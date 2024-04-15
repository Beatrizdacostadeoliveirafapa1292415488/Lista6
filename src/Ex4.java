import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2;

        System.out.println("digite o primeiro numero:");
        num1=scanner.nextInt();
        System.out.println("digite o segundo numero:");
        num2=scanner.nextInt();
        int maior=qualeomaior(num1,num2 );
        System.out.println("o maior é:"+maior);
    }
    public static int qualeomaior(int num1,int num2){
        if (num1 > num2) {
            return num1;
        } else {
           return num2;
        }
    }
}

