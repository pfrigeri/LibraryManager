package com.pfrigeri.library.controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TelaLoginController {
    @FXML
    private TextField campoNome;
    @FXML
    private TextField campoSenha;
    @FXML
    private Button btn_Enter;
    @FXML
    private Button btn_Register;

    @FXML
    private void btn_Enter_Click(ActionEvent event){
        if(campoNome != null && campoSenha != null){
            System.out.println(campoNome.getText() + " É uma bicha !");
        }
    }

    @FXML
    private void btn_Register_Click(ActionEvent event){


    }

}
