package com.padaria.controller;

import java.math.BigDecimal;


import com.jfoenix.controls.*;
import com.jfoenix.validation.RequiredFieldValidator;
import com.padaria.dao.ProdutoDAO;
import com.padaria.model.Produto;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller{
	
	// Tela Cadastro
	@FXML
	private JFXTextField campoCodigoBarra;
	
	@FXML
	private JFXComboBox<?> comboCategoria;
	
	@FXML
	private JFXComboBox<?> comboMarca;
	
	@FXML
	private JFXTextField campoNome;
	
	@FXML
	private JFXTextArea campoDescricao;
	
	@FXML
	private JFXTextField campoDtVencimento;
	
	@FXML
	private JFXTextField campoQtnComprada;
	
	@FXML
	private JFXTextField campoQtnEstoque;
	
	@FXML
	private JFXTextField campoPreco;
	
	@FXML
	private JFXButton botaoCadastrar;
	
	
	@FXML
	private Label labelNome;
	
	private static ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void botaoAddProduto() {
	
		RequiredFieldValidator validator = new RequiredFieldValidator();
		
//		campoCodigoBarra.getV
				
		Produto produto = new Produto();
		
		produto.setCodigoBarra(campoCodigoBarra.getText());

		produto.setNome(campoNome.getText());
		
		produto.setDescricao(campoDescricao.getText());
		
		produto.setDtVencimento(campoDtVencimento.getText());
		
		produto.setQtnComprada(new Integer(campoQtnComprada.getText())); 
		
		produto.setQtnEstoque(new Integer(campoQtnEstoque.getText()));
		
		produto.setPreco(new BigDecimal(campoPreco.getText()));
		
		produtoDAO.addProduto(produto);
		
	}

}
