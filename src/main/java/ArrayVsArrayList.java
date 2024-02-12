import java.util.*;
import java.util.function.UnaryOperator;

public class ArrayVsArrayList {
    public static void main(String[] args){
        //Declare Array Vs ArrayList and initialize them
        String[] friendsArray = {"Anas", "Khalid", "Bader", "Hicham"};
        int[] numbersArray = {9, 0, 3};
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("Anas", "Khalid", "Bader", "Hicham"));
        ArrayList<Integer> numbersArrayList = new ArrayList<>(Arrays.asList(1, 2, 3));

        //Get an element
        System.out.println(numbersArray[0]);
        System.out.println(numbersArrayList.get(0));


        //Get length
        System.out.println(numbersArray.length);    //field
        System.out.println(numbersArrayList.size());  //method

        //Set an element
        numbersArray[1] = 2;
        friendsArray[0] = "Ayoub";
        numbersArrayList.set(0, 7);
        friendsArrayList.set(0, "Khalid");

        //Remove an element
        //you can not do that for an Array because it has a fixed size
        friendsArrayList.remove(2);

        //Add in element
        //You can not add an element to an Array because it has a fixed size, but you can set an element as long as the array is not full
        friendsArrayList.add("Mustapha");



        //print Array Vs ArrayList
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersArrayList);
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(friendsArrayList);

        //Sort
        Arrays.sort(numbersArray);
        Arrays.sort(friendsArray);
        Collections.sort(numbersArrayList);
        Collections.sort(friendsArrayList);
        String[] StringArrayList = friendsArrayList.toArray(new String[0]);
        Arrays.sort(StringArrayList);
        ArrayList<String> sortedFriendsArrayList = new ArrayList<>(Arrays.asList(StringArrayList));
        System.out.println(Arrays.toString(numbersArray));
        System.out.println(numbersArrayList);
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(sortedFriendsArrayList);
        System.out.println(friendsArrayList);
    }
}
