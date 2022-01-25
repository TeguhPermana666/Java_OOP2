public class threadd extends Thread{
        //thread dapat mengcomplicated task in the background without interrupt in main
        //create thread:
        //1.It can be created by extending the Thread class and overriding its run() method:
        public void run () {
            System.out.println("Code berjalan dengan thread");
        }
        public static void main(String[] args) {
            threadd object1 = new threadd();
            object1.start();//menjalankan thread

            System.out.println("ini jalan diluar thread");

        } 
    }
       
