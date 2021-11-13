package br.com.dio.debbuging;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};
        double media = calculaMediaDaTurma(alunos, scan);
        System.out.println("Média da turma: " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0.0;
        for(String aluno: alunos) {
            System.out.println("Nota do Aluno: " + aluno + ":");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

}
