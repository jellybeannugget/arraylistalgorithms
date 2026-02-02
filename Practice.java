//yusef feb 2nd
import java.util.ArrayList;


public class Practice{


   public static void main(String[] args) {
    Integer i = 30;
    Double d = 40.3;
       System.out.println(Integer.MIN_VALUE);
       System.out.println(Integer.MAX_VALUE);

    System.out.println("Area: " + i*d);

    ArrayList <String> list = new ArrayList <String>();
    list.add("Michael");
    list.add("Jessica");
    list.add("Lee");
    list.add(1, "Sarah");
    String store = list.set(2, "Mary");
    String store2 = list.get(3);
        System.out.println(list);
    

}
}