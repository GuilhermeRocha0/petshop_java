/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.petshop.model;

/**
 *
 * @author dti
 */

// Classe Produto (projeto Sistema de Agendamentos para PetShop)
public class Produto {

    private static int proximoId = 1;

    private int id;
    private String nome;
    private float preco;
    private int quantidade;
    private String categoria;
    private String descricao;

    // Construtor
    public Produto(String nome, float preco, int quantidade, String categoria, String descricao) {
        this.id = proximoId++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }
    
    // Getters e Setters
    public static int getProximoId() {
        return proximoId;
    }

    public static void setProximoId(int proximoId) {
        Produto.proximoId = proximoId;
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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + ", categoria=" + categoria + ", descricao=" + descricao + '}';
    }
    
}
