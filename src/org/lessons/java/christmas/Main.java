package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Make list instance
        List<String> wishList = new ArrayList<>();

        // User input
        Scanner scan = new Scanner(System.in);

        Boolean moreInput = true;
        while (moreInput) {
            System.out.print("Esprimi un desiderio (digita x per terminare): ");
            String userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("x")) {
                moreInput = false;
            } else {
                wishList.add(userInput);
            }
        }

        // Print list
        Collections.sort(wishList);
        System.out.println(wishList);
    }
}