package org.example;

public class defaultAccessSpecifier {
        int x= 22;
        public static void main(String ar[]){
            defaultAccessSpecifier d = new defaultAccessSpecifier();
            System.out.println(d.x);

            // can be accesssble outside the class but cannot access in diff package
            //can access in subclass
        }


    }

