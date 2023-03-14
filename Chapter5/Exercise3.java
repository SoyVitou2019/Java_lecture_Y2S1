/*Read Input Integer into ArrayList Until User input 0, Store No-Dupplicate Integer */
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise3 {
      public static void main(String[] args) {
            int number;
            ArrayList<Integer> arrayList = new ArrayList<>();

            //User Input
            Scanner input = new Scanner(System.in);
            do{
                  //Continue Asking User to Input integer
                  System.out.print("Please Enter a number: ");
                  number = input.nextInt();
                  //Check dupplicate number
                  if (!arrayList.contains(number) && number != 0) {
                        arrayList.add(number);
                  }
                  else{
                        continue;
                  }    
            }
            //Check 0 
            while (number != 0);  

            input.close();

            //Display ALL element 
            System.out.println("The number in Array: ");
            for (int i = 0; i < arrayList.size(); i++) {
                  System.out.print(arrayList.get(i) + " ");
            }
      }
      
}
