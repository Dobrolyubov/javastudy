package org.centurion;

/**
 * Created by Max on 13.03.2016.
 */
public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i <= 100; i++) {
//            System.out.println("общее кол-во раз = " + i);
//            if (i % 10 == 0 ) {
//                System.out.println("i = " + i);
//
//            }
//        }

        int a = 0;
        while(a < 100){
            a++;
            //System.out.println("общее кол-во раз = " + a);
            if (a == a && a % 1 ==0) {
                System.out.println("Я простое число = " + a);
            }
        }

    }
}
