package n2exercici3;

//TODO preguntar si era esto lo que habia que hacer con el ejercicio, o si se se referia a un switch dentro del lambda
public class Operaciones {
    public static float sumar(float a, float b){
        IOperaciones iOperaciones = () -> a + b;
        return iOperaciones.operacio();
    }

    public static float restar(float a, float b){
        IOperaciones iOperaciones = () -> a - b;
        return iOperaciones.operacio();
    }

    public static float multiplicar(float a, float b){
        IOperaciones iOperaciones = () -> a * b;
        return iOperaciones.operacio();
    }

    public static float dividir(float a, float b){
        //Acá debería haber ido una excepcion
        IOperaciones iOperaciones = () -> b != 0 ? a / b : 0;
        if (b == 0)
            System.out.println("La division no fue posible");
        return iOperaciones.operacio();
    }

    public static void main(String[] args) {
        float a = 3.14F;
        float b = 8.8F;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Suma: " + sumar(a,b));
        System.out.println("Resta: " + restar(a,b));
        System.out.println("Multiplicacion: " + multiplicar(a,b));
        System.out.println("Division: es " + dividir(a,b));
    }
}
