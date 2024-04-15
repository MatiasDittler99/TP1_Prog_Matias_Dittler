// Ejercicio 1
// Clase Persona definida previamente
public class Persona {
    private String nombre;
    private String apellido;
    private char sexo;
    private int edad;
    private String ciudad;

    // Ejercicio 3
    // Constructores de la clase Persona
    public Persona(String nombre, String apellido, char sexo, int edad, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    // Constructor solo con nombre y appelido
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Ejercicio 4
    // Funcion para mostrar los datos de las personas
    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombre + " Apellido: " + this.apellido +  " Sexo: " + this.sexo + " Edad: " + this.edad + " Ciudad: " + this.ciudad);
    }
    //Funcionn para mostrar unicamente a las personas mayores de edad
    public boolean mayorDeEdad(){
        if(this.edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}