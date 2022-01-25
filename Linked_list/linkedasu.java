package OOP.Linked_list;
import java.util.LinkedList;
public class linkedasu {
    
    public static void main(String[] args) {
        LinkedList<String> obj1 = new LinkedList<String>();
        obj1.add("Teguh");
        obj1.add("Babi");
        System.out.println(obj1);

        obj1.addFirst("PERTAMA");
        System.out.println(obj1);

        obj1.addLast("Terakhir");
        System.out.println(obj1);

        System.out.println(obj1.getFirst());
        System.out.println(obj1.getLast());
        System.out.println(obj1.get(1));

        obj1.remove();
        System.out.println(obj1);

        obj1.removeFirst();
        System.out.println(obj1);

        obj1.removeAll(obj1);
        System.out.println(obj1);


    }
}
