package com.example.ecommerce.Controller;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class ClientesController {

    @FXML
    private TableView<?> tabelaClientes;

    @FXML
    public void initialize() {

        tabelaClientes.setColumnResizePolicy(
                TableView.CONSTRAINED_RESIZE_POLICY
        );

        Label vazio = new Label("SEM CLIENTES CADASTRADOS");
        vazio.setAlignment(Pos.CENTER);
        vazio.setMaxWidth(Double.MAX_VALUE);

        vazio.setStyle("""
            -fx-font-family: 'Pricedown bl';
            -fx-font-size: 18px;
            -fx-text-fill: rgba(255,255,255,0.4);
        """);
        tabelaClientes.setPlaceholder(vazio);
    }
}
