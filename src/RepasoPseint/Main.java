package RepasoPseint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Leer -> Scanner
        Scanner leer = new Scanner(System.in);

        // Tipos de Datos

        // Lógicos
        boolean logic = false; // Verdadero o Falso - true o false

        // Caracter
        String cadena = "H";
        char caracter = 'A';

        // Entero y Real
        int numero = 20;
        double number = 10.5;
        float num = 10.5f;

        // Operadores
        /*
            Matemáticos:

            Multiplicacion => * : 5 * 4;
            Division => / : 5 / 2;
            Suma => + : 5 +5;
            Resta => - : 4 - 3;
            Potencia => Math.pow(a,b), 3 ** 2
            Raiz => Math.sqrt(a)

            Comparación:

            > Mayor -> 5 > 4
            < Menor -> 4 < 5
            >= Mayor igual -> 5 >= 5
            <= Menor igual -> 4 <= 4
            != Distinto que -> 5 != 5
            == Igual que -> 5 == 5

            Lógicos:

            Y (and) -> &&
            O (or) -> ||
            No (not) -> !


            Incremento / Decremento

            var++ -> Incrementa la variable en 1;
            var-- -> Decrementa la variable en 1;

            numero += 5;  // PSeInt -> numero = numero + 5
            numero -= 5;
            numero *= 5
            numero /= 5;
            numero %= 5;  // % -> Modulo o Resto de la división.
        */


        // SI - SINO
//        if(num < 10){
//           if(){
//
//           }
//        }else if(num > 10){
//
//        }else{
//
//        }
//
//
//        if(num < 10){
//
//        }
//        if(num > 10){
//
//        }

        // Según

//        switch (numero){
//            case 10:
//                System.out.println("Es 10");
//                break;
//            case 20:
//                System.out.println("Es 20");
//                break;
//            default:
//                System.out.println("No es ninguna de las opciones");
//        }
//
//        // Bucles
//
//        // FOR -> PARA
//        // Para variable <- 0 Hasta 10 Con Paso 1 Hacer
//        // for ( inicializar variable ;  condición  ;  Incremento o Decremento)
//        for (int i= 0; i < 10; i += 2){
//            System.out.println("Hola " + i);
//        }
//        // While -> Mientras
//        boolean res = true;
//        int contador = 0;
//
//        while(res){
//            if(contador == 5){
//                res = false;
//            }
//            System.out.println("Contador en: " + contador);
//            System.out.println("res : " + res);
//            contador++;
//        }

        int opcion;

        do{
            System.out.println("Ingresa la opcion que quieras | 1 - juego | 2 - ajustes | 3 - salir");
            opcion = leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresaste al juego");
                    break;
                case 2:
                    System.out.println("Ingresaste a ajustes");
                    break;
                case 3:
                    System.out.println("Saliste del juego");
                    break;
                default:
                    System.out.println("Ingresa una opcion correcta");
            }
        }while(opcion != 1 && opcion != 2 && opcion != 3);



        // Fuciones


    }
    public static int sumar(int a,int b){
        int res = a + b;
        return res;
    }
}