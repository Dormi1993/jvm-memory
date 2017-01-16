package com.dlut.test1;

public class Main {
    /**
     * 这一段代码啥也没有，就是交换个变量的值
     * @param args
     */
    public static void main(String[] args) {
        int a=1,b=2;
        System.out.println("a="+a+",b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a+",b="+b);
    }
}
