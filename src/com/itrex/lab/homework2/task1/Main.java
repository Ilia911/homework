package com.itrex.lab.homework2.task1;
/*
* Написать программу которая при запуске вызывает OutOfMemoryError: Metaspace.
* В Readme описать условия запуска. (если такие будут, например jvm options)
* */

import java.util.Base64;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        String clazzBase64 ="yv66vgAAADcADAEAEm15cGFja2FnZS9NeWNsYXNzMAcAAQEAEGphdmEvbGFuZy9PYmplY3QHAAMBAApTb3Vy" +
                "Y2VGaWxlAQANTXljbGFzczAuamF2YQEABjxpbml0PgEAAygpVgwABwAICgAEAAkBAARDb2RlACEAAgAEAAAAAAABAAEABwAIA" +
                "AEACwAAABEAAQABAAAABSq3AAqxAAAAAAABAAUAAAACAAY=";

        byte[] compiledClazz = Base64.getDecoder().decode(clazzBase64);
        int classNameLength = Integer.valueOf(compiledClazz[12]);

        MyClassLoader myClassLoader = new MyClassLoader(Thread.currentThread().getContextClassLoader());

        for (int i = 0; ; i++) {
            byte[] bytes = String.valueOf(i).getBytes();
            byte[] bytecode = new byte[compiledClazz.length + bytes.length - 1];
            System.arraycopy(compiledClazz, 0, bytecode, 0, 30);
            bytecode[12] = (byte) (classNameLength + bytes.length - 1 & 0xFF);

            System.arraycopy(bytes, 0, bytecode, 30, bytes.length);
            System.arraycopy(compiledClazz, 31, bytecode, 30 + bytes.length, compiledClazz.length - 31);

            String classname = "mypackage.Myclass" + i;
            Class c = myClassLoader.getClass(classname, bytecode);
        }
    }

    public static class MyClassLoader extends ClassLoader {
        public MyClassLoader(ClassLoader parent) {
            super(parent);
        }

        public Class<?> getClass(String name, byte[] code) {
            return defineClass(name, code, 0, code.length);
        }
    }
}
