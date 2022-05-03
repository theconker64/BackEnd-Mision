package Herencia;

public class SaintNictocat extends Mona{
    private final String accesorios;
    public SaintNictocat(String nombre, String vestimenta, String expFacial, String accesorios) {
        super(nombre, vestimenta, expFacial);
        this.accesorios = accesorios;
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Saint Nictocat.");
    }

    public  void descripcion(){
        accion();
        System.out.println("Mi época favorita del año es la navidad, " +
                "me encantan los regalos, eso si mejor dar que recibir.");
    }

    @Override
    public String ShowMona() {
        return  super.ShowMona()+
                "Accesorios: " + accesorios + '\n';
    }
}
