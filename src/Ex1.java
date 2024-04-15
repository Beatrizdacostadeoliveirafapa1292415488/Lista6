import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("digite o primeiro numero:");
        num1= leitor.nextInt();
        System.out.println("digite o segundo  numero:");
        num2= leitor.nextInt();
        int produto=calcularasomatotal(num1,num2);
        System.out.println("o resultado da multiplicação de"+num1+"mais"+num2+"é:"+produto);
    }
    public static int calcularasomatotal (int num1,int num2){
        return num1*num2;
    }
}
