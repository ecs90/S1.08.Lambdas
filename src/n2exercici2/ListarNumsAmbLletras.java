package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class ListarNumsAmbLletras {
    public static String putLletraParidad(List<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        lista.forEach(num -> {
            sb.append(num % 2 == 0 ? 'e' : 'o');
            sb.append(num + ", ");
                });
        int i = sb.length();
        sb.delete(i -2, i);
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(12);
        numeros.add(35);
        numeros.add(66);
        numeros.add(79);
        numeros.add(84);
        numeros.add(4);
        numeros.add(33);
        numeros.add(391);
        numeros.add(19);
        numeros.add(0);

        System.out.println(putLletraParidad(numeros));
    }
}
