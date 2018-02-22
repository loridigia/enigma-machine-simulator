import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;


public class Controller implements Initializable {
	@FXML
	private Circle circleQ, circleW, circleE, circleR, circleT, circleY, circleU, circleI, circleO, circleP, circleA, circleS,
			circleD, circleF, circleG, circleH, circleJ, circleK, circleL, circleZ, circleX, circleC, circleV, circleB, circleN, circleM;

	@FXML
	private Button buttonQ, buttonW, buttonE, buttonR, buttonT, buttonY, buttonU, buttonI, buttonO, buttonP, buttonA, buttonS,
			buttonD, buttonF, buttonG, buttonH, buttonJ, buttonK, buttonL, buttonZ, buttonX, buttonC, buttonV, buttonB, buttonN, buttonM, impostaRotori;

	@FXML
	private ChoiceBox choicepos1, choicepos2, choicepos3;
	@FXML
	private ChoiceBox<Integer> choiceSX, choiceCE, choiceDX, choiceREF;

	private String[] alpha = new String[] { "q", "w", "e", "r", "t", "z", "u", "i", "o", "a", "s", "d", "f", "g", "h", "j", "k", "p", "y", "x", "c", "v", "b", "n", "m", "l" };

	@FXML
	private Circle[] circles = new Circle[]{circleQ, circleW, circleE, circleR, circleT, circleZ, circleU, circleI, circleO, circleA, circleS, circleD, circleF, circleG, circleH,
			circleJ, circleK, circleP, circleY, circleX, circleC, circleV, circleB, circleN, circleM, circleL };
	
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

			//ASSEGNAMENT ROTORS SX,CE,DX FOR PARAMETERS OF ENIGMA CLASS
			Rotore SX = AssignRotore(pos1, choiceSX.getValue());
			Rotore CE = AssignRotore(pos2, choiceCE.getValue());
			Rotore DX = AssignRotore(pos3, choiceDX.getValue());
			Riflettore REF = new Riflettore(choiceREF.getValue());

			//Initialize Enigma Class
			Enigma machine = new Enigma(SX,CE,DX,REF);


			//Button Interactive
			buttonQ.setOnAction(event->{
				String lettera = machine.codifica("q");
				int i = Arrays.asList(alpha).indexOf(lettera);
				System.out.println(i);
				Circle ciao = circles[6];
				System.out.println(ciao);
				//ciao.setFill(new Color(1,1,0, 1.0));
				/*Timeline time = new Timeline(new KeyFrame(Duration.millis(1000), a -> circle.setFill(new Color(1,1,1,1.0))));
				time.play();
				System.out.println(lettera); */


			});






			System.out.println("POSIZIONE 1: ROTORE " + pos1 + "\n POSIZIONE 2: ROTORE " + pos2 + "\n POSIZIONE 3: ROTORE " + pos3 + "\n");
		});

		
	}

	public Rotore AssignRotore(Integer rotore, int valueStart){
		if ( rotore == 1 ) return new Rotore1(valueStart);
		else if( rotore == 2) return new Rotore2(valueStart);
		else return new Rotore3(valueStart);
	}

	public Integer ChoicePosition(ChoiceBox choicepos){
		int rotore;
		if( choicepos.getValue() == "I") return 1;
		else if(choicepos.getValue() == "II") return 2;
		else return 3;
	}
	
}
