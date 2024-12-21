import java.util.Scanner;

//Faça um programa que leia 1 número inteiro e imprima na tela se ele for ímpar
    public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = sc.nextInt();

        if(a % 2 != 0){
            System.out.println("O número é impar");
        }else{
            System.out.println("O número é par");
        }
    }
}