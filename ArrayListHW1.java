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
            boolean isDupes = findDuplicates(nums);
             System.out.println("Sum of ArrayList: " + sum); 
             System.out.println("Average of ArrayList: " + avg);
              System.out.println("Maximum value: " + max);
               System.out.println("Minimum value: " + min); 
<<<<<<< HEAD
                System.out.println("Are there duplicates? : " + isDupes); 
                accessPairs(nums);
=======
               System.out.println("Doubled list: " + dupe(nums)); 
>>>>>>> 78bd7c768d7e0ff40c608f1f7d07262c737f1978

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
<<<<<<< HEAD

                            public static boolean findDuplicates(ArrayList<Integer> a){
                              for (int i = 0; i < a.size(); i++){
                                 for (int j = i+1; j < a.size(); j++){
                                    if (a.get(i).equals(a.get(j))){
                                       return true;
                                    }
                                 }
                              }
                              return false;
                            }


                            public static void accessPairs(ArrayList<Integer> list) {
                               for (int i = 0; i < list.size() - 1; i++) { 
                                 int first = list.get(i); 
                                 int second = list.get(i + 1); 
                                 System.out.println("pair: " + first + ", " + second);
                               } 
                              }
                        }
=======
                        

                        public static ArrayList<Integer> dupe(ArrayList<Integer> list){
                           ArrayList<Integer> newNums = new ArrayList<>();

                           for (int i = 0; i < list.size(); i++) {
                              newNums.add(list.get(i));
                              newNums.add(list.get(i));
                        }
                        return newNums;
                     }
                  }
>>>>>>> 78bd7c768d7e0ff40c608f1f7d07262c737f1978
