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
    public void delete(int id) {
        Person d = get(id);
        if (d != null) {
            lista.remove(d);
        } else {
            System.out.print("No existe");
        }
    }
    
    public void getListElement(int id) {
        for (Person person: lista) {
            if (person.getId() == id) {
                System.out.println(person.getId() + "\t"  + person.getId() + "\t" + person.getName());
            }
        }
    }
}
