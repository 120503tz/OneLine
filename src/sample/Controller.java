 package sample;


import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
     public TextField textField1;
     public TextField textField2;
     public Button saveButton;
     public TextArea myBigTextArea;
     public ListView listview1;

     public void userSavedText() {
         String textToSave = textField1.getText();
         myBigTextArea.setText(textToSave);
         listview1.getItems().add(textToSave);
         myBigTextArea.setDisable(false);
         textField1.setText("");
         System.out.println(textToSave);
         saveButton.setText("SAVED");
         saveButton.setDisable(true);
     }
 }