package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemover {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setId(1l);
        ContatoDao dao = new ContatoDao();
        dao.remove(contato);
        System.out.println("Removido!");
    }

}
