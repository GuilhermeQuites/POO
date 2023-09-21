package br.com.pratica1;

public class Main {
    public static void main(String[] args) {

        Normal n1 = new Normal(100);

        n1.imprimeIngresso();

        Vip c2 = new Vip(100,50);

        c2.imprimeIngresso();

        Camarote c3 = new Camarote(100, 500, "Parte superior");

        c3.imprimeIngresso();



    }
}
