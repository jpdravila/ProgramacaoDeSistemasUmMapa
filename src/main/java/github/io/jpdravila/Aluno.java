package github.io.jpdravila;

public class Aluno {

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
