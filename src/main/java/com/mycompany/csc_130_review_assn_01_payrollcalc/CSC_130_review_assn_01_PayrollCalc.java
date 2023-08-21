/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*
 * Write a payroll calculation program. You need to ask the user for a number of
 * hours and a pay rate. Once you have these two values from the user, find 
 * their gross pay for the week. Withhold 15% of their pay (for taxes and social
 * security) and find their net pay.

 * Remember that you must give overtime pay… ( 1.5 * (hours - 40) * payrate)  
 * …for the overtime hours in gross pay if the user worked over 40 hours, 
 * so you will need to use an IF statement in this program to check if there are
 * over 40 hours and handle regular time under one path, ….and payrate times 40 
 * hours [for the first 40 hours] + overtime using the calculation above for the
 * extra hours under the other path.

 * You should print out the gross pay, withheld amount, and the net pay for the 
 * user with appropriate text telling the user what each number is.

 * Note: You may want to skip the formatting placeholders because you will need 
 * to use doubles or floats as the data types here. If you do wish to use them, 
 * do not use %d as it is for an integer. Use %f 
*/

package com.mycompany.csc_130_review_assn_01_payrollcalc;

import java.util.Scanner;

/**
 *
 * @author donnie
 */

public class CSC_130_review_assn_01_PayrollCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double hoursWorked;
        double payRate;
        double grossPay;
        double netPay;
        double overHours;
        double normalHours;
        double normalPay;
        double overPay;
        double withholdRate;
        double withheldAmt;
        
        withholdRate = 0.15;
        
        System.out.println("Enter your hours worked: ");
        hoursWorked = input.nextDouble();
        
        System.out.println("Enter your pay rate: ");
        payRate = input.nextInt();
        
        if (hoursWorked > 40) {
            
            overHours = hoursWorked - 40;
            normalHours = hoursWorked - overHours;
            normalPay = normalHours * payRate;
            overPay = (overHours * 1.5) * payRate;
            grossPay = overPay + normalPay;
            withheldAmt = grossPay * withholdRate;
            netPay = grossPay - withheldAmt;
            
            System.out.printf("Gross Payment: %f%n", grossPay);
            System.out.printf("Withheld Amount: %f%n", withheldAmt);
            System.out.printf( "Net Payment: %f%n", netPay);
        }
        else { 
            
            normalHours = hoursWorked;
            normalPay = normalHours * payRate;
            withheldAmt = normalPay * withholdRate;
            netPay = normalPay - withheldAmt;
            
            System.out.printf("Gross Payment: %f%n", normalPay);
            System.out.printf("Withheld Amount: %f%n", withheldAmt);
            System.out.printf("Net Payment: %f%n", netPay);
            
        }
        
    }
}
