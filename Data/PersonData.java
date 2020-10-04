package Data;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import entities.Person;
import java.util.Iterator;

public class PersonData {
    public static List<Person> lista= new ArrayList <Person>();
    
    int id=0;
    Scanner sdf = new Scanner(System.in);

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
        String r = new String();
        Iterator<Person> personIterator = lista.iterator();
        while(personIterator.hasNext()){
            Person perslis = personIterator.next();
            if (perslis.getId() == id){
                personIterator.remove();
            }
        }
    }

}