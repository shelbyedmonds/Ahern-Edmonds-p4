
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

/**This is the main method of the driver class.
 * It drives the entire program.
 * 
 * @param args String []
 * @return void
 */
    public static void main(String[] args) {
        launch(args);
    } // main

/** This method starts up the GUI for the user. It throws an excpetion
 * if the resource file is not available.
 *
 * @param primaryStage Stage
 * @return void
 */ 
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

public boolean recursive=false;
public RecursiveMath recursor= new RecursiveMath();
public IterativeMath iterator= new IterativeMath();
public boolean showBinary=true;
public String calculationString="";
public String answerString="";
public String [] infix;
public String [] postfix;
public String binaryRep="";



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
   
/**This method updates the GUI if the user
 * clicks on the number 7 button. 
 *
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent7(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"7";	
	calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 *  clicks on the number 8 
 *
 *  @param event Action Event
 *  @return void
 */
    @FXML
    void actionEvent8(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"8";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 9 button. 
 *  
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent9(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
    	calculationString=calculationString+"9";
        calculations.setText(calculationString);
	}

/**This method updates the GUI if the user
 * clicks on the number 4 button. 
 * 
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent4(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"4";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 5 button. 
 * 
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent5(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"5";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 6 button. 
 *  
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent6(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"6";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 1 button. 
 *  
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent1(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"1";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 2 button. 
 * 
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent2(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"2";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 *  clicks on the number 3 button. 
 *  
 *  @param event ActionEvent
 *  @return void
 */ 
    @FXML
    void actionEvent3(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"3";
        calculations.setText(calculationString);
    }

/**This method updates the GUI if the user
 * clicks on the number 0 button. 
 * 
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent0(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);
	calculationString=calculationString+"0";
        calculations.setText(calculationString);
    }

/** This method performs the method calls needed to execute
 * the mathematical expressions. It checks to see if the calculator is in 
 * iterative or recursive mode and catches errors in the formatting on the 
 * user's expression using the Reverse Polish Notation Classes.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEquals(ActionEvent event) {
	binaryBox.setEditable(false);
	answer.setEditable(false);
	calculations.setEditable(false);

	infix= calculationString.split("  ");
	postfix=ReversePolishNotation.infixToPostfix(infix);
	if(recursive==false)
		answerString=""+ReversePolishNotation.evaluate(iterator, postfix);
	else
		answerString=""+ReversePolishNotation.evaluate(recursor, postfix);
	answer.setText(answerString);
	calculationString="";
	calculations.setText(calculationString);
	
	}

/** This method prints out a division symbol on the GUI in the user specified location
 * and also adds it into the calculation string in a properly formatted way.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventDivide(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString + "  /  ";
	calculations.setText(calculationString);
    }

/**This method prints out a minus symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventMinus(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  -  ";
	calculations.setText(calculationString);
    }

/**This method prints out a multiplication symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 *  
 * @param event ActionEvent
 * @return void
 */

    @FXML
    void actionEventMultiply(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  *  ";
	calculations.setText(calculationString);
	}

/**This method prints out an addition symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 *   
 * @param event ActionEvent
 * @return void
 */

    @FXML
    void actionEventAdd(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  +  ";
	calculations.setText(calculationString);
    }

/**This method prints out a factorial symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 *  
 * @param event ActionEvent
 * @return void
 */

    @FXML
    void actionEventFactorial(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  !  ";
	calculations.setText(calculationString);
    }

 /** This method clears off one space of the calculation string. This is designed to remove
 * the last character of the user's expression.
 *  
 * @param event ActionEvent
 * @return void
 */

    @FXML
    void actionEventBackspace(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString.substring(0,(calculationString.length()-1));
	calculations.setText(calculationString);		
    }

/**This method clears the entire GUI calculation area. It also clears the calculation string so that
 * further expressions made will not be changed in any way via previous expressions.
 *
 * @param event Action Event
 * @return void
 */
    @FXML
    void actionEventCancel(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString="";
	calculations.setText(calculationString);
	}

/**This method prints out a power symbol on the GUI in the user specified locatin and also
 *  adds it into the calculation string in a properly formatted fashion.
 *  
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventPower(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+" ^ ";
	calculations.setText(calculationString);
    }

/**This method toggles the calculators functionality to be the opposite of 
 * what is currently is. It changes it from recursive to iterative and vice versa.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventUseRecursion(ActionEvent event) {
	binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	if(recursive==false)
		recursive=true;
	else
		recursive=false;
    }

/**This method toggles the calculator's display to either show the binary codes
 * or hide them depending on the current setting.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventHideBinary(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	if(showBinary==true)
		showBinary=false;
    	else
		showBinary=true;
	}

/**This method prints out a left shift symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 * 
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventLeft(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  <<  ";
        calculations.setText(calculationString);   
 }

/**This method prints out a right shift symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 * 
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventRight(ActionEvent event) {
        binaryBox.setEditable(false);
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  >>  ";
        calculations.setText(calculationString);  
  }
public void  binaryConversion(String total){
	int currentAnswer= Integer.parseInt(total);
	int remainder;
	while(currentAnswer>0){	
		remainder=currentAnswer%2;
		binaryRep=remainder+binaryRep;
		currentAnswer=currentAnswer/2;
	}
	binaryBox.setText(binaryRep);		
}//binaryConversion


/**This method initializes parts of the GUI from the Javafxml code.
 *
 * @param none
 * @return void
 */
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
