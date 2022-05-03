package Herencia;

public class Origen {

    public static void main(String[] args) {
        showHulatocat();
        showScubatocat();
        showVinyltocat();
        showSaintNictocat();
        showDinotocat();
        showHomercat();
        showmonaOriginal();
    }

    public static void showHulatocat(){
        Hulatocat hulatocat = new Hulatocat("Hulatocat.","Falda de hierba con una flor hibiscus en la cabeza.", "Contenta.");
        hulatocat.descripcion();
        System.out.println(hulatocat.ShowMona());
    }

    public static void showScubatocat(){
        Scubatocat scubatocat = new Scubatocat("Scubatocat.", "Equipo de Esnórquel.", "Asombrado.", "Pez Globo");
        scubatocat.descripcion();
        System.out.println(scubatocat.ShowMona());
    }

    public static void showVinyltocat(){
        Vinyltocat vinyltocat = new Vinyltocat("Vinyltocat.", "Al aire libre.", "Concentrado.", "Amarillo.");
        vinyltocat.descripcion();
        System.out.println(vinyltocat.ShowMona());
    }

    public static void showSaintNictocat(){
        SaintNictocat saintNictocat = new SaintNictocat("Saint Nictocat.", "Traje de Santa Claus.", "Feliz.", "Bolsa de regalos y campana.");
        saintNictocat.descripcion();
        System.out.println(saintNictocat.ShowMona());
    }

    public static void showDinotocat(){
        Dinotocat dinotocat = new Dinotocat("Dinotocat.", "Traje de Dinosaurio.", "Rawr.");
        dinotocat.descripcion();
        System.out.println(dinotocat.ShowMona());
    }

    public static void showHomercat(){
        Homercat homercat = new Homercat("Homercat.", "Camisa blanca y pantalón de mezclilla.", "Pensando?.", "Marchcat.", "Bartcat, Liscat y Maggicat.");
        homercat.descripcion();
        System.out.println(homercat.ShowMona());
    }

    public static void showmonaOriginal(){
        monaOriginal monaoriginal = new monaOriginal("Mona", "Al aire libre", "Feliz");
        System.out.println(monaoriginal.ShowMona());
    }
}
