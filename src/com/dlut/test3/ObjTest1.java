package com.dlut.test3;

public class ObjTest1 {
    public static void changeArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            arr[i]=10+i;
        }
    }
    private static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]);
            if(i!=arr.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("改变数组前");
        ObjTest1.printArr(arr);
        ObjTest1.changeArr(arr);
        System.out.println("改变数组后");
        ObjTest1.printArr(arr);
    }
}
