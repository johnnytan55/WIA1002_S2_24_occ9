/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l2;

/**
 *
 * @author Tan Hao Wen
 */
import java.util.ArrayList;

public class Q1MainMethod {
    public static void main(String[] args) {
        MyGeneric strObj = new MyGeneric("Johnny");
        MyGeneric intObj = new MyGeneric(300000);
        
        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
        
        ArrayList<Number> Hi = new ArrayList<>();
        
        Hi.add(67);
        Hi.add(65.6);
        
    }
}
