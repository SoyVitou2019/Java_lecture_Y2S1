// Points nearest to each other
import java.util.Arrays;
public class Exercise6 {
    public static void main(String[] args) {
        //Create 2D array
        double[][] points = {
                { -1, 0, 3 },
                { -1, -1, -1 },
                { 4, 1, 1 },
                { 2, 0.5, 9 },
                { 3.5, 2, -1 },
                { 3, 1.5, 3 },
                { -1.5, 4, 2 },
                { 5.5, 4, -0.5 }
        };
        //Declare Variable
        int firstPoint = 0;
        int secondPoint = 1;

        double distance = 0;
        double shortestDistance = Math.sqrt(Math.pow(points[0][0] - points[1][0], 2)
                + Math.pow(points[0][1] - points[1][1], 2) + Math.pow(points[0][2] - points[1][2], 2));

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                // Calculate distance two different point 
                if (j != i) {
                    distance = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2)
                            + Math.pow(points[i][1] - points[j][1], 2) + Math.pow(points[i][2] - points[j][2], 2));
                    // Find Shortest distance
                    if (shortestDistance > distance) {
                        firstPoint = i;
                        secondPoint = j;
                        shortestDistance = distance;
                    }
                }
            }
        }
        //Display 
        System.out.println(Arrays.toString(points[firstPoint]) + " - " + Arrays.toString(points[secondPoint]) + " = "
                + Math.floor(shortestDistance * 1e3) / 1e3);
    }
}