import java.util.ArrayList;
 public class ArrayListHW1 { 
    public static void main(String[] args) { 
        ArrayList<Integer> nums = new ArrayList<>();
         for (int i = 0; i < 50; i++) 
         { int value = (int)(Math.random() * 101); 
            nums.add(value);
          } 
            int sum = getSum(nums); 
            double avg = getAverage(nums); 
            int max = getMax(nums); 
            int min = getMin(nums);
             System.out.println("Sum of ArrayList: " + sum); 
             System.out.println("Average of ArrayList: " + avg);
              System.out.println("Maximum value: " + max);
               System.out.println("Minimum value: " + min); 
               System.out.println("Doubled list: " + dupe(nums)); 

            } 
         
            public static int getSum(ArrayList<Integer> list) {
                 int total = 0; 
                 for (int i = 0; i < list.size(); i++) {
                     total += list.get(i); 
                    } 
                    return total;
                 } 
             
                 public static double getAverage(ArrayList<Integer> list) { 
                    return (double)getSum(list) / list.size(); 
                } 
               
                public static int getMax(ArrayList<Integer> list) {
                     int max = list.get(0); 
                     for (int i = 1; i < list.size(); i++) { 
                        if (list.get(i) > max) { 
                            max = list.get(i);
                         } 
                        } 
                        return max;
                     } 
                    
                     public static int getMin(ArrayList<Integer> list) {
                         int min = list.get(0);
                          for (int i = 1; i < list.size(); i++) {
                             if (list.get(i) < min) { 
                                min = list.get(i);
                             }
                             }
                              return min; 
                            }
                        

                        public static ArrayList<Integer> dupe(ArrayList<Integer> list){
                           ArrayList<Integer> newNums = new ArrayList<>();

                           for (int i = 0; i < list.size(); i++) {
                              newNums.add(list.get(i));
                              newNums.add(list.get(i));
                        }
                        return newNums;
                     }
                  }