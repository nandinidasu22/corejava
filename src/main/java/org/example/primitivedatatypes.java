package org.example;

public class primitivedatatypes {
    static byte b= 15;
    static short s = 420;
    static int  i =1000;
    static long l =4250;
    static float f= 7125;
    static double d =5.2;
    static char c ='N';
    //Casting
    static byte b1 = (byte)s;
    static byte b2 = (byte)i;
    static byte b3=(byte)l;
    static byte  b4 = (byte)f;
    static byte b5 =(byte)d;
    static byte b6 =(byte)c;
    public static void main (String ar[]){
        primitivedatatypes p = new primitivedatatypes();
        System.out.println(p.b);
        System.out.println(p.b1);
        System.out.println(p.b2);
        System.out.println(p.i);
        System.out.println(p.b3);
        System.out.println(p.l);
        System.out.println(p.b4);
        System.out.println(p.f);
        System.out.println(p.b5);
        System.out.println(p.d);
        System.out.println(p.b6);
        System.out.println(p.c);


    }


}
