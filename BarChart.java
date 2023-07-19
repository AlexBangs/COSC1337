/**
 * Objective: To understand how JavaFX even works to make cool applications!
 * Algorithm: Description how to resolve the problem.
 *Input and Output: You input text and dimensions and get an output of "bars" that represent a bar chart that you'd
 * probably do better at in Excel or Power Bi
 * Created by: Alex Bangs
 * Date: 7/19/23
 * Version: 1.0?
 */


package com.example.barchart;
//Using the package in IntelliJ to get this to work
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//The prerequisites of making this work. To have an application, scene, color, text, stage, and etc

public class BarChart extends Application{
//Extends is REQUIRED for this to work
    public void start(Stage primaryStage) {

    Pane pane = new Pane();

    double height = 300;
    double paneHeight = 150;

    Rectangle r1 = new Rectangle(10, paneHeight - height * 0.2, 100, height * 0.2);
    r1.setFill(Color.RED);
    Text text1 = new Text(10, paneHeight - height * 0.2 - 10, "Project -- 20%");
    //This is the first bar in the chart at "20%" in reference to a Project


    Rectangle r2 = new Rectangle(10 + 110, paneHeight - height * 0.1, 100, height * 0.1);
    r1.setFill(Color.BLUE);
    Text text2 = new Text(10 + 110, paneHeight - height * 0.1 - 10, "Quiz -- 10%");
    //This is the second bar in the chart at "10%" in reference to a Quiz


    Rectangle r3 = new Rectangle(10 + 220, paneHeight - height * 0.3, 100, height * 0.3);
    r3.setFill(Color.GREEN);
    Text text3 = new Text(10 + 220, paneHeight - height * 0.3 - 10, "Midterm -- 30%");
    //This is the third bar in the chart at "30%" in reference to the Midterm

    Rectangle r4 = new Rectangle(10 + 330, paneHeight - height * 0.4, 100, height * 0.4);
    r1.setFill(Color.ORANGE);
    Text text4 = new Text(10 + 330, paneHeight - height * 0.4 - 10, "Final -- 40%");
    //This it the fourth bar in the chart at "40%" in reference to the Final

    pane.getChildren().addAll(r1, text1, r2, text2, r3, text3, r4, text4);
    //This getChildren() allows all of the rectangles and text to be displayed
    Scene scene = new Scene(pane, 500, paneHeight);
    primaryStage.setTitle("Bar Chart");
    //This gives the window the name "Bar Chart"
    primaryStage.setScene(scene);
    primaryStage.show();

}
    public static void main(String[] args) {
    launch(args);
    //This literally makes it appear in IJ.
    }
}