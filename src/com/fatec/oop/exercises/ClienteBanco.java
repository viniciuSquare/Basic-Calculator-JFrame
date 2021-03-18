package com.fatec.oop.exercises;

public class ClienteBanco{
	
	private String nome;
	private String cpf;
	private String endereço;
	private String tipoDeConta;
	
	public ClienteBanco(String nome, String cpf, String endereço, String tipoDeConta) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereço = endereço;
		this.tipoDeConta = tipoDeConta;
	}
	
	//methods - getters & setters	
	public String getNome() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public String getTipoDeConta() {
		return tipoDeConta;
	}
	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	
}
