package OOP.wrapper_class;

public class wrap {
    public static void main(String[] args) {
        
    //wrap kelas digunakan utnuk mengganti  pengaksesan primitif type sebagai object
    Integer Myint = 10;
    System.out.println(Myint);
    //Myint adalah object yg dpaat mengakses keadaan sekarang dengan methode
    //yg koresporenden dnegan wrapper object untuk mengakses nilai dapat dilakukan methode
    //intValue(), byteValue(), shortValue(), longValue(), floatValue(),
    // doubleValue(), charValue(), booleanValue()
    System.out.println(Myint.intValue());
    //the output will same bro but the acces with know about certain information from the wrapper object

    //u can convert wrapper class
    String myString = Myint.toString();
    System.out.println(myString);
    System.out.println(myString.length());

    /*
      int value;
      value. ini tidak dapat memanggil methode untukmengetahui informasi dari atribut
      tapi dengan wrapper class dpt mengetahui informasi dari wrapper object 
      
    */
    }
}
