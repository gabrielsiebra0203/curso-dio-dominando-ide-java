package br.com.dio.model;

import java.util.Objects;

public class Gato {

	private String nome;
	private String cor;
	private integer idade;

	}

	public Gato(String nome, String cor, integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public integer getIdade() {
		return idade;
	}

	public void setIdade(integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + "]";
	}

	/*
	 * public Gato (String nome, string cor, integer idade) { this.nome= nome;
	 * this.cor = cor; this.idade = idade; }
	 */

}
