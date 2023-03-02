import java.util.Scanner;
public class Clase1_1 {
    //Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
    //y “b”
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de a: ");
        int i;
        int a = miScanner.nextInt();
        System.out.print("Ingrese el valor de b: ");
        int b = miScanner.nextInt();

            for (i=a;i<=b;i++ ){
                System.out.print(i + " ");
            }
    }
}