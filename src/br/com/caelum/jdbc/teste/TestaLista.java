package br.com.caelum.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {

    public static void main(String[] args) {
        ContatoDao dao = new ContatoDao();

        System.out.println("Lista todos:");
        imprime(dao.getLista());
        
        System.out.println("pesquisaNome:");
        imprime(dao.pesquisarNome());
        
        System.out.println("pesquisaId:");
        imprime(dao.pesquisar(1));

    }

    public static void imprime(List<Contato> contatos) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Endereço: " + contato.getEndereco());
            System.out.println("Data de Nascimento: " + sdf.format(contato.getDataNascimento().getTime()) + "\n");
        }
    }

}
