import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        // IPL Team list using ArrayList
        ArrayList<String> teams = new ArrayList<>();

        // 1. Add some items in list 
        teams.add("RCB");
        teams.add("PBSK");
        teams.add("MI");
        System.out.println("1. Initial teams: " + teams);

        // 2. Add at specific index
        teams.add(2, "GT");
        System.out.println("2. After adding 'GT' at index 2: " + teams);

        // 3. Replace a team at index 0
        teams.set(0, "KKR");
        System.out.println("3. After replacing index 0 with 'KKR': " + teams);

        // 4. Get team at index 1
        System.out.println("4. Team at index 1: " + teams.get(1));

        // 5. Remove a team by index
        System.out.println("5. Removed team at index 1: " + teams.remove(1));
        System.out.println("   Teams after removal: " + teams);

        // 6. Remove team by value
        teams.remove("GT");
        System.out.println("6. Removed 'GT' by name: " + teams);

        // 7. Check if a team is present
        System.out.println("7. Contains 'MI'? " + teams.contains("MI"));

        // 8. Find index of a team
        System.out.println("8. Index of 'MI': " + teams.indexOf("MI"));

        // 9. Sort the list
        Collections.sort(teams);
        System.out.println("9. Teams after sorting: " + teams);

        // 10. Reverse the list
        Collections.reverse(teams);
        System.out.println("10. Teams after reversing: " + teams);

        // 11. Size of the list
        System.out.println("11. Total number of teams: " + teams.size());

        // 12. Print all teams using for-each loop
        System.out.println("12. Looping through teams:");
        for (String team : teams) {
            System.out.println("- " + team);
        }

        // 13. Clear the list
        teams.clear();
        System.out.println("13. After clearing: " + teams);

        // 14. Check if list is empty
        System.out.println("14. Is team list empty? " + teams.isEmpty());
    }
}
