public class Vecino implements Observer{
    String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String notificacion) {
        System.out.println("Hola " + nombre + " ha llegado la notificacion: " + notificacion);
    }
}
