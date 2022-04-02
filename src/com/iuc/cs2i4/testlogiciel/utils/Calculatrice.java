package com.iuc.cs2i4.testlogiciel.utils;

public class Calculatrice {

    public Calculatrice() {
        super();
    }

    public double addition(double op1, double op2) {
        double resultat;
        resultat = op1 + op2;
        return resultat;
    }

    public double soustraction(double op1, double op2) {
        double resultat;
        resultat = op1 - op2;
        return resultat;
    }

    public double multiplication(double op1, double op2) {
        double resultat;
        resultat = op1 * op2;
        return resultat;
    }

    public double division(double op1, double op2) {
        double resultat;
        resultat = op1 / op2;
        return resultat;
    }
}
