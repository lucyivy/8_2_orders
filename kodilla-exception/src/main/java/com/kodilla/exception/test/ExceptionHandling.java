package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3.5, 2.5);

        } catch (Exception e) {
            System.out.println("There was a problem with inserted numbers! Error: " + e);

        } finally {
            System.out.println("Thank you for using our program.");

        }
    }
}
