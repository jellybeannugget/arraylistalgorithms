import java.util.ArrayList; 
public class RemoveDupes {
     public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>();
    
         for (int i = 0; i < 20; i++)
             { 
            list.add((int)(Math.random() * 10) + 1); 
        } 
         
         System.out.print("Original: ");
          for (int i = 0; i < list.size(); i++)
             { 
            System.out.print(list.get(i) + " "); 
        } 
        System.out.println(); 
         list = removeDuplicates(list); 
         
         System.out.print("After removing duplicates: "); 
         for (int i = 0; i < list.size(); i++) { 
            System.out.print(list.get(i) + " ");
         }
          System.out.println(); 
        } 


        public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) 
        { 
            for (int i = 0; i < list.size(); i++)
                 { 
                for (int j = i + 1; j < list.size(); j++)
                     { 
                    if (list.get(i).equals(list.get(j)))
                         { 
                        System.out.println("Removing: " + list.get(j)); 
                        list.remove(j); j--; 
                         }
                     }
                 }
              return list;  
             }
          }