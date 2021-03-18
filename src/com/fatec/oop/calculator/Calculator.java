package com.fatec.oop.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField opPanel;
	
	private JButton btnClean;
	private JButton btnSignalChange;
	private JButton btnPercentage;
	private JButton btnDivide;
	private JButton btnMultipliy;
	private JButton btnMinus;
	private JButton btnPlus;
		
	private JButton btnNum1;
	private JButton btnNum2;
	private JButton btnNum3;
	private JButton btnNum4;
	private JButton btnNum5;
	private JButton btnNum6;
	private JButton btnNum7;
	private JButton btnNum8;
	private JButton btnNum9;
	private JButton btnNum0;
	
	private JButton btnEqual;
	private JButton btnComma;
	
	public Eval operator;

	public static String equal(String str) {
		
		if(str.indexOf('=') != -1) {
			str = str.substring((str.indexOf('=')+1));
		} else
			str = Double.toString(Eval.eval(str));
		
		return str;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {150, 150, 150, 123};
		gbl_contentPane.rowHeights = new int[] {120, 60, 60, 60, 60, 60, 60};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		contentPane.setLayout(gbl_contentPane);
		
		opPanel = new JTextField();
		opPanel.setFont(new Font("Montserrat", Font.PLAIN, 21));
		opPanel.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		GridBagConstraints gbc_opPanel = new GridBagConstraints();
		gbc_opPanel.insets = new Insets(10, 0, 15, 0);
		gbc_opPanel.ipady = 10;
		gbc_opPanel.fill = GridBagConstraints.BOTH;
		gbc_opPanel.gridwidth = 5;
		gbc_opPanel.gridx = 0;
		gbc_opPanel.gridy = 0;
		contentPane.add(opPanel, gbc_opPanel);
		
		opPanel.setColumns(10);
		
		btnClean = new JButton("Clean");	
		GridBagConstraints gbc_btnClean = new GridBagConstraints();
		gbc_btnClean.fill = GridBagConstraints.BOTH;
		gbc_btnClean.gridx = 0;
		gbc_btnClean.gridy = 1;
		contentPane.add(btnClean, gbc_btnClean);
		
		btnSignalChange = new JButton("+/-");
		btnSignalChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnSignalChange = new GridBagConstraints();
		gbc_btnSignalChange.fill = GridBagConstraints.BOTH;
		gbc_btnSignalChange.insets = new Insets(0, 0, 0, 0);
		gbc_btnSignalChange.gridx = 1;
		gbc_btnSignalChange.gridy = 1;
		contentPane.add(btnSignalChange, gbc_btnSignalChange);
		
		btnPercentage = new JButton("%");
		GridBagConstraints gbc_btnPercentage = new GridBagConstraints();
		gbc_btnPercentage.fill = GridBagConstraints.BOTH;
		gbc_btnPercentage.insets = new Insets(0, 0, 0, 0);
		gbc_btnPercentage.gridx = 2;
		gbc_btnPercentage.gridy = 1;
		contentPane.add(btnPercentage, gbc_btnPercentage);

		btnMinus = new JButton("-");
		GridBagConstraints gbc_btnMinus = new GridBagConstraints();
		gbc_btnMinus.gridwidth = 2;
		gbc_btnMinus.fill = GridBagConstraints.BOTH;
		gbc_btnMinus.gridx = 3;
		gbc_btnMinus.gridy = 3;
		contentPane.add(btnMinus, gbc_btnMinus);
		
		btnDivide = new JButton("/");
		GridBagConstraints gbc_btnDivide = new GridBagConstraints();
		gbc_btnDivide.gridwidth = 2;
		gbc_btnDivide.fill = GridBagConstraints.BOTH;
		gbc_btnDivide.insets = new Insets(0, 0, 0, 0);
		gbc_btnDivide.gridx = 3;
		gbc_btnDivide.gridy = 1;
		contentPane.add(btnDivide, gbc_btnDivide);

		btnMultipliy = new JButton("X");
		GridBagConstraints gbc_btnMultipliy = new GridBagConstraints();
		gbc_btnMultipliy.gridwidth = 2;
		gbc_btnMultipliy.fill = GridBagConstraints.BOTH;
		gbc_btnMultipliy.gridx = 3;
		gbc_btnMultipliy.gridy = 2;
		contentPane.add(btnMultipliy, gbc_btnMultipliy);
		
		btnPlus = new JButton("+");
		GridBagConstraints gbc_btnPlus = new GridBagConstraints();
		gbc_btnPlus.fill = GridBagConstraints.BOTH;
		gbc_btnPlus.gridwidth = 2;
		gbc_btnPlus.gridx = 3;
		gbc_btnPlus.gridy = 4;
		contentPane.add(btnPlus, gbc_btnPlus);
		
		btnNum1 = new JButton("1");		
		GridBagConstraints gbc_btnNum1 = new GridBagConstraints();
		gbc_btnNum1.fill = GridBagConstraints.BOTH;
		gbc_btnNum1.gridx = 0;
		gbc_btnNum1.gridy = 2;
		contentPane.add(btnNum1, gbc_btnNum1);
		
		btnNum2 = new JButton("2");
		GridBagConstraints gbc_btnNum2 = new GridBagConstraints();
		gbc_btnNum2.fill = GridBagConstraints.BOTH;
		gbc_btnNum2.gridx = 1;
		gbc_btnNum2.gridy = 2;
		contentPane.add(btnNum2, gbc_btnNum2);
		
		btnNum3 = new JButton("3");
		GridBagConstraints gbc_btnNum3 = new GridBagConstraints();
		gbc_btnNum3.fill = GridBagConstraints.BOTH;
		gbc_btnNum3.insets = new Insets(0, 0, 0, 0);
		gbc_btnNum3.gridx = 2;
		gbc_btnNum3.gridy = 2;
		contentPane.add(btnNum3, gbc_btnNum3);

		btnNum4 = new JButton("4");
		GridBagConstraints gbc_btnNum4 = new GridBagConstraints();
		gbc_btnNum4.fill = GridBagConstraints.BOTH;
		gbc_btnNum4.gridx = 0;
		gbc_btnNum4.gridy = 3;
		contentPane.add(btnNum4, gbc_btnNum4);

		btnNum5 = new JButton("5");
		GridBagConstraints gbc_btnNum5 = new GridBagConstraints();
		gbc_btnNum5.fill = GridBagConstraints.BOTH;
		gbc_btnNum5.gridx = 1;
		gbc_btnNum5.gridy = 3;
		contentPane.add(btnNum5, gbc_btnNum5);
		
		btnNum6 = new JButton("6");
		GridBagConstraints gbc_btnNum6 = new GridBagConstraints();
		gbc_btnNum6.fill = GridBagConstraints.BOTH;
		gbc_btnNum6.gridx = 2;
		gbc_btnNum6.gridy = 3;
		contentPane.add(btnNum6, gbc_btnNum6);
		
		btnNum7 = new JButton("7");
		GridBagConstraints gbc_btnNum7 = new GridBagConstraints();
		gbc_btnNum7.fill = GridBagConstraints.BOTH;
		gbc_btnNum7.gridx = 0;
		gbc_btnNum7.gridy = 4;
		contentPane.add(btnNum7, gbc_btnNum7);
		
		btnNum8 = new JButton("8");
		GridBagConstraints gbc_btnNum8 = new GridBagConstraints();
		gbc_btnNum8.fill = GridBagConstraints.BOTH;
		gbc_btnNum8.gridx = 1;
		gbc_btnNum8.gridy = 4;
		contentPane.add(btnNum8, gbc_btnNum8);
		
		btnNum9 = new JButton("9");
		GridBagConstraints gbc_btnNum9 = new GridBagConstraints();
		gbc_btnNum9.fill = GridBagConstraints.BOTH;
		gbc_btnNum9.gridx = 2;
		gbc_btnNum9.gridy = 4;
		contentPane.add(btnNum9, gbc_btnNum9);
		
		btnNum0 = new JButton("0");
		GridBagConstraints gbc_btnNum0 = new GridBagConstraints();
		gbc_btnNum0.fill = GridBagConstraints.BOTH;
		gbc_btnNum0.gridwidth = 2;
		gbc_btnNum0.gridx = 0;
		gbc_btnNum0.gridy = 5;
		contentPane.add(btnNum0, gbc_btnNum0);
		
		btnComma = new JButton(",");
		GridBagConstraints gbc_btnComma = new GridBagConstraints();
		gbc_btnComma.fill = GridBagConstraints.BOTH;
		gbc_btnComma.insets = new Insets(0, 0, 0, 0);
		gbc_btnComma.gridx = 2;
		gbc_btnComma.gridy = 5;
		contentPane.add(btnComma, gbc_btnComma);
		
		btnEqual = new JButton("=");
		GridBagConstraints gbc_btnEqual = new GridBagConstraints();
		gbc_btnEqual.gridwidth = 2;
		gbc_btnEqual.fill = GridBagConstraints.BOTH;
		gbc_btnEqual.gridx = 3;
		gbc_btnEqual.gridy = 5;
		contentPane.add(btnEqual, gbc_btnEqual);
	
	//methods
		
		//Operations
		btnClean.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				opPanel.setText("");
				
			}
		});
		
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String result = equal(opPanel.getText());
				
				opPanel.setText(opPanel.getText() + " = " + result);
			}
		});

		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
				//equal() + { operator }
				
				String result = equal(opPanel.getText());
				
				opPanel.setText(result + " + ");
			}
		});
		
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO			
				String result = equal(opPanel.getText());
				
				opPanel.setText(result + " - ");
			}
		});
		
		btnMultipliy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO				
				String result = equal(opPanel.getText());
				
				opPanel.setText(result + " * ");
			}
		});
		
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO				
				String result = equal(opPanel.getText());
				
				opPanel.setText(result + " + ");
			}
		});
		
		btnSignalChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				opPanel.setText("-" + equal(opPanel.getText()));
				
			}
		});
		
		//Numbers		
		btnNum1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "1");
				
			}
		});
		btnNum2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "2");
				
			}
		});
		btnNum3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "3");
				
			}
		});
		btnNum4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "4");
				
			}
		});		
		btnNum5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "5");
				
			}
		});
		btnNum6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "6");
				
			}
		});
		btnNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "7");
				
			}
		});
		btnNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "8");
				
			}
		});
		btnNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "9");
				
			}
		});
		btnNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + "0");
				
			}
		});
				
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				opPanel.setText(opPanel.getText() + ".");
				
			} 
		});
		
	}
}
