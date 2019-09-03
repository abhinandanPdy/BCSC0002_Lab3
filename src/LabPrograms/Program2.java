package LabPrograms;

import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {
        System.out.println("Enter the price.");
        Scanner input = new Scanner(System.in);
        double price = input.nextDouble();
        int iPrice = (int) price;
        double fPrice = price - iPrice;
        if (fPrice == 0) {
            System.out.println(price + " Rupees and 0 Paise");
        } else {
            System.out.println(iPrice + " Rupees and " + (float)fPrice + " Paise");
        }
    }
}