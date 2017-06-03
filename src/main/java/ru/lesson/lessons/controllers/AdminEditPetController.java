package ru.lesson.lessons.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import ru.lesson.lessons.Client;
import ru.lesson.lessons.Pet;


public class AdminEditPetController {
    @FXML
    private TableView clientTab;

    @FXML
    private Button newPetNameButton;

    @FXML
    private TextField newPetNameField;

    @FXML
    private Button deletePetButton;

    @FXML
    private Button BackButton;

    @FXML
    private Button MainMenuButton;

    @FXML
    private TableColumn<Pet, String> PetName;

    @FXML
    private TableColumn<Client, String> Master;
}
