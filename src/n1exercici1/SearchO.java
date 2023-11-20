package n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class SearchO {
    public static List<String> filterO(List<String> lista) {
        return lista.stream().filter(palabra -> palabra.toLowerCase().contains("o")).toList();
    }

    public static void main(String[] args) {
        List<String> noms = new ArrayList<>();

        noms.add("Ana");
        noms.add("Juan");
        noms.add("Pedro");
        noms.add("Pablo");
        noms.add("Olivia");
        noms.add("Marta");
        noms.add("Ruben");
        noms.add("Rita");
        noms.add("Julia");
        noms.add("Federico");

        List<String> nomsAmbO = filterO(noms);
        System.out.println(nomsAmbO);
    }
}
