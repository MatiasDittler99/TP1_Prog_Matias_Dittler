// Ejercicio 2
// Clase Auto definida previamente
public class Auto{
    private String color;
    private String patente;
    private int año;
    private String modelo;
    private int km;

    //Ejercicio 3
    // Constructor
    public Auto(String color, String patente, int año, String modelo, int km){
        this.color = color;
        this.patente = patente;
        this.año = año;
        this.modelo = modelo;
        this.km = km;
    }

    // Ejercicio 5
    public void encender(){
        System.out.println("El auto se ha encendido.");
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public boolean kilometrajeMayor(){
        return this.km > 100000;
    }
}