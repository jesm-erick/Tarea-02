import entities.Person;

import java.util.List;
import java.util.Scanner;

import Data.PersonData;


public class Main {

    public static void main(String[] args) {
        PersonData data = new PersonData();
        Scanner input = new Scanner(System.in);
        int opt = 0;
        do{
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 Listar ");
            System.out.println("2 Nuevo ");
            System.out.println("3 Borrar ");
            System.out.println("4 Get byID(seleccionar) ");
            System.out.println("5 update ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("Listado de personas ");
                    List<Person> lis = data.lista;
                    System.out.println("ID\t Nombre\t Direccion\t DNI");
                    for (Person d : data.list("")) {
                        System.out.println(d.getId() + "\t" + d.getName()+ "\t" + d.getDireccion()+ "\t" + d.getDNI());
                    }
                    break;
                case 2:
                    System.out.println("Nueva persona ");
                    Person p= new Person();
                    System.out.print("nombre: ");
                    p.setName(input.nextLine());
                    System.out.println("Ingrese la direccion: ");
                    p.setDireccion(input.nextLine());
                    System.out.println("Ingrese su DNI: ");
                    p.setDNI(input.nextInt());
                    data.create(p);
                    break;
                case 3:
                    System.out.println("Eliminar persona ");                    
                    System.out.print("id: ");
                    data.delete(input.nextInt());
                    break;
                case 4:
                System.out.print("Ingrese el id del objeto: ");
                data.getListElement(input.nextInt());
                break;
                case 5:
                    
                default: 
                    System.out.println("Opcion no valida");
            
            }
        }while (opt != 0);
    }

}
