import entities.Person;

import java.util.Scanner;

import coche.Coche;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("Ingrese nombre:");
        //String name= input.nextLine();
        //System.out.println("escribiste: "+name);
        int opt = 0;
        do{
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1: System.out.println("Opcion 1 elejida");
                break;
                case 2: System.out.println("Opcion 2 elejida");
                break;
                default: System.out.println("Opcion no valida");
            
            }
        }while (opt != 0);



    }
}
