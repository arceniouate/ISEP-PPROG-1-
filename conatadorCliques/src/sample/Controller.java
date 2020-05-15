package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    private Label show;
    @FXML
    private Button button;
    int cont=0;

    @FXML
    public void  actionButton(ActionEvent action){
        //cont++;
        show.setText(String.format("%d ",cont++));
    }
}
