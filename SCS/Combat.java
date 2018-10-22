package SCS;

import java.util.Scanner;

public class Combat {

  SithFighter SF = new SithFighter();
  AureSF ASF = new AureSF();
  Scanner in = new Scanner(System.in);

  public void R1() {

    System.out.println("Choose either. ");
    System.out.println("     1. Sith Fighter");
    System.out.println("     2. Aure Strike Fighter");
    System.out.println("Choose now : ");

    char choice = in.next().charAt(0);

    if (choice == '1') {
      System.out.println("\nYou have chosen the Sith Fighter.");
    } else if (choice == '2') {
      System.out.println("\nYou have chosen the Aure Strike Fighter.");
    }

    do {

      System.out.println("\nYour moves are. ");
      System.out.println("     A. attack.");
      System.out.println("     M. missle.");

      char move = in.next().charAt(0);

      switch (move) {
        case 'a':
          if (choice == '1') {
            System.out.println("\nSith Fighter attacks and deales " + SF.attack(ASF) + " damage. ");
            System.out.println("\nAure Strike Fighter health is now " + ASF.getCurrentHealth());
          } else if (choice == '2') {
            System.out.println("\nAure Strike Fighter attacks and deales " + ASF.attack(SF) + " damage.");
            System.out.println("\nSith Fighter health is now " + SF.getCurrentHealth());
          }
          break;
        case 'm':
          if (choice == '1') {
            System.out.println("\nSith Fighter attacks and deales " + SF.missle(ASF) + " damage. ");
            System.out.println("\nAure Strike Fighter health is now " + ASF.getCurrentHealth());
          } else if (choice == '2') {
            System.out
                .println("\nAure Strike Fighter uses missle barrage and deales " + ASF.missileBarrage(SF) + " damage.");
            System.out.println("\nSith Fighter health is now " + ASF.getCurrentHealth());
          }
      }
      if (ASF.getCurrentHealth() < 0) {
        System.out.println("\nAure Strike Fighter is now destroyed.");
        System.exit(0);
      } else if (SF.getCurrentHealth() < 0) {
        System.out.println("\nSith Fighter is destroyed.");
        System.exit(0);
      }
    } while (SF.isAlive = true);
  }
}
