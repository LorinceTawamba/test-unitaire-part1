package com.iuc.cs2i4.testlogiciel.utils;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class VerificationTest {
    private String msg;
    private int nbre;

    @BeforeEach
    void setUp() {
        // create a string of all characters
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        msg = sb.toString();
        System.out.println("Random String is: " + msg);

        nbre = random.nextInt();
        System.out.println("Random Number is: " + nbre);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(1)
    void isStringEmpty() {
    }

    @Test
    @Order(2)
    void isNumberOk() {
    }
}