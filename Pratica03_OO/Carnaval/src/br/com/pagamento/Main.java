package br.com.pagamento;

public class Main {
    public static void main(String[] args) {

        FPadrao fp = new FPadrao(1,"Guilherme",1000);
        System.out.println(fp.toString());

        FProdutividade fpro = new FProdutividade(2,"Gomes",2000,0.50,100);
        System.out.println(fpro.toString());

        FComissionado Fc = new FComissionado(3,"Quites",1500,2,2000);
        System.out.println(Fc.toString());
        
    }
}
