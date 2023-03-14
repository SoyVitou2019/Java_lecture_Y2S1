/* Class: ITE-G8-Y2-A
Group06:
1. Chhoeng Khengseang
2. Soy Vitou
3. Yoo Seryvathana
4. Lany Malis */

/* Method Remove Integer form ArrayList */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 
{
    public static void removeInt(ArrayList<Integer> arrayList, int deleteNumber) // To take the arraylist and deletenumber from main
    {
    
        System.out.println();
        // Check for delete
        if (arrayList.removeIf(Integer.valueOf(deleteNumber)::equals)) // The value equal deleteNumber
        {
            System.out.println("You removed successfully.");
        }
        // Otherwish display this
        else
        {
            System.out.println("The array list don't have this interger.(-,-)");
        }
        
        
    }

    public static void main(String[] args) 
    {
        // create array list 
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList());
        arrayList.add(34);
        arrayList.add(168);
		arrayList.add(1563);
		arrayList.add(-98);
		arrayList.add(8);
		arrayList.add(8);
		arrayList.add(31);
        
        // Display the original array list
        System.out.print("The original array list is : ");
        for ( Integer ArrayList : arrayList)
        {
            System.out.print( ArrayList+ "  ");
        }
        
        // Create varible to store the number that want to delete
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number that you want to delete : ");
        int deleteNumber = input.nextInt();
        input.close();
        
        // Call method to remove number
        removeInt(arrayList, deleteNumber);

        // Display the last array list
        System.out.print("The last array list is : ");
        for ( Integer ArrayList : arrayList)
        {
            System.out.print( ArrayList+ "  ");
        }
    }
    
}
