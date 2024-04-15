
// Clase celular definida previamente
public class Celular{
    private String modelo;
    private String marca;
    private int memoria;
    private boolean radio;
    private int nroCelular;

    // Constructor por defecto
    public Celular(){
        this.modelo = "";
        this.marca = "";
        this.memoria = 0;
        this.radio = false;
        this.nroCelular = 0;
    }

    // Constructor con modelo y marca
    public Celular(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    // Metodo para realizar llamada
    public void realizarLlamar(){
        System.out.println("Llamando...");
    }

    // Metodo para cortar llamada
    public void cortarLlamada(){
        System.out.println("Llamada terminada...");
    }

    // Getters y setters de los atributos
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getMemoria(){
        return this.memoria;
    }
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    public boolean getRadio(){
        return this.radio;
    }
    public void setRadio(boolean radio){
        this.radio = radio;
    }
    public int getNroCelular(){
        return this.nroCelular;
    }
    public void setNroCelular(int nroCelular){
        this.nroCelular = nroCelular;
    }
}