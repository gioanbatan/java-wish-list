package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    // Fields
    private String name;
    private String address;

    List<String> wishList = new ArrayList<>();

    // Constructors
    public ChristmasLetter(String name, String address, List<String> wishList) {

    }

    // Methods
    // Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Custom methods
    public void send() throws LetterException {
        // WishList size control
        if (this.wishList.size() > 5) {
            throw new LetterException("I desideri devono essere massimo 5!");
        }

        // Random boolean for good/bad
        Random rnd = new Random();
        if (rnd.nextBoolean()) {
            throw new LetterException("Sei stato troppo cattivo, niente regali");
        }

        // Display send success
        System.out.println("Lettera inviata!!!");
        System.out.println("-------------------\n");
        System.out.println("Mittente: " + this.name);
        System.out.println("Indirizzo: " + this.address);
    }
}
