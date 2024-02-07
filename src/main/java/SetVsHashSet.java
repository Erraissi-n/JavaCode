import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetVsHashSet {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(Arrays.asList("Apple", "Orange", "Banana"));
        fruits.add("Pineapple");
        fruits.add("Pineapple");

        System.out.println(fruits);
        System.out.println("Using for loop");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("Using for lambda");
        fruits.forEach(System.out::println);
        System.out.println("Using for iterator");
        Iterator<String> fruitsIterator = fruits.iterator();
        while(fruitsIterator.hasNext()){
            System.out.println(fruitsIterator.next());
        }
    }
}
