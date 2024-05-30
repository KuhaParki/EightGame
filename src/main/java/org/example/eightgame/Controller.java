package org.example.eightgame;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;

import java.util.Objects;
import java.util.Random;

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
    Label[] labelArray = {oneLabel, twoLabel, threeLabel, fourLabel, fiveLabel, sixLabel, sevenLabel,
            eightLabel};
    Rectangle[] rectArray = {oneRectangle, twoRectangle, threeRectangle, fourRectangle, fiveRectangle, sixRectangle,
                sevenRectangle, eightRectangle};

    public void oneRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(twoLabel.getText(), " ")){
            twoLabel.setText(oneLabel.getText());
            twoRectangle.setOpacity(0);
            oneLabel.setText(" ");
            oneRectangle.setOpacity(1);
        }

        if(Objects.equals(fourLabel.getText(), " ")){
            fourLabel.setText(oneLabel.getText());
            fourRectangle.setOpacity(0);
            oneLabel.setText(" ");
            oneRectangle.setOpacity(1);
        }
    }

    public void twoRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(oneLabel.getText(), " ")){
            oneLabel.setText(twoLabel.getText());
            oneRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            fiveLabel.setText(twoLabel.getText());
            fiveRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
        }

        if(Objects.equals(threeLabel.getText(), " ")){
            threeLabel.setText(twoLabel.getText());
            threeRectangle.setOpacity(0);
            twoLabel.setText(" ");
            twoRectangle.setOpacity(1);
        }
    }

    public void threeRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(twoLabel.getText(), " ")){
            twoLabel.setText(threeLabel.getText());
            twoRectangle.setOpacity(0);
            threeLabel.setText(" ");
            threeRectangle.setOpacity(1);
        }

        if(Objects.equals(sixLabel.getText(), " ")){
            sixLabel.setText(threeLabel.getText());
            sixRectangle.setOpacity(0);
            threeLabel.setText(" ");
            threeRectangle.setOpacity(1);
        }
    }

    public void fourRectangleClicked(MouseEvent mouseEvent) {
        if(Objects.equals(oneLabel.getText(), " ")){
            oneLabel.setText(fourLabel.getText());
            oneRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            fiveLabel.setText(fourLabel.getText());
            fiveRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
        }

        if(Objects.equals(sevenLabel.getText(), " ")){
            sevenLabel.setText(fourLabel.getText());
            sevenRectangle.setOpacity(0);
            fourLabel.setText(" ");
            fourRectangle.setOpacity(1);
        }
    }

    public void fiveRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(sixLabel.getText(), " ")){
            sixLabel.setText(fiveLabel.getText());
            sixRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            eightLabel.setText(fiveLabel.getText());
            eightRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }

        if(Objects.equals(twoLabel.getText(), " ")){
            twoLabel.setText(fiveLabel.getText());
            twoRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }

        if(Objects.equals(fourLabel.getText(), " ")){
            fourLabel.setText(fiveLabel.getText());
            fourRectangle.setOpacity(0);
            fiveLabel.setText(" ");
            fiveRectangle.setOpacity(1);
        }
    }

    public void sixRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(threeLabel.getText(), " ")){
            threeLabel.setText(sixLabel.getText());
            threeRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            fiveLabel.setText(sixLabel.getText());
            fiveRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
        }

        if(Objects.equals(nineLabel.getText(), " ")){
            nineLabel.setText(sixLabel.getText());
            nineRectangle.setOpacity(0);
            sixLabel.setText(" ");
            sixRectangle.setOpacity(1);
        }
    }

    public void sevenRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(fourLabel.getText(), " ")){
            fourLabel.setText(sevenLabel.getText());
            fourRectangle.setOpacity(0);
            sevenLabel.setText(" ");
            sevenRectangle.setOpacity(1);
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            eightLabel.setText(sevenLabel.getText());
            eightRectangle.setOpacity(0);
            sevenLabel.setText(" ");
            sevenRectangle.setOpacity(1);
        }
    }

    public void eightRectangleClicked(MouseEvent mouseEvent) {
        System.out.println("terve");
        if(Objects.equals(nineLabel.getText(), " ")){
            nineLabel.setText(eightLabel.getText());
            nineRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
        }

        if(Objects.equals(fiveLabel.getText(), " ")){
            fiveLabel.setText(eightLabel.getText());
            fiveRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
        }

        if(Objects.equals(sevenLabel.getText(), " ")){
            sevenLabel.setText(eightLabel.getText());
            sevenRectangle.setOpacity(0);
            eightLabel.setText(" ");
            eightRectangle.setOpacity(1);
        }
    }

    public void nineRectangleClicked(MouseEvent mouseEvent) {

        if(Objects.equals(sixLabel.getText(), " ")){
            sixLabel.setText(nineLabel.getText());
            sixRectangle.setOpacity(0);
            nineLabel.setText(" ");
            nineRectangle.setOpacity(1);
        }

        if(Objects.equals(eightLabel.getText(), " ")){
            eightLabel.setText(nineLabel.getText());
            eightRectangle.setOpacity(0);
            nineLabel.setText(" ");
            nineRectangle.setOpacity(1);
        }
    }

    public void mixButtonClicked(MouseEvent mouseEvent) {
        mixHelper();
        Label[] labelArray2 = {oneLabel, twoLabel, threeLabel, fourLabel, fiveLabel, sixLabel, sevenLabel,
                eightLabel};
        Random random = new Random();

        int[] numArray = new int[8];
        int idx = 0;
        boolean check = false;
        boolean added = false;

        for(Label x : labelArray2){
            added = false;
            while(!added) {

                int random_int = random.nextInt(1, 9);
                boolean test = false;

                for (int i = 0; i < idx; i++) {
                    if (numArray[i] == random_int) {
                        test = true;
                        break;
                    }
                }

                if(!test){
                    numArray[idx] = random_int;
                    idx++;
                    x.setText(String.valueOf(random_int));
                    added = true;
                }
            }
        }
    }

    public void mixHelper() {
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

