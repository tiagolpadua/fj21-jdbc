package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaListaFuncionarios {

    public static void main(String[] args) {
        FuncionarioDao dao = new FuncionarioDao();

        System.out.println("Lista todos:");
        imprime(dao.getLista());

    }

    public static void imprime(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Usuario: " + funcionario.getUsuario());
            System.out.println("Senha: " + funcionario.getSenha());
        }
    }

}
