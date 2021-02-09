package solvery;

import java.util.Scanner;

public class StartApplication {
  public static void main(String[] args) {
    Scanner consoleScanner = new Scanner(System.in);
    System.out.println("===== Table creator 2021 =====");
    System.out.println("Type the height and width of table's desk");
    Desk desk = new Desk(consoleScanner.nextInt(), consoleScanner.nextInt());
    System.out.println("Type radius and height of the table's legs");
    int legRadius = consoleScanner.nextInt();
    int legHeight = consoleScanner.nextInt();
    System.out.println("Table created: " + Table.create(desk, legRadius, legHeight));
  }
}
