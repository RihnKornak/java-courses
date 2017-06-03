package ru.lesson.lessons.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ru.lesson.lessons.Client;

public class AdminEditClientController {
    @FXML
    private TableView clientTab;

    @FXML
    private Button newClientNameButton;

    @FXML
    private TextField newClientNameField;

    @FXML
    private Button addClientButton;

    @FXML
    private TextField addClientField;

    @FXML
    private Button addPetButton;

    @FXML
    private TextField addPetField;

    @FXML
    private Button BackButton;

    @FXML
    private Button MainMenuButton;

    @FXML
    private TableColumn<ru.lesson.lessons.Client, String> Client;

    @FXML
    private TableColumn<Client, Integer> PetsCount;
}
