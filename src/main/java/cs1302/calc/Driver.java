
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

        primaryStage.setTitle("Programmer's Calculator");
	primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();

    } // start

public int newVal=0;
public boolean recursive=false;
public RecursiveMath recursor= new RecursiveMath();
public IterativeMath iterator= new IterativeMath();
public boolean showBinary=true;
public String calculationString="";
public String answerString="";
public String ops="";
public int rhsStop=0;
public int lhsStop=0;
public int opsMarker=0;
public Integer lhs=0;
public Integer rhs=0;
public Character myChar=' ';
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
    private TextField answer;
    
    @FXML
    void actionEvent7(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=7;
	calculationString=calculationString+newVal;	
	calculations.setText(calculationString);
    }

    @FXML
    void actionEvent8(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=8;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent9(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=9;
    	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
	}

    @FXML
    void actionEvent4(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=4;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent5(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=5;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent6(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=6;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent1(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=1;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent2(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=2;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent3(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=3;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEvent0(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	newVal=0;
	calculationString=calculationString+newVal;
        calculations.setText(calculationString);
    }

    @FXML
    void actionEquals(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	for(int i=0; i<calculationString.length();i++){
		myChar=calculationString.charAt(i);
		if(i!=0&&(myChar.equals('*')||myChar.equals('/')||myChar.equals('+')||myChar.equals('-')||myChar.equals('^')||myChar.equals('!'))){
			lhsStop=i-1;
			opsMarker=i;
			for(int j=i; j<calculationString.length(); j++){
				myChar=calculationString.charAt(j);
				if(j==calculationString.length()-1||myChar.equals('*')||myChar.equals('/')||myChar.equals('+')||myChar.equals('-')||myChar.equals('^')||myChar.equals('!')){
    					rhsStop=j;
				}
			
				lhs= Integer.parseInt(calculationString.substring(0,lhsStop+1));
				if(opsMarker+1==calculationString.length()){
					rhsStop=0;
				}
				else if(rhsStop==opsMarker){
					rhsStop=0;
				}
				else{
				if(rhsStop+1<calculationString.length())
					rhs=Integer.parseInt(calculationString.substring(opsMarker+1,rhsStop+1));
				else
					rhs=Integer.parseInt(calculationString.substring(opsMarker+1));
				ops=calculationString.substring(opsMarker, opsMarker+1);
				}
			if(rhsStop!=0&&(lhsStop!=opsMarker)){
				if(ops.equals("*")&&recursive==true)
						answerString=""+recursor.mul(lhs, rhs);
				if(ops.equals("*")&&recursive==false)
						answerString=""+iterator.mul(lhs, rhs);
				if(ops.equals("+")&&recursive==true)
						answerString=""+recursor.add(lhs, rhs);
				if(ops.equals("+")&&recursive==false)
					answerString=""+iterator.add(lhs, rhs);
				if(ops.equals("-")&&recursive==true)
					answerString=""+recursor.sub(lhs, rhs);
				if(ops.equals("-")&&recursive==false)
					answerString="" + iterator.sub(lhs, rhs);
				if(ops.equals("/")&& recursive==true);
					answerString=""+recursor.div(lhs, rhs);
				if(ops.equals("/")&&recursive==false)
					answerString=""+iterator.div(lhs,rhs);
				if(ops.equals("^")&&recursive==true)
					answerString=""+recursor.pow(lhs, rhs);
				if(ops.equals("^")&& recursive==false)
					answerString=""+iterator.pow(lhs, rhs);
				if(ops.equals("!")&&recursive==true)
					answerString=""+recursor.fac(lhs);
				if(ops.equals("!")&&recursive==false)
					answerString=""+iterator.fac(lhs);
				}
			else if(rhsStop==0&&ops.equals("!")){
					if(recursive==true)
						answerString=""+recursor.fac(lhs);
					if(recursive==false)
						answerString=""+iterator.fac(lhs);
			}
				if(rhsStop==calculationString.length()-1||rhsStop==0){
					calculationString="";
					calculations.setText(calculationString);
					answer.setText(answerString);
				}
				else if(rhsStop!=calculationString.length()-1&&rhsStop!=0)
					calculationString=answerString+calculationString.substring(rhsStop+1);
			}
		}
		
	}
	calculationString="";
	answerString="";
	calculations.setText(calculationString);	
	
	}

 @FXML
    void actionEventDivide(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString + "/";
	calculations.setText(calculationString);
    }

    @FXML
    void actionEventMinus(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"-";
	calculations.setText(calculationString);
    }

    @FXML
    void actionEventMultiply(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"*";
	calculations.setText(calculationString);
	}
    @FXML
    void actionEventAdd(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"+";
	calculations.setText(calculationString);
    }

    @FXML
    void actionEventFactorial(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"!";
	calculations.setText(calculationString);
    }

    @FXML
    void actionEventBackspace(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString.substring(0,(calculationString.length()-1));
	calculations.setText(calculationString);		
    }

    @FXML
    void actionEventCancel(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString="";
	calculations.setText(calculationString);
    	newVal=0;
	}

    @FXML
    void actionEventPower(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"^";
	calculations.setText(calculationString);
    }

    @FXML
    void actionEventUseRecursion(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	recursive=true;
    }

    @FXML
    void actionEventHideBinary(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	showBinary=false;
    }

    @FXML
    void actionEventLeft(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
    }

    @FXML
    void actionEventRight(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
    }

    @FXML
    void initialize() {
        assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'calc.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calc.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'calc.fxml'.";
        assert factorial != null : "fx:id=\"factorial\" was not injected: check your FXML file 'calc.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calc.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calc.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calc.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calc.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calc.fxml'.";
        assert shiftLeft != null : "fx:id=\"shiftLeft\" was not injected: check your FXML file 'calc.fxml'.";
        assert backspace != null : "fx:id=\"backspace\" was not injected: check your FXML file 'calc.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calc.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calc.fxml'.";
        assert power != null : "fx:id=\"power\" was not injected: check your FXML file 'calc.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calc.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calc.fxml'.";
        assert recursion != null : "fx:id=\"recursion\" was not injected: check your FXML file 'calc.fxml'.";
        assert addition != null : "fx:id=\"addition\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryHider != null : "fx:id=\"binaryHider\" was not injected: check your FXML file 'calc.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calc.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calc.fxml'.";
        assert shiftRight != null : "fx:id=\"shiftRight\" was not injected: check your FXML file 'calc.fxml'.";
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryBox != null : "fx:id=\"binaryBox\" was not injected: check your FXML file 'calc.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calc.fxml'.";
        assert calculations != null : "fx:id=\"calculations\" was not injected: check your FXML file 'calc.fxml'.";

        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);

    }







} // Driver
