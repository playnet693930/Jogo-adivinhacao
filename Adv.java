import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 0;
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Digite um número: ");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        
        scanner.close();
    }
}
