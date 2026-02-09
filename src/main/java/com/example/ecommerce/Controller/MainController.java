package com.example.ecommerce.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.Node;

public class MainController {
    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        abrirHome();
    }

    @FXML
    public void abrirHome(){
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirSobre(){
        carregarTela("Sobre.fxml");
    }

    @FXML
    public void abrirSAC(){
        carregarTela("SAC.fxml");
    }

    @FXML
    public void abrirProdutos(){
        carregarTela("Produtos.fxml");
    }

    @FXML
    public void abrirClientes(){
        carregarTela("Clientes.fxml");
    }

    private void carregarTela(String fxml) {
        try {
            Node tela = FXMLLoader.load(
                    getClass().getResource("/fxml/" + fxml)
            );
            root.setCenter(tela);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
