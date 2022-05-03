package Herencia;

public class Dinotocat extends Mona{
    public Dinotocat(String nombre, String vestimenta, String expFacial) {
        super(nombre, vestimenta, expFacial);
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Dinotocat.");
    }

    public  void descripcion(){
        accion();
        System.out.println("Amo a los Dinosaurios, te gusta mi disfraz? Rawr ( OwO ).");
    }
}
