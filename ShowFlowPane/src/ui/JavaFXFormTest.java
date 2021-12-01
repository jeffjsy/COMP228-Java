package ui;

import javafx.application.Application;
import javafx.stage.Stage;

import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class JavaFXFormTest extends Application {
    private BorderPane borderPane;
    private GridPane empPanel;
    private Label lblFirstName, lblLastName, lblEmail;
    private TextField txtFirstName, txtLastName, txtEmail;
    private Button btnDisplay, btnChangeStyle;
    private VBox lngBox;
    private TextArea tArea;    
    private ToggleGroup group;
    private RadioButton rb1, rb2, rb3;

    public JavaFXFormTest() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        borderPane = new BorderPane();
        //create the grid pane for entries
        empPanel = new GridPane();
        empPanel.setHgap(5);
        empPanel.setVgap(5);
        //create labels
        lblFirstName = new Label("First Name:");
        lblLastName = new Label("Last Name:");
        lblEmail = new Label("Email:");
        //create text fields
        txtFirstName = new TextField();
        txtLastName = new TextField();
        txtEmail = new TextField();
        //create buttons
        btnDisplay = new Button("Display");
        btnChangeStyle = new Button("Change Style");
        //add controls to grid pane
        empPanel.add(lblFirstName, 0, 0);
        empPanel.add(txtFirstName, 1, 0);
        empPanel.add(lblLastName, 0, 1);
        empPanel.add(txtLastName, 1, 1);
        empPanel.add(lblEmail, 0, 2);
        empPanel.add(txtEmail, 1, 2);
        empPanel.add(btnChangeStyle, 0, 4);
        empPanel.add(btnDisplay, 1, 4);
        //align buttons in grid pane
        GridPane.setHalignment(btnDisplay, HPos.RIGHT);
        GridPane.setHalignment(btnChangeStyle, HPos.LEFT);
        //create the toggle group to group radio buttons
        group = new ToggleGroup();
        //create radio buttons and add them to the toggle group
        rb1 = new RadioButton("Java");
        rb1.setToggleGroup(group);
        //rb1.setSelected(true);
        rb2 = new RadioButton("C#");
        rb2.setToggleGroup(group);
        // 
        rb3 = new RadioButton("Python");
        rb3.setToggleGroup(group);
        //create the text area
        tArea = new TextArea();
        // Create a scroll pane to hold the text area
        ScrollPane scrollPane = new ScrollPane(tArea);
        //handle click events
        btnDisplay.setOnAction(e -> displayEntries());
        btnChangeStyle.setOnAction(e -> changeAppearance(tArea));
        //handle radio button events
        rb1.setOnAction(e -> {
            if (rb1.isSelected()) {
                tArea.appendText(rb1.getText());
            }
        });
        //place grid pane in the center of border pane
        borderPane.setCenter(empPanel);
        //create the box pane and place to the right
        lngBox = new VBox();
        //set the style
        lngBox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
                + "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
        //set the title of box pane
        Text title = new Text("Languages");
        lngBox.getChildren().add(title);
        lngBox.getChildren().addAll(rb1, rb2, rb3);
        borderPane.setRight(lngBox);

        //set the scroll pane to the bottom of border pane
        borderPane.setBottom(scrollPane);
        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 400, 250);
        primaryStage.setTitle("Student Info"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        //
    }

    // display entries in text area
    public void displayEntries() {
        //
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();
        //
        tArea.appendText(firstName + "\n" + lastName + "\n" + email + "\n");

    }

    //
    public void changeAppearance(Control control) {

        control.setStyle("-fx-font: 16px Serif;" + "-fx-font-weight: bold;" + "-fx-text-fill: blue;"
                + "-fx-background-color: #CCFF99;");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);

    }

}