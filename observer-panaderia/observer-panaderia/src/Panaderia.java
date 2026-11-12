import jsvs.util.ArrayList;

public class Panaderia implements Observable {
    String nombrePanaderia;
    private ArrayList<Vecino> vecinos = new ArrayList<Vecino>();

    public Panaderia(String nombrePanaderia) {
        this.nombrePanaderia = nombrePanaderia;
    }

    @Override
    public void suscribir(Vecino v) {
        System.out.println("Se ha suscrito un nuevo vecino: " + v.nombre);
        vecinos.add(v);
    }

    @Override
    public void desuscribir(Vecino v) {
        System.out.println("Se ha desuscrito un nuevo vecino: " + v.nombre);
        vecinos.removeIf(veci -> veci.nombre.equals(v.nombre));
    }

    @Override
    public void notificar(String notificacion) {
        for (Vecino v : vecinos) {
            v.actualizar(notificacion);
        }
    }

    public void sacarPan() {
        System.out.println("Hay pan fresco");
        notificar("ya hay pan fresco");
    }
}
