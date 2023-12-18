package org.example;

public class objectivedatatypes {

    static int i;

    static byte b;
    static char c;
    static double d;
    static boolean b1;
    static float f;

    public objectivedatatypes(int i, byte b, char c, double d, boolean b1, float f) {
        this.i = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.b1 = b1;
        this.f = f;
    }

    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b1);
        System.out.println(f);
        objectivedatatypes ob = new objectivedatatypes(i:11, b:22, c:"nandu", d:2.5, b1 :true, f:6.21);
        System.out.println(ob.i + "  " + ob.c + "  " + ob.b1);

    }
}

