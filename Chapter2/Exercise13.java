import java.util.Scanner;

class Exercise13 {
    public static void main(String[] args) {
        // user input the thier choice
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print(" Enter your choice (scissor(0), rock(1), paper(2)) : ");
            String yourChoice = input.nextLine();

            // chage number to word
            if (yourChoice.equals("0")) {
                System.out.println(" Your choice is: sisscor ");
            } else if (yourChoice.equals("1")) {
                System.out.println(" Your choice is: rock ");
            } else if (yourChoice.equals("2")) {
                System.out.println(" Your choice is: paper ");
            } else {
                System.out.println(" You not allow the rule game -,- ..l..");
                break;
            }

            // randomly generate computer choice (0,1,2)
            int rand = (int) (Math.random() * 3);
            String camputerChoice = "";

            if (rand == 0) {
                camputerChoice = "scissor";
            } else if (rand == 1) {
                camputerChoice = "rock";
            } else {
                camputerChoice = "paper";
            }
            System.out.println(" The Camputer choice is: " + camputerChoice);

            if ((yourChoice.equals("0") && camputerChoice.equals("scissor"))
                    || (yourChoice.equals("1") && camputerChoice.equals("rock"))
                    || (yourChoice.equals("2") && camputerChoice.equals("paper"))) {
                System.out.println(" It is a draw ");
            } else if ((yourChoice.equals("0") && camputerChoice.equals("paper"))
                    || (yourChoice.equals("1") && camputerChoice.equals("scissor"))
                    || (yourChoice.equals("2") && camputerChoice.equals("rock"))) {
                System.out.println(" You won ");
                break;
            } else {
                System.out.println(" You lose ");

            }

        }
        input.close();

    }

}