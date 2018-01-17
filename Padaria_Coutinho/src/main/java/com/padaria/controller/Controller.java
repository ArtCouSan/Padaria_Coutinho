package com.padaria.controller;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;
import com.jfoenix.validation.RequiredFieldValidator;
import com.padaria.dao.ProdutoDAO;
import com.padaria.model.Produto;
import com.padaria.validator.Validation;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller implements Initializable {

	// Tela Cadastro
	@FXML
	private JFXTextField campoCodigoBarra;

	@FXML
	private JFXComboBox<String> comboCategoria;

	@FXML
	private JFXComboBox<String> comboMarca;

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
	private Button botaoCadastrar;

	@FXML
	private Label labelNome;

	private static ProdutoDAO produtoDAO = new ProdutoDAO();

	// Botao que add produto
	public void botaoAddProduto() {
		
		// Validação
		Validation validator = new Validation();
		
		Produto produto = new Produto();
		
		String codigoBarra = null, 
				nome = null, 
				categoria = null, 
				marca = null, 
				descricao = null, 
				dtVencimento = null, 
				qtnComprada = null, 
				qtnPreco = null;
		
		// Validações de regra de negocio do codigo de barra
		if(validator.validationField(campoCodigoBarra)) {
			
			
		}else {
			
			codigoBarra = campoCodigoBarra.getText();
			
		}
		
		// Validações de regra de negocio do nome
		if(validator.validationField(campoNome)) {
			
		}else {
			
			nome = campoNome.getText();
			
		}
		
		// Validações de regra de negocio de data de vencimento
		if(validator.validationField(campoDtVencimento)) {
			
		}else {
			
			dtVencimento = campoDtVencimento.getText();
			
		}
		
		// Validações de regra de negocio da quantidade comprada
		if(validator.validationField(campoQtnComprada)) {
			
		}else {
			
			qtnComprada = campoQtnComprada.getText(); 
			
		}
		
		// Validações de regra de negocio do preço
		if(validator.validationField(campoPreco)) {
			
		}else {
			
			qtnPreco = campoPreco.getText();
			
		}
		
		// Validações de regra de negocio da descrição
		if(validator.validationArea(campoDescricao)) {
			
		}else {
			
			descricao = campoDescricao.getText();
			
		}
		
		// Validações de regra de negocio da marca
		if(validator.validationCombo(comboMarca)) {
					
		}else {
					
			marca = comboMarca.getValue();
					
		}
				
		// Validações de regra de negocio da categoria
		if(validator.validationCombo(comboCategoria)) {
					
		}else {
					
			categoria = comboCategoria.getValue();
					
		}
		
		produto.setCodigoBarra(codigoBarra);
				
		produto.setNome(nome);
		
		produto.setCategoria(categoria);
		
		produto.setMarca(marca);
		
		produto.setDescricao(descricao);
		
		produto.setDtVencimento(dtVencimento);
		
		produto.setQtnComprada(new Integer(qtnComprada)); 
				
		produto.setPreco(new BigDecimal(qtnPreco));
		
		// Insere produto no banco de dados
		produtoDAO.addProduto(produto);
		
	}

	// Inicial
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		RequiredFieldValidator validator = new RequiredFieldValidator();

		campoCodigoBarra.getValidators().add(validator);

		campoCodigoBarra.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (!newValue) {
					campoCodigoBarra.validate();
				}
			}
		});

	}

}
