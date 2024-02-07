import java.util.*;

public class CollectionData {
    public static void main(String[] args) {
        Map<String, Integer> dataMap = new LinkedHashMap<>();
        dataMap.put("A", 11);
        dataMap.put("Q", 1);
        dataMap.put("I", 8);
        dataMap.put("W", 2);
        dataMap.put("G", 15);
        dataMap.put("P", 10);
        System.out.println(dataMap);
        Stack<Integer> dataStack = new Stack<>();
        dataStack.push(1);
        dataStack.push(2);
        dataStack.push(3);
        dataStack.push(4);
        dataStack.pop();
        System.out.println(dataStack);
    }
}
