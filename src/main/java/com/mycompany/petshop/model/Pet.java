/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop.model;

/**
 *
 * @author dti
 */

// Classe Pet (projeto Sistema de Agendamentos para PetShop)
public class Pet {
    private static int proximoId = 1;

    private int id;
    private int usuarioId;
    private String nome;
    private String porte;
    private String idade;
    private String raca;
    private String observacoes;
    
    // Construtor
    public Pet(int usuarioId, String nome, String porte, String idade, String raca, String observacoes) {
        this.id = proximoId++;
        this.usuarioId = usuarioId;
        this.nome = nome;
        this.porte = porte;
        this.idade = idade;
        this.raca = raca;
        this.observacoes = observacoes;
    }

    // Getters e Setters
    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Pet.proximoId = proximoId;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    @Override
    public String toString() {
        return "Pet{" + "id=" + id + ", usuarioId=" + usuarioId + ", nome=" + nome + ", porte=" + porte + ", idade=" + idade + ", raca=" + raca + ", observacoes=" + observacoes + '}';
    }
}
