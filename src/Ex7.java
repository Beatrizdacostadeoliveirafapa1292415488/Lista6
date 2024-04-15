import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int[]x=new int[10];
        int[]y=new int[10];

        System.out.println("digito 10 numeros:");
        for (int i=0;i<10;i++){
            x[i]=scanner.nextInt();
        }
        preenchery(x,y);
        System.out.println("Vetor Y é:");
        for (int i = 0; i < 10; i++) {
            System.out.print(y[i] + " ");
        }
    }
    public static void preenchery(int[]X, int[] Y) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                Y[i] = X[i] * 2;
            } else {
                Y[i] = X[i] * 3;
            }
        }
    }
}
