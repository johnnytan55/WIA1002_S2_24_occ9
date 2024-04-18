/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l1;

/**
 *
 * @author Tan Hao Wen
 */
import java.util.Scanner;
import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        String text3address = "text3.txt";
        String text2address = "text2.txt";
        String text1address = "text1.txt";
        
        
        System.out.println("Text 1:");
        //display without special characters
        System.out.println(removeSpecialCharacters(text1address));
        
        //calculate characters in the string
        String text1 = removeSpecialCharacters(text1address);
        System.out.println((text1.replaceAll("\n", "")).length() + " characters in text 1\n");
        
        System.out.println("Text 2:");
        //display without special characters
        System.out.println(removeSpecialCharacters(text2address));
        
        //calculate characters in the string
        String text2 = removeSpecialCharacters(text2address);
        System.out.println((text2.replaceAll("\n", "")).length() + " characters in text 3\n");
        
        
        System.out.println("Text 3:");
        //display without special characters
        System.out.println(removeSpecialCharacters(text3address));
        
        //calculate characters in the string
        String text3 = removeSpecialCharacters(text3address);
        System.out.println((text3.replaceAll("\n", "")).length() + " characters in text 3\n");
        
    }
    
    
    
    public static String removeSpecialCharacters(String address){
        String list = "";
        
        try{
        
            Scanner InputStream = new Scanner(new FileInputStream(address));
            
            while (InputStream.hasNextLine()){
                String temp = InputStream.nextLine();
                temp = temp.replaceAll("[,; ]", "");
                list = list + temp + "\n";
            }
            
            
        } catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
        
        return list;
    }
}
    

