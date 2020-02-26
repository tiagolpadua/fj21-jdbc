package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setId(1l);
        contato.setNome("Caelum Atualizado");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj57");
        contato.setDataNascimento(Calendar.getInstance());
        ContatoDao dao = new ContatoDao();
        dao.altera(contato);
        System.out.println("Alterado!");
    }

}
