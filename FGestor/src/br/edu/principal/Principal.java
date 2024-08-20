package br.edu.principal;

import br.edu.dados.carro_de_passeio;
import br.edu.dados.jeep;
import br.edu.dados.utilitarios;

public class Principal {

	public static void main(String[] args) {
		jeep c1 = new jeep();
		carro_de_passeio c2 = new carro_de_passeio();
		utilitarios c3 = new utilitarios();
		c1.buzinar();
		c2.buzinar();
		c3.buzinar();
		c1.freiar();
	}

}
