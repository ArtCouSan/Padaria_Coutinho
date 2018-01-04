package com.padaria.dao;

import com.padaria.model.Produto;

import org.hibernate.Session;

import com.padaria.entity.HibernateUtil;

public class ProdutoDAO {

	public void addProduto(Produto produto) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		
		s.beginTransaction();
		
		s.save(produto);
		
		s.getTransaction().commit();
		
		s.close();
		
	}
	
}
