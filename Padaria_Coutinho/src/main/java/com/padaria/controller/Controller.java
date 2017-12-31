package com.padaria.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller{
	
	// Tela Cadastro
	@FXML
	private TextField campoCodigoBarra;
	
	@FXML
	private ComboBox<?> comboCategoria;
	
	@FXML
	private ComboBox<?> comboMarca;
	
	@FXML
	private TextField campoNome;
	
	@FXML
	private TextArea campoDescricao;
	
	@FXML
	private TextField campoDtVencimento;
	
	@FXML
	private TextField campoQtnComprada;
	
	@FXML
	private TextField campoQtnEstoque;
	
	@FXML
	private TextField campoPreco;
	
	@FXML
	private Button botaoCadastrar;
	
	
	@FXML
	private Label labelNome;
	
	// Tela Consulta
	
	public void initialize() {
		
		labelNome.setText("Nome :");
		
	}

}
