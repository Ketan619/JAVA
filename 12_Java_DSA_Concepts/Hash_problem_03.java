import java.util.HashMap;

public class Hash_problem_03 {
     public static void main(String[] args) {
       String str="aabbcddef";

    // String[] newStr= str.split(" "); 
     HashMap<Character,Integer>map=new HashMap<>();
     for (char ch:str.toCharArray()) {
         map.put(ch, map.getOrDefault(ch, 0) + 1);

     }
   System.out.print("CHARACTER AT FREQUENCY 1=");
     for(char ch:map.keySet()){
        if (map.get(ch)==1) {
            System.out.println(ch);
        }
     }
    }
}
