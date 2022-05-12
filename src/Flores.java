
import java.io.Serializable;

/**
 *
 * @author lorec
 */
public class Flores implements Serializable {       // usamos a importação Serializable para poder utilizar 
                                                    // o gerenciador de arquivos e salvar dados no doc de texto.
    private String especie;     // utilizamos encapsulamento por questões de segurança.                                
    private int quantidade;
    private String disponibilidade;
    
    public void getEspecie(String especie) {    // utilizamos get-sets para poder acessar os atributos encapsulados.
        this.especie = especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void getQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void getDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getDisponibilidade2() {       // criamos um segundo get para facilitar o processo 
        return disponibilidade;                 // de atualização.
    }

    public int getQuantidade2() {
        return quantidade;
    }

    public String getEspecie2() {
        return especie;
    }
}
