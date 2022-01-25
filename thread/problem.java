package OOP.thread;

public class problem extends Thread {
    //problem if thread and main membaca dan menulis same variabel
    //==>solusi:isAlive();
    public static int amount =0;//unspected

    public static void main(String[] args) {
        problem object= new problem();
        object.start();
        while(object.isAlive()){//jika sudah die maka false, selama alive(berjalan) maka loping delay
            System.out.println("LOADING...");
        }
        System.out.println(amount);
        System.out.println(++amount);
    }
    public void run(){
        amount++;//global ga perlu return
    }
}
