package ru.lesson.lessons.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.lesson.lessons.Client;
import ru.lesson.lessons.Pet;

public class AdminListBaseController {
    @FXML
    private Button addMenuButton;

    @FXML
    private Button editMenuButton;

    @FXML
    private Button deleteButton;

    @FXML
    private TableView clientTab;

    @FXML
    private TableView PetTab;

    @FXML
    private Button ckButton;

    @FXML
    private Button MainMenuButton;

    @FXML
    private TableColumn<Pet, String> PetName;

    @FXML
    private TableColumn<Client, String> Master;

    @FXML
    private TableColumn<Client, String> Client;

    @FXML
    private TableColumn<Client, Integer> PetsCount;
}
