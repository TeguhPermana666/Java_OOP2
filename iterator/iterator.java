package OOP.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        
    //make class collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("hai");
    cars.add("Manis");
    cars.add("tapi bohong");

    //mmendapatkan iterator => it
    Iterator<String> it = cars.iterator();
    //print
    System.out.println(it.hasNext());//untuk fillter perulangan
    System.out.println(it.next());//untuk akses value dengan melempar index
    
    //mencetak per index
    while(it.hasNext()){
        System.out.println(it.next());
    }
    ArrayList<Integer> object1= new ArrayList<Integer>();
    object1.add(10);
    object1.add(20);
    object1.add(30);
    object1.add(8);
    object1.add(7);
    object1.add(6);
    Iterator<Integer>itu = object1.iterator();
    while(itu.hasNext()){
        if(itu.next()<10){
            itu.remove();
        }
    }
    System.out.println(object1);

    }
}
