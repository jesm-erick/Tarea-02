package Data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis= new ArrayList <Person>();

     public void  create(Person p) {
         //ToDo
        System.out.println("Create");
        lis.add(p);
     }
     public List<Person> list(String filter){
        System.out.println(lis);
        //ToDo
        System.out.println("list jejejejejjej");
        return lis;
         
     }
     public Person get(int id) {
        Person d= new Person();
        //ToDo
        System.out.println("get");
        return d;
    }
    public void Update(int Person) {
        return;
    }
    public void delete(int id) {
        
    }
    

    
}
