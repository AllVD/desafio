/*
* @author  AlvD
* @version 1.0
* @since   31/07/2024
*/
package src;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{
    
    @Override
    public void tocarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Fazendo ligação para: " + numero);
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Ligação encerrada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void enviarMensagemSms(String numero, String mensagem) {
        System.out.println("Enviando SMS para: " + numero + ". Mensagem: " + mensagem);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }