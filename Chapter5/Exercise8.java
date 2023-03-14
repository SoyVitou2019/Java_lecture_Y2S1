
/* Method LocateSmallest with ArrayList */
import java.util.ArrayList;
import java.util.Random;

public class Exercise8 {

      static ArrayList<Integer> locateSmallest(ArrayList<ArrayList<Float>> arrayList2D) {

            ArrayList<Integer> location = new ArrayList<>();

            float smallestNum = 200.99f;

            for (int i = 0; i < arrayList2D.size(); i++) {
                  for (int j = 0; j < arrayList2D.get(i).size(); j++) {
                        if (arrayList2D.get(i).get(j) < smallestNum) {

                              location.clear();
                              location.add(i);
                              location.add(j);

                              smallestNum = arrayList2D.get(i).get(j);
                        }
                  }
            }
            System.out.println("\nThe smallest number of array: " + smallestNum);
            return location;
      }

      static ArrayList<ArrayList<Float>> generate2DArrayList() {

            Random rand = new Random();

            ArrayList<ArrayList<Float>> arrayList2D = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                  ArrayList<Float> tempArray = new ArrayList<>();
                  for (int j = 0; j < 4; j++) {
                        float ranNum = rand.nextFloat() * (200.99f - 100.00f) + 100.00f;
                        tempArray.add(ranNum);
                  }
                  arrayList2D.add(tempArray);
            }

            return arrayList2D;
      }

      public static void main(String[] args) {

            ArrayList<ArrayList<Float>> arrayList2D = generate2DArrayList();

            System.out.println("ArrayList Zin: ");
            System.out.println(arrayList2D);

            System.out.println("The smallest number location: " + locateSmallest(arrayList2D));

      }
}
