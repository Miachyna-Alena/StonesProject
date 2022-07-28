package by.itstep.miachyna.examtask.controller;

import by.itstep.miachyna.examtask.model.entity.Jeweler;
import by.itstep.miachyna.examtask.model.entity.Necklace;
import by.itstep.miachyna.examtask.model.logic.Manager;
import by.itstep.miachyna.examtask.model.logic.Searcher;
import by.itstep.miachyna.examtask.model.logic.Sorter;
import by.itstep.miachyna.examtask.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        Necklace necklace = new Necklace();
//      int stoneNumber = 3;
        int stoneNumber;

        do {
            Printer.print("Input the number of stones in a necklace: ");
            stoneNumber = scanner.nextInt();
        } while (stoneNumber <= 0);

        Jeweler.createNecklace(necklace, stoneNumber);

        Printer.print(String.valueOf(necklace));

        Printer.print(String.format("\nTotal weight (in carats) = %.2f carats",
                Manager.calculateTotalStonePrice(necklace.getStoneList())));

        Printer.print(String.format("\nTotal price of stones = %.2f $",
                Manager.calculateTotalStonePrice(necklace.getStoneList())));

        Printer.print("Enter the criterion of color " +
                "(white, green, red, blue, brown, black, yellow or pink): ");
        String colour = scanner.next();
        Printer.print("Find stones by color: ");
        Printer.print(String.valueOf(Searcher.findStoneByColor(colour.toUpperCase(),
                necklace.getStoneList())));

        Printer.print(String.format("\nMax stone price = %.2f $",
                Searcher.findTheMostExpensiveStone(necklace.getStoneList())));

        Printer.print(String.format("\nMin stone price = %.2f $",
                Searcher.findTheCheapestStone(necklace.getStoneList())));

        Printer.print(String.format("\nMax stone weight = %.2f ct",
                Searcher.findTheHeaviestStone(necklace.getStoneList())));

        Printer.print(String.format("\nMin stone weight = %.2f ct",
                Searcher.findTheEasiestStone(necklace.getStoneList())));

        Printer.print("\nList of stones sorted by weight: ");
        Sorter.sortStonesByWeight(necklace.getStoneList());
        Printer.print(String.valueOf(necklace.getStoneList()));

        Printer.print("\nList of stones sorted by price: ");
        Sorter.sortStonesByPrice(necklace.getStoneList());
        Printer.print(String.valueOf(necklace.getStoneList()));
    }
}
