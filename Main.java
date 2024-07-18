//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int resultado = multiplicacionRecursiva(1); // Ejemplo de uso con el número 5
        System.out.println("Resultado: " + resultado);
    }

    public static int multiplicacionRecursiva(int multiplicacion) {
        if (multiplicacion <= 9) {
            int j = 1; // Inicializar j en 1 para que no sea 0 y evitar un bucle infinito
            while (j <= 9) {
                int producto = multiplicacion * j;
                System.out.println(multiplicacion + " * " + j + " = " + producto);
                j++;
            }
            multiplicacion++; // Incrementar multiplicacion para demostrar recursividad
            multiplicacionRecursiva(multiplicacion); // Llamar recursivamente la función
        }
        return multiplicacion;
    }
}
