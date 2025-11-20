import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arrayLetras = new char[26];
        arrayLetras = rellenarLetras(arrayLetras);

        int[] arrayNums = new int[26];
        arrayNums = rellenarNums(arrayNums);

        String phrase = "";

        printArrayInt(arrayNums);
        System.out.println();
        printArrayChar(arrayLetras);
        System.out.println();
        askForLetter(phrase, arrayLetras);

    }

    public static void askForLetter(String phrase, char[] arrayLetras){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la letra que quieras poner [NUMERO]: ");
        int entrada = sc.nextInt();
        do {
            if (checkNum(entrada)){
                phrase+=String.valueOf(arrayLetras[entrada]);
                System.out.println(phrase);
            }else{
                System.out.println("¡ERROR!");
            }
            System.out.println("Ingrese la letra que quieras poner [-1 EXIT]: ");
            entrada = sc.nextInt();
        }while(entrada!=-1);
    }

    public static char[] rellenarLetras(char[] arrayLetras){
        for (int i=0;i<arrayLetras.length;i++){
            arrayLetras[i]= (char)('A' + i);
        }
        return arrayLetras;
    }
    public static int[] rellenarNums(int[] arrayNums){
        for (int i=0;i<arrayNums.length;i++){
            arrayNums[i]= i;
        }
        return arrayNums;
    }
    public static void printArrayInt(int[] arrayNums){
        for (int i=0;i<arrayNums.length;i++){
            System.out.print(arrayNums[i]+" ");
        }
    }
    public static void printArrayChar(char[] arrayLetras){
        for (int i=0;i<arrayLetras.length;i++){
            if (i<10) {
                System.out.print(arrayLetras[i] + " ");
            }else {
                System.out.print(arrayLetras[i] + "  ");
            }
        }
    }

    public static boolean checkNum(int entrada){
        if (entrada>25||entrada<0)
            return false;
        else return true;
    }
}