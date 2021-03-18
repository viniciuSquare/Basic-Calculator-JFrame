package com.fatec.oop.exercises;

import javax.swing.JOptionPane;

public class Pessoa {
	
	private String name;
	private int birthyear;
	private double height;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String name, int birthyear, double height) {
		
		this.name = name;
		this.birthyear = birthyear;
		this.height = height;
	}

	//methods - getters & setters	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	
	
	public static void main(String args[]){
		Pessoa p1 = new Pessoa();
		
		p1.setName(JOptionPane.showInputDialog("Digite seu nome"));
		p1.setBirthyear(Integer.parseInt(JOptionPane.showInputDialog("Olá " + p1.getName() + "! Qual o ano do seu nascimento?")));
		p1.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
		
		JOptionPane.showMessageDialog(null, 
				p1.getName() + ", \nvocê tem " + (2021 - p1.getBirthyear()) + " anos \ne " + p1.getHeight() + "m");
	}
	
}
