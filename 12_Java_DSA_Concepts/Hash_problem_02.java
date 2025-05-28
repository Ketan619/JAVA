import java.util.HashMap;

public class Hash_problem_02 {
    
    public static void main(String[] args) {
       String str="java is programming programming is java";

    String[] newStr= str.split(" "); 
     HashMap<String,Integer>map=new HashMap<>();
     for (String ch:newStr) {
         map.put(ch, map.getOrDefault(ch, 0) + 1);

     }
     System.out.println(map);
    }
}

