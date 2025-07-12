package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar: ");
        int n = input.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = input.nextDouble();
        }
        double MaiorValor = vect[0];
        int posicao = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i] > MaiorValor){
                MaiorValor = vect[i];
                posicao = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f\n", MaiorValor);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);




    }
}