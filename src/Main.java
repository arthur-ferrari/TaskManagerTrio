package com.exemplo.taskmanager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas manager = new GerenciadorTarefas(); // Instância do gerenciador
        Scanner sc = new Scanner(System.in);                   // Leitor do console
        boolean sair = false;

        while (!sair) {
            System.out.println("\n=== TaskManagerTrio ===");
            System.out.println("1) Adicionar tarefa");
            System.out.println("2) Listar tarefas");
            System.out.println("3) Remover tarefa");
            System.out.println("0) Sair");
            System.out.print("Escolha: ");

            String entrada = sc.nextLine();
            int op;

            try {
                op = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número.");
                continue;
            }

            switch (op) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String desc = sc.nextLine();
                    manager.adicionarTarefa(desc); // Chama método do Dev A
                    System.out.println("✅ Tarefa adicionada!");
                    break;

                case 2:
                    List<Tarefa> lista = manager.listarTarefas(); // Chama método do Dev B
                    if (lista.isEmpty()) {
                        System.out.println("⚠️ Nenhuma tarefa cadastrada.");
                    } else {
                        System.out.println("📋 Tarefas:");
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + ") " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o índice da tarefa para remover: ");
                    String idxStr = sc.nextLine();
                    try {
                        int idx = Integer.parseInt(idxStr);
                        boolean removida = manager.removerTarefa(idx); // Chama método do Dev C
                        if (removida) {
                            System.out.println("🗑️ Tarefa removida com sucesso.");
                        } else {
                            System.out.println("❌ Índice inválido.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Entrada inválida. Use um número.");
                    }
                    break;

                case 0:
                    sair = true;
                    break;

                default:
                    System.out.println("⚠️ Opção inválida.");
            }
        }

        sc.close();
        System.out.println("👋 Programa encerrado.");
    }
}
