/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.bean;

/**
 *
 * @author Carlos
 */
public class PrescricaoExame {
    int idPrescricao;
    String data;
    private Paciente paciente;
    private Medico medico;
    double valorTotal;
    
    public PrescricaoExame() {
        
    }
    
    public PrescricaoExame(String data, Medico medico, Paciente paciente, Double valorTotal) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.valorTotal = valorTotal;
    }

    public int getIdPrescricao() {
        return idPrescricao;
    }

    public void setIdPrescricao(int idPrescricao) {
        this.idPrescricao = idPrescricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
