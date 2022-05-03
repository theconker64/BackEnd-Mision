package Herencia;

public class Mona {
    private String nombre;
    private String vestimenta;
    private String expFacial;

    public Mona(String nombre, String vestimenta, String expFacial) {
        this.nombre = nombre;
        this.vestimenta = vestimenta;
        this.expFacial = expFacial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getvestimenta() {
        return vestimenta;
    }

    public void setvestimenta(String vestimenta) {
        this.vestimenta = vestimenta;
    }

    public String getexpFacial() {
        return expFacial;
    }

    public void setexpFacial(String expFacial) {
        this.expFacial = expFacial;
    }

    public void accion(){
        System.out.println("Hola! Soy Octocat, un gusto conocerte :3");
    }

    public String ShowMona() {
        return
                        "Nombre: " + nombre + '\n' +
                        "Vestimenta: " + vestimenta + '\n' +
                        "Humor: " + expFacial + '\n';
    }
}