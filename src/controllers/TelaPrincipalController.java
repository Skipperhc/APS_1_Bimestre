package controllers;
/**
 * Sample Skeleton for 'TelaPrincipal.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;

public class TelaPrincipalController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAlertDialog"
    private Button btnAlertDialog; // Value injected by FXMLLoader

    @FXML // fx:id="btnInputDialog"
    private Button btnInputDialog; // Value injected by FXMLLoader

    @FXML // fx:id="btnChoiceDialog"
    private Button btnChoiceDialog; // Value injected by FXMLLoader

    @FXML // fx:id="lblInputDialog"
    private Label lblInputDialog; // Value injected by FXMLLoader

    @FXML // fx:id="lblChoice"
    private Label lblChoice; // Value injected by FXMLLoader


    @FXML
    void showAlertDialog(ActionEvent event) {

    	Alert alert = new Alert(AlertType.INFORMATION);
    	//Aqui inserimos o titulo do alerta
    	alert.setTitle("Atenção");
    	
    	alert.setHeaderText("Existe vários tipos de Alertas");
    	
    	alert.setContentText("Bem útil se estivermos com pressa para desenvolver o programa");
    	
    	alert.setOnCloseRequest(e -> showAlerts());
    	
    	alert.showAndWait();
    	
    }
    
    private void showAlerts() {
    	Alert alertWarninng = new Alert(AlertType.WARNING);
    	Alert alertConfirmation = new Alert(AlertType.CONFIRMATION);
    	Alert alertError = new Alert(AlertType.ERROR);
    	Alert alertNone = new Alert(AlertType.NONE);
    	
    	alertConfirmation.setHeaderText("Confirmação");
    	alertConfirmation.showAndWait();

    	alertError.setHeaderText("Erro");
    	alertError.showAndWait();

    	alertWarninng.setHeaderText("e Aviso");
    	alertWarninng.showAndWait();

    }

    @FXML
    void showChoiceDialog(ActionEvent event) {

    	ChoiceDialog<String> choiceDialog = new ChoiceDialog<String>("Você","pode","colocar","o que","quiser","nas","opções");
    	choiceDialog.setTitle("Choice Dialog");
    	choiceDialog.setHeaderText("O proveito que pode tirar é seleção de escolhas pre determinadas");
    	choiceDialog.setContentText("escolha uma String");
    	Optional<String> result = choiceDialog.showAndWait();
    	System.out.println("ate aqui tudo bem");
    	if(result.isPresent()) lblChoice.setText("Aê você selecionou \"" + result.get() + "\"");
    }

    @FXML
    void showInputDialog(ActionEvent event) {

    	TextInputDialog inputDialog = new TextInputDialog();
    	
    	inputDialog.setTitle("Titulo do input dialog");
    	
    	inputDialog.setHeaderText("acho bem util ferramentas prontas");
    	
    	inputDialog.setContentText(" insira qualquer coisa que quiser aqui: ");
    	
    	Optional<String> result = inputDialog.showAndWait();
    	System.out.println("ate aqui tudo bem");
    	if(result.isPresent()) lblInputDialog.setText("Aê você selecionou " + result.get());
    	
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAlertDialog != null : "fx:id=\"btnAlertDialog\" was not injected: check your FXML file 'TelaPrincipal.fxml'.";
        assert btnInputDialog != null : "fx:id=\"btnInputDialog\" was not injected: check your FXML file 'TelaPrincipal.fxml'.";
        assert btnChoiceDialog != null : "fx:id=\"btnChoiceDialog\" was not injected: check your FXML file 'TelaPrincipal.fxml'.";
        assert lblInputDialog != null : "fx:id=\"lblInputDialog\" was not injected: check your FXML file 'TelaPrincipal.fxml'.";

    }
}

