
package cs1302.calc;

import javafx.fxml.FXMLLoader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Driver extends Application {

    public static void main(String[] args) {
        launch(args);
    } // main
    
    @Override
    public void start(Stage primaryStage) {

	Parent root = null;

	try {
	    root = FXMLLoader.load(getClass().getResource("/calc.fxml"));
	} catch (IOException e) {
	    System.out.println(e);
	    System.exit(1);
	} // try

        primaryStage.setTitle("CalcFX!");
	primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();

    } // start


public int oldVal=0;
public int newVal=0;
public boolean recursive=false;
public RecursiveMath recursor= new RecursiveMath();
public IterativeMath iterator= new IterativeMath();
public boolean showBinary=true;
public String calculationString="";

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button binaryHider;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button factorial;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private TextArea binaryBox;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button backspace;

    @FXML
    private Button divide;

    @FXML
    private Button power;

    @FXML
    private TextField calculations;

    @FXML
    private Button multiply;

    @FXML
    private Button five;

    @FXML
    private Button recursion;

    @FXML
    private Button addition;

    @FXML
    private Button shiftRight;

    @FXML
    private Button shiftLeft;

    @FXML
    void actionEvent7(ActionEvent event) {
	newVal=7;
	calculationString=calculationString+newVal;	
	calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent8(ActionEvent event) {
	newVal=8;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent9(ActionEvent event) {
	newVal=9;
    	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
	}

    @FXML
    void actionEvent4(ActionEvent event) {
	newVal=4;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent5(ActionEvent event) {
	newVal=5;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent6(ActionEvent event) {
	newVal=6;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent1(ActionEvent event) {
	newVal=1;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent2(ActionEvent event) {
	newVal=2;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent3(ActionEvent event) {
	newVal=3;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEvent0(ActionEvent event) {
	newVal=0;
	calculationString=calculationString+newVal;
        calculationField.setText(calculationString);
    }

    @FXML
    void actionEquals(ActionEvent event) {

    }

 @FXML
    void actionEventDivide(ActionEvent event) {
	if(recursive==true){
		recursor.div(oldVal, newVal);	
	}
	else{
		iterator.div(oldVal, newVal);

	}	
    }

    @FXML
    void actionEventMinus(ActionEvent event) {
	if(recursive==true){
		recursor.sub(oldVal, newVal);
	}
	else{
		iterator.sub(oldVal, newVal);
	}
    }

    @FXML
    void actionEventMultiply(ActionEvent event) {
	if(recursive==true){
		recursor.mul(oldVal, newVal);
	}
	else{
		iterator.mul(oldVal, newVal);
    }

    @FXML
    void actionEventAdd(ActionEvent event) {
	if(recursive==true){
		recursor.add(oldVal, newVal);
	}
	else{
		iterator.add(oldVal, newVal);
	}
    }

    @FXML
    void actionEventFactorial(ActionEvent event) {
	if(recursive==true){
		recursor.fac(oldVal);
	else{
		iterator.fac(oldVal);
	}
    }

    @FXML
    void actionEventBackspace(ActionEvent event) {
	
    }

    @FXML
    void actionEventCancel(ActionEvent event) {

    }

    @FXML
    void actionEventPower(ActionEvent event) {
	if(recursive==true){
		recursor.pow(oldVal, newVal);
	else{
		iterator.pow(oldVal, newVal);
	}
    }

    @FXML
    void actionEventUseRecursion(ActionEvent event) {
	recursive=true;
    }

    @FXML
    void actionEventHideBinary(ActionEvent event) {
	showBinary=false;
    }

    @FXML
    void actionEventLeft(ActionEvent event) {

    }

    @FXML
    void actionEventRight(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'calc.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calc.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryHider != null : "fx:id=\"binaryHider\" was not injected: check your FXML file 'calc.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calc.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calc.fxml'.";
        assert factorial != null : "fx:id=\"factorial\" was not injected: check your FXML file 'calc.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calc.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calc.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calc.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calc.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryBox != null : "fx:id=\"binaryBox\" was not injected: check your FXML file 'calc.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calc.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calc.fxml'.";
        assert lessThan != null : "fx:id=\"lessThan\" was not injected: check your FXML file 'calc.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calc.fxml'.";
        assert power != null : "fx:id=\"power\" was not injected: check your FXML file 'calc.fxml'.";
        assert calculations != null : "fx:id=\"calculations\" was not injected: check your FXML file 'calc.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calc.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calc.fxml'.";
        assert recursion != null : "fx:id=\"recursion\" was not injected: check your FXML file 'calc.fxml'.";
        assert addition != null : "fx:id=\"addition\" was not injected: check your FXML file 'calc.fxml'.";

    }



} // Driver
