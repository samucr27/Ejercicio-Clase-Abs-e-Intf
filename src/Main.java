public class Main {
    public static void main(String[] args) {
            Perro perro = new Perro("Dande");
            Gato gato = new Gato("Tulu");

            System.out.println("El perro se mueve:");
            perro.moverse();
            System.out.println("El perro hace un sonido:");
            perro.hacerSonido();
            System.out.println("El perro está comiendo:");
            perro.comer();

            System.out.println();

            System.out.println("El gato se mueve:");
            gato.moverse();
            System.out.println("El gato hace un sonido:");
            gato.hacerSonido();
            System.out.println("El gato está comiendo:");
            gato.comer();

    }
}
