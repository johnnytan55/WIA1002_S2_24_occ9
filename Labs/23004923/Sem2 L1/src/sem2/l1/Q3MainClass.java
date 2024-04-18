/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l1;

/**
 *
 * @author Tan Hao Wen
 */
public class Q3MainClass {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000.0);
        
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500.0);
        acc.deposit(3000);
        System.out.println(acc.getBalance());
        System.out.println(acc.getMonthlyInterest());
        System.out.println(acc.getDateCreated());
    }
}
