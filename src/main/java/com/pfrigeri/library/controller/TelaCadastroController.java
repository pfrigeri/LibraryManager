package com.pfrigeri.library.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

import java.awt.*;

public class TelaCadastroController {
    @FXML
    private TextField txt_NomeCadastro;
    @FXML
    private TextField txt_EmailCadastro;
    @FXML
    private TextField txt_BirthDateCadastro;
    @FXML
    private TextField txt_SenhaCadastro;

    @FXML
    private RadioButton rb_User;
    @FXML
    private RadioButton rb_Admin;

    @FXML
    private Button btn_Cadastrar;


}
