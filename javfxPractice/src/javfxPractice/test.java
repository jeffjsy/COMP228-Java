package javfxPractice;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;

public class test extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Creating root pane
    BorderPane root = new BorderPane();   
    root.setPadding(new Insets(10,20,10,20));
    
    // left pane. Student Information
    GridPane lpane = new GridPane();
    lpane.add(new Label("Name: "), 0, 0);
    lpane.add(new TextField(), 1, 0);
    lpane.add(new Label("Address: "), 0, 1);
    lpane.add(new TextField(), 1, 1);
    lpane.add(new Label("Province: "), 0, 2);
    lpane.add(new TextField(), 1, 2);
    lpane.add(new Label("City: "), 0, 3);
    lpane.add(new TextField(), 1, 3);
    lpane.add(new Label("Postal Code: "), 0, 4);
    lpane.add(new TextField(), 1, 4);
    lpane.add(new Label("Phone Number: "), 0, 5);
    lpane.add(new TextField(), 1, 5);
    lpane.add(new Label("Email: "), 0, 6);
    lpane.add(new TextField(), 1, 6);
    
    // Center pane. check boxes
    CheckBox topBox = new CheckBox("Student Council");
    CheckBox botBox = new CheckBox("Volunteer Work");
    VBox vBox = new VBox(topBox, botBox);
    vBox.setAlignment(Pos.BASELINE_CENTER);
    vBox.setPadding(new Insets(10,20,10,20));
    
    // Right pane. Radio button and combo box
    FlowPane flowPane = new FlowPane();
    flowPane.setAlignment(Pos.TOP_RIGHT);
    flowPane.setPadding(new Insets(10,20,10,20));    
    ToggleGroup tg = new ToggleGroup();    
    RadioButton rb1 = new RadioButton("Computer Science ");
    RadioButton rb2 = new RadioButton("Business");
    rb1.setToggleGroup(tg);
    rb2.setToggleGroup(tg);
    flowPane.getChildren().add(rb1);
    flowPane.getChildren().add(rb2);
    
    // combo box setup
    String courses[] = {"Python", "Java", "C#", "SQL"};    
	ComboBox<String> combox = new ComboBox<String>(FXCollections.observableArrayList(courses));
	
	
	//adding radio buttons and combo box to right pane
    VBox vBox2 = new VBox(flowPane, combox);
    vBox2.setAlignment(Pos.TOP_RIGHT);
    vBox2.setPadding(new Insets(10,20,10,20));
    
    // text area
    
    // Place nodes in the pane     
    root.setRight(vBox2);
    root.setBottom(new CustomPane("Bottom"));
    root.setLeft(lpane);
    root.setCenter(vBox); 
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(root, 900, 400);
    primaryStage.setTitle("Student Entry Form"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  public static void main(String[] args) {
	    launch(args);
	  }
} 

// Define a custom pane to hold a label in the center of the pane
class CustomPane extends StackPane {
  public CustomPane(String title) {
    getChildren().add(new Label(title));
    setStyle("-fx-border-color: red");
    setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
  }
}
