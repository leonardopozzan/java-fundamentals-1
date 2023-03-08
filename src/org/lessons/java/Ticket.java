package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean check;
        int distance = 0;
        int age = 0;

        do{
            System.out.println("Quanti anni hai?");
            String input = scanner.nextLine();
            try {
                age = Integer.parseInt(input);
                if(age >0){
                    check =  true;
                }else{
                    check =  false;
                }
            } catch (NumberFormatException nfe) {
                check =  false;
            }
            if(!check){
                System.out.println("Inserisci un numero maggiore di zero! Riprova");
            }
        }while(!check);


        do{
            System.out.println("Quanti km devi percorrere?");
            String input = scanner.nextLine();
            try {
                distance = Integer.parseInt(input);
                if(distance >0){
                    check =  true;
                }else{
                    check =  false;
                }
            } catch (NumberFormatException nfe) {
                check =  false;
            }
            if(!check){
                System.out.println("Inserisci un numero maggiore di zero! Riprova");
            }
        }while(!check);

        final double priceForKm = 0.21;
        final double discountUnderage = 0.2;
        final double discountOver65 = 0.4;
        double price = distance * priceForKm;
        String message = "";

        if(age < 18){
            price *= (1 - discountUnderage);
            message = "è stato applicato uno sconto del: " + (discountUnderage * 100) + "%";
        }
        if(age > 65){
            price *= (1 - discountOver65);
            message = "è stato applicato uno sconto del: " + (discountOver65 * 100) + "%";
        }

        String pattern = "###,###.##";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        String formatPrice = decimalFormat.format(price);

        System.out.println("Il prezzo del tuo biglietto è: " + formatPrice + "€");

        if (!message.equals("")){
            System.out.println(message);
        }
    }
}
