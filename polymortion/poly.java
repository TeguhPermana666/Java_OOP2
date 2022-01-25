package OOP.polymortion;
//default is like same to public but is only to one package yang sama
class animal{
    //menggunakan metode overide->mengoveride fungsi dari superclass  ke subclass apablia
    //superclass object = new subclass();,jadi isi yang ditampilkan 
    public void sound(){
        System.out.println("Aku adalah hewan auuuuuud");
    }
}

class pig extends animal{
    public void sound(){
        System.out.println("IAM PROG crog crog");
    }
}

class dog extends animal{
    public void sound(){
        System.out.println("Iam dog style augg");
    }
    static void state(){
        System.out.println("TEST STATIC");
    }
}

public class poly {
    public static void main(String[] args) {
        //call methode of parent 
        animal mysound = new animal();//because public modify
        mysound.sound();//methode is public jadi harus diakses dengan created object

        //call methode on child of parent class extends
        animal mypig = new pig();// membuat object pig child untuk class extends dari animal sebagai parent
        mypig.sound();//methode is public jadi harus diakses dengan created object

        //call methode on child of parent class extends
        animal mydog=new dog();// membuat object dog child untuk class extends dari animal sebagai parent
        mydog.sound();//methode is public jadi harus diakses dengan created object
        dog.state();//methode is static jadi accesing tidak harus menggunakan object
    }
}
