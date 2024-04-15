import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor=new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        System.out.println("digite o primeiro numero:");
        num1= leitor.nextInt();
        System.out.println("digite o segundo  numero:");
        num2= leitor.nextInt();
        System.out.println("digite o terceiro numero:");
        num3= leitor.nextInt();
        System.out.println("digite o quarto numero:");
        num4= leitor.nextInt();
        float media=calcularamadiatotal(num1,num2,num3,num4);
        System.out.printf("media é:%.2f\n",media);

    }
    public static float calcularamadiatotal(int num1,int num2,int num3,int num4){
        return (num1+num2+num3+num4)/4.0f;
    }
}
