package com.centurion.test;

/**
 * Created by Max on 20.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        int a = 5;
//        System.out.println("a = " + a);
//        methodA(a);
//        System.out.println("a = " + a);

        int[] nago = new int[] {1,88,56565,0,45,789};
        System.out.print(nago[1] + ", ");
        System.out.print(nago[3] + ", ");
        System.out.println(nago[5]);
        methodB(nago);
        System.out.print(nago[1] + ", ");
        System.out.print(nago[3] + ", ");
        System.out.println(nago[5]);

    }
    private static void methodA(int paramA){
        System.out.println("methodA " + paramA);
        paramA = 8;
        System.out.println("methodA " + paramA);
    }

    private static void methodB(int[] paramB) {
//        System.out.print(paramB[1] + ", ");
//        System.out.print(paramB[3] + ", ");
//        System.out.println(paramB[5]);
        paramB[1] = 99;
        paramB[3] = 777;
        paramB[5] = 999;
//        System.out.print(paramB[1] + ", ");
//        System.out.print(paramB[3] + ", ");
//        System.out.println(paramB[5]);

    }
}
