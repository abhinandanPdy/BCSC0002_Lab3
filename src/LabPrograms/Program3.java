package LabPrograms;

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        //Converting Fahrenheit to Celsius.
        System.out.println("Enter the temp. in fahrenheit");
        Scanner input=new Scanner(System.in);
        double f=input.nextDouble();
        double c = (f-32)/1.8;
        System.out.println(c);
    }
}
