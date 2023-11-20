package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class SearchShortA {
    public static List<String> filterATres(List<String> lista) {
        return lista.stream().filter(palabra -> palabra.startsWith("A") && palabra.length() == 3
        ).toList();
    }

    public static void main(String[] args) {
        List<String> noms = new ArrayList<>();

        noms.add("Ana");
        noms.add("Alcia");
        noms.add("Esteban");
        noms.add("Carla");
        noms.add("ano");
        noms.add("Patricia");
        noms.add("Ron");
        noms.add("Felicia");
        noms.add("Pablo");
        noms.add("Ari");

        List<String> nomsAmbATres = filterATres(noms);
        System.out.println(nomsAmbATres);
    }
}
