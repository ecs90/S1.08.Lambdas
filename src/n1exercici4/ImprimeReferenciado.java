package n1exercici4;

import java.util.ArrayList;
import java.util.List;

public class ImprimeReferenciado {
    public static void main(String[] args) {
        List<String> noms = new ArrayList<>();

        noms.add("Enero");
        noms.add("Febrero");
        noms.add("Marzo");
        noms.add("Abril");
        noms.add("Mayo");
        noms.add("Junio");
        noms.add("Julio");
        noms.add("Agosto");
        noms.add("Septiembre");
        noms.add("Octubre");
        noms.add("Noviembre");
        noms.add("Diciembre");

        noms.forEach(System.out::println);
    }
}
