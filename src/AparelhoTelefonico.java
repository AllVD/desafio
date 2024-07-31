/*
* @author  AlvD
* @version 1.0
* @since   31/07/2024
*/
package src;

public interface AparelhoTelefonico {
    public void fazerLigacao(String numero);
    public void atenderLigacao();
    public void encerrarLigacao();
    public void iniciarCorreioVoz(String mensagem, String numero);
    public void enviarMensagemSms(String numero, String mensagem);
}