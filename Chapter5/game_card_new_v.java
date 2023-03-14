import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class game_card_new_v {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String continues = "";

        // Game Loop
        while (!continues.equalsIgnoreCase("n")) {

            ArrayList<String> player = new ArrayList<>();
            ArrayList<String> machine = new ArrayList<>();

            int total_Machine = 0;
            int total_player = 0;

            // check player check or not
            boolean player_draw = false;
            // draw card and shuffle card 52
            ArrayList<String> card = card52();
            // shuffle card
            continues = "";
            // assign card first to machine and than player
            machine.add(card.get(0));
            player.add(card.get(1));
            machine.add(card.get(2));
            player.add(card.get(3));

            total_Machine = calculate_score(machine);
            total_player = calculate_score(player);
            if (total_Machine >= 8 || total_player >= 8) {
                // automatically win with automatic win function
                automaticallyWin(total_Machine, total_player, machine, player);
            } else {
                // add third card
                if (total_Machine <= 3 || total_Machine == 10) {
                    machine.add(card52().get(4));
                    if (isNumeric(machine.get(2).charAt(0) + "") && machine.get(2).length() < 3) {
                        total_Machine += Integer.valueOf(machine.get(2).charAt(0) + "");
                    }

                    // add third card
                } else if (total_Machine == 4) { // if Machine got score 4 probability is 80%
                    int probability = rand.nextInt(100)+1;
                    if (probability <= 80) {
                        machine.add(card52().get(4));
                        if (isNumeric(machine.get(2).charAt(0) + "") && machine.get(2).length() < 3) {
                            total_Machine += Integer.valueOf(machine.get(2).charAt(0) + "");
                        }
                    }
                    // add third card
                } else if (total_Machine == 5) {
                    // if Machine got score 5 probability is 40%
                    int probability = rand.nextInt(100)+1;
                    if (probability <= 40) {
                        machine.add(card52().get(4));
                        if (isNumeric(machine.get(2).charAt(0) + "") && machine.get(2).length() < 3) {
                            total_Machine += Integer.valueOf(machine.get(2).charAt(0) + "");
                        }
                    }
                    // add third card
                } else if (total_Machine == 6) {
                    // if Machine got score 6 probability is 10%
                    int probability = rand.nextInt(100)+1;
                    if (probability <= 10) {
                        machine.add(card52().get(4));
                        if (isNumeric(machine.get(2).charAt(0) + "") && machine.get(2).length() < 3) {
                            total_Machine += Integer.valueOf(machine.get(2).charAt(0) + "");
                        }
                    }

                }

                for (int i = 0; i < 2; i++) {
                    System.out.println(" Card Player " + (i + 1) + " : " + player.get(i));
                }
                System.out.println("--------------------------------------------------");
                System.out.println("      Totals :  " + total_player);
                System.out.println("--------------------------------------------------");

                // ask user draw card or not?
                System.out.print("Do you want to draw one more ? (y/N) : ");
                String draw_card_player = input.next();
                System.out.println("--------------------------------------------");
                if (draw_card_player.equalsIgnoreCase("y")) {
                    // set player draw to true
                    player_draw = true;

                    player.add(card52().get(4));

                    // add score to total score of player
                    if (isNumeric(player.get(2).charAt(0) + "") && player.get(2).length() < 3) {
                        total_player += Integer.valueOf(player.get(2).charAt(0) + "");
                    }
                }
                win_stage(total_Machine, total_player, player_draw, machine, player);

            }
            System.out.print("Do you want to continue ? (y/n) : ");
            continues = input.next();
            System.out.println("--------------------------------------------");
        }
        input.close();

    }

    // declearation method
    public static ArrayList<String> card52() {
        ArrayList<String> card_str = new ArrayList<>(Arrays.asList("1H", "1D", "1C", "1S", "2H", "2D", "2C", "2S", "3H",
                "3D", "3C", "3S",
                "4H", "4D", "4C", "4S", "5H", "5D", "5C", "5S", "6H", "6D", "6C", "6S", "7H", "7D", "7C", "7S", "8H",
                "8D", "8C", "8S", "9H", "9D", "9C", "9S",
                "10H", "10D", "10C", "10S", "JH", "JD", "JC", "JS", "QH", "QD", "QC", "QS", "KH", "KD", "KC", "KS"));
        Collections.shuffle(card_str);
        return card_str;
    }

    // use for check it number or string
    private static boolean isNumeric(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static int calculate_score(ArrayList<String> player) {
        int total_score = 0;
        if (isNumeric(player.get(0).charAt(0) + "") && player.get(0).length() < 3) {
            total_score += Integer.valueOf(player.get(0).charAt(0) + "");
        }
        if (isNumeric(player.get(1).charAt(0) + "") && player.get(1).length() < 3) {
            total_score += Integer.valueOf(player.get(1).charAt(0) + "");
        }
        if (total_score >= 10) {
            total_score = Character.getNumericValue((total_score + "").charAt(1));
        }
        return total_score;
    }

    public static void automaticallyWin(int total_Machine, int total_player, ArrayList<String> machine,
            ArrayList<String> player) {

        for (int i = 0; i < machine.size(); i++) {
            System.out.println("Card machine " + (i + 1) + " : " + machine.get(i) + " | Card Player " + (i + 1) + " : "
                    + player.get(i));
        }
        System.out.println("--------------------------------------------------");
        System.out.println("        Totals : " + total_Machine + "         Totals :  " + total_player);
        System.out.println("--------------------------------------------------");
        if (total_Machine > total_player) {
            System.out.println("                Machine was auto win !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        } else if (total_player > total_Machine) {
            System.out.println("                You are Auto win !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        } else if (total_Machine == total_player) {
            System.out.println("             You're auto draw with Machine !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        }
    }

    public static void win_stage(int total_Machine, int total_player, boolean player_draw, ArrayList<String> machine,
            ArrayList<String> player) {
        // round machine score
        if (total_Machine >= 10) {
            total_Machine = Character.getNumericValue((total_Machine + "").charAt(1));
        }

        // round player score
        if (total_player >= 10) {
            total_player = Character.getNumericValue((total_player + "").charAt(1));
        }

        // card machine equal card player
        if (player_draw) {
            System.out.println("======================================");
            for (int i = 0; i < machine.size(); i++) {
                System.out.println("Card machine " + (i + 1) + " : " + machine.get(i) + " | Card Player " + (i + 1)
                        + " : " + player.get(i));
            }
            System.out.println("--------------------------------------------------");
            System.out.println("        Totals : " + total_Machine + "         Totals :  " + total_player);
            System.out.println("--------------------------------------------------");
        } else {
            System.out.println("======================================");
            for (int i = 0; i < 2; i++) {
                System.out.println("Card machine " + (i + 1) + " : " + machine.get(i) + " | Card Player " + (i + 1)
                        + " : " + player.get(i));
            }
            if (machine.size() == 3) {
                System.out.println("Card machine " + (3) + " : " + machine.get(2));
            }
            System.out.println("--------------------------------------------------");
            System.out.println("        Totals : " + total_Machine + "         Totals :  " + total_player);
            System.out.println("--------------------------------------------------");
        }

        if (total_Machine > total_player) {
            System.out.println("                Machine was win !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        } else if (total_player > total_Machine) {
            System.out.println("                  You are win !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        } else if (total_Machine == total_player) {
            System.out.println("               You're draw with Machine !");
            System.out.println("--------------------------------------------------");
            System.out.println();
        }
    }

}
