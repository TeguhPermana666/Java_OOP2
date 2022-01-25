package OOP.methode;

public class Main {
    //Different of public and static of methode and atribut
    /*
    Public=> pengaksesan harus dengan object yang dibuat dari claas
    static=>pengaksesan tidak harus melalui object tapi secara langsung panggil aja nama atribut ata methodenya

    */
    public void mobil (){
        System.out.println("Public diakses harus melalui object");
    }
    static void motor(){
        System.out.println("Static diakes secara langsung");
    }
    public static void main(String[] args) {
        //Public acces
        Main bum =new Main();
        bum.mobil();
        //Private accses
        motor();

        //Methode of class
        list obj1 = new list();
        System.out.println(obj1.var);
        obj1.nilai(30);
        
        System.out.println(list.nalai(10));
        System.out.println(list.vir);
    }
}
