package emprego.faculdade;

public class EmpregoFaculdade {

    private String nome;
    private double salario;
    private int horasAula;


    double getGastos(){

        return this.salario + (this.horasAula * 40);

    }

   public String getInfo(){
        //Retorna o salário mais o bonus
        return "Nome: " + this.nome + " com salário " + getGastos();
    }


    public static void main(String[] args) {

        EmpregoFaculdade professor = new EmpregoFaculdade();

        professor.nome = "Guilherme Gomes";
        professor.salario = 2000;
        professor.horasAula = 6;

        System.out.println("Gastos: " + professor.getInfo());
        System.out.println("Informações: " + professor.getGastos());

    }

}


