import java.util.Scanner;

public class CalculoMedia {
    public static void main (String args[]) {
        calculaMedia();
    }

    public static void calculaMedia() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota do aluno:");
        int nota3 = s.nextInt();
        System.out.println("Digite a quarta nota do aluno:");
        int nota4 = s.nextInt();

        int somaNotas = nota1 + nota2 + nota3 + nota4;

        int mediaNotas = somaNotas / 4;

        System.out.println("Media: " + mediaNotas);

        if (mediaNotas < 5) {
            System.out.println("O aluno está reprovado");
        } else if (mediaNotas >= 5 && mediaNotas < 7 ) {
            System.out.println("O aluno está de recuperação");
        } else if (mediaNotas >= 7) {
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("Digite um valor válido");
        }
    }
}
