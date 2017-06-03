package ru.lesson.lessons.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import ru.lesson.lessons.Client;
import ru.lesson.lessons.Pet;

public class UserListPetsController {
    @FXML
    private TableView PetTab;

    @FXML
    private Button BackButton;

    @FXML
    private Button MainMenuButton;

    @FXML
    private TableColumn<Pet, String> petName;

    @FXML
    private TableColumn<Client, String> master;

    @FXML
    private void initialize(){
        petName.setCellValueFactory(new PropertyValueFactory<Pet, String>("name"));
        master.setCellValueFactory(new PropertyValueFactory<Client, String>(""));
    }



}
