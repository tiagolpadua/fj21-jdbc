package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaInsereFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Caelum");
        funcionario.setUsuario("cael");
        funcionario.setSenha("123456");

        FuncionarioDao dao = new FuncionarioDao();

        // método elegante
        dao.adiciona(funcionario);
        System.out.println("Gravado!");
    }

}
