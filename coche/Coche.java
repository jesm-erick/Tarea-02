package coche;

public class Coche {
    String Marca;
    String Color;
    public Coche() {
    }
    public Coche(String Marca) {
        this.Marca=Marca;
    }
    public Coche(String Marca, String Color) {
        this.Marca=Marca;
        this.Color=Color;
    }

    public void Sound() {
        System.out.println( Marca + " ti ti ti ti");
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
    
}
