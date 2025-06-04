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
// Classe Persistencia (projeto Sistema de Agendamentos para PetShop)
public class Persistencia {

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private static ArrayList<Servico> listaServicos = new ArrayList<Servico>();
    private static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
    private static ArrayList<Pet> listaPets = new ArrayList<Pet>();
    private static ArrayList<Agendamento> listaAgendamentos = new ArrayList<Agendamento>();

    // Usuários
    static {
        // Usuário admin criado ao iniciar o sistema
        Usuario admin = new Usuario("Administrador", "admin", "00000000000", "admin", "ADMIN");
        listaUsuarios.add(admin);
    }
    
    // Método que retorna a lista de usuários
    public static ArrayList<Usuario> getLista() {
        return listaUsuarios;
    }
    
    // Método que salva o usuário cadastrado na lista de usuários
    public static void cadastrar(Usuario user) {
        if (user != null) {
            listaUsuarios.add(user);
        }
    }

    // Método que busca o usuário pelo seu email cadastrado
    public static Usuario buscarPorEmail(String email) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }
    
    // Método que busca o usuário pelo seu CPF cadastrado
    public static Usuario buscarPorCpf(String cpf) {
        for (Usuario u : listaUsuarios) {
            if (u.getCpf().equals(cpf)) {
                return u;
            }
        }
        return null;
    }
    
    // Método que verifica que o usuário está na lista de usuários para conseguir autentica-lo, retornando o usuário
    public static Usuario autenticar(String email, String senha) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    // Método que busca o usuário pelo seu id
    public static Usuario getUsuarioPorId(int id) {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null; // Não encontrado
    }

    // Serviços
    // Método que salva o serviço na lista de serviços
    public static void cadastrarServico(Servico s) {
        if (s != null) {
            listaServicos.add(s);
        }
    }

    // Método que retorna a lista de serviços
    public static ArrayList<Servico> getServicos() {
        return listaServicos;
    }

    // Produtos
    // Método que salva o produto na lista de produtos
    public static void cadastrarProduto(Produto p) {
        if (p != null) {
            listaProdutos.add(p);
        }
    }
    
    // Método que retorna a lista de Produtos
    public static ArrayList<Produto> getProdutos() {
        return listaProdutos;
    }

    // Pets
     // Método que salva o pet na lista de Pets
    public static void cadastrarPet(Pet pet) {
        if (pet != null) {
            listaPets.add(pet);
        }
    }
    
    // Método que retorna a lista de Pets
    public static ArrayList<Pet> getPets() {
        return listaPets;
    }

    // Método que busca o pet pelo seu nome
    public static Pet buscarPetPorNome(String nome) {
        for (Pet p : listaPets) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // Método que busca o pet pelo seu id
    public static Pet getPetPorId(int id) {
        for (Pet p : listaPets) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // Não encontrado
    }

    // Agendamentos
    // Método que retorna a lista de Agendamentos
    public static ArrayList<Agendamento> getAgendamentos() {
        return listaAgendamentos;
    }

    // Método que verifica se há algum conflito na data e hora no momento em que é feita a tentativa de salvar uma agendamento
    public static boolean temConflito(Date inicio, int duracaoMinutos) {
        long inicioMillis = inicio.getTime();
        long fimMillis = inicioMillis + (duracaoMinutos * 60 * 1000);
        
        for (Agendamento a : listaAgendamentos) {
            long agendamentoInicio = a.getDataHora().getTime();
            long agendamentoFim = a.getFimAgendamento().getTime();

            // Conflito: início < fim de agendamento existente E fim > início de agendamento existente
            if (inicioMillis < agendamentoFim && fimMillis > agendamentoInicio) {
                return true;
            }
        }
        return false;
    }
    
    // Método que salva o agendamento na lista de agendmanetos se a data e hora não tiver nenhum conflito
    public static boolean cadastrarAgendamento(Agendamento agendamento) {
        if (!temConflito(agendamento.getDataHora(), agendamento.getTempoTotal())) {
            listaAgendamentos.add(agendamento);
            return true;
        }
        return false; // Conflito encontrado, não cadastra
    }
}
