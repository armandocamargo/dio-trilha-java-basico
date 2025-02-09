public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void tocar() {
        System.out.println("Música tocando");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }
    
    public void atender() {
        System.out.println("Chamada atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Me adora Pitty");

        meuIphone.ligar("+55 11 91234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("https://github.com/armandocamargo");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}