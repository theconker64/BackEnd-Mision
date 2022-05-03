package PracticaHarry;

public class Magos {
    String nombre;
    int edad;
    String genero;
    double estatura;
    String casa;
    String sangre;
    String patronus;

    public Magos(String nombre, int edad, String genero, double estatura, String casa, String sangre, String patronus) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.estatura = estatura;
        this.casa = casa;
        this.sangre = sangre;
        this.patronus = patronus;
    }

    //Metodos Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public void mostrarD() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nGenero: " + genero
                + "\nEstatura: " + estatura + "\nSangre: " + sangre + "\nPatronus: " + patronus + "\n");
    }
}

