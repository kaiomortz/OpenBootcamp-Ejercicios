public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        resultado = suma(3,3,3);
        System.out.println("El resultado de la suma es "+ resultado);

        Coche nuevoCoche = new Coche();
        nuevoCoche.AgregarPuerta();
        System.out.println("La cantidad de puertas del coche es " + nuevoCoche.puertas);

    }
    public static int suma(int a,int b, int c){
        return a+b+c;
    }
}
class Coche{
    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }

}

    
