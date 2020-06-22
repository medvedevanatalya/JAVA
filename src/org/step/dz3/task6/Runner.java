package org.step.dz3.task6;


import org.step.dz3.task7.ClassAnnotation;

import java.lang.reflect.Field;

public class Runner {

    public static void main(String[] args) {
       NuclearBoat nuclearBoat = new NuclearBoat();
       nuclearBoat.startEngine();
       nuclearBoat.stopEngine();

       Field[] declaredFields = nuclearBoat.getClass().getDeclaredFields();

       for (Field field : declaredFields) {
           field.setAccessible(true);
           boolean annotationPresent = field.isAnnotationPresent(ClassAnnotation.class);

           if (annotationPresent) {
               ClassAnnotation annotation = field.getAnnotation(ClassAnnotation.class);

               String value = annotation.value();

               try {
                   field.set(nuclearBoat, value);
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               }
           }
       }
       System.out.println(nuclearBoat.getSomeText());
    }
}
