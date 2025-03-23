package org.example;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando funcionalidades do Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando funcionalidades do Aparelho Telefônico
        meuIphone.ligar("11999999999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando funcionalidades do Navegador
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
