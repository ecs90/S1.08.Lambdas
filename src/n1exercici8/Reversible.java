package n1exercici8;

public class Reversible {
    public static void main(String[] args) {
        IReversible iReversible = (string) -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            return String.valueOf(stringBuilder.reverse());
        };
        System.out.println(iReversible.reverse("Podran revertirme?"));
    }
}
