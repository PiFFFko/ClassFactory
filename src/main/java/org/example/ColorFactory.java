package org.example;

public class ColorFactory {

     public static Color createColor(String ColorType){
         switch (ColorType){
             case ("Black"):
                 return new Black();
             case("Red"):
                 return new Red();
             default:
                 return null;
         }
     }
}
