package org.agenda;

import org.pessoa.Pessoa;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> contatos = new ArrayList<>();

    public void cadastrar(Pessoa pessoa){
        if(pessoa.getNome() == null || pessoa.getNome() == ""){
            System.out.println("não pode ser null ou vazio");
        }else if(pessoa.getTelefone() == null || pessoa.getTelefone() == "") {
            System.out.println("não pode ser null ou vazio");
        }else if(pessoa.getEmail() == null || pessoa.getEmail() == "") {
            System.out.println("Nome não pode ser null ou vazio");
        }else{
            contatos.add(pessoa);
        }
    }
    public void excluirPorId(int id){
        for(int i = 0; i < contatos.size();i++){
            if(contatos.get(i).getId() == id){
                contatos.remove(i);
                System.out.println("Contato excluido com sucesso");
            }else{
                System.out.println("Contato nao encontrado");
            }
        }
    }
    public void listarContatos(){
        System.out.println("Lista de contatos");

        if(contatos.size() == 0){
            System.out.println("Lista vazia! Cadastre um contato digitando 1");
        }
        for(Pessoa pessoa: contatos){
            System.out.println(
                               "\nID: " + pessoa.getId()+
                               "\nNOME: " + pessoa.getNome()+
                               "\nEMAIL: " + pessoa.getEmail()+
                               "\nTELEFONE: " + pessoa.getTelefone());
        }
    }
    public void alterarContato(int id, String nome, String telefone, String email){

        for(int i=0;i<contatos.size();i++){
            Pessoa pessoa = contatos.get(i);
            if (pessoa.getId() == id) {
                pessoa.atualizar(nome, telefone, email);
                System.out.println("Contato Atualizado");
            }else{
                System.out.println("Contato nao encontrado");
            }
        }
    }
}
