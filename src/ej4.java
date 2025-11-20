import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        int size = entradaInt("Indica el tamaño del array: ");

        int min = entradaInt("Indica el límite menor: ");
        int max = entradaInt("Indica el límite mayor: ");

        if(newSize(min,max,size)<size){
            System.out.println("Los primos que caben en el array entre los límites establecidos son: " + newSize(min,max,size));
            size=newSize(min,max,size);
        }
        int[] array = primosArray(min, max, size);
        print(array);
        System.out.println("El mayor es ->" + array[size-1]);
    }

    public static int newSize(int min, int max, int size){
        int newSize = 0;
        for (int i=min;i<max;i++){
            if(esNumeroPrimo(i))
                newSize++;
        }
        return newSize;
    }

    public static int[] primosArray(int min, int max, int size){
        int[] array = new int[size];
        int primo=min;
        for (int i=0;i<array.length;i++){
            if (esNumeroPrimo(primo)&&primo<=max){
                array[i] =primo;
                do {
                        primo++;
                }while(!esNumeroPrimo(primo) && primo<=max);
            }else if (primo>=max)
                array[i]=primo;
        }
        return array;
    }

    public static boolean esNumeroPrimo(int numero) {
        // Los números menores que 2 no son primos
        if (numero < 2) {
            return false;
        }
        // Itera desde 2 hasta la raíz cuadrada del número
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si el número es divisible por i, no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no se encontró ningún divisor, es primo
        return true;
    }

    public static void print(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static int entradaInt(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println(texto);
        return sc.nextInt();

    }
}