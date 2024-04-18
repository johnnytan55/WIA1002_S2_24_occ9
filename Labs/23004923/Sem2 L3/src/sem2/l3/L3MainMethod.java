/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l3;

/**
 *
 * @author Tan Hao Wen
 */
public class L3MainMethod {
    public static void main(String[] args) {
        BagInterface<String> bag1 = new ArrayBag<>(); 
        BagInterface<String> bag2 = new ArrayBag<>(); 

        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "anotherstring"};
        
        testAdd(bag1, contentsOfBag1 );
        testAdd(bag2, contentsOfBag2 );
        
        BagInterface<String> bag3 = bag1.Union(bag2); 
        BagInterface<String> bag4 = bag1.intersect(bag2); 
        BagInterface<String> bag5 = bag1.difference(bag2); 
       
        
        displayBag(bag1);
        displayBag(bag2);
        displayBag(bag3);
        displayBag(bag4);
        displayBag(bag5);
        
        
        
    }
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for (String item: content) {
            aBag.add(item);
        }
    }
    
    private static void displayBag(BagInterface<String> aBag){
        Object [] content = aBag.toArray();
        System.out.printf("The bag contains %d string(s): \n", aBag.getCurrentSize());
        for (int i = 0; i < content.length; i++) {
            System.out.print(content[i] + " ");       
        }
        System.out.println("");
        
        
        }
    
}
