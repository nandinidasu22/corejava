package org.example;
/**
 * String is the non primitive data types, it will store multiple characters or text
 */

public class Stringclass {
    static String str1 = "nandu";

    // String str1 =new String "nandu";(another method for string)
    static String str2 = "Dasu";
    static String str3 = new String("nandu");

    /**
     * this is method level comments
     * @parameters
     */
    // String internally used equals and hashcode to compare the objects...
    public class void main (String ar[]){
        System.out.println(str1.hashCode());s
        System.out.println(str2.hashCode());
        System.out.println(str1+ "  "+str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str1.startsWith("n"));
        System.out.println(str2.startsWith("n" , 4));
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println(str1.concat(str2));

        if (str1.equals(str3)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if (str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        Stringclass Stringclass = new Stringclass();
        Stringclass Stringclass1 = new Stringclass();
        System.out.println(Stringclass.hashCode());
        System.out.println(Stringclass1.hashCode());
    }
}
