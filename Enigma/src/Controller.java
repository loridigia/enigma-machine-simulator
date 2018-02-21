import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
	@FXML
	private Circle circleQ;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circleQ.setFill(new Color(0,0,1,1.0));
		
	}
}
