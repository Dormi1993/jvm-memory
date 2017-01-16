package com.dlut.test2;

//public class Main {
//    public static void swap(int a,int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
//    public static void main(String[] args) {
//        int a=1,b=2;
//        System.out.println("a="+a+",b="+b);
//        Main.swap(a, b);
//        System.out.println("a="+a+",b="+b);
//    }
//}

public class Main{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args){
        int a = 2, b = 5;
        System.out.println("a = " + a + ", b = " + b);
        Main.swap(a, b);

        System.out.println("a = " + a + ", b = " + b);
    }
}
