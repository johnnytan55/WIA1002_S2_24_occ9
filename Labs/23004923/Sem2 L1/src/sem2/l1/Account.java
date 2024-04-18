/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l1;

/**
 *
 * @author Tan Hao Wen
 */
public class Account {
    private int ID = 0;
    private double balance = 0;
    private String dateCreated;
    private static double annualInterestRate = 0;
    
    public Account(){
    }
    
    public Account(int id, double balance){
        this.ID = id;
        this.balance = balance;
    }
    
    //mutator
    public void setID(int ID){
        this.ID = ID;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setAnnualInterestRate(double interestRate){
        annualInterestRate = interestRate;
    }
    
    //accesor
    public int getID(){
        return this.ID;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public String getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest(){
        return (this.balance * getMonthlyInterestRate()/100);
    }
    
    public void withdraw(double withdraw){
        this.balance -= withdraw;
    }
    
    public void deposit(double deposit){
        this.balance += deposit;
    }
    
    
    
    
    
    
    
    
}
