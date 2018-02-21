import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
	@FXML
	private Circle circleQ, circleW, circleE, circleR, circleT, circleY, circleU, circleI, circleO, circleP, circleA, circleS,
			circleD, circleF, circleG, circleH, circleJ, circleK, circleL, circleZ, circleX, circleC, circleV, circleB, circleN, circleM;

	@FXML
	private Button buttonQ, buttonW, buttonE, buttonR, buttonT, buttonY, buttonU, buttonI, buttonO, buttonP, buttonA, buttonS,
			buttonD, buttonF, buttonG, buttonH, buttonJ, buttonK, buttonL, buttonZ, buttonX, buttonC, buttonV, buttonB, buttonN, buttonM, impostaRotori;

	@FXML
	private ChoiceBox choicepos1, choicepos2, choicepos3, choiceSX, choiceCE, choiceDX, choiceREF;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// INITIALIZE POSIZIONE ROTORI
		choicepos1.getItems().addAll("I", "II", "III");
		choicepos1.setValue("I");
		choicepos2.getItems().addAll("I", "II", "III");
		choicepos2.setValue("II");
		choicepos3.getItems().addAll("I", "II", "III");
		choicepos3.setValue("III");

		// INITIALIZE VALUE OF ROTORI
		choiceREF.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
		choiceREF.setValue(0);
		choiceSX.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
		choiceSX.setValue(0);
		choiceCE.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
		choiceCE.setValue(0);
		choiceDX.getItems().addAll(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26);
		choiceDX.setValue(0);

		impostaRotori.setOnAction( e -> {
			int pos1 = ChoicePosition(choicepos1);
			int pos2 = ChoicePosition(choicepos2);
			int pos3 = ChoicePosition(choicepos3);
			if(pos1 == pos2 || pos1 == pos3 || pos2 == pos3 || (pos1 == pos2 && pos1 == pos3)){
				System.out.println("HAI SOLO 3 ROTORI A DISPOSIZIONE, QUINDI UNO DI ESSI NON PUò STARE IN 2 POSIZIONE DIVERSE CONTEMPORANEAMENTE \n");
				pos1 = 1;
				pos2 = 2;
				pos3 = 3;
			}

			System.out.println("POSIZIONE 1: ROTORE " + pos1 + "\n POSIZIONE 2: ROTORE " + pos2 + "\n POSIZIONE 3: ROTORE " + pos3 + "\n");
		});

		
	}

	public Integer ChoicePosition(ChoiceBox choicepos){
		int rotore;
		if( choicepos.getValue() == "I") return 1;
		else if(choicepos.getValue() == "II") return 2;
		else return 3;
	}
	
}

//circleQ.setFill(new Color(1,1,0,1.0));