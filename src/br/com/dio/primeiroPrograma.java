package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroPrograma {

	public static void main(String[] args) {
		Livros livros = new Livros();
		Gato gato = new Gato();

		System.out.println(gato);
		System.out.println(livros);

	}

}

class livros {
	private String nome;
	private String npag;
}
