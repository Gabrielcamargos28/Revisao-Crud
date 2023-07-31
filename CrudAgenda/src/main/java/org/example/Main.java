package org.example;

import org.agenda.Agenda;
import org.pessoa.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();
        System.out.println("Agenda de Contatos");

        while(true){
            System.out.println("\n 1 - Listar Contatos");
            System.out.println("\n 2 - Cadastrar Contato");
            System.out.println("\n 3 - Alterar Contato");
            System.out.println("\n 4 - Excluir Contato");
            System.out.println("\nEscolha uma opcao");
            int op = scan.nextInt();
            scan.nextLine();

            if(op == 0){
                break;
            }else if(op == 1){
                agenda.listarContatos();
                //breakPointTeste
            }else if(op == 2){
                System.out.print("Digite o ID do contato: ");
                int id = scan.nextInt();
                scan.nextLine();
                System.out.print("Digite o nome do contato: ");
                String nome = scan.nextLine();
                System.out.print("Digite o telefone do contato: ");
                String telefone = scan.nextLine();
                System.out.print("Digite o email do contato: ");
                String email = scan.nextLine();
                Pessoa pessoa = new Pessoa(id,nome,telefone,email);
                agenda.cadastrar(pessoa);
            }else if(op == 3){
                System.out.print("Digite o ID do contato que deseja alterar: ");
                int id = scan.nextInt();
                scan.nextLine(); // Limpa o buffer
                System.out.print("Digite o novo nome do contato: ");
                String nome = scan.nextLine();
                System.out.print("Digite o novo telefone do contato: ");
                String telefone = scan.nextLine();
                System.out.print("Digite o novo email do contato: ");
                String email = scan.nextLine();
                agenda.alterarContato(id,nome,email,telefone);
            }else if(op ==4){
                System.out.println("Digite o ID para exclusao do contato");
                int id = scan.nextInt();
                agenda.excluirPorId(id);
            }else{
                System.out.println("Essa opcao ainda nao foi implementada...Trabalhando...");
            }
        }


    }
}