package com.example.ecommerce.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;

public class MainController {

    @FXML
    private BorderPane root;

    @FXML
    public void initialize() {
        abrirHome();
    }

    @FXML
    public void abrirHome() {
        carregarTela("Home.fxml");
    }

    @FXML
    public void abrirClientes() {
        carregarTela("Clientes.fxml");
    }

    @FXML
    public void abrirProdutos() {
        carregarTela("Produtos.fxml");
    }

    @FXML
    public void abrirSobre() {
        carregarTela("Sobre.fxml");
    }

    @FXML
    public void abrirSAC() {
        carregarTela("SAC.fxml");
    }

    private void carregarTela(String fxml) {
        try {
            URL url = getClass().getResource("/fxml/" + fxml);
            if (url == null) {
                throw new RuntimeException("FXML não encontrado: " + fxml);
            }
            FXMLLoader loader = new FXMLLoader(url);
            Node tela = loader.load();
            root.setCenter(tela);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}