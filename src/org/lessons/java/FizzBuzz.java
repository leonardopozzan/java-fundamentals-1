package org.lessons.java;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        int number = 0;

        do{
            System.out.println("Quanti numeri vuoi stampare?");
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
                if(number >0 && number<=500){
                    check =  true;
                }else{
                    check =  false;
                }
            } catch (NumberFormatException nfe) {
                check =  false;
            }
            if(!check){
                System.out.println("Inserisci un numero maggiore di zero e minore di 500! Riprova");
            }
        }while(!check);

        for (int i = 1; i <= number; i++) {
            if (i%3 == 0 && i%5==0){
                System.out.println("FizzBuzz ");
            } else if (i%3==0) {
                System.out.print("Fizz ");
            }else if (i%5==0) {
                System.out.print("Buzz ");
            }else {
                System.out.format("%03d ",i);
            }
        }
    }
}
