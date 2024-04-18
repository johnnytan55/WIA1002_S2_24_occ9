/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem2.l1;

/**
 *
 * @author Tan Hao Wen
 */
import java.util.Scanner;
import java.io.*;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Part 1: read the self introduction text file

        try {

            Scanner inputStream = new Scanner(new FileInputStream("TanHaoWen_23004923.txt"));

            while (inputStream.hasNextLine()) {
                String temp = inputStream.nextLine();
                System.out.println(temp);

            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }
        
        // ask user what to add to the 2nd part of the text file
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your message from the future:");
        String future = sc.nextLine();
        
        //adding part 2 to the text file
        
        try {
        
            PrintWriter outputStream = new PrintWriter (new FileOutputStream("TanHaoWen_23004923.txt",true));
            
            
            outputStream.println("\nThursday, 18 June 2021");
            outputStream.println(future);
            
            outputStream.close();
            
        
        }catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
        
        
    }

}
