public class Gato extends Animal implements Sonido {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau Miau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo pescado.");
    }
}