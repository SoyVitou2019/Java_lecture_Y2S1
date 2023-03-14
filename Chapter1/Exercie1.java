import java.util.Scanner;

class Exercie1
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        while ( total <= 50 )
        {
            System.out.print("Enter number :");
            int number = input.nextInt();
            total = number;
            System.out.println("The total is " + total);
        }
        input.close();
    }
}