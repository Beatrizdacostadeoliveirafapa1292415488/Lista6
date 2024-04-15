import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] a=lerovetor("a");
        int[] b=lerovetor("b");
        int[] c=multiplique(a,b);
        System.out.println("o vetor c:");
        imprimir(c);
    }
    public static int[] lerovetor(String nome){
        Scanner scanner=new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Digite os elementos do vetor " + nome + ":");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(nome + "[" + i + "]: ");
            vetor[i] = scanner.nextInt();
        }

        return vetor;
    }
    public static int[]multiplique(int[] a,int[] b){
        int[] C = new int[10];

        for (int i = 0; i < C.length; i++) {
            C[i] = a[i] * b[i];
        }

        return C;
    }
    public static void imprimir(int[]vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    }


