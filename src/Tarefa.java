package com.exemplo.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    // Lista estática para armazenar as tarefas
    private static List<Tarefa> tarefas = new ArrayList<>();

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return (concluida ? "[X] " : "[ ] ") + descricao;
    }

    // 🔹 Método solicitado: adicionarTarefa
    public static void adicionarTarefa(String descricao) {
        Tarefa nova = new Tarefa(descricao);
        tarefas.add(nova);
    }

    // Getter para recuperar a lista (vai ser útil no listarTarefas do Dev B)
    public static List<Tarefa> getTarefas() {
        return tarefas;
    }
}
