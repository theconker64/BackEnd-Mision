package Herencia;

public class Hulatocat extends Mona{
    private  String habilidad = "Ukulele";
    public Hulatocat(String nombre, String vestimenta,String expFacial) {
        super(nombre, vestimenta, expFacial);
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Hulatocat.");
    }

    public  void descripcion(){
        accion();
        System.out.println("Soy bastante buena tocando el "+ habilidad + ", " +
                "¿Quieres ver? Te sentirás como en Hawái.");
    }

}
