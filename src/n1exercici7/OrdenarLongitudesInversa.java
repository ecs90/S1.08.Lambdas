package n1exercici7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenarLongitudesInversa {
    public static void main(String[] args) {
        List<String> desordenada = new ArrayList<>();

        desordenada.add("Yo deberia ir al primera por ser la mas larga lalalalalala");
        desordenada.add("No me preguntes, solo soy una chica");
        desordenada.add("yo ultima");
        desordenada.add("A quien le importo? :(");
        desordenada.add("No se peleen, todas vamos a estar ordenadas");
        desordenada.add("Mi vieja mula ya no es lo que era");

        desordenada.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
