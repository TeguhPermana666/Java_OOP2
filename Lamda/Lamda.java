package OOP.Lamda;

import java.util.ArrayList;
import java.util.function.Consumer;

interface stringfunction{//default adalah default
    String run(String str);
}

public class Lamda {
    /*

    Lamda mirip dengan methode tapi tidak memeiliki sebuah nama mengambil 
    nilai dari parameter dan mereturnnya bisa diimplemen ke body methode
    */
    //Parameter -> expresion yahh like the fucking kotlin

    //2 paramter? wrap them to ()
    //(parameter1,parameter2)->expresion
    /*
    expresion disini dia just return value cant used to contain the bitch atribut

    code block? just {}=>used for complex your code to contain whatever
    (parameter1,parameter2)->{
        u want return value?
        just tap statement return value;
    }
    */

    //lamda expresion=>pass parameter to function
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("Teguh");
        nama.add("Permana");
        nama.add("KIMOCI");
        
        nama.forEach((s)->System.out.println(s));

        //cara kedua pakai consumer untuk nyimpen ke variabel a
        //lamda methode
        Consumer<String>a =(s)-> {
            System.out.println(s);
        };
        nama.forEach(a);
        // Create a method which takes a lambda expression as a parameter
            //lamda methode from class interface
        stringfunction perintah = (s)->(s+"!");
        stringfunction tanya = (s)->(s+"?");//harus function constructor= function constructor
        //stringfunction nilai = "babi";error

        stringformat("Teguh",perintah);
        stringformat("Teguh",tanya);

    }
    public static void stringformat(String str,stringfunction object){
        String result = object.run(str);
        System.out.println(result);
    }
}
    
