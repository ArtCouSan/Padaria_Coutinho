package com.padaria.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long codigoProduto;
	
	@Column(name = "CDG_BARRA_PRODUTO", length = 100, nullable = true)
	private String codigoBarra;
	
	@Column(name = "NOME_PRODUTO", length = 100, nullable = true)
	private String nome;
	

	@Column(name = "CATEGORIA_PRODUTO", length = 100, nullable = true)
	private String categoria;

	@Column(name = "MARCA_PRODUTO", length = 100, nullable = true)
	private String marca;
	
	
	@Column(name = "DESCRICAO_PRODUTO", length = 100, nullable = true)
	private String descricao;
	
	@Column(name = "DT_VENCIMENTO_PRODUTO", length = 100, nullable = true)
	private String dtVencimento;
	
	@Column(name = "QTN_COMPRADA_PRODUTO", length = 100, nullable = true)
	private int qtnComprada;
	
	@Column(name = "QTN_ESTOQUE_PRODUTO", length = 100, nullable = true)
	private int qtnEstoque;
	
	@Column(name = "PRECO_PRODUTO", length = 100, nullable = true)
	private BigDecimal preco;
	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

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
