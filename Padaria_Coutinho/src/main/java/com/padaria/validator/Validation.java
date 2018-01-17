package com.padaria.validator;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

public class Validation {

	// Validação de field
	public boolean validationField(JFXTextField text) {

		if (text.getText().isEmpty() || text.getText().equals("")) {

			return true;

		}

		return false;

	}

	// Validação de area
	public boolean validationArea(JFXTextArea text) {

		if (text.getText().isEmpty() || text.getText().equals("")) {

			return true;

		}

		return false;

	}
	
	// Validação de combo
	public boolean validationCombo(JFXComboBox<String> text) {

		if (text.getValue().isEmpty() || text.getValue().equals("")) {

			return true;

		}

		return false;

	}

}
