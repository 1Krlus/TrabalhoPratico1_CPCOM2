/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author Carlos
 */
public class Exame {
    int idExame;
    String codigo;
    String materialColetado;
    String horasJejum;
    double valor;
    
    public Exame(int idExame, String codigo, String materialColetado, String horasJejum, double valor) {
        this.idExame = idExame;
        this.codigo = codigo;
        this.materialColetado = materialColetado;
        this.horasJejum = horasJejum;
        this.valor = valor;
    }
    
    public Exame() {
        
    }

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMaterialColetado() {
        return materialColetado;
    }

    public void setMaterialColetado(String materialColetado) {
        this.materialColetado = materialColetado;
    }

    public String getHorasJejum() {
        return horasJejum;
    }

    public void setHorasJejum(String horasJejum) {
        this.horasJejum = horasJejum;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }    
}
