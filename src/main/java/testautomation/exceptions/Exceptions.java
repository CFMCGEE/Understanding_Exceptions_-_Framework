package testautomation.exceptions;

import java.io.*;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    public static void main(String[] args) {

        createNewFile();
        //numbersExceptionHandling
        //createNewFileRethrow();
        dividing();

    }

    private static void createNewFile() {
        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (Exception e) {
            System.out.println("Directory doest not exist.");
            e.printStackTrace();
        }

    }
//
//    public static void numbersExceptionHandling() {
//        File file = new File("resources/numbers.txt");
//
//        try (Scanner fileReader = new Scanner(file)) {;
//
//            while (fileReader.hasNext()) {
//                double num = fileReader.nextDouble();
//                System.out.println(num);
//            }
//        } catch (FileNotFoundException | InputMismatchException e) {
//                   e.printStackTrace();
//        }
//
//    }
//
//    private static void createNewFileRethrow() throws IOException {
//        File file = new File("resources/nonexistent.txt");
//        file.createNewFile();
//    }

    public static void dividing() {

        int c = 30/0;

        try {

            if (c == 0) {
                System.out.println(c + 3);
            }

            throw new ArithmeticException();

        } catch (Exception ae) {
            System.out.println("Division is Fun");
            ae.printStackTrace();
        }

    }

}
