import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double suma = 0, nota;
        double mayor = -1, menor = 21;

        while (true) {
            System.out.print("Ingrese una nota (20 termina): ");
            nota = sc.nextDouble();

            if (nota == 20) {
                break;
            }

            cantidad++;
            suma += nota;

            if (nota > mayor) mayor = nota;
            if (nota < menor) menor = nota;
        }

        System.out.println("Cantidad: " + cantidad);

        if (cantidad > 0) {
            System.out.println("Promedio: " + suma / cantidad);
            System.out.println("Nota maxima: " + mayor);
            System.out.println("Nota minima: " + menor);
        }

        sc.close();
    }
}