/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author lorec
 */
public class GerenciadorDeArquivos {

    private ObjectOutputStream saida;
    private ObjectInputStream entrada;
    private String nomeDoArquivo;

    public GerenciadorDeArquivos(String nomeDoArquivo) {    //inicializando as variavel
        saida = null;                       
        entrada = null;
        this.nomeDoArquivo = nomeDoArquivo;      //caminho do arquivo onde serão 
    }                                            //salvos os dados do projeto

    public void writeObject(Object obj) throws IOException {    // metódo adiciona novos dados ao objeto.
        FileOutputStream arquivoSaida = new FileOutputStream(nomeDoArquivo);
        saida = new ObjectOutputStream(arquivoSaida);
        saida.writeObject(obj);
    }

    public Object readObject() throws IOException, ClassNotFoundException {  // mostra os dados 
        FileInputStream arquivoEntrada = new FileInputStream(nomeDoArquivo); //salvos no objeto.
        entrada = new ObjectInputStream(arquivoEntrada);
        return entrada.readObject();
    }

}
