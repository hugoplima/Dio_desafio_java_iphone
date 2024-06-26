import Aparelho.iPhone;

public class Main {
    public static void main(String[] args) {

        iPhone iphone = new iPhone();

        System.out.println("-----Reprodutor Musical-----");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Música 1");

        System.out.println("-----Aparelho Telefônico-----");
        iphone.ligar("123-456-789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("-----Navegador na Internet-----");
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}