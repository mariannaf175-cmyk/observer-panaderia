public class Main {
    public static void main(String[] args) {
        System.out.println("Creamos los Vecinos");
        Vecino veci1 = new Vecino("Ana");
        Vecino veci2= new Vecino("Luis");
        Vecino veci3 = new Vecino("Marta");

        System.out.println("Creamos la panaderia");
        Panaderia panaderia = new Panaderia("Fuente azul");

        System.out.println("suscribimos a los vecinos");
        panaderia.suscribir(veci1);
        panaderia.suscribir(veci2);
        panaderia.suscribir(veci3);

        System.out.println("Hora de sacar el pan");
        panaderia.sacarPan();
    }
}
