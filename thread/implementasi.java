package OOP.thread;
public class implementasi implements Runnable{
    public void run(){
        System.out.println("jalan dalam threads");
    }
    public static void main(String[] args) {
        implementasi object2 = new implementasi();
        //object1.start();=>blm nyambung dengan thread
        
        //Saatnya object 2 ->class implementasi extends Thread class melalui Objectthread

        Thread Objectthread = new Thread(object2);//object1 nyambung dengan constructor thread melalui pembuatan object
        //objectthread mengandung object implements dari kelas implementasi=>baru bisa start
        Objectthread.start();//now can be start
        System.out.println("DILUAR thread");
    }
}
/*  canntot because class implementasi sudah di definisikan jika mau baru buat class file baru
public class implementasi extends Thread{
    public void run(){
        System.out.println("RUN IN thread");
    }
}
*/

//jika tidak ada main blm bisa jalan
//perlu main untuk menjalankan thread-nya

