package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {

    // I Java (olikt t.ex. Python) kan man ha "samma namn" på en metod (funktion i Python) flera gånger
    // Detta eftersom metoderna kan t.ex. ta emot olika typer av element, i detta fall tar den första
    // metoden emot en array och den andra en ArrayList
    // Det kan vara bra för error hantering (t.ex. kan en tredje calcMean ta emot Strings (text) och
    // säga till användaren att medelvärd på text inte går)

    // Metod som tar emot array med for loop
    // Returnerar medelvärdet
    public static double calcMean(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        return sum / values.length;
    }

    // Metod som tar emot en ArrayList med foreach loop
    // Returnerar medelvärdet
    public double calcMean(ArrayList<Double> values) {
        double sum = 0;
        for (Double value: values
        ) {
            sum += value;
        }

        sum = sum / values.size();

        return sum;
    }
}