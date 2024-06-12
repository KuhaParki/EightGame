package org.example.eightgame;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import java.util.Objects;
import java.util.Random;

/**
 * This is a controller class for the eight-game functionality. It consists of every method needed for the user to play
 * the game.
 */
public class Controller {

    public Rectangle oneRectangle;
    public Rectangle twoRectangle;
    public Rectangle threeRectangle;
    public Rectangle fourRectangle;
    public Rectangle fiveRectangle;
    public Rectangle sixRectangle;
    public Rectangle sevenRectangle;
    public Rectangle eightRectangle;
    public Rectangle nineRectangle;
    public Label oneLabel;
    public Label twoLabel;
    public Label threeLabel;
    public Label fourLabel;
    public Label fiveLabel;
    public Label sixLabel;
    public Label sevenLabel;
    public Label eightLabel;
    public Label nineLabel;
    public Button mixButton;
    public Label clickCountLabel;
    public Label gameWinLabel;
    Label[] labelArray = {oneLabel, twoLabel, threeLabel, fourLabel, fiveLabel, sixLabel, sevenLabel,
            eightLabel};
    Rectangle[] rectArray = {oneRectangle, twoRectangle, threeRectangle, fourRectangle, fiveRectangle, sixRectangle,
                sevenRectangle, eightRectangle};

    /**
     * This is a method that displays a text when all the numbers are in order and the user has won the game.
     */
    public void gameWinner(){
        if(Objects.equals(oneLabel.getText(), "1") && Objects.equals(twoLabel.getText(), "2") &&
                Objects.equals(threeLabel.getText(), "3") && Objects.equals(fourLabel.getText(), "4")
                && Objects.equals(fiveLabel.getText(), "5") && Objects.equals(sixLabel.getText(), "6")
                && Objects.equals(sevenLabel.getText(), "7") && Objects.equals(eightLabel.getText(), "8")
                && Objects.equals(nineLabel.getText(), " ")){
            gameWinLabel.setText("You won the game! Congratulations!");
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void oneRectangleClicked(MouseEvent mouseEvent) {
        if(Objects.equals(twoLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            twoLabel.setText(oneLabel.getText());
            twoRectangle.setOpacity(0);
            oneLabel.setText(" ");
            oneRectangle.setOpacity(1);
            gameWinner();
        }


        if(Objects.equals(fourLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fourLabel.setText(oneLabel.getText());
            fourRectangle.setOpacity(0);
            oneLabel.setText(" ");
            oneRectangle.setOpacity(1);
            gameWinner();
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void twoRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(oneLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            oneLabel.setText(twoLabel.getText());
            oneRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fiveLabel.setText(twoLabel.getText());
            fiveRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(threeLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            threeLabel.setText(twoLabel.getText());
            threeRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
            gameWinner();
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void threeRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(twoLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            twoLabel.setText(threeLabel.getText());
            twoRectangle.setOpacity(0);
            threeLabel.setText(" ");
            threeRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(sixLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            sixLabel.setText(threeLabel.getText());
            sixRectangle.setOpacity(0);
            threeLabel.setText(" ");
            threeRectangle.setOpacity(1);
            gameWinner();
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void fourRectangleClicked(MouseEvent mouseEvent) {
        if(Objects.equals(oneLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            oneLabel.setText(fourLabel.getText());
            oneRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fiveLabel.setText(fourLabel.getText());
            fiveRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(sevenLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            sevenLabel.setText(fourLabel.getText());
            sevenRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void fiveRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(sixLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            sixLabel.setText(fiveLabel.getText());
            sixRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            eightLabel.setText(fiveLabel.getText());
            eightRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(twoLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            twoLabel.setText(fiveLabel.getText());
            twoRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }

        if(Objects.equals(fourLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fourLabel.setText(fiveLabel.getText());
            fourRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void sixRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(threeLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            threeLabel.setText(sixLabel.getText());
            threeRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fiveLabel.setText(sixLabel.getText());
            fiveRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(nineLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            nineLabel.setText(sixLabel.getText());
            nineRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void sevenRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(fourLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fourLabel.setText(sevenLabel.getText());
            fourRectangle.setOpacity(0);
            sevenLabel.setText(" ");
            sevenRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            eightLabel.setText(sevenLabel.getText());
            eightRectangle.setOpacity(0);
            sevenLabel.setText(" ");
            sevenRectangle.setOpacity(1);
            gameWinner();
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void eightRectangleClicked(MouseEvent mouseEvent) {
        System.out.println("terve");
        if(Objects.equals(nineLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            nineLabel.setText(eightLabel.getText());
            nineRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            fiveLabel.setText(eightLabel.getText());
            fiveRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(sevenLabel.getText(), " ")){
            gameWinner();
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            sevenLabel.setText(eightLabel.getText());
            sevenRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
        }
    }

    /**
     * This is a functional method for a number to be clicked by the mouse.
     * @param mouseEvent A click of the mouse
     */
    public void nineRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(sixLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            sixLabel.setText(nineLabel.getText());
            sixRectangle.setOpacity(0);
            nineLabel.setText(" ");
            nineRectangle.setOpacity(1);
            gameWinner();
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            clickCountLabel.setText(String.valueOf(Integer.parseInt(clickCountLabel.getText()) + 1));
            eightLabel.setText(nineLabel.getText());
            eightRectangle.setOpacity(0);
            nineLabel.setText(" ");
            nineRectangle.setOpacity(1);
            gameWinner();
        }
    }

    /**
     * A functionality to mix the numbers on the board.
     * @param mouseEvent ja click of the "mix" button.
     */
    public void mixButtonClicked(MouseEvent mouseEvent) {
        // Set the click count Label to be 0
        clickCountLabel.setText("0");

        // Call for the mixHelper method
        mixHelper();

        // Create a new Array for the Labels
        Label[] labelArray2 = {oneLabel, twoLabel, threeLabel, fourLabel, fiveLabel, sixLabel, sevenLabel,
                eightLabel};

        // Construct a Random-object
        Random random = new Random();

        // Create a new Array, set index to be 0 and create a boolean variable
        boolean solvable = false;

        while (!solvable) {

            int[] numArray = new int[8];
            int idx = 0;
            boolean added;


            // Loop the Label Array
            for(Label x : labelArray2){

                // Set added to be false on every iteration
                added = false;

                // Loop until added is declared true
                while(!added) {

                    // Create a new random integer on every loop and set a boolean variable test to be false
                    int random_int = random.nextInt(1, 9);
                    boolean test = false;

                    // Check if the Array already consists the new random integer
                    for (int i = 0; i < idx; i++) {
                        if (numArray[i] == random_int) {
                            test = true;
                            break;
                        }
                    }

                    // If it doesn't consist the integer then it's added to the Array and the while loop eventually breaks
                    // to fill the next available spot of the Array.
                    if(!test){
                        numArray[idx] = random_int;
                        idx++;
                        x.setText(String.valueOf(random_int));
                        added = true;
                    }
                }
            }

            int inversions = 0;

            for (int i = 0; i < numArray.length - 1; i++) {
                for (int j = i + 1; j < numArray.length; j++) {
                    if (numArray[i] > numArray[j]) {
                        inversions++;
                    }
                }
            }

            if (inversions % 2 == 0){
                solvable = true;
            }
        }
    }

    // The mixHelper method first arranges the game back to normal so it is easier to mix.
    public void mixHelper() {
        gameWinLabel.setText("");
        oneLabel.setText("1");
        twoLabel.setText("2");
        threeLabel.setText("3");
        fourLabel.setText("4");
        fiveLabel.setText("5");
        sixLabel.setText("6");
        sevenLabel.setText("7");
        eightLabel.setText("8");
        nineLabel.setText(" ");

        oneRectangle.setOpacity(0);
        twoRectangle.setOpacity(0);
        threeRectangle.setOpacity(0);
        fourRectangle.setOpacity(0);
        fiveRectangle.setOpacity(0);
        sixRectangle.setOpacity(0);
        sevenRectangle.setOpacity(0);
        eightRectangle.setOpacity(0);
        nineRectangle.setOpacity(1);
    }
}

