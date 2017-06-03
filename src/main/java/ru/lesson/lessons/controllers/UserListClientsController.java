package ru.lesson.lessons.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import ru.lesson.lessons.Client;

public class UserListClientsController {
    @FXML
    private TableView clientTab;

     @FXML
    private Button BackButton;

     @FXML
    private Button MainMenuButton;

     @FXML
    private TableColumn<Client, String> Client;

     @FXML
    private TableColumn<Client, Integer> PetsCount;



}
