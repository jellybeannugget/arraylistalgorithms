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
    

        for (int in = 0; in < list.size(); in++){
           if(list.get(in).substring(0,1).equals("L")){
              list.set(in, "JIG");
           }
        System.out.println(list.get(in));
        }

        int j = 0;
        while (j<list.size()){
         
           if(list.get(j).indexOf("Michael") >= 0){
              list.remove(j);
           }
           else{
              j++;
           }
           System.out.println(list.get(j));
         
         
}

for (String lis : list) {
 //  System.out.println(list.get(lis));

}
}}