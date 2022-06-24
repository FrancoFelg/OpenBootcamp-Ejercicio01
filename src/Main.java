public class Main {

    public static void main(String[] args) {
        sumar3numeros(1,2,3); //Parte 1
        //Parte 2
        Coche miCoche = new Coche();
        System.out.println("Cantidad de puertas al inicio: " + miCoche.puertas);
        miCoche.aumentarPuertas();
        System.out.println("Cantidad de puertas al final: " +miCoche.puertas);
        //Parte 2
    }

    //Parte 1
    public static int sumar3numeros(int a, int b, int c){
        return a+b+c;
    }
    //Parte 1
}

//Parte 2
class Coche{
    public int puertas = 0;

    public void aumentarPuertas(){
        this.puertas++;
    }

}
//Parte 2
