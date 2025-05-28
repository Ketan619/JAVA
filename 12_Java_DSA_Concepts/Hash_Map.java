
import java.util.HashMap;
public class Hash_Map {
 public static void main(String[] args) {
    HashMap<String,Integer> map=new HashMap<>();
    map.put("id1",1);
    map.put("id2",2);
    map.put("id3",3);
    map.put("id4",4);
    System.out.println(map);
    // System.out.println(map.get("id2"));
    System.out.println(map.getOrDefault("id5", 5));
    // System.out.println("show values "+map.values());
    // System.out.println("show keys "+map.keySet());

 }   
}
