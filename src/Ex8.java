
import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        int[]a=new int[30];
        int[]b=new int[30];
        int[]c=intercecao(a,b);

        System.out.println("digito 10 numeros para o a:"+ Arrays.toString(a));
        System.out.println("\ndigito 10 numeros para o B:"+Arrays.toString(b));
        System.out.println("\nElementos da interseção (vetor C):"+Arrays.toString(c));
    }
    public static int[] intercecao(int[]a,int[]b){
        int[] temp = new int[Math.min(a.length, b.length)];
        int index = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (a[i] == b[j]) {
                    temp[index++] = a[i];
                    break;
                }
            }
        }
        int[]c=new int[index];
        System.arraycopy(temp, 0, c, 0, index);
        return c;
    }

}
