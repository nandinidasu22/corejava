package org.example;

public class multiGenerics <x,y,z> {


        public x biryani;
        public y biryanistate;
        public z biryaniprice;

        public x getBiryani(){
            return biryani;
        }

        public static void main(String ar[]){
            multiGenerics<String,String,Integer> m = new multiGenerics<String,String,Integer>();
            m.biryani="chicken";
            m.biryanistate="ANDHRA";
            m.biryaniprice=500;
            System.out.println(m.biryanistate);
            System.out.println(m.biryani);
            System.out.println(m.biryaniprice);
            System.out.println(m.getBiryani());
        }

    }

