/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;

public class EX14 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float order_amt;

        System.out.print("What is the order amount? ");
        order_amt = input.nextFloat();

        System.out.print("What is the state? ");
        String state = WI.nextLine();


        if (state==WI) {

            System.out.print("The subtotal is $"+order_amt+"");
            double taxWI = 5.5/100;
            double total = order_amt + (taxWI*order_amt);;
            System.out.println("The tax is $" +taxWI*order_amt+"");
            System.out.println("The total is $"+total+"");

        }

        System.out.println("The total is $"+order_amt+"");









    }

}