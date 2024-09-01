package exercicio03;

public class Aluno {
    public String nome;
    public double ap1;
    public double ap2;
    public double as;


    public Aluno(String nome, double ap1, double ap2, double as) {
        this.nome = nome;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.as = as;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAp1() {
        return ap1;
    }

    public void setAp1(double ap1) {
        this.ap1 = ap1;
    }

    public double getAp2() {
        return ap2;
    }

    public void setAp2(double ap2) {
        this.ap2 = ap2;
    }

    public double getAs() {
        return as;
    }

    public void setAs(double as) {
        this.as = as;
    }
}
