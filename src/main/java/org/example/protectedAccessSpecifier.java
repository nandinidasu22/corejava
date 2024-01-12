package org.example;

public class protectedAccessSpecifier {

        protected int h = 21;
        public static void main(String ar[]){
            protectedAcccessSpecifier p2 = new protectedAcccessSpecifier();
            System.out.println(p2.h);

            //can access in diff class but can not access in diff package
            //can access in subclass
            // can not access in subclass in diff package
        }
    }

