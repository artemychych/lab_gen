module ru.svfu {
    requires javafx.controls;
    requires javafx.fxml;

    opens ru.svfu to javafx.fxml;
    exports ru.svfu;
}
