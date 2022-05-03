package Herencia;

public class Homercat extends Mona{
    private final String esposa;
    private final String hijos;

    public Homercat(String nombre, String vestimenta, String expFacial, String esposa, String hijos) {
        super(nombre, vestimenta, expFacial);
        this.esposa = esposa;
        this.hijos = hijos;
    }

    @Override
    public void accion() {
        System.out.println("Hola! Soy Mona, y esta es mi versión Homercat, ¡D'oh!.");
    }

    public  void descripcion(){
        accion();
        System.out.println("¡Matanga!");
    }

    @Override
    public String ShowMona() {
        return  super.ShowMona()+
                "Esposa: " + esposa + '\n' +
                "Hijos: " + hijos + '\n';
    }
}
