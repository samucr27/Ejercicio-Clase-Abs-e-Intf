abstract class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void moverse() {
        System.out.println(nombre + " se está moviendo.");
    }

    public abstract void comer();
}