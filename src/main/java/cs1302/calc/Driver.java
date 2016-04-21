
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
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.InputEvent;
import javafx.scene.Node;

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
public String binaryRep="0000000000000000000000000000000";


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button cancel;

    @FXML
    private Button nine;

    @FXML
    private Label nineBinary;

    @FXML
    private Label eighteenBinary;

    @FXML
    private Label threeBinary;

    @FXML
    private Button seven;

    @FXML
    private Button three;

    @FXML
    private Label twentyfourBinary;

    @FXML
    private Label twentyfiveBinary;

    @FXML
    private Button zero;

    @FXML
    private Button shiftLeft;

    @FXML
    private Button four;

    @FXML
    private Label twentyeightBinary;

    @FXML
    private HBox binaryHBox;

    @FXML
    private Label twelveBinary;

    @FXML
    private Button five;

    @FXML
    private Button recursion;

    @FXML
    private Button addition;

    @FXML
    private Label tenBinary;

    @FXML
    private Label twentythreeBinary;

    @FXML
    private Label sixBinary;

    @FXML
    private Label twentysixBinary;

    @FXML
    private Button shiftRight;

    @FXML
    private Label eightBinary;

    @FXML
    private TextField calculations;

    @FXML
    private Label fourBinary;

    @FXML
    private Label seventeenBinary;

    @FXML
    private Button minus;

    @FXML
    private Button factorial;

    @FXML
    private Label twentysevenBinary;

    @FXML
    private Label twentynineBinary;

    @FXML
    private Label thirteenBinary;

    @FXML
    private Button two;

    @FXML
    private Label sevenBinary;

    @FXML
    private Button eight;

    @FXML
    private Label sixteenBinary;

    @FXML
    private Button backspace;

    @FXML
    private Label elevenBinary;

    @FXML
    private Button divide;

    @FXML
    private Label oneBinary;

    @FXML
    private Button power;

    @FXML
    private Button multiply;

    @FXML
    private Label fiveBinary;

    @FXML
    private Button binaryHider;

    @FXML
    private Button six;

    @FXML
    private Label twentytwoBinary;

    @FXML
    private Button one;

    @FXML
    private Label fifteenBinary;

    @FXML
    private Label nineteenBinary;

    @FXML
    private Label twoBinary;

    @FXML
    private Label thirtyoneBinary;

    @FXML
    private TextField answer;

    @FXML
    private Label twentyBinary;

    @FXML
    private Label twentyoneBinary;

    @FXML
    private Label thirtyBinary;

    @FXML
    private Button equals;

    @FXML
    private Label fourteenBinary;

/**This method updates the GUI if the user
 * clicks on the number 7 button. 
 *
 * @param event ActionEvent
 * @return void
 */ 
    @FXML
    void actionEvent7(ActionEvent event) {
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
	resetBinaryLabels();	
	binaryConversion(answerString);	
	}

/** This method prints out a division symbol on the GUI in the user specified location
 * and also adds it into the calculation string in a properly formatted way.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventDivide(ActionEvent event) {
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
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString="";
	calculations.setText(calculationString);
	answerString="";
	answer.setText(answerString);
	resetBinaryLabels();
	}

/**This method prints out a power symbol on the GUI in the user specified locatin and also
 *  adds it into the calculation string in a properly formatted fashion.
 *  
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventPower(ActionEvent event) {
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  ^  ";
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
        answer.setEditable(false);
        calculations.setEditable(false);
	if(recursive==false){
		recursive=true;
		recursion.setText("Use Iteration");		
	}
	else{
		recursive=false;
		recursion.setText("Use Recursion");
    	}
	}

/**This method toggles the calculator's display to either show the binary codes
 * or hide them depending on the current setting.
 *
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventHideBinary(ActionEvent event) {
        answer.setEditable(false);
        calculations.setEditable(false);
	if(showBinary==true){
		showBinary=false;
		binaryHBox.setVisible(false);		
    		binaryHider.setText("Show Binary");
	}
	else{
		showBinary=true;
		binaryHBox.setVisible(true);
		binaryHider.setText("Hide Binary");
	}
}

/**This method prints out a left shift symbol on the GUI in the user specified locatin and also
 * adds it into the calculation string in a properly formatted fashion.
 * 
 * @param event ActionEvent
 * @return void
 */
    @FXML
    void actionEventLeft(ActionEvent event) {
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
        answer.setEditable(false);
        calculations.setEditable(false);
	calculationString=calculationString+"  >>  ";
        calculations.setText(calculationString);  
  }
public void resetBinaryLabels(){
	binaryRep="0000000000000000000000000000000";
	oneBinary.setText(""+binaryRep.charAt(0));
        twoBinary.setText(""+binaryRep.charAt(1));
        threeBinary.setText(""+binaryRep.charAt(2));
        fourBinary.setText(""+binaryRep.charAt(3));
        fiveBinary.setText(""+binaryRep.charAt(4));
        sixBinary.setText(""+binaryRep.charAt(5));
        sevenBinary.setText(""+binaryRep.charAt(6));
        eightBinary.setText(""+binaryRep.charAt(7));
        nineBinary.setText(""+binaryRep.charAt(8));
        tenBinary.setText(""+binaryRep.charAt(9));
        elevenBinary.setText(""+binaryRep.charAt(10));
        twelveBinary.setText(""+binaryRep.charAt(11));
        thirteenBinary.setText(""+binaryRep.charAt(12));
        fourteenBinary.setText(""+binaryRep.charAt(13));
        fifteenBinary.setText(""+binaryRep.charAt(14));
        sixteenBinary.setText(""+binaryRep.charAt(15));
        seventeenBinary.setText(""+binaryRep.charAt(16));
        eighteenBinary.setText(""+binaryRep.charAt(17));
        nineteenBinary.setText(""+binaryRep.charAt(18));
        twentyBinary.setText(""+binaryRep.charAt(19));
        twentyoneBinary.setText(""+binaryRep.charAt(20));
        twentytwoBinary.setText(""+binaryRep.charAt(21));
        twentythreeBinary.setText(""+binaryRep.charAt(22));
        twentyfourBinary.setText(""+binaryRep.charAt(23));
        twentyfiveBinary.setText(""+binaryRep.charAt(24));
        twentysixBinary.setText(""+binaryRep.charAt(25));
        twentysevenBinary.setText(""+binaryRep.charAt(26));
        twentyeightBinary.setText(""+binaryRep.charAt(27));
        twentynineBinary.setText(""+binaryRep.charAt(28));
        thirtyBinary.setText(""+binaryRep.charAt(29));
        thirtyoneBinary.setText(""+binaryRep.charAt(30));
}//resetBinaryLabels

public void  binaryConversion(String total){
	int currentAnswer= Integer.parseInt(total);
	int remainder;
	while(currentAnswer>0){	
		remainder=currentAnswer%2;
		binaryRep=remainder+binaryRep;
		currentAnswer=currentAnswer/2;
	}
	for(int i=31-binaryRep.length(); i>0; i--){
		binaryRep=0+ binaryRep;
	}
	oneBinary.setText(""+binaryRep.charAt(30));
	twoBinary.setText(""+binaryRep.charAt(29));
	threeBinary.setText(""+binaryRep.charAt(28));
	fourBinary.setText(""+binaryRep.charAt(27));
	fiveBinary.setText(""+binaryRep.charAt(26));
	sixBinary.setText(""+binaryRep.charAt(25));
	sevenBinary.setText(""+binaryRep.charAt(24));
	eightBinary.setText(""+binaryRep.charAt(23));
	nineBinary.setText(""+binaryRep.charAt(22));
	tenBinary.setText(""+binaryRep.charAt(21));
	elevenBinary.setText(""+binaryRep.charAt(20));
	twelveBinary.setText(""+binaryRep.charAt(19));
	thirteenBinary.setText(""+binaryRep.charAt(18));
	fourteenBinary.setText(""+binaryRep.charAt(17));
	fifteenBinary.setText(""+binaryRep.charAt(16));
	sixteenBinary.setText(""+binaryRep.charAt(15));
	seventeenBinary.setText(""+binaryRep.charAt(14));
	eighteenBinary.setText(""+binaryRep.charAt(13));
	nineteenBinary.setText(""+binaryRep.charAt(12));
	twentyBinary.setText(""+binaryRep.charAt(11));
	twentyoneBinary.setText(""+binaryRep.charAt(10));
	twentytwoBinary.setText(""+binaryRep.charAt(9));
	twentythreeBinary.setText(""+binaryRep.charAt(8));
	twentyfourBinary.setText(""+binaryRep.charAt(7));
	twentyfiveBinary.setText(""+binaryRep.charAt(6));
	twentysixBinary.setText(""+binaryRep.charAt(5));
	twentysevenBinary.setText(""+binaryRep.charAt(4));
	twentyeightBinary.setText(""+binaryRep.charAt(3));
	twentynineBinary.setText(""+binaryRep.charAt(2));
	thirtyBinary.setText(""+binaryRep.charAt(1));
	thirtyoneBinary.setText(""+binaryRep.charAt(0));
}//binaryConversion

	public void decimalConversion(String binaryRep){
		int binaryMult=2;
		int sum=0;
		for(int r=30, t=0; r>=0&& t<31; r--, t++){
			for(int i=0; i<r; i++){
				if(i==0)
					binaryMult=1;
				else
					binaryMult=binaryMult*2;

			}
		sum=sum+binaryMult*(Integer.parseInt(binaryRep.charAt(t)+""));
		}
		answerString=""+sum;
		answer.setText(answerString);
		calculationString=answerString;
		calculations.setText(calculationString);
	}//decimalConversion



    @FXML
    void eventOne(MouseEvent event) {
	if(binaryRep.charAt(0)==('0')){
		oneBinary.setText("1");
		binaryRep=1+binaryRep.substring(1);
	}
	else{
		oneBinary.setText("0");
		binaryRep=0+binaryRep.substring(0);
    	}
	decimalConversion(binaryRep);
	}

    @FXML
    void eventTwo(MouseEvent event) {
	if(binaryRep.charAt(1)==('0')){
		twoBinary.setText("1");
		binaryRep=binaryRep.substring(0,1)+1+binaryRep.substring(2);
	}
	else{
		twoBinary.setText("0");
		binaryRep=binaryRep.substring(0,1)+0+binaryRep.substring(2);
    	}
	decimalConversion(binaryRep);
	}

    @FXML
    void eventThree(MouseEvent event) {
	if(binaryRep.charAt(2)==('0')){
                threeBinary.setText("1");
                binaryRep=binaryRep.substring(0,2)+1+binaryRep.substring(3);
        }
        else{
                threeBinary.setText("0");
                binaryRep=binaryRep.substring(0,2)+0+binaryRep.substring(3);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventFour(MouseEvent event) {
	if(binaryRep.charAt(3)==('0')){
                fourBinary.setText("1");
                binaryRep=binaryRep.substring(0,3)+1+binaryRep.substring(4);
        }
        else{
                fourBinary.setText("0");
                binaryRep=binaryRep.substring(0,3)+0+binaryRep.substring(4);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventFive(MouseEvent event) {
	if(binaryRep.charAt(4)==('0')){
                fiveBinary.setText("1");
                binaryRep=binaryRep.substring(0,4)+1+binaryRep.substring(5);
        }
        else{
                fiveBinary.setText("0");
                binaryRep=binaryRep.substring(0,4)+0+binaryRep.substring(5);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventSix(MouseEvent event) {
	if(binaryRep.charAt(5)==('0')){
                sixBinary.setText("1");
                binaryRep=binaryRep.substring(0,5)+1+binaryRep.substring(6);
        }
        else{
                sixBinary.setText("0");
                binaryRep=binaryRep.substring(0,5)+0+binaryRep.substring(6);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventSeven(MouseEvent event) {
	if(binaryRep.charAt(6)==('0')){
                sevenBinary.setText("1");
                binaryRep=binaryRep.substring(0,6)+1+binaryRep.substring(7);
        }
        else{
                sevenBinary.setText("0");
                binaryRep=binaryRep.substring(0,6)+0+binaryRep.substring(7);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventEight(MouseEvent event) {
	if(binaryRep.charAt(7)==('0')){
                eightBinary.setText("1");
                binaryRep=binaryRep.substring(0,7)+1+binaryRep.substring(8);
        }
        else{
                eightBinary.setText("0");
                binaryRep=binaryRep.substring(0,7)+0+binaryRep.substring(8);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventNine(MouseEvent event) {
	if(binaryRep.charAt(8)==('0')){
                nineBinary.setText("1");
                binaryRep=binaryRep.substring(0,8)+1+binaryRep.substring(9);
        }
        else{
                nineBinary.setText("0");
                binaryRep=binaryRep.substring(0,8)+0+binaryRep.substring(9);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTen(MouseEvent event) {
	if(binaryRep.charAt(9)==('0')){
                tenBinary.setText("1");
                binaryRep=binaryRep.substring(0,9)+1+binaryRep.substring(10);
        }
        else{
                tenBinary.setText("0");
                binaryRep=binaryRep.substring(0,9)+0+binaryRep.substring(10);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventEleven(MouseEvent event) {
	if(binaryRep.charAt(10)==('0')){
                elevenBinary.setText("1");
                binaryRep=binaryRep.substring(0,10)+1+binaryRep.substring(11);
        }
        else{
                elevenBinary.setText("0");
                binaryRep=binaryRep.substring(0,10)+0+binaryRep.substring(11);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwelve(MouseEvent event) {
	if(binaryRep.charAt(11)==('0')){
                twelveBinary.setText("1");
                binaryRep=binaryRep.substring(0,11)+1+binaryRep.substring(12);
        }
        else{
                twelveBinary.setText("0");
                binaryRep=binaryRep.substring(0,11)+0+binaryRep.substring(12);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventThirteen(MouseEvent event) {
	if(binaryRep.charAt(12)==('0')){
                thirteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,12)+1+binaryRep.substring(13);
        }
        else{
                thirteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,12)+0+binaryRep.substring(13);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventFourteen(MouseEvent event) {
	if(binaryRep.charAt(13)==('0')){
                fourteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,13)+1+binaryRep.substring(14);
        }
        else{
                fourteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,13)+0+binaryRep.substring(14);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventFifteen(MouseEvent event) {
	if(binaryRep.charAt(14)==('0')){
                fifteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,14)+1+binaryRep.substring(15);
        }
        else{
                fifteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,14)+0+binaryRep.substring(15);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventSixteen(MouseEvent event) {
	if(binaryRep.charAt(15)==('0')){
                sixteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,15)+1+binaryRep.substring(16);
        }
        else{
                sixteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,15)+0+binaryRep.substring(16);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventSeventeen(MouseEvent event) {
	if(binaryRep.charAt(16)==('0')){
                seventeenBinary.setText("1");
                binaryRep=binaryRep.substring(0,16)+1+binaryRep.substring(17);
        }
        else{
                seventeenBinary.setText("0");
                binaryRep=binaryRep.substring(0,16)+0+binaryRep.substring(17);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventEighteen(MouseEvent event) {
	if(binaryRep.charAt(17)==('0')){
                eighteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,17)+1+binaryRep.substring(18);
        }
        else{
                eighteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,17)+0+binaryRep.substring(18);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventNineteen(MouseEvent event) {
	if(binaryRep.charAt(18)==('0')){
                nineteenBinary.setText("1");
                binaryRep=binaryRep.substring(0,18)+1+binaryRep.substring(19);
        }
        else{
                nineteenBinary.setText("0");
                binaryRep=binaryRep.substring(0,18)+0+binaryRep.substring(19);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwenty(MouseEvent event) {
	if(binaryRep.charAt(19)==('0')){
                twentyBinary.setText("1");
                binaryRep=binaryRep.substring(0,19)+1+binaryRep.substring(20);
        }
        else{
                twentyBinary.setText("0");
                binaryRep=binaryRep.substring(0,19)+0+binaryRep.substring(20);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentyOne(MouseEvent event) {
	if(binaryRep.charAt(20)==('0')){
                twentyoneBinary.setText("1");
                binaryRep=binaryRep.substring(0,20)+1+binaryRep.substring(21);
        }
        else{
                twentyoneBinary.setText("0");
                binaryRep=binaryRep.substring(0,20)+0+binaryRep.substring(21);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentytwo(MouseEvent event) {
	if(binaryRep.charAt(21)==('0')){
                twentytwoBinary.setText("1");
                binaryRep=binaryRep.substring(0,21)+1+binaryRep.substring(22);
        }
        else{
                twentytwoBinary.setText("0");
                binaryRep=binaryRep.substring(0,21)+0+binaryRep.substring(22);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentythree(MouseEvent event) {
	if(binaryRep.charAt(22)==('0')){
                twentythreeBinary.setText("1");
                binaryRep=binaryRep.substring(0,22)+1+binaryRep.substring(23);
        }
        else{
                twentythreeBinary.setText("0");
                binaryRep=binaryRep.substring(0,22)+0+binaryRep.substring(23);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentyfour(MouseEvent event) {
	if(binaryRep.charAt(23)==('0')){
                twentyfourBinary.setText("1");
                binaryRep=binaryRep.substring(0,23)+1+binaryRep.substring(24);
        }
        else{
                twentyfourBinary.setText("0");
                binaryRep=binaryRep.substring(0,23)+0+binaryRep.substring(24);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentyfive(MouseEvent event) {
	if(binaryRep.charAt(24)==('0')){
                twentyfiveBinary.setText("1");
                binaryRep=binaryRep.substring(0,24)+1+binaryRep.substring(25);
        }
        else{
                twentyfiveBinary.setText("0");
                binaryRep=binaryRep.substring(0,24)+0+binaryRep.substring(25);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentysix(MouseEvent event) {
	if(binaryRep.charAt(25)==('0')){
                twentysixBinary.setText("1");
                binaryRep=binaryRep.substring(0,25)+1+binaryRep.substring(26);
        }
        else{
                twentysixBinary.setText("0");
                binaryRep=binaryRep.substring(0,25)+0+binaryRep.substring(26);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentyseven(MouseEvent event) {
	if(binaryRep.charAt(26)==('0')){
                twentysevenBinary.setText("1");
                binaryRep=binaryRep.substring(0,26)+1+binaryRep.substring(27);
        }
        else{
                twentysevenBinary.setText("0");
                binaryRep=binaryRep.substring(0,26)+0+binaryRep.substring(27);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentyeight(MouseEvent event) {
	if(binaryRep.charAt(27)==('0')){
                twentyeightBinary.setText("1");
                binaryRep=binaryRep.substring(0,27)+1+binaryRep.substring(28);
        }
        else{
                twentyeightBinary.setText("0");
                binaryRep=binaryRep.substring(0,27)+0+binaryRep.substring(28);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventTwentynine(MouseEvent event) {
	if(binaryRep.charAt(28)==('0')){
                twentynineBinary.setText("1");
                binaryRep=binaryRep.substring(0,28)+1+binaryRep.substring(29);
        }
        else{
                twentynineBinary.setText("0");
                binaryRep=binaryRep.substring(0,28)+0+binaryRep.substring(29);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventThirty(MouseEvent event) {
	if(binaryRep.charAt(29)==('0')){
                thirtyBinary.setText("1");
                binaryRep=binaryRep.substring(0,29)+1+binaryRep.substring(30);
        }
        else{
                thirtyBinary.setText("0");
                binaryRep=binaryRep.substring(0,29)+0+binaryRep.substring(30);
        }
        decimalConversion(binaryRep);
    }

    @FXML
    void eventThirtyOne(MouseEvent event) {
	if(binaryRep.charAt(30)==('0')){
                thirtyoneBinary.setText("1");
                binaryRep=binaryRep.substring(0,30)+1;
        }
        else{
                thirtyBinary.setText("0");
                binaryRep=binaryRep.substring(0,30)+0;
        }
        decimalConversion(binaryRep);
	}
/*This method initializes parts of the GUI from the Javafxml code.
 *  *
 *   * @param none
 *    * @return void
 *     */
    @FXML
    void initialize() {



        assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'calc.fxml'.";
	assert cancel != null : "fx:id=\"cancel\" was not injected: check your FXML file 'calc.fxml'.";
        assert nine != null : "fx:id=\"nine\" was not injected: check your FXML file 'calc.fxml'.";
        assert nineBinary != null : "fx:id=\"nineBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert eighteenBinary != null : "fx:id=\"eighteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert threeBinary != null : "fx:id=\"threeBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert seven != null : "fx:id=\"seven\" was not injected: check your FXML file 'calc.fxml'.";
        assert three != null : "fx:id=\"three\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentyfourBinary != null : "fx:id=\"twentyfourBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentyfiveBinary != null : "fx:id=\"twentyfiveBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert zero != null : "fx:id=\"zero\" was not injected: check your FXML file 'calc.fxml'.";
        assert shiftLeft != null : "fx:id=\"shiftLeft\" was not injected: check your FXML file 'calc.fxml'.";
        assert four != null : "fx:id=\"four\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentyeightBinary != null : "fx:id=\"twentyeightBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryHBox != null : "fx:id=\"binaryHBox\" was not injected: check your FXML file 'calc.fxml'.";
        assert twelveBinary != null : "fx:id=\"twelveBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert five != null : "fx:id=\"five\" was not injected: check your FXML file 'calc.fxml'.";
        assert recursion != null : "fx:id=\"recursion\" was not injected: check your FXML file 'calc.fxml'.";
        assert addition != null : "fx:id=\"addition\" was not injected: check your FXML file 'calc.fxml'.";
        assert tenBinary != null : "fx:id=\"tenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentythreeBinary != null : "fx:id=\"twentythreeBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert sixBinary != null : "fx:id=\"sixBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentysixBinary != null : "fx:id=\"twentysixBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert shiftRight != null : "fx:id=\"shiftRight\" was not injected: check your FXML file 'calc.fxml'.";
        assert eightBinary != null : "fx:id=\"eightBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert calculations != null : "fx:id=\"calculations\" was not injected: check your FXML file 'calc.fxml'.";
        assert fourBinary != null : "fx:id=\"fourBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert seventeenBinary != null : "fx:id=\"seventeenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert minus != null : "fx:id=\"minus\" was not injected: check your FXML file 'calc.fxml'.";
        assert factorial != null : "fx:id=\"factorial\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentysevenBinary != null : "fx:id=\"twentysevenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentynineBinary != null : "fx:id=\"twentynineBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert thirteenBinary != null : "fx:id=\"thirteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert two != null : "fx:id=\"two\" was not injected: check your FXML file 'calc.fxml'.";
        assert sevenBinary != null : "fx:id=\"sevenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert eight != null : "fx:id=\"eight\" was not injected: check your FXML file 'calc.fxml'.";
        assert sixteenBinary != null : "fx:id=\"sixteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert backspace != null : "fx:id=\"backspace\" was not injected: check your FXML file 'calc.fxml'.";
        assert elevenBinary != null : "fx:id=\"elevenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert divide != null : "fx:id=\"divide\" was not injected: check your FXML file 'calc.fxml'.";
        assert oneBinary != null : "fx:id=\"oneBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert power != null : "fx:id=\"power\" was not injected: check your FXML file 'calc.fxml'.";
        assert multiply != null : "fx:id=\"multiply\" was not injected: check your FXML file 'calc.fxml'.";
        assert fiveBinary != null : "fx:id=\"fiveBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert binaryHider != null : "fx:id=\"binaryHider\" was not injected: check your FXML file 'calc.fxml'.";
        assert six != null : "fx:id=\"six\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentytwoBinary != null : "fx:id=\"twentytwoBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert one != null : "fx:id=\"one\" was not injected: check your FXML file 'calc.fxml'.";
        assert fifteenBinary != null : "fx:id=\"fifteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert nineteenBinary != null : "fx:id=\"nineteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twoBinary != null : "fx:id=\"twoBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert thirtyoneBinary != null : "fx:id=\"thirtyoneBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert answer != null : "fx:id=\"answer\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentyBinary != null : "fx:id=\"twentyBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert twentyoneBinary != null : "fx:id=\"twentyoneBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert thirtyBinary != null : "fx:id=\"thirtyBinary\" was not injected: check your FXML file 'calc.fxml'.";
        assert equals != null : "fx:id=\"equals\" was not injected: check your FXML file 'calc.fxml'.";
        assert fourteenBinary != null : "fx:id=\"fourteenBinary\" was not injected: check your FXML file 'calc.fxml'.";
    
	answer.setEditable(false);
        calculations.setEditable(false);

    }







} // Driver
