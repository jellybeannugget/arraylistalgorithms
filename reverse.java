import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList <String> num = new ArrayList <String>();
        num.add("1");
        num.add("2");
        num.add("7");
        num.add("5");
        System.out.println(num);
        System.out.println(reverseThis(num));

    }
    public static ArrayList<String> reverseThis(ArrayList<String> Arraylist){
        ArrayList <String> reverse = new ArrayList <String>();

        for (int i = Arraylist.size()-1; i >= 0; i--){
reverse.add(Arraylist.get(i));
        }
    return reverse;
    }
}
