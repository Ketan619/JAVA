import java.util.HashMap;

public class Hash_Map_problem_01 {
    public static void main(String[] args) {
        String str="PROGRAMMING";
     HashMap<Character,Integer>map=new HashMap<>();
     for (char ch:str.toCharArray()){
        map.put(ch,map.getOrDefault(ch, 0)+1);

     }
     System.out.println(map);
    }
}
