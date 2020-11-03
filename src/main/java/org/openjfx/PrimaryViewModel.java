package org.openjfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryViewModel {


    public TextField inputTextfield;

    public Button sayItButton;

    public Label sayItLabel;


    public void initialize() {
        inputTextfield.clear();
    }


    @FXML
    private void onSubmitClicked(ActionEvent event) {
        sayItButton.setDisable(true);
        String text = inputTextfield.getText();
        if (text.equals("")) {
            sayItLabel.setText("Well... If you want me to say nothing, then that's the way it is.");
            inputTextfield.setDisable(true);
            return;
        } else if (!Model.getInstance().waseverSaid(text)) {
            sayItLabel.setText("Ok.. here you go: " + text);
        } else {
            sayItLabel.setText("Nah! I already said that!");
        }
        inputTextfield.clear();

        sayItButton.setDisable(false);
    }
}


