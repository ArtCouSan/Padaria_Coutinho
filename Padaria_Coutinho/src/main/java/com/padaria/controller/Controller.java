package com.padaria.controller;

import java.math.BigDecimal;

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
	private TextField campoCodigoBarra;
	
	@FXML
	private ComboBox<?> comboCategoria;
	
	@FXML
	private ComboBox<?> comboMarca;
	
	@FXML
	private TextField campoCategoria;
	
	@FXML
	private TextField campoMarca;
	
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
	
	private static ProdutoDAO produtoDAO = new ProdutoDAO();
	
	public void botaoAddProduto() {
	
		Produto produto = new Produto();
		
		produto.setCodigoBarra(campoCodigoBarra.getText());
		
		produto.setCategoria(campoCategoria.getText());
		
		produto.setMarca(campoMarca.getText());

		produto.setNome(campoNome.getText());
		
		produto.setDescricao(campoDescricao.getText());
		
		produto.setDtVencimento(campoDtVencimento.getText());
		
		produto.setQtnComprada(new Integer(campoQtnComprada.getText())); 
		
		produto.setQtnEstoque(new Integer(campoQtnEstoque.getText()));
		
		produto.setPreco(new BigDecimal(campoPreco.getText()));
		
		produtoDAO.addProduto(produto);
		
	}

}
