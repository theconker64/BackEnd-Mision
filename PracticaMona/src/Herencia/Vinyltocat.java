package Herencia;

public class Vinyltocat extends Mona{
    private final String colorTocadiscos;
    public String habilidad = "Tocadiscos";
    public Vinyltocat(String nombre, String vestimenta, String expFacial, String colorTocadiscos) {
        super(nombre, vestimenta, expFacial);
        this.colorTocadiscos = colorTocadiscos;
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Vinyltocat.");
    }

    public  void descripcion(){
        accion();
        System.out.println("Disfruto mucho de mi "+ habilidad +
                ", soy un amante de la música clásica, " +
                " escucha Cotton Fields de Creedence!!!.");
    }

    @Override
    public String ShowMona() {
        return  super.ShowMona()+
                "Color Tocadiscos: " + colorTocadiscos + '\n';
    }
}
