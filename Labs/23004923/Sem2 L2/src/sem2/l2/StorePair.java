/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem2.l2;

/**
 *
 * @author Tan Hao Wen
 * @param <T>
 */
public class StorePair<T extends Comparable<T>> implements Comparable<StorePair<T>> {

    private T first, second;

    public StorePair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }

    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return ("first = " + first + " second = " + second);
    }

    public boolean equals(Object obj) {
        if (obj instanceof StorePair<?>) {
            return ((StorePair<?>) obj).getFirst().equals(first);
        }
        return false;
    }
    
    public int compareTo(StorePair<T> obj){
            return first.compareTo(obj.getFirst());
    }
}
