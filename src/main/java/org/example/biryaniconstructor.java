package org.example;

public class biryaniconstructor {
        public int num1;
        public String name;
        public String type;
        //empty constructor
        biryaniconstructor(){

        }
        //constructor with parameters
        public biryaniconstructor(int num1,String name,String type){
            this.num1=num1;
            this.name=name;
            this.type=type;
        }
        public static void main (String ar[]){
            org.example.biryaniconstructor b = new org.example.biryaniconstructor();
            System.out.println(b.toString());
            org.example.biryaniconstructor b1 = new org.example.biryaniconstructor( int num1:5, String name: "chicken", String type:"non veg");
            System.out.println(b1.int num1);
            System.out.println(b1.static String name);
            System.out.println(b1.static String type);
        }




}
