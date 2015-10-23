package cis232.converter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KilometerConverterController {

	@FXML
	private Button button;

	@FXML
	private TextField textfieldKM;

	@FXML
	private Label lblOutput;

	public void initialize() {
		// Perform any initialization in here
		lblOutput.setText("Enter some kms and I'll show you some miles");
	}

	public void buttonListener() {
		final double CONVERSION_FACTOR = 0.6214;
		try {
			String str = textfieldKM.getText();

			double miles = Double.parseDouble(str) * CONVERSION_FACTOR;

			lblOutput.setText(String.format("%s km is %.1f miles", str, miles));
		} catch (NumberFormatException e) {
			lblOutput.setText("that's not a number!");
		}
	}
}
