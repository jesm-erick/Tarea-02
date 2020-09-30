package Data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis= new ArrayList <Person>();
    int id=0;

     public void  create(Person p) {
        p.setId(++id);
        lis.add(p); 
     }
     public List<Person> list(String filter){
        return lis;
         
     }
     public Person get(int id) {
        int index=0;
        for (Person d : lis) {
            if (d.getId() == id ) {
                return lis.get(index);
            }
            index++;
        }
        return null;    
    }
    public void delete(int id) {
        Person d = get(id);
        if (d != null) {
            lis.remove(d);
        } else {
            System.out.print("No existe");
        }
    }
    public void update(int id, String name, int age) {
        for (Person person: lis) {
            if (person.getId() == id) {
                System.out.println("Ya se cambió");
            }else {
                System.out.println("No se cambió correctamente");
            }
        }
    }
    public void getListElement(int id) {
        for (Person person: lis) {
            if (person.getId() == id) {
                System.out.println(person.getId() + "\t"  + person.getId() + "\t" + person.getName());
            }
        }
    }
}
