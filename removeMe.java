import java.util.ArrayList;

public class removeMe {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0);
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
        nums.add(6);
        nums.add(7);
        nums.add(3);
        nums.add(9);
        nums.add(3);
        
        nums = removeMe(nums);
        System.out.println(nums);
    }

    public static ArrayList<Integer> removeMe(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) == 3) {
                list.remove(i);
            }
        }
        return list;
    }
}