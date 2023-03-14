/* Method getIntersection with ArrayList */
import java.util.ArrayList;
import java.util.Random;

public class Exercise7 {

    static ArrayList<Character> randomCharacter() {

        Random random = new Random();
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int ranNum = random.nextInt(90 - 65) + 65;
            Character charToAdd = Character.valueOf((char) (ranNum));

            if (!arrayList.contains(charToAdd))
                arrayList.add(charToAdd);
            else
                i -= 1;

        }

        return arrayList;
    }

    static ArrayList<Character> getIntersection(ArrayList<Character> arrayList1, ArrayList<Character> arrayList2) {

        ArrayList<Character> intersectArray = new ArrayList<>();

        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList2.contains(arrayList1.get(i))) {
                intersectArray.add(arrayList1.get(i));
            }

        }

        return intersectArray;

    }

    public static void main(String[] args) {

        ArrayList<Character> arrayList1 = randomCharacter();
        ArrayList<Character> arrayList2 = randomCharacter();

        System.out.println(arrayList1);
        System.out.println(arrayList2);

        System.out.println("\nThis is arrayList of intersect element from 2 arrayList: ");
        System.out.println(getIntersection(arrayList1, arrayList2));
    }
}
