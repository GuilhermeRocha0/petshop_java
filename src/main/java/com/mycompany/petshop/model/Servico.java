/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop.model;

/**
 *
 * @author dti
 */

// Classe Servico (projeto Sistema de Agendamentos para PetShop)
public class Servico {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private float preco;
    private int tempoEstimado; // em minutos
    
    // Construtor
    public Servico(String nome, float preco, int tempoEstimado) {
        this.id = proximoId++;
        this.nome = nome;
        this.preco = preco;
        this.tempoEstimado = tempoEstimado;
    }
    
    // Getters e Setters
    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Servico.proximoId = proximoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(int tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Preço: R$" + preco + " | Tempo: " + tempoEstimado + " min";
    }
    
}
