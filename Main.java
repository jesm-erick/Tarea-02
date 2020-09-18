import entities.Person;
import coche.Coche;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("David "+p);
        p.setSex("M");
        System.out.println("sexo= "+ p.getSex() );
        p.laugh();

        Person p2 = new Person("Gloria","F");
        System.out.println("sexo= "+ p2.getSex() );
        p2.laugh();

        Coche c = new Coche();
        c.setMarca("Toyata "+c);
        c.setColor("Rojo ");
        System.out.println("Color= "+ c.getColor() );
        c.Sound();

        Coche c2 = new Coche("Alfa Romeo","Azul");
        System.out.println("Color= "+ c2.getColor() );
        c2.Sound();



    }
}
