Programación 1
Names: Nikolai Panchi, Jouse Monta
Lenguage program Java
version .17

Funciones y Switch  Program
This is a simple Java program that demonstrates various functionalities based on user input. The following instructions explain how to use the program and provide a brief description of the implemented functions.

Prerequisites
To run this program, ensure you have:

Java Development Kit (JDK) 8 or higher.
An Integrated Development Environment (IDE) like IntelliJ IDEA, Eclipse, or NetBeans, or you can use the command line.
How to Run
Run from an IDE:

Import the project into your  IDE.
Run the HelloApplication class containing the main method.
Run from the Command Line:

Navigate to the directory containing HelloApplication.java.

Compile the program:
javac com/example/funciones_switch/HelloApplication.java

Run the program:
java com.example.funciones_switch.HelloApplication
Program Functionality
Upon starting, the program will display a welcome message and ask the user to choose an option: A, B, or C.

Available Options
Option A: Sum of Two Numbers

Prompts the user for two numbers.
Calculates and displays their sum.
Option B: Display a String

Prompts the user for a string.
Displays the entered string.
Option C: Calculate Cosine

Prompts the user for a value (in degrees).
Calculates and displays the cosine of the value.
Example Usage

On running the program, you will see:
Hello you are in the best program, the program has some options such as: A,B,C
Please type any option

If the user inputs A:
Now you are in sum program, it is necessary to type two numbers
Please type the first number that you are going to use
(User enters 5)
Please type the second number that you are going to use
(User enters 10)
The result of your sumatory is: 15


If the user inputs B:
Please type a string
(User enters "Hello World")
Your String is: Hello World

If the user inputs C:
Now you are in cos function to print the cos of a degree
Please type a value to calculate
(User enters 45)
The result of the cosen of 45 is: 0.7071067811865476


Source Code
package com.example.funciones_switch;

import java.util.Scanner;

public class HelloApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printAnyString("Hello you are in the best program, the program has some options such as: A,B,C");
        printAnyString("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()) {
            case "a":
                printAnyString("Now you are in sum program, it is necessary to type two numbers");
                printAnyString("Please type the first number that you are going to use");
                int numberOne = scanner.nextInt();
                printAnyString("Please type the second number that you are going to use");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne, numberTwo);
                printAnyString("The result of your sumatory is: " + sumResult);
                break;
            case "b":
                printAnyString("Please type a string");
                scanner.nextLine(); // Consume the remaining newline
                String IdkString = scanner.nextLine();
                String Yeah = Returnnothing(IdkString);
                printAnyString("Your String is: " + Yeah);
                break;
            case "c":
                printAnyString("Now you are in cos function to print the cos of a degree");
                printAnyString("Please type a value to calculate");
                int normal = scanner.nextInt();
                double cosenresult = Coseno(normal);
                printAnyString("The result of the cosen of " + normal + " is: " + cosenresult);
        }
    }

    public static void printAnyString(String message) {
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static String Returnnothing(String IdkString) {
        return IdkString;
    }

    public static double Coseno(int normal) {
        return Math.cos(Math.toRadians(normal)); // Convert degrees to radians
    }
}

A option
![a option](https://github.com/nikp062602/Funciones_y_switch/assets/170439648/8c15f50a-1768-4953-a3be-968a6eb36be3)

B option
![option b](https://github.com/nikp062602/Funciones_y_switch/assets/170439648/cf7d28c2-474a-4154-8b3b-1c68fcef82cd)

C option
![image](https://github.com/nikp062602/Funciones_y_switch/assets/170439648/73852e29-5e2b-45b9-8227-0c35a5aadd9b)


