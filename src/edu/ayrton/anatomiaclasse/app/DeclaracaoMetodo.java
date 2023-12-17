package edu.ayrton.anatomiaclasse.app;
public class DeclaracaoMetodo {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";

        String nomeCompleto = nomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return "Olá, " + nome.concat(" ").concat(sobrenome);
    }
}
