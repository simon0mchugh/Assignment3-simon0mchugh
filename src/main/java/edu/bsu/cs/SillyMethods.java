package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int number) {
        return number == 42;
    }

    public String countTo(int number) {
        String stringToReturn = "";
        for (int i=0; i<=number; i++) {
            stringToReturn += i;
            if (i != number) {
                stringToReturn += " ";
            }
        }
        return stringToReturn;
    }
}
