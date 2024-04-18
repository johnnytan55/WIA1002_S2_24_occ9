/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l2;

/**
 *
 * @author Tan Hao Wen
 */
public class MinMax{
    public static void main(String[] args) {
        Integer [] intArray = {5,3,7,1,4,9,8,2};
        String [] strArray = {"red", "blue", "orange", "tan"};
        
        minmax(intArray);
        minmax(strArray);
        
        
        
    }
    
    public static <T extends Comparable> String minmax(T [] someArray){
        T min = someArray[0], max = someArray[0];
        int hold;
        
        for (int i = 1; i < someArray.length; i++) {
            if (compareTo(someArray[i],max)>0)
                max = someArray[i] ;
            if (compareTo(someArray[i],min)<0)
                min = someArray[i];
        }
        
        System.out.println(("Min = " + min + " Max = " + max));
        return ("Min = " + min + " Max = " + max);
    }
    
    public static <T extends Comparable> int compareTo(T first, T second){
        if (first.compareTo(second)>0)
            return 1;
        else if (first.compareTo(second)== 0)
            return 0;
        else
            return -1;
    }
    
}
