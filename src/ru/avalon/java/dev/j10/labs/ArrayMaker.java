package ru.avalon.java.dev.j10.labs;

class ArrayMaker {

    static void printOut(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println("\n");
    }

    static int value(int[] array) {

        int value = 0;
        for (int i = 0; i < array.length; i++) {
            value += array[i];

        }
        return value;
    }
}