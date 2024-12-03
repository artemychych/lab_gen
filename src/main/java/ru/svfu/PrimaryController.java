package ru.svfu;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.svfu.services.VariantService;

public class PrimaryController {

    private Integer counter = 0;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML 
    private TextField textfield;

    @FXML
    private Button btn;

    @FXML
    private void click(ActionEvent event) {
        int foo;
        String[] dataArray = { "first", "second", "third" };

        try {
            foo = Integer.parseInt(textfield.getText());
        }
        catch (NumberFormatException e) {
            foo = -1;
        }

        if (foo != -1) {
            VariantService service = new VariantService(foo, dataArray);
            btn.setText(service.createTextWithVariant());
        }
        
        
    }
}
