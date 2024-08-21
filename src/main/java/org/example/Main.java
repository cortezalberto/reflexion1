package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            // Obtener la clase
        //    Class<?> clazz = Class.forName("java.util.ArrayList");

            Class<?> clazz = Class.forName("org.example.ArticuloCreateDto");

            // Obtener el nombre de la clase
            System.out.println("Nombre de la clase: " + clazz.getName());

            // Obtener los métodos de la clase
            Method[] methods = clazz.getMethods();
            System.out.println("\nMétodos:");
            for (Method method : methods) {
                System.out.println(" " + method.getName());
            }

            // Obtener los campos de la clase
            Field[] fields = clazz.getDeclaredFields();
            System.out.println("\nCampos:");
            for (Field field : fields) {
                System.out.println(" " + field.getName());
            }

            // Obtener los constructores de la clase
            Constructor<?>[] constructors = clazz.getConstructors();
            System.out.println("\nConstructores:");

            for (Constructor<?> constructor : constructors) {
                System.out.println(" " + constructor.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
