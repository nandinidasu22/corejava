package org.example;

public class privateAccessSpecifier {
        private int j = 22;
        public static void main(String ar[]){
            privateAccessSpecifier p1 = new privateAccessSpecifier();
            System.out.println(p1.j);

            // can only be accessible within the same class
            // can not access in subclass
        }


    }

