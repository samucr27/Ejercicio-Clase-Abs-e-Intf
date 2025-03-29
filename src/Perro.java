public class Perro extends Animal implements Sonido{
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau Guau!");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo croquetas.");
    }
}
