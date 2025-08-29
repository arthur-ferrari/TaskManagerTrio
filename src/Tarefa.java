package com.exemplo.taskmanager;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private final List<Tarefa> tarefas = new ArrayList<>();

    // Dev A
    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    // Dev B
    public List<Tarefa> listarTarefas() {
        return new ArrayList<Tarefa>(tarefas);
    }

    // Dev C
    public boolean removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            return true;
        }
        return false;
    }
}
