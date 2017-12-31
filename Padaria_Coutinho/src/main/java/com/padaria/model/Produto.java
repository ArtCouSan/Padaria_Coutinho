package com.padaria.model;

import java.math.BigDecimal;

public class Produto {

	private String codigoBarra;
	
	private String nome;
	
	private String descricao;
	
	private String dtVencimento;
	
	private int qtnComprada;
	
	private int qtnEstoque;
	
	private BigDecimal preco;

	public String getCodigoBarra() {
		return codigoBarra;
	}

	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public int getQtnComprada() {
		return qtnComprada;
	}

	public void setQtnComprada(int qtnComprada) {
		this.qtnComprada = qtnComprada;
	}

	public int getQtnEstoque() {
		return qtnEstoque;
	}

	public void setQtnEstoque(int qtnEstoque) {
		this.qtnEstoque = qtnEstoque;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	
	
}
