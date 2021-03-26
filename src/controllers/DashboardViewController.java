package controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import models.Professor;
import models.Student;
import utilities.DBUtility;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardViewController implements Initializable {

    @FXML
    private Label studentsLabel;

    @FXML
    private ListView<Student> studentListView;

    @FXML
    private Label professorsLabel;

    @FXML
    private ListView<Professor> professorsListView;

    @FXML
    private Label courcesLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        studentListView.getItems().addAll(DBUtility.getStudentsFromDB());
        professorsListView.getItems().addAll(DBUtility.getProfessorsFromDB());
        studentsLabel.setText("Students : " + studentListView.getItems().size() + " Students");
        professorsLabel.setText("Professors : " + professorsListView.getItems().size() + " Professors");
    }

}
