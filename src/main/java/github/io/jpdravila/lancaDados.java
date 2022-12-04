package github.io.jpdravila;

import java.util.Scanner;

class Aluno {

    private int matriculaDoAluno;
    private String  nomeDoAluno;
    private double notaUm;
    private double notaDois;
    private double notaTres;
    private float presenca;

    public Aluno(){

    }

    public Aluno(int matriculaDoAluno, String nomeDoAluno, Double notaUm, Double notaDois, Double notaTres, float presenca) {
        this.matriculaDoAluno = matriculaDoAluno;
        this.nomeDoAluno = nomeDoAluno;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
        this.presenca = presenca;
    }

    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    public float caluclarPresenca(float presenca){
        if(presenca > 60) {
            System.out.print("Error: número de presença extrapolado");
            return 0.0f;
        }
        return (presenca / 60) * 100;
    }

    public Double mediaDoEstudante(double notaUm, double notaDois, double notaTres){
        return (notaUm + notaDois + notaTres) / 3;
    }
    //=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

    public int getMatriculaDoAluno() {
        return matriculaDoAluno;
    }

    public void setMatriculaDoAluno(int matriculaDoAluno) {
        this.matriculaDoAluno = matriculaDoAluno;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public Double getNotaUm() {
        return notaUm;
    }

    public void setNotaUm(Double notaUm) {
        this.notaUm = notaUm;
    }

    public Double getNotaDois() {
        return notaDois;
    }

    public void setNotaDois(Double notaDois) {
        this.notaDois = notaDois;
    }

    public Double getNotaTres() {
        return notaTres;
    }

    public void setNotaTres(Double notaTres) {
        this.notaTres = notaTres;
    }

    public float getPresenca() {
        return presenca;
    }

    public void setPresenca(float presenca) {
        this.presenca = presenca;
    }
}

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