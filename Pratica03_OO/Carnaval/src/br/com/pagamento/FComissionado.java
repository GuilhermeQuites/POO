package br.com.pagamento;

public class FComissionado extends Funcionario {
    private double percentua;
    private  double vendas;

    public FComissionado(int matricula, String nome, double salario, double percentua, double vendas) {
        super(matricula, nome, salario);
        this.percentua = percentua;
        this.vendas = vendas;
    }

    public double getPercentua() {
        return percentua;
    }

    public void setPercentua(double percentua) {
        this.percentua = percentua;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double calcularProventos(){

        return  getSalario() + (getVendas() * getPercentua() / 100);

    }

    public String toString(){
        return "Nome: " + getNome() + "\n" + "Matricula : " + getMatricula() + "\n" + "Salário: " + calcularProventos();
    }

}
