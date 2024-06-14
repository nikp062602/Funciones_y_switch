package com.example.funciones_switch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;


public class HelloApplication {
    public static void main(String[] args) {
        double cosValue;
        Scanner scanner = new Scanner (System.in);

        printAnyString("Hello you are in the best program, the program has some options such as: A,B,C");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":
                printAnyString ("Now you are in sum program, it is necessary to type two numbers");
                printAnyString ("Please type the first number that you are going to use");
                int numberOne = scanner.nextInt();
                printAnyString ("Please type the second number that you are going to use");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne,numberTwo);
                printAnyString("The result of your sumatory is:" + sumResult);
                break;
            case "b":
                printAnyString ("Please type a string");
                String IdkString = scanner.nextLine();
                String Yeah = Returnnothing(IdkString);
                printAnyString("Your String is:" + Yeah);
                break;
            case "c":
                printAnyString("Now you are in cos function to print the cos of a degree");
                printAnyString("Please type a value to calculate");
                int normal = scanner.nextInt();
                double cosenresult = Coseno(normal);
                printAnyString("The result of the cosen of " + normal + " is: " + cosenresult);

        }


    }
    public static void printAnyString(String message){
        System.out.println(message);
    }
    public static int sumNumbers(int numberOne, int numberTwo){
        int result = numberOne+numberTwo;
        return result;
    }

    public static String Returnnothing(String IdkString){
        System.out.println(IdkString);
        return IdkString;
    }
    public static double Coseno(int normal){
        double cosValue = Math.cos(normal);
        return cosValue;


    }



}