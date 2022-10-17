package github.io.jpdravila;

import java.util.Scanner;

public class lancaDados {
    public static void main(String[] args){
        System.out.println("Sistema Escolar");

        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in, "UTF-8");

        System.out.print("Número de matricula: ");
        aluno.setMatriculaDoAluno(sc.nextInt());

        sc.nextLine();
        System.out.print("Nome do aluno: ");
        aluno.setNomeDoAluno(sc.nextLine().toUpperCase());

        System.out.print("Primeira nota: ");
        aluno.setNotaUm(sc.nextDouble());

        System.out.print("Segunda nota: ");
        aluno.setNotaDois(sc.nextDouble());

        System.out.print("Terceira nota: ");
        aluno.setNotaTres(sc.nextDouble());

        System.out.print("Presenças totais: ");
        aluno.setPresenca(sc.nextFloat());

        double mediaFinal = aluno.mediaDoEstudante(aluno.getNotaUm(),
                       aluno.getNotaDois(), aluno.getNotaTres());

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(">>> Código         : Nº" + aluno.getMatriculaDoAluno());
        System.out.println(">>> Nome           : " + aluno.getNomeDoAluno());
        System.out.println(">>> Média de notas : " + String.format("%.1f", mediaFinal));
        System.out.println(">>> Precentual(%)  : " + String.format("%.2f", aluno.caluclarPresenca(aluno.getPresenca())) + "%");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }
}
