package Herencia;

public class Scubatocat extends Mona{
    private final String entorno;
    private  String habilidad = "Esnórquel";
    public Scubatocat(String nombre, String vestimenta, String expFacial, String entorno) {
        super(nombre, vestimenta, expFacial);
        this.entorno = entorno;
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Scubatocat.");
    }

    public  void descripcion(){
        accion();
        System.out.println("Me encanta hacer "+ habilidad +
                ", soy un amante de lo desconocido" +
                " ven y conoce las profundidades conmigo.");
    }

    @Override
    public String ShowMona() {
        return  super.ShowMona()+
                "Entorno: " + entorno + '\n';
    }
}
