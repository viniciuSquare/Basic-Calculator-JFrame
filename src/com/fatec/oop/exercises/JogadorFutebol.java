package com.fatec.oop.exercises;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class JogadorFutebol {

	private String nome;
	private String posicao;
	private String dataDeNascimento;
	private String nacionalidade;
	private double altura;
	private double peso;

	public JogadorFutebol() {

	}

	public JogadorFutebol(String nome, String posicao, String dataDeNascimento, String nacionalidade, double altura,
			double peso) {

		this.nome = nome;
		this.posicao = posicao;
		this.dataDeNascimento = dataDeNascimento;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}

	// methods - getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public static void main(String args[]) {
		JogadorFutebol j1 = new JogadorFutebol();

		j1.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
		j1.setPosicao(JOptionPane.showInputDialog(j1.getNome() + " qual sua posição: "));
		j1.setDataDeNascimento(JOptionPane.showInputDialog(j1.getNome() + " digite sua data de nascimento:"));
		j1.setNacionalidade(JOptionPane.showInputDialog(j1.getNome() + " digite sua nacionalidade:"));
		j1.setAltura(Double.parseDouble(JOptionPane.showInputDialog(j1.getNome() + " digite sua altura:")));
		j1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(j1.getNome() + " digite seu peso:")));

		JOptionPane.showMessageDialog(null,
				j1.getNome() + ", \nPosição " + j1.getPosicao() + "\nNascido em " + j1.getDataDeNascimento() 
				+ "\n" + j1.getNacionalidade() + "\nCom " + j1.getAltura() + "m e " + j1.getPeso() + "kg");
	}

}
