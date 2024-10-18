import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int point = 0;
        int die1 = 0;
        int die2 = 0;
        boolean done=false;
        boolean done2=false;
        String cont;
        boolean done3 = false;
        String rollAgain;
        boolean done4=false;


            do {
                die1 = rand.nextInt(1, 7);
                die2 = rand.nextInt(1, 7);
                sum = die1 + die2;


                if (sum == 2 || sum == 3 || sum == 12) {
                    System.out.println("Die 1="+die1+" Die 2="+die2+" | You rolled a sum of "+sum+", you crapped out");

                } else if (sum == 7 || sum == 11) {
                    System.out.println("Die 1="+die1+" Die 2="+die2+" | You rolled a sum of "+sum+", you win with a natural!");

                } else {
                    point = sum;
                    System.out.println("Die 1="+die1+" Die 2="+die2+" | You rolled a sum of "+sum+", the point is now " + point);
                    System.out.println("Do you want to roll again? [Y/N]");
                    rollAgain = in.nextLine();
                    if (rollAgain.equals("Y")||rollAgain.equals("y")){
                        do {
                            System.out.println("Rolling...");
                            die1 = rand.nextInt(1, 7);
                            die2 = rand.nextInt(1, 7);
                            sum = die1 + die2;
                            if (sum == 7) {
                                System.out.println("Die 1=" + die1 + " Die 2=" + die2 + " | You rolled a sum of " + sum + ", you lose");
                                done2 = true;
                            } else if (sum == point) {
                                System.out.println("Die 1=" + die1 + " Die 2=" + die2 + " | You rolled a " + sum + ", you win");
                                done2 = true;
                            } else {
                                System.out.println("Die 1=" + die1 + " Die 2=" + die2 + " | You rolled a " + sum + ", roll again? [Y/N]");
                                cont = in.nextLine();
                                do {
                                    if (cont.equals("Y") || cont.equals("y")) {
                                        done4=true;
                                        done3 = true;
                                    } else if (cont.equals("N") || cont.equals("n")) {
                                        System.out.println("You gave up");
                                        done3 = true;
                                        done2 = true;
                                        done = true;
                                        done4=true;
                                    } else {
                                        System.out.println("That is not a valid input, try again.");
                                    }

                                }while(!done4);
                            }
                        } while (!done2);
                    }else{
                        System.out.println("You gave up");
                        done3 = true;
                    }
                }
                do {
                    System.out.println("Do you want to play again? [Y/N]");
                    cont = in.nextLine();
                    if (cont.equals("Y")||cont.equals("y")){
                        System.out.println("Starting over...");
                        done = false;
                        done2 = false;
                        done3 = true;
                    }else if (cont.equals("N")||cont.equals("n")){
                        System.out.println("Goodbye!");
                        done3 = true;
                        done2=true;
                        done = true;
                    }else{
                        System.out.println("That is not a valid input, try again.");
                    }
                }while(!done3);

            } while (!done);


    }
}