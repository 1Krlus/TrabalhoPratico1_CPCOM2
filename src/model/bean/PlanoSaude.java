/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author Carlos
 */
public class PlanoSaude {

    int idPlanoSaude;
    private String nome;
    private String cnpj;

    public PlanoSaude() {
    }

    public PlanoSaude(int idPlanoSaude, String nome, String cnpj) {
        this.idPlanoSaude = idPlanoSaude;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getIdPlanoSaude() {
        return idPlanoSaude;
    }

    public void setIdPlanoSaude(int idPlanoSaude) {
        this.idPlanoSaude = idPlanoSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
