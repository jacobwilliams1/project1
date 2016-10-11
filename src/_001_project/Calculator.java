package _001_project;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Created by jacobwilliams on 10/10/16.
 */
public class Calculator {
    static double num1;
    static double num2;
    static double res;
    static String YN;
    static String choice;
    static String menu;
    static Scanner ask = new Scanner(System.in);
    static Scanner ask1 = new Scanner(System.in);
    static Scanner ask2 = new Scanner(System.in);
    static Scanner menuChoice = new Scanner(System.in);
    static Scanner cont = new Scanner(System.in);
    static ArrayList<String> History = new ArrayList<>();

    public static void askUser() throws IOException {
        String fileName = "history.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName)); //won't work if you don't catch for IO exception
        while (true) {

            System.out.println("What would you like to do?" + "\n" + "[1]Calculator" + "\n" + "[2]Tip Calculator" + "\n" + "[3]Help" + "\n" + "[4]Calculate Tax" + "\n" + "[5]Clear History" + "\n" + "[6]Quit");
            menu = menuChoice.nextLine();
            if (menu.equals("1")) {
                System.out.println("Enter an operator");

                choice = ask.nextLine();


                if (choice.equals("+")) {
                    System.out.println("What is your first number");
                    num1 = ask1.nextInt();
                    System.out.println("What is your second number");
                    num2 = ask2.nextInt();
                    res = num1 + num2;
                    System.out.println("The answer is " + res);

                    History.add(num1 + " + " + num2 + " = " + res);
                    System.out.println("History: " + History);
                }

                if (choice.equals("-")) {
                    System.out.println("What is your first number");
                    num1 = ask1.nextInt();
                    System.out.println("What is your second number");
                    num2 = ask2.nextInt();
                    res = num1 - num2;
                    System.out.println("The answer is " + res);

                    History.add(num1 + " - " + num2 + " = " + res);
                    System.out.println("History: " + History);
                }

                if (choice.equals("*")) {
                    System.out.println("What is your first number");
                    num1 = ask1.nextInt();
                    System.out.println("What is your second number");
                    num2 = ask2.nextInt();
                    res = num1 * num2;
                    System.out.println("The answer is " + res);

                    History.add(num1 + " * " + num2 + " = " + res);
                    System.out.println("History: " + History);

                }

                if (choice.equals("/")) {
                    System.out.println("What is your first number");
                    num1 = ask1.nextInt();
                    System.out.println("What is your second number");
                    num2 = ask2.nextInt();
                    res = num1 / num2;
                    System.out.println("The answer is " + res);

                    History.add(num1 + " / " + num2 + " = " + res);
                    System.out.println("History: " + History);
                }
            }
                double bill;
                double pct;
                double tipResult;
                double total;
                Scanner tipBill = new Scanner(System.in);
                Scanner tipPct = new Scanner(System.in);

                if (menu.equals("2")) {
                    System.out.println("You have chose the Tip Calculator");
                    System.out.println("How much was your bill?");
                    bill = tipBill.nextInt();
                    System.out.println("What tip percentage do you want to give?" + "\n" + "10" + "\n" + "15" + "\n" + "20");
                    pct = tipPct.nextInt();
                    tipResult = (pct / 100) * bill;
                    total = tipResult + bill;
                    System.out.println("Your total tip is " + tipResult);
                    System.out.println("Your total amount is " + total);
                    History.add("Tip Result" + tipResult + "Total bill" + total);
                }


                if (menu.equals("3")) {
                    System.out.println("Calculator is a function that allows the user to input an operator and two numbers then get an answer" + "\n" +
                            "Tip Calculator is a function that allows the user to input a bill amount and a tip percentage and then calculates the total bill and total tip amount for them");
                }
                Scanner grocPrice = new Scanner(System.in);
                double grocItem;
                double grocPct;
                double grocRes;
                double grocAns;
                if (menu.equals("4")) {
                    System.out.println("How much does our item cost?");
                    grocItem = grocPrice.nextInt();
                    System.out.println("What percent tax are you paying?");
                    grocPct = grocPrice.nextInt();
                    grocRes = (grocPct / 100) * grocItem;
                    grocAns = grocItem + grocRes;
                    System.out.println("Your total item with tax included is: " + grocAns);
                    History.add("Your total item with tax included is: " + grocAns);
                }
                if (menu.equals("5")) {
                    History.clear();
                    System.out.println("Your history has been cleared thanks!");
                }
                if (menu.equals("6")) {
                    System.out.println("Would you like to do quit");

                    YN = cont.nextLine();

                    if (YN.equals("n"))
                        outFile.println(History);
                    outFile.close();
                    break;
                }
            }
        }
    }