public class Main {
    public static void main(String[] args) {
        /// Ejercicio 3
        // Crear un objeto persona
        Persona persona1 = new Persona("Juan", "Perez", 'M', 25, "Buenos Aires");
        // Crear un objeto persona solo con nombre y apellido
        Persona persona2 = new Persona("Maria", "Lopez");
        // Crear un objeto persona con todos los datos
        Persona persona3 = new Persona("Lautaro","Martinez",'M',24,"Bahia Blanca");

        // Mostramos los datos del ejercicio 4
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

        // Separador
        System.out.println();

        // Ejercicio 3 y Ejercicio 4 con bucle
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("John", "Doe", 'M', 25, "Buenos Aires");
        personas[1] = new Persona("Jane", "Smith", 'F', 16, "Cordoba");
        personas[2] = new Persona("Bob", "Williams", 'M', 30, "Rosario");

        // Iterar sobre el array y mostrar los datos de cada persona
        for(Persona persona : personas){
            // Verificar si es mayor de edad y mostrar solo los datos de la persona mayor de edad

            if (persona.mayorDeEdad()){
                System.out.println("Datos de la persona:");
                persona.mostrarDatos();
                System.out.println();
            }
        }

        //Ejercicio 3
        // Crear objetos Auto
        Auto auto1 = new Auto("Rojo", "ABC123", 2020, "Fiesta", 15000);
        Auto auto2 = new Auto("Negro", "DEF456", 2021, "Gol", 30000);
        Auto auto3 = new Auto("Blanco", "GHI789", 2019, "Uno", 200000);
        
        // Guardamos los datos de los autos creados
        Auto[] autos = new Auto[]{auto1, auto2, auto3};

        // Ejercicio 5
        // Llamar método encender sobre objetos creados
        for(int i=0; i<autos.length; i++){
            autos[i].encender();
            System.out.println("El auto " + autos[i].getModelo() + " el auto se encendio.");
            System.out.println();
        }

        // Llamar método kilometrajeMayor
        // para verificar cual tiene más de 100k km
        for(int i=0; i<autos.length; i++){
            if(autos[i].kilometrajeMayor()){
                System.out.println("El auto " + autos[i].getModelo() + " tiene más de 100k km.");
                System.out.println();
            }
            else{
                System.out.println("El auto " + autos[i].getModelo() + " tiene menos de 100k km.");
                System.out.println();
            }
        }

        // Ejercicio 6
        // Creamos el onbjeto celular
        Celular miCelular = new Celular("Poco X3 pro", "Xiaomi");

        // Mostramos el modelo y la marca del celular
        System.out.println("El modelo es: " + miCelular.getModelo() + " y la marca es: " + miCelular.getMarca());

        // Realizamos una llamada
        miCelular.realizarLlamar();

        // Cortamos la llamada
        miCelular.cortarLlamada();
    }
}