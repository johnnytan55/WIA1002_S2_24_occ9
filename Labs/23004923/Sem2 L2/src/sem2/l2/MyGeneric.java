/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem2.l2;

/**
 *
 * @author Tan Hao Wen
 */
public class MyGeneric <E> {
    public E e;
    
    public MyGeneric(){
    }
    
    public MyGeneric(E something){
        this.e = something;
    }
    
    //setter
    public void setE(E something){
        this.e = something;
    }
    
    //getter
    public E getE(){
        return this.e;
    }
    
}
