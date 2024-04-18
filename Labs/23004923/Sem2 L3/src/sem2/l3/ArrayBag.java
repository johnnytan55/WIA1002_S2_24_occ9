/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem2.l3;

/**
 *
 * @author Tan Hao Wen
 */
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private final int DEFAULT_CAPACITY = 25;
    private int numberofEntries;

    public ArrayBag() {
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public ArrayBag(T[] bag) {
        this.bag = bag;
        numberofEntries = bag.length;
    }

    public ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
    }

    public int getCurrentSize() {
        return numberofEntries;
    }

    public boolean isFull() {
        return bag.length == numberofEntries;
    }

    public boolean isEmpty() {
        return numberofEntries == 0;
    }

    public boolean add(T newEntry) {
        if (isFull()) {
            return false;
        } else {
            bag[numberofEntries++] = newEntry;
            return true;
        }
    }

    //remove a random entry from the bag
    public T remove() {
        Random r = new Random();

        T removed = removeIndex(r.nextInt(0, numberofEntries));

        return removed;
    }

    //remove a given entry from the bag
    public boolean remove(T entry) {
        int index = indexof(entry);

        removeIndex(index);

        if (removeIndex(index) == null) {
            return false;
        } else {
            return true;
        }
    }

    T removeIndex(int index) {
        if ((index < 0) || (index >= this.bag.length || this.isEmpty())) {
            return null;
        }

        //assign the object to be removed to "item"
        T item = bag[index];

        for (int i = index; i < numberofEntries - 1; i++) {
            bag[i] = bag[i + 1];
        }

        bag[--numberofEntries] = null;

        return item;
    }

    int indexof(T entry) {
        if (entry == null) {
            for (int i = 0; i < numberofEntries; i++) {
                if (entry == bag[i]) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < numberofEntries; i++) {
                if (entry == bag[i]) {
                    return i;
                }
            }
        }
        return -1;// if entry is not found in array Bag
    }

    public void clear() {
        Arrays.fill(bag, null);
        numberofEntries = 0;
    }

    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for (int i = 0; i < numberofEntries; i++) {
            if (anEntry.equals(bag[i])) {
                counter++;
            }
        }
        return counter;
    }

    public boolean contains(T anEntry) {
        boolean same = false;
        for (int i = 0; i < numberofEntries; i++) {
            if (anEntry.equals(bag[i])) {
                same = true;
                return same;
            }
        }
        return same;
    }

    public T[] toArray() {
        T[] storeList = (T[]) new Object[numberofEntries];

        System.arraycopy(bag, 0, storeList, 0, numberofEntries);
        return storeList;
    }

    @Override
    public BagInterface<T> Union(BagInterface<T> anotherBag) {
        int size1 = this.getCurrentSize();
        int size2 = anotherBag.getCurrentSize();

        ArrayBag<T> newBag = new ArrayBag<>(size1 + size2);

        T[] arr1 = this.toArray();
        T[] arr2 = anotherBag.toArray();

        for (int i = 0; i < arr1.length; i++) {
            newBag.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            newBag.add(arr2[i]);
        }

        return newBag;
    }
    
    public int small(int a, int b){
        if ( a > b){
            return b;
        }
        else if (b>a){
            return a;
        }
        else{
            return a;
        }
    }

    @Override
    public BagInterface<T> intersect(BagInterface<T> anotherBag) {
        int size1 = this.getCurrentSize();
        int size2 = anotherBag.getCurrentSize();       
        
        T[] arr1 = this.toArray();
        T[] arr2 = anotherBag.toArray();
        ArrayList<T> arr3 = new ArrayList<>();

        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                
                if (arr1[i].equals(arr2[j])) {
                    int count1 = this.getFrequencyOf(arr1[i]);
                    int count2 = anotherBag.getFrequencyOf(arr2[j]);
                    int count3 = 0;
                    int small = small(count1, count2);
                    
                    for (int k = 0; k < arr3.size(); k++) {
                        if(arr3.get(k).equals(arr1[i])){
                            count3++;
                        }
                    }
                    
                    if(count3 < small){
                        arr3.add(arr1[i]);
                    }
                    
                    
                    
                    
                }
            }
        }

        BagInterface<T> intersectBag = new ArrayBag<>(arr3.size());
        
        for (int i = 0; i < arr3.size(); i++) {
            intersectBag.add(arr3.get(i));
        }
        
        return intersectBag;
    }

    public void printBag(){
//        for (int i = 0; i < numberofEntries; i++) {
//            System.out.println(bag[i]);
//        }
        System.out.println(Arrays.toString(bag));
    }
    
    public BagInterface<T> difference(BagInterface<T> anotherBag){
        Map<T, Integer> map = new HashMap<>();
        ArrayList<T> store = new ArrayList<>(); 
        
        for (T item: anotherBag.toArray()) {
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        
        for (T item: this.toArray()) {
            if (map.getOrDefault(item, 0) <=0){
                store.add(item);
            }
            else if (map.containsKey(item)){
                map.put(item, map.get(item)-1);
            }
        }
        
        ArrayBag <T> newBag = new ArrayBag<>(store.size());
        for (T item: store) {
            newBag.add(item);
        }
        
        return newBag;
    
    }
    
}
