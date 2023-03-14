/* Method rotateRight with ArrayList */
import java.util.ArrayList;
import java.util.Arrays;

class Exercise6{
    public static void main(String[] args) {

        // create object arrayList and asssign value directly
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1,3,5));

        // display default arraylist
        System.out.println(arrList.toString());

        // display update arrayList
        System.out.println(rotateRight(arrList));
        
    }
    // declearation method rotate elements to right 2 slot
    public static ArrayList<Integer> rotateRight(ArrayList<Integer> arrList){
        // dynamic rotate two slote to right
        for (int i = 0; i < 2; i++) {
            // store remove element
            int lastElement = arrList.remove(arrList.size() - 1);
            // add elements thats has removed to first index
            arrList.add(0, lastElement);
        }
        // return result
        return arrList;
    }
}
