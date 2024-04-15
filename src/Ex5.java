import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] b= preencher();
        System.out.println("o vetor b é:"+ Arrays.toString(b));
    }
    public static int[] preencher() {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 20;
            } else {
                vetor[i] = 10;
            }
        }
        return vetor;

    }
}
