package com.padaria.config;

import javafx.fxml.FXMLLoader;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class FXMLLoaderProvider {

	private AnnotationConfigApplicationContext ctx;

	@SuppressWarnings("restriction")
	public FXMLLoader getLoader(String path) {

		FXMLLoader loader = new FXMLLoader();

		loader.setControllerFactory(param -> {

			try {
				
				return ctx.getBean(param);
				
			} catch (BeansException e) {
				
				e.printStackTrace();
				
			}

		});

		loader.setLocation(getClass().getResource(path));

		return loader;

	}

	@Autowired
	public void setCtx(AnnotationConfigApplicationContext ctx) {
		this.ctx = ctx;
	}

}
