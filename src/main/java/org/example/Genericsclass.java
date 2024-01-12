package org.example;

public class Genericsclass<T> {

        public T city;

        public static void main(String ar[]){
            Genericsclass<String> g = new Genericsclass<String>();
            g.city = "GVD";
            System.out.println(g.city);
        }
    }

