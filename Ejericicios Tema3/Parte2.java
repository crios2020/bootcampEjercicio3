public class Parte2 {
    public static void main(String[] args) {
        Coche miCoche=new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.cantidadPuertas);
    }
}

class Coche{
    int cantidadPuertas;

    void incrementarPuertas(){
        cantidadPuertas++;
    }

}
