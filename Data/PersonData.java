package Data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    public static List<Person> lista= new ArrayList <Person>();
    
    int id=0;

     public void  create(Person p) {
        p.setId(++id);
        lista.add(p); 
     }
     public List<Person> list(String filter){
        return lista;
         
     }
     public Person get(int id) {
        int index=0;
        for (Person d : lista) {
            if (d.getId() == id ) {
                return lista.get(index);
            }
            index++;
        }
        return null;    
    } 
    public void update(Person p) {
        int index = 0;
        // boolean b=false;
        for (Person d : lista) {
            if (d.getId() == p.getId()) {
                // d = p;
                lista.set(index, p);
                // b=true;
            }
            index++;
        }
        // if (b)
        // System.out.println("encontrado");
        // else
        // System.out.println("NO encontrado");

    }
    public void delete(int id) {
        for (Person d : lista) {
            if (id == d.getId()) {
                lista.remove(d);
                System.out.println("Eliminado de la lista " + d.getName());
                
            }
        }
    }

}