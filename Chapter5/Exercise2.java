/*Method Remove Dupplicate Integer from ArrayList */
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise2
{
    public static void removeDupplicate(ArrayList<Integer> arrayList)
    {
        //loop from 0 to size of array -1
        for ( int i = 0; i < arrayList.size(); i++)
        {
            //loop from  i+1 to size
            for ( int j = i + 1; j<arrayList.size(); j++)
            {
                //check if have dupplicate number
                if (arrayList.get(i)== arrayList.get(j))
                {
                    arrayList.remove(j);  //remove that dupplicate number
                    i--;   //move left 1
                    break;
                }
                
            }
            
        }
        
    }

    public static void main(String[] args) 
    {

        // Create array list
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList());
        arrayList.add(34);
        arrayList.add(34);
        arrayList.add(168);
		arrayList.add(1563);
		arrayList.add(-98);
		arrayList.add(8);
        arrayList.add(34);
		arrayList.add(8);
		arrayList.add(31);
        arrayList.add(8);
        arrayList.add(34);
        arrayList.add(34);
        
        // System.out.println("ArrayList : "+arrayList);
        System.out.print("The original array list has : ");
        for ( Integer ArrayList : arrayList)
        {
            System.out.print( ArrayList+ "  ");
        }
        
        // Call method to remove number
        removeDupplicate(arrayList);

         // Display the last array list
        System.out.println();
        System.out.print("The last array list after remove dupplicate has : ");
        for ( Integer ArrayList : arrayList)
        {
            System.out.print( ArrayList+ "  ");
        }
    }
    
}