import entities.Person;
import java.util.InputMismatchException;
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
                    System.out.println("ID\t Nombre\t sexo\t edad");
                    for (Person d : data.list("")) {
                        System.out.println(d.getId() + "\t" + d.getName()+ "\t" + d.getSex()+ "\t" + d.getAge());
                    }
                    break;
                case 2:
                    System.out.println("Nueva persona ");
                    Person p = new Person();
                    System.out.print("name: ");
                    p.setName(input.nextLine());
                    System.out.print("sexo: ");
                    p.setSex(input.nextLine());

                    System.out.print("edad: ");
                    try {
                        p.setAge(input.nextInt());
                        data.create(p);
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.print("Edad debe ser entero, no se guardo");
                    }
                    break;
                case 3:
                    System.out.println("Eliminar persona ");
                    System.out.print("id: ");
                    data.delete(input.nextInt());
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("get persona ");
                    System.out.print("id: ");
                    Person d = data.get(input.nextInt());
                    System.out.println("Id: " + d.getId());
                    System.out.println("Name: " + d.getName());
                    System.out.println("sexo: " + d.getSex());

                    try {
                        System.out.println("Edad: " + d.getAge());
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.print("Edad debe ser entero, no se guardo");
                    }
                    
                    break;
                case 5:
                    System.out.println("update persona ");
                    System.out.print("id: ");
                    Person per = data.get(input.nextInt());
                    if (per != null) {
                        System.out.println("Name current: " + per.getName());
                        System.out.println("Sex current: "+per.getSex());
                        System.out.println("nueva edad: "+per.getAge());

                        input.nextLine(); // Limpiar el buffer
                        System.out.print("new name: ");
                        per.setName(input.nextLine());
                        
                        System.out.print("new sex: ");
                        per.setSex(input.nextLine());
                        data.update(per);

                        System.out.print("nueva edad: ");
                        try {
                            per.setAge(input.nextInt());
                            data.update(per);
                            System.out.print("se cambio correctamente ");
                        } catch (Exception e) {
                            input.nextLine(); // Limpiar el buffer
                            System.out.print("Edad debe ser entero, no se cambio");
                        }    
                    } else {
                        System.out.println("NO encontrado");
                    }

                    break;
                    
                default: 
                    System.out.println("Opcion no valida");
            
            }
        }while (opt != 0);
    }

}