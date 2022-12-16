public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio de if");

        int numeroIf = 3;

        if (numeroIf > 0){
            System.out.println("El numero es positivo\n");
        }
        else if (numeroIf < 0){
            System.out.println("El numero es negativo\n");
        }
        else {
            System.out.println("El numero es cero\n");
        }



        System.out.println("Ejercicio de While");

        int numeroWhile = -1;

        while(numeroWhile < 3){

            System.out.println(numeroWhile);

            numeroWhile = numeroWhile + 1;
        }
        System.out.println("");



        System.out.println("Ejercicio de Do While");
        int contador = 1;

        do {
            contador--;

            System.out.println(numeroWhile);

        }while(contador != 0);

        System.out.println("");



        System.out.println("Ejercicio de For");

        int numeroFor = 0;

        for (;numeroFor <= 3; numeroFor++){

            System.out.println(numeroFor);
        }

        System.out.println("");



        System.out.println("Ejercicio de For");

        String estacion = "Primavera";

        switch (estacion){

            case "Verano" : System.out.println("Es verano");
                break;

            case "Primavera" : System.out.println("Es primavera");
                break;

            case "Otoño" : System.out.println("Es otoño");
                break;

            case "Invierno" : System.out.println("es invierno");
                break;

            default: System.out.println("Ingrese una Estacion correcta");

        }




    }
}
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
//
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//
//Mostrarlo por pantalla cada vez que se ejecute.
//
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
//
//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
//
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.