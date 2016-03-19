package org.centurion;

/**
 * Created by Max on 19.03.2016.
 */
public class Main2 {

    public static void main(String[] args) {
        if (haveParams(args)) {
            if (isNumber(args[0])) {
                int length = Integer.parseInt(args[0]);
                for (int i = 0; i < length; i++) {
                    System.out.println(i);
                    if (i == length / 2) {
                        System.out.println("Я в середине и  равно: " + i);
                        break;
                    }
                }
            } else {
                System.out.println("Это не число!");
            }
        } else {
            System.out.println("Укажите хотя бы один параметр!");
        }
    }

    private static boolean haveParams(String[] params) {
        return (params != null) && (params.length > 0);
    }

    private static boolean isNumber(String numberStr) {
        try {
            Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }
}

