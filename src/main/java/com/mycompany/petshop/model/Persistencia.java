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

    public static ArrayList<Usuario> getLista() {
        return listaUsuarios;
    }

    public static void cadastrar(Usuario user) {
        if (user != null) {
            listaUsuarios.add(user);
        }
    }

    public static Usuario buscarPorEmail(String email) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }

    public static Usuario buscarPorCpf(String cpf) {
        for (Usuario u : listaUsuarios) {
            if (u.getCpf().equals(cpf)) {
                return u;
            }
        }
        return null;
    }

    public static Usuario autenticar(String email, String senha) {
        for (Usuario u : listaUsuarios) {
            if (u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha)) {
                return u;
            }
        }
        return null;
    }

    // Buscar Usuário por ID
    public static Usuario getUsuarioPorId(int id) {
        for (Usuario u : listaUsuarios) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null; // Não encontrado
    }

    // Serviços
    public static void cadastrarServico(Servico s) {
        if (s != null) {
            listaServicos.add(s);
        }
    }

    public static ArrayList<Servico> getServicos() {
        return listaServicos;
    }

    // Produtos
    public static void cadastrarProduto(Produto p) {
        if (p != null) {
            listaProdutos.add(p);
        }
    }

    public static ArrayList<Produto> getProdutos() {
        return listaProdutos;
    }

    // Pets
    public static void cadastrarPet(Pet pet) {
        if (pet != null) {
            listaPets.add(pet);
        }
    }

    public static ArrayList<Pet> getPets() {
        return listaPets;
    }

    public static Pet buscarPetPorNome(String nome) {
        for (Pet p : listaPets) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    // Buscar Pet por ID
    public static Pet getPetPorId(int id) {
        for (Pet p : listaPets) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null; // Não encontrado
    }

    // Agendamentos
    public static ArrayList<Agendamento> getAgendamentos() {
        return listaAgendamentos;
    }

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

    public static boolean cadastrarAgendamento(Agendamento agendamento) {
        if (!temConflito(agendamento.getDataHora(), agendamento.getTempoTotal())) {
            listaAgendamentos.add(agendamento);
            return true;
        }
        return false; // Conflito encontrado, não cadastra
    }
}
