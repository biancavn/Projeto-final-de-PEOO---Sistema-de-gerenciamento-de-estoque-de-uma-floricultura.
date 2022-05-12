/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorec
 */
public class Plantas extends Flores {       // a classe Plantas herda metódos e atributos de Flores.

    private String usuario;     // utilizamos encapsulamento por questões de segurança.
    private String senha;

    public String getUsuario() {  // utilizamos get-sets para poder acessar os atributos encapsulados.
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
