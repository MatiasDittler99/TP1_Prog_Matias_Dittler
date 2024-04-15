// Importamos las librerias necesarias
// java.util.Scanner sirve para leer datos por teclado
import java.util.Scanner;
// java.util.ArrayList sirve para almacenar datos en una lista
import java.util.ArrayList;
// java.io.BufferedReader sirve para leer datos de un archivo
import java.io.BufferedReader;
// java.io.IOException sirve para manejar errores en la lectura de archivos
import java.io.IOException;
// java.io.InputStreamReader sirve para leer datos de un archivo
import java.io.InputStreamReader;

// Creamoos una clase llamada App
public class App {
    // Definimos un método main para ejecutar el programa
    public static void main(String[] args) {
        // Crear objeto Scanner para leer entrada del usuario
        Scanner entrada = new Scanner(System.in);
        // Declarar variable para guardar la opcion ingresada por el usuario
        int opcion;

        // Usamos un bucle do-while para que se repita siempre al menos una vez
        do{
            // Mostrar menu de opciones
            System.out.println("Seleccione una opción del menu:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("14. Ejercicio 14");
            System.out.println("15. Ejercicio 15");
            System.out.println("16. Ejercicio 16");
            System.out.println("17. Ejercicio 17");
            System.out.println("18. Ejercicio 18");
            System.out.println("19. Ejercicio 19");
            System.out.println("20. Salir");
            System.out.print("Ingrese su opcion: ");

            // Validar que el usuario ingrese un número entero
            while (!entrada.hasNextInt()) {
                System.out.println("Error, debe ingresar un número valido.");
                System.out.print("Reingrese su opcion: ");
                entrada.next();
            }

            // Guardar la opcion ingresada por el usuario
            opcion = entrada.nextInt();

            // Validar que la opcion ingresada por el usuario sea entre 1 y 20
            switch(opcion){
                case 1:
                    // Llamar al metodo del Ejercicio 1
                    ejercicio1(entrada);
                    break;
                case 2:
                    // Llamar al metodp del Ejercicio 2
                    ejercicio2(entrada);
                    break;
                case 3:
                    // Llamar al metodo del Ejercicio 3
                    ejercicio3(entrada);
                    break;
                case 4:
                    // Llamar al metodo del Ejercicio 4
                    ejercicio4(entrada);
                    break;
                case 5:
                    // Llamar al metodo del Ejercicio 5
                    ejercicio5(entrada);
                    break;
                case 6:
                    // Llamar al metodo del Ejercicio 6
                    ejercicio6(entrada);
                    break;
                case 7:
                    // Llamar al metodo del Ejercicio 7
                    ejercicio7(entrada);
                    break;
                case 8:
                    // Llamar al metodo del Ejercicio 8
                    ejercicio8(entrada);
                    break;
                case 9:
                    // Llamar al metodo del Ejercicio 9
                    ejercicio9(entrada);
                    break;
                case 10:
                    // Llamar al metodo del Ejercicio 10
                    ejercicio10(entrada);
                    break;
                case 11:
                    // Llamar al metodo del Ejercicio 11
                    ejercicio11(entrada);
                    break;
                case 12:
                    // Llamar al metodo del Ejercicio 12
                    ejercicio12(entrada);
                    break;
                case 13:
                    // Llamar al metodo del Ejercicio 13
                    ejercicio13(entrada);
                    break;
                case 14:
                    // Llamar al metodo del Ejercicio 14
                    ejercicio14(entrada);
                    break;
                case 15:
                    // Llamar al metodo del Ejercicio 15
                    ejercicio15(entrada);
                    break;
                case 16:
                    // Llamar al metodo del Ejercicio 16
                    ejercicio16(entrada);
                    break;
                case 17:
                    // Llamar al metodo del Ejercicio 17
                    ejercicio17(entrada);
                    break;
                case 18:
                    // Llamar al metodo del Ejercicio 18
                    ejercicio18(entrada);
                    break;
                case 19:
                    // Llamar al metodo del Ejercicio 19
                    ejercicio19();
                    break;
                case 20:
                    // Salir del bucle do-while
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    // Mostrar mensaje de error si la opcion ingresada por el usuario no es valida
                    System.out.println("Error: Opcion no valida. Por favor, elija una opcion entre 7 y 11.");
                    break;
            }
        } while (opcion != 20);

        // Cerrar el Scanner
        entrada.close();
    }

    private static void ejercicio1(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Crear una clase persona, con los siguientes atributos: private String nombre; private String apellido; private char sexo; private int edad; private String ciudad;");
        System.out.println();
        System.out.println("Ver el ejercicio 1 en el archivo Persona.java");
    }

    private static void ejercicio2(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Crear la clase auto, con los atributos: private String color; private String patente; private int año; private String modelo; private int km;");
        System.out.println();
        System.out.println("Ver el ejercicio 2 en el archivo Auto.java");
    }

    private static void ejercicio3(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Para los ejercicios 1 y 2 crear el constructor por defecto y crear un objeto mediante el operador new.");
        System.out.println("Ejemplo de new:");
        System.out.println("Persona persona = new Persona('Lautaro','Martinez','M',24,'Bahia Blanca')");
        System.out.println("Además en la clase persona crear con el operador new una persona solo con nombre y apellido");
        System.out.println();
        System.out.println("Ver el ejercicio 3 en el archivo Main.java");
    }

    private static void ejercicio4(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("4- La clase persona del ejercicio 1 agregar el método llamado mostrarDatos, el cual imprimirá los datos de la persona y el metodo mayorDeEdad, el cual muestra solo las personas mayores de 18 años.");
        System.out.println();
        System.out.println("Ver el ejercicio 4 en el archivo Main.java");
    }

    
    private static void ejercicio5(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Para la clase del ejercicio 2 crear el método encender donde muestre por pantalla el mensaje El auto se incendió. Además crear otro método llamado kilometrajeMayor, este método debe tener que mostrar los autos con más de 100000 km.");
        System.out.println();
    }

    private static void ejercicio6(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Crear la clase Celular,la misma tendrá los siguientes atributos: private String Modelo; private String Marca; private int memoria; private boolean radio; private int nroCelular;");
        System.out.println("Además crear un constructor por defecto y crear un objeto mediante el operador new, donde solo tenga el modelo y la marca. Luego generar los siguientes metodos: realizarLlamada() // Mostrar un mensaje que diga: Llamando...,         cortarLlamada() // Mostrar un mensaje que diga: Llamada Terminada");
        System.out.println();
        System.out.println("Ver el ejercicio 6 en el archivo Celular.java");
    }

    private static void ejercicio7(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Realizar un programa Java que lea un número entero por teclado y calcule si es par o impar. Podemos saber si un número es par cuando el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar. El operador Java que calcula el resto de la división entre dos números enteros o no es el operador % 2");
        System.out.println();

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un numero entero: ");

        // Validacion del numero ingresado
        while(!entrada.hasNextInt()){
            System.out.println("Error, debe ingresar un numero entero valido.");
            System.out.print("Reingrese un numero entero: ");
            entrada.next(); //Limpiar buffer
        }

        // Leer el numero ingresado por el usuario
        int numero = entrada.nextInt();

        // Imprimir el numero ingresado
        System.out.println("Numero valido ingresado: " + numero);
        System.out.println();

        // Comprobar si el numero es par o impar
        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par.");
            System.out.println();

        }
        else {
            System.out.println("El numero " + numero + " es impar.");
            System.out.println();
        }
    }

    private static void ejercicio8(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Realizar un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.");
        System.out.println();

        // Validar la entrada
        boolean entradaValida = false;

        do{
            // Solicitar al usuario que ingrese un caracter
            System.out.print("Ingrese un caracter: ");
            // Leer el caracter ingresado
            // objeto.next() lee una cadena hasta el primer espacio
            // objeto.nextLine() lee toda la línea
            String input = entrada.next();

            // Verificar si la entrada es un solo carácter y si es una letra mayúscula
            // variable.length() devuelve la longitud de la cadena
            // Character.isUpperCase(variable.charAt(0)) comprueba si el primer caracter es mayuscula
            // Charaacter.toLowerCase(variable) convierte la cadena a minusculas
            // Character.isUpperCase(variable) convierte la cadena a mayusculas
            // variable.charAt(0) devuelve el primer caracter como char
            if(input.length() == 1 && Character.isUpperCase(input.charAt(0))) {
                System.out.println("El dato ingresado es un único carácter y es una letra mayúscula.");
                entradaValida = true; // Establecer entradaValida a true para salir del bucle
            }
            else{
                System.out.println("El dato ingresado no cumple con los requisitos especificados.");
            }
        } while(!entradaValida); // Repetir el bucle mientras entradaValida sea false
    }

    private static void ejercicio9(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Realizar un programa que lea tres valores enteros. Estos valores representarán los lados de un triángulo, ergo, lados {a, b, c}. Mostrar si efectivamente pueden los valores {a, b, c } pueden formar un triángulo.");
        System.out.println();

        // Definimos las cariables
        int ladoA, ladoB, ladoC;

        // Solicitar al usuario que ingrese los valores de los lados del triángulo
        System.out.println("Ingrese los tres valores enteros que representan los lados del triángulo:");
        
        do{
            System.out.print("Lado a: ");
            
            // Validacion del lado a
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoA = entrada.nextInt();

            // Verificamos que el ladoA sea entero
            if(ladoA <= 0){
                System.out.println("Error: El lado A debe ser un número entero positivo.");
            }

        } while(ladoA <= 0);

        do{
            System.out.print("Lado b: ");
            
            // Validacion del lado B
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoB = entrada.nextInt();

            // Verificamos que el ladoB sea entero
            if(ladoB <= 0){
                System.out.println("Error: El lado B debe ser un número entero positivo.");
            }

        } while(ladoB <= 0);

        do{
            System.out.print("Lado C: ");
            
            // Validacion del lado C
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoC = entrada.nextInt();

            // Verificamos que el ladoC sea entero
            if(ladoC <= 0){
                System.out.println("Error: El lado C debe ser un número entero positivo.");
            }

        } while(ladoC <= 0);

        // Verificar si los valores pueden formar un triángulo
        boolean esTriangulo = esTriangulo(ladoA, ladoB, ladoC);

        //Mostrar el resultado
        if (esTriangulo) {
            System.out.println("Los valores " + ladoA + ", " + ladoB + ", " + ladoC + " pueden formar un triángulo.");
        } else {
            System.out.println("Los valores " + ladoA + ", " + ladoB + ", " + ladoC + " no pueden formar un triángulo.");
        }
    }

    // Funcion perteneciente al ejercicio 9
    private static boolean esTriangulo(int ladoA, int ladoB, int ladoC) {
        // Comprobar la suma de dos lados sea mayor que el tercero
        return (ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA);
    }

    private static void ejercicio10(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Modificar el programa de arriba para que, en caso que los lados { a, b, c } puedan formar un triángulo, indicar de qué tipo es: escaleno, isósceles o equilátero.");
        System.out.println();

        // Definimos las cariables
        int ladoA, ladoB, ladoC;

        // Solicitar al usuario que ingrese los valores de los lados del triángulo
        System.out.println("Ingrese los tres valores enteros que representan los lados del triángulo:");
        
        do{
            System.out.print("Lado a: ");
            
            // Validacion del lado a
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoA = entrada.nextInt();

            // Verificamos que el ladoA sea entero
            if(ladoA <= 0){
                System.out.println("Error: El lado A debe ser un número entero positivo.");
            }

        } while(ladoA <= 0);

        do{
            System.out.print("Lado b: ");
            
            // Validacion del lado B
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoB = entrada.nextInt();

            // Verificamos que el ladoB sea entero
            if(ladoB <= 0){
                System.out.println("Error: El lado B debe ser un número entero positivo.");
            }

        } while(ladoB <= 0);

        do{
            System.out.print("Lado C: ");
            
            // Validacion del lado C
            // objeto.hasNextInt() valida si el siguiente token es un entero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un número entero.");
                System.out.print("Ingrese un entero positivo: ");
                entrada.next(); // Consumir la entrada no válida
            }
            // objeto.nextInt() lee el entero ingresado
            ladoC = entrada.nextInt();

            // Verificamos que el ladoC sea entero
            if(ladoC <= 0){
                System.out.println("Error: El lado C debe ser un número entero positivo.");
            }

        } while(ladoC <= 0);

        // Verificar si los valores pueden formar un triángulo
        boolean esTriangulo = esTriangulo(ladoA, ladoB, ladoC);

        //Mostrar el resultado
        if (esTriangulo) {
            System.out.println("Los valores " + ladoA + ", " + ladoB + ", " + ladoC + " pueden formar un triángulo.");

            // Llamar al método privado para determinar el tipo de triángulo
            String tipoTriangulo = determinarTipoTriangulo(ladoA, ladoB, ladoC);
            // Mostramos el tipo de triángulo
            System.out.println("El triángulo es " + tipoTriangulo + ".");
        } else {
            System.out.println("Los valores " + ladoA + ", " + ladoB + ", " + ladoC + " no pueden formar un triángulo.");
        }
    }

    // Funcion perteneciente al ejercicio 10 para determinar el tipo de triángulo
    private static String determinarTipoTriangulo(int ladoA, int ladoB, int ladoC) {
        // Comprobar si los tres lados son iguales o si dos lados son iguales o si todos son diferentes
        if(ladoA == ladoB && ladoB == ladoC){
            return "equilátero";
        }else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            return "isósceles";
        }
        else{
            return "escaleno";
        }
    }

    private static void ejercicio11(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println(" Crear un programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while");
        System.out.println();

        // Definimos las variables
        int numero = 1;

        do{
            System.out.println("Estamos mostrando el numero " + numero);
            System.err.println();
            numero++;
        }while(numero <= 100);

        System.out.println("Fin del muestreo de numeros");
        System.out.println();
    }

    private static void ejercicio12(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Calcular el factorial de un número ingresado por el usuario.Sentencia For");
        System.out.println();

        // Definimos las variables
        int numero = 0;
        // Declaramos la variable factorial para almacenar el resultado del tipo long para poder almacenar los resultados de factorial de numeros muy grandes
        long factorial = 1;

        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un número entero para calcular su factorial:");
        
            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero: ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numero = entrada.nextInt();

            // Verificar que el numero sea entero positivo
            if(numero <= 0){
                System.out.println("Error: El numero debe ser un numero entero positivo.");
            }
        } while(numero <= 0);

        // Calcular el factorial
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }  
        
        System.out.println("El factorial del " + numero + " es " + factorial);
        System.out.println();
    }

    private static void ejercicio13(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Programa Java que muestre los números del 500 al 200 utilizando la instrucción for.");
        System.out.println();

        // Mostramos los números del 500 al 200 utilizando la instrucción for
        for(int i = 500; i >= 200; i--){
            System.out.println("Estamos mostrando el numero " + i);
            System.err.println();
        }
    }

    private static void ejercicio14(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Realizar un programa en Java que luego de introducir dos números enteros A y B por teclado, muestre los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará un mensaje indicándolo y se debe poder volver a introducir valores A y B nuevos.");
        System.out.println();

        // Definimos las variables
        int numeroA = 0;
        int numeroB = 0;

        // Solicitar al usuario que ingrese el numero A
        do{
            System.out.print("Ingrese un número entero A: ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero A: ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroA = entrada.nextInt();

            // Solicitar al usuario que ingrese el numero B
            System.out.print("Ingrese un número entero B: ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero B: ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroB = entrada.nextInt();

            // Verificar que el numero A sea menor que el numero B
            if(numeroA > numeroB){
                System.out.println("Error: El numero A debe ser menor que el numero B.");
            }

        }while(numeroA > numeroB);

        // Mostrar los numeros pares entre A y B
        for(int i = numeroA; i <= numeroB; i++){
            if(i % 2 == 0){
                System.out.println("El numero " + i + " es par");
            }
        }
    }

    private static void ejercicio15(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Leer números enteros por teclado y para cada número introducido indique si es positivo o negativo y si es par o impar. Se deben realizar tres versiones del programa:");
        System.out.println("a. En la primera versión se utilizará un bucle while. La lectura de números finalizará cuando se introduzca un cero.");
        System.out.println("b. En la segunda versión se utilizará un bucle do .. while. La lectura de números en esta versión también finaliza cuando se introduzca un cero");
        System.out.println("c. En la tercera versión también se utilizará un bucle do .. while pero en este caso la lectura de números finaliza cuando se responda ‘N’ ó ‘n’ a la pregunta “Desea introducir más números? (S/N):”");
        System.out.println();

        // Menu para versiones del programa
        // Definimos las variables
        String opcion;
        char opcionChar;

        do{
            // Solicitar al usuario que ingrese la opcion que desea utilizar
            System.out.println("Ingrese la opcion que desea utilizar:");
            System.out.println("A. Primera version");
            System.out.println("B. Segunda version");
            System.out.println("C. Tercera version");
            System.out.println("D. Salir");
            System.out.print("Ingrese su opcion: ");

            // Leer la opcion ingresada
            opcion = entrada.next();

            // Validacion que la opcion ingresada se un caracter
            while(opcion.length()!= 1){
                System.out.println("Error: Debe ingresar una opcion valida que sea un caracter.");
                System.out.print("Ingrese una opcion: ");
                System.out.println();
                opcion = entrada.next(); // Consumir la entrada no válida
            }

            // Obtener el caracter de la opcion ingresada
            opcionChar = opcion.charAt(0);

            //Convertir el caracter a mayusculas
            // Character.toUpperCase() devuelve el caracter en mayusculas
            opcionChar = Character.toUpperCase(opcionChar);

            // Validacion de la opcion ingresada
            switch(opcionChar){
                case 'A':
                    primeraVersion(entrada);
                    break;
                case 'B':
                    segundaVersion(entrada);
                    break;
                case 'C':
                    terceraVersion(entrada);
                    break;
                case 'D':
                    System.out.println("Gracias por utilizar el programa.");
                    break;
                default:
                    System.out.println("Error: Debe ingresar una opcion valida.");
            }
        } while(opcionChar!= 'D');
    }

    private static void primeraVersion(Scanner entrada) {
        // Definimos una lista para almacenar los numeros ingresados
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //Definimos una variable para almacenar el numero actual
        int numeroActual = -1;

        System.out.println();
        System.out.println("Bienvenido a la primera versión del programa.");
        System.out.println();

        // Leer numeros hasta que se ingrese, hasta que se ingrese un cero
        while(numeroActual != 0){
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un número entero (0 para finalizar): ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero (0 para finalizar): ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroActual = entrada.nextInt();

            // Agregar el numero a la lista
            if (numeroActual!= 0){
                listaNumeros.add(numeroActual);
            }
        }

        // Separador
        System.out.println();

        // Llamamos al metodo para verificar los numeros
        verificarNumero(listaNumeros);
    }

    private static void numeroPositivoONegativo(int numero) {
        // Verificar si el numero es positivo o negativo
        if(numero > 0){
            System.out.println("El numero " + numero + " es positivo.");
        }else if(numero < 0){
            System.out.println("El numero " + numero + " es negativo.");
        }
        else{
            System.out.println("El numero " + numero + " es cero.");
        }
    }

    private static void numeroParOImpar(int numero){
        // Verificar si el numero es par o impar
        if(numero % 2 == 0){
            System.out.println("El numero " + numero + " es par.");
        }else{
            System.out.println("El numero " + numero + " es impar.");
        }

    }

    private static void verificarNumero(ArrayList<Integer> listaNumeros) {
        // Verificar si el numero es positivo o negativo y si es par o impar
        // lista.size() devuelve el tamaño de la lista
        for(int i = 0; i < listaNumeros.size(); i++){
            // lista.get(i) devuelve el elemento de la posicion i de la lista
            numeroPositivoONegativo(listaNumeros.get(i));
            numeroParOImpar(listaNumeros.get(i));
            System.out.println();
        }
    }

    private static void segundaVersion(Scanner entrada) {
        // Definimos una lista para almacenar los numeros ingresados
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //Definimos una variable para almacenar el numero actual
        int numeroActual;

        System.out.println();
        System.out.println("Bienvenido a la segunda versión del programa.");
        System.out.println();

        // Leer numero que se ingrese, hasta que se ingrese un cero
        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un número entero (0 para finalizar): ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero (0 para finalizar): ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroActual = entrada.nextInt();

            // Agregar el numero a la lista
            if (numeroActual != 0){
                listaNumeros.add(numeroActual);
            }
        } while(numeroActual != 0);

        // Separador
        System.out.println();

        // Verificar si el numero es positivo o negativo y si es par o impar
        verificarNumero(listaNumeros);
    }

    private static void terceraVersion(Scanner entrada) {
        // Definimos una lista para almacenar los numeros ingresados
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        //Definimos una variable para almacenar el numero actual
        int numeroActual;
        String opcion;
        char opcionChar;
        boolean continua = false;

        System.out.println();
        System.out.println("Bienvenido a la tercera versión del programa.");
        System.out.println();

        // Leer numero que se ingrese, hasta que se ingrese un cero
        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un número entero: ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero entero: ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroActual = entrada.nextInt();

            // Agregar el numero a la lista
            if (numeroActual != 0){
                listaNumeros.add(numeroActual);
            }

            // Separador
            System.out.println();

            // Definimos la variable
            boolean opcioValida = false;

            while(!opcioValida){
                // Solicitar al usuario que ingrese la opcion
                System.out.print("Desea introducir mas números? (S/N): ");
                    
                // Leemos la opcion ingresada
                opcion = entrada.next();

                // Separador
                System.out.println();

                // Obtener el caracter de la opcion ingresada
                opcionChar = opcion.charAt(0);

                //Convertir el caracter a mayusculas
                // Character.toUpperCase() devuelve el caracter en mayusculas
                opcionChar = Character.toUpperCase(opcionChar);

                // Validar si la opcion ingresada es S o N
                if(opcionChar == 'S' || opcionChar == 'N'){
                    continua = opcionChar == 'S';
                    opcioValida = true;

                }else{
                    System.out.println("Error: Debe ingresar un dato valido.");
                    System.out.println();
                }
            }
        }while(continua);

        // Separador
        System.out.println();

        // Verificar si el numero es positivo o negativo y si es par o impar
        verificarNumero(listaNumeros);
    }

    private static void ejercicio16(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Implementar un programa Java que convierta millas a kilómetros. El programa pide que se introduzca una cantidad de millas y calculará su equivalente en Kilómetros. Se debe mostrar en pantalla el siguiente resultado “El equivalente a N millas son N Kilómetros”. El proceso se repite hasta que se introduzca un 0 como valor para las millas.");
        System.out.println("NOTA: 1 Milla equivale a 1.6093 Kilómetros");
        System.out.println("El valor de los KM resultantes se debe mostrar con dos decimales");
        System.out.println();

        // Definimos una variable para almacenar el numero actual
        int numeroMillas;

        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese una cantidad de millas (0 para finalizar): ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese una cantidad de millas (0 para finalizar): ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            numeroMillas = entrada.nextInt();

            if(numeroMillas < 0){
                System.out.println("Error: Debe ingresar un entero positivo.");
            }else if (numeroMillas > 0){
                // Convertir el numero ingresado a kilometros
                double numeroKilometros = numeroMillas * 1.6093;

                // Redondeamos el numero con dos decimales
                // Math.round() redondea el numero a la izquierda o derecha dependiendo de si es positivo o negativo
                numeroKilometros = Math.round(numeroKilometros * 100.0) / 100.0;

                // Imprimir el resultado
                System.out.println("El equivalente a " + numeroMillas + " millas son " + numeroKilometros + " Kilometros");
            }
            else{
                System.out.println("Fin del programa");
                System.out.println();
            }
        }while(numeroMillas != 0);
    }

    private static void ejercicio17(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Considere el siguiente programa java, declara un int llamado day cuyo valor representa un día (1-7). El código muestra el nombre del día, basado en el valor del día, usando la declaración switch");
        System.out.println();

        // Definimos una variable para almacenar el numero del dia
        int dia;
        
        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un numero del 1 al 7 para saber el dia (0 para finalizar): ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero del 1 al 7 para saber el dia (0 para finalizar): ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            dia = entrada.nextInt();

            // Validar si el numero ingresado es valido
            switch (dia) {
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Error: Debe ingresar un dia valido.");
                    break;
            }
        }while(dia != 0);
    }

    private static void ejercicio18(Scanner entrada) {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Teniendo en cuenta el programa realizado en el ejercicio 9, agregar la funcionalidad de mostrar si un día es un día laborable o uno de fin de semana");
        System.out.println();

        // Definimos una variable para almacenar el numero del dia
        int dia;

        do{
            // Solicitar al usuario que ingrese el numero
            System.out.print("Ingrese un numero del 1 al 7 para saber el dia (0 para finalizar): ");

            // Validacion del numero
            while(!entrada.hasNextInt()){
                System.out.println("Error: Debe ingresar un dato valido.");
                System.out.print("Ingrese un numero del 1 al 7 para saber el dia (0 para finalizar): ");
                entrada.next(); // Consumir la entrada no válida
            }

            // Leer el numero ingresado
            dia = entrada.nextInt();

            // Validar si el numero ingresado es valido
            switch (dia) {
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Error: Debe ingresar un dia valido.");
                    break;
            }

            //Definimos una variable
            String tipoDia = "";

            // Validar si el dia ingresado es un dia laborable
            switch (dia) {
                case 0:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    tipoDia = "Laborable";
                    System.out.println("El dia ingresado es " + tipoDia);
                    break;
                case 6:
                case 7:
                    tipoDia = "Fin de semana";
                    System.out.println("El dia ingresado es " + tipoDia);
                    break;
                default:
                    tipoDia = "Invalido";
                    System.out.println("El dia ingresado es " + tipoDia);
                    break;
            }
        }while(dia != 0);
    }

    private static void ejercicio19() {
        // Imprimir instrucciones del ejercicio
        System.out.println();
        System.out.println("Pedir palabras al usuario hasta que el usuario escriba una cadena vacía. Muestre la concatenación de esas palabras al final");
        System.out.println();

        // Crear un objeto BufferedReader para leer desde la entrada estándar (consola)
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Inicializar un StringBuilder para almacenar las palabras ingresadas por el usuario
        StringBuilder concatenatedWords = new StringBuilder();

        // Mostrar un mensaje al usuario para indicar que ingrese palabras
        System.out.println("Ingresa palabras (presiona Enter después de cada palabra):");
        
        try {
            String input; // Variable para almacenar la entrada del usuario

            // Utilizar un bucle while para solicitar palabras hasta que se ingrese una cadena vacía
            while (true) {
                // Solicitar al usuario que ingrese una palabra
                System.out.print("> ");
                
                // Leer la entrada del usuario y eliminar los espacios en blanco iniciales y finales
                input = reader.readLine().trim();

                // Verificar si la entrada está vacía
                if (input.isEmpty()) {
                    break; // Salir del bucle si se ingresa una cadena vacía
                }

                // Validar si la entrada contiene solo letras
                // Utilizar un patrón regular para validar si la entrada contiene solo letras con el metodo matches(), DENTRO SE LE PASA UN PATRON DE LETRAS VALIDAS
                if (!input.matches("[a-zA-Z]+")) {
                    // Mostrar un mensaje de error si la entrada no contiene solo letras y continuar con la siguiente iteración del bucle
                    System.out.println("¡Error! Solo se permiten letras.");
                    continue; // Volver a solicitar la entrada al usuario
                }

                // Concatenar la palabra ingresada al StringBuilder con un espacio al final
                concatenatedWords.append(input).append(" ");
            }

            // Verificar si se ingresaron palabras
            if (concatenatedWords.length() > 0) {
                // Si se ingresaron palabras, eliminar el último espacio en blanco y mostrar la concatenación de las palabras
                //deleteCharAt() para eliminar el ultimo caracter de la cadena
                concatenatedWords.deleteCharAt(concatenatedWords.length() - 1);
                System.out.println("Concatenación de palabras ingresadas: " + concatenatedWords.toString());
                System.out.println();
            } else {
                // Si no se ingresaron palabras, mostrar un mensaje apropiado
                System.out.println("No se ingresaron palabras.");
            }
        } catch (IOException e) {
            // Capturar y manejar cualquier excepción de entrada/salida que pueda ocurrir durante la lectura de la entrada del usuario
            // Mostrar un mensaje de error y terminar el programa, CON getMessage() PARA OBTENER EL MENSAJE DE ERROR
            System.err.println("Error de entrada/salida: " + e.getMessage());
        }
        // No cerramos el lector aquí para permitir que se pueda utilizar después del final del programa
    }
}
