package exercicios_basicos_java;

import java.util.Scanner;

public class Lista_Exercicios {
    static Scanner leitor = new Scanner(System.in); // Torna o Scanner estático para poder ser acessado de um método estático
    
    public static void main(String[] args) {
        exe1(); // 1) Encontre o maior número em uma lista.
    }

    private static void exe1() {
    	int tamanho;
    	double[] lista;
    	double maiorNumero;
    	
        System.out.println("Maior número em uma lista\n");
        
        System.out.print("Digite o tamanho da lista: ");
        tamanho = leitor.nextInt();
        
        lista = new double[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            lista[i] = leitor.nextDouble();
        }
        
        maiorNumero = lista[0];
        for (int i = 1; i < tamanho; i++) {
            if (lista[i] > maiorNumero) {
                maiorNumero = lista[i]; 
            }
        }
      
        System.out.println("\nO maior número na lista é: " + maiorNumero);
        
    }
}
