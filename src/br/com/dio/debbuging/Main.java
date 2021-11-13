package br.com.dio.debbuging;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio do Programa do método main.");
        a();
        System.out.println("Final do Programa do método main. ");
    }

    static void a() {
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Final do método a.");
    }

    static void b() {
        System.out.println("Entrou no método b.");
        for(int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        c();
        System.out.println("Final do método b.");
    }

    static void c() {
        System.out.println("Entrou no método c.");
        //Thread.dumpStack();
        System.out.println("Final do método c.");
    }


}
