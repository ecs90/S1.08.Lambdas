package n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class MesDeCincLletras {
    public static List<String> filterOYCinc(List<String> lista) {
        return lista.stream().filter(palabra -> palabra.toLowerCase().contains("o") && palabra.length() > 4
        ).toList();
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
        noms.add("Nico");
        noms.add("Julia");
        noms.add("Federico");

        List<String> nomsAmbOYCincLletras = filterOYCinc(noms);
        System.out.println(nomsAmbOYCincLletras);
    }
}
