/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dti
 */

// Classe Agendamento (projeto Sistema de Agendamentos para PetShop)
public class Agendamento {
        
    private static int proximoId = 1;
    private int id;
    private int usuarioId;
    private int petId; 
    private ArrayList<Servico> servicos;
    private Date dataHora;  // Data e hora do agendamento
    private int tempoTotal; // Em minutos
    private double valorTotal;
    
    // Construtor
    public Agendamento(int usuarioId, int petId, ArrayList<Servico> servicos, Date dataHora) {
        this.id = proximoId++;
        this.usuarioId = usuarioId;
        this.petId = petId;
        this.servicos = servicos;
        this.dataHora = dataHora;
        this.tempoTotal = calcularTempoTotal();
        this.valorTotal = calcularValorTotal();
    }
    
    // Função para calcular o tempo estimado total dos serviços no agendamento
    private int calcularTempoTotal() {
        int total = 0;
        for (Servico s : servicos) {
            total += s.getTempoEstimado();
        }
        return total;
    }

    // Função para cacular o valor total dos serviços no agendamento
    private double calcularValorTotal() {
        double total = 0.0;
        for (Servico s : servicos) {
            total += s.getPreco();
        }
        return total;
    }
    
    // Getters e Setters
    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Agendamento.proximoId = proximoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public ArrayList<Servico> getServicos() {
        return servicos;
    }

    public void setServicos(ArrayList<Servico> servicos) {
        this.servicos = servicos;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    public Date getFimAgendamento() {
        long millis = dataHora.getTime() + (tempoTotal * 60 * 1000);
        return new Date(millis);
    }

    public Object getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
