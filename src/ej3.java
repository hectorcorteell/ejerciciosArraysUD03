public class ej3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int suma=0;
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*(100)+1);
            System.out.println(array[i]);
            suma+=array[i];
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El promedio es: "+(suma/100));
    }
}
