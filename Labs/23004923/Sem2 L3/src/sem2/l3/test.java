/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l3;

/**
 *
 * @author Tan Hao Wen
 */
public class test {
    public static void main(String[] args) {
        
        BagInterface<Integer> JohnnyBag = new ArrayBag<Integer>(new Integer[]{1,1,1,2,8});
        BagInterface<Integer> XinruBag = new ArrayBag<Integer>(new Integer[]{4,4,1,1});  
        
        BagInterface<Integer> Joshua = JohnnyBag.Union(XinruBag);
        
        JohnnyBag.printBag();
        XinruBag.printBag();
        Joshua.printBag();

        
        
    }
    
}
