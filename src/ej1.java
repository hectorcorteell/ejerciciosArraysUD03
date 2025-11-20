import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        int[] array=askNum();

        print(array);


    }

    public static void print(int array[]){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static int[] askNum(){
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        int i=0;
        do {
            System.out.println("Escribe el número " + (i+1));
            array[i]=sc.nextInt();
            i++;
        }while(i<array.length);

        return array;
    }

}
