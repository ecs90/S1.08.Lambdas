package n1exercici5;

public class FerPiPi{
    public static void main(String[] args) {
        IFerPiPi iFerPiPi = () -> 3.1415;
        System.out.println("El valor de pi es: " + iFerPiPi.getPiValue());
    }
}
