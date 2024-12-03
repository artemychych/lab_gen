package ru.svfu;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class MainController {
    @FXML
    private ListView<String> labList; // Список лабораторных

    @FXML
    private VBox formContainer; // Контейнер для отображения формы

    public void onCreateLab() {
        // Логика для создания новой лабораторной
    }

    public void onEditLab() {
        // Логика для редактирования выбранной лабораторной
    }

    public void onSaveLab() {
        // Логика для сохранения лабораторной
    }
}
