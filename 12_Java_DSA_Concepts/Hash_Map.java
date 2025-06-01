
import java.util.HashMap;
public class Hash_Map {
 public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();
    map.put("id1",1);
    map.put("id2",2);
    map.put("id3",3);
    map.put("id4",4);
     System.out.println(map);
    System.out.println("specfic"+ map.get("id4"));//specfic
    System.out.println(map.getOrDefault("id5", 5));//not in the list defalut value
     System.out.println(map.getOrDefault("id1", null));//if in the list print the value
    System.out.println("show all values "+map.values());
     System.out.println("show keys "+map.keySet());
HashMap<Integer, String> map1 = new HashMap<>();
map1.put(101, "Virat");
map1.put(102, "ABD");

System.out.println(map1.get(101)); // ➤ Output: Virat
System.out.println(map1.values()); // ➤ Output: [Virat, ABD]
 }   
}
///////
