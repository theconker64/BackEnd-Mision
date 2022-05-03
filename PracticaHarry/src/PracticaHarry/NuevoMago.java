package PracticaHarry;

public class NuevoMago {
    public static void main(String[] args) {
        Magos Harry = new Magos("Harry Potter", 17, "M", 1.68, "Gryffindor", "Sangre mestiza", "Ciervo");
        Magos Hermione = new Magos ("Hermione Granger", 16, "F", 1.65, "Gryffindor", "Sangre sucia", "Nutria");
        Magos Ronald = new Magos ("Ronald Weasley", 17, "M", 1.69, "Gryffindor", "Sangre pura", "Jack Russell Terrier");
        Magos Draco = new Magos("Draco Lucius Malfoy ", 42, "M", 1.78, "Slytherin", "Pura", "No tiene");
        Magos Severus = new Magos("Severus Snape", 62, "M", 1.78, "Slytherin", "Mestiza", "Ciervo");

        Harry.mostrarD();
        Hermione.mostrarD();
        Ronald.mostrarD();
        Draco.mostrarD();
        Severus.mostrarD();
    }
    }
