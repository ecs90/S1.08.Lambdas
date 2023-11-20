package n1exercici6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaLongitudes {
    public static void main(String[] args) {
        List<String> desordenada = new ArrayList<>();

        desordenada.add("Yo deberia ir al final por ser la mas larga lalalalalala");
        desordenada.add("No me preguntes, solo soy una chica");
        desordenada.add("yo 1");
        desordenada.add("A quien le importo? :(");
        desordenada.add("No se peleen, todas vamos a estar ordenadas");
        desordenada.add("Mi vieja mula ya no es lo que era");

        desordenada.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
