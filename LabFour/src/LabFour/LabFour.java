package LabFour;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import java.util.stream.Collectors;

public class LabFour extends Application {
	
	Label lblName, lblAddress, lblProvince, lblCity, lblPostal, lblPhone, lblEmail;
	TextField txtName, txtAddress, txtProvince, txtCity, txtPostal, txtPhone, txtEmail;
	TextArea textArea;
	CheckBox volunteerBox, studentBox;
	ListView<String> listView;
	RadioButton radioCS, radioBusi;
	ToggleGroup btnGroup;
	String coursesCS[] = {"Python", "Java", "C#", "SQL"};
    String coursesBusi[] = {"Management", "Accounting", "Marketing", "Human Resources"};	
	ComboBox<String> comBox;
		
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Creating root pane
    BorderPane root = new BorderPane();   
    root.setPadding(new Insets(10,20,10,20));
    
    // left pane. Student Information
    lblName = new Label("Name: ");
    lblAddress = new Label("Address: ");
    lblProvince = new Label("Province: ");
    lblCity = new Label("City: ");
    lblPostal = new Label("Postal Code: ");
    lblPhone = new Label("Phone Number: ");
    lblEmail = new Label("Email: ");
    
    txtName = new TextField();
    txtAddress = new TextField();
    txtProvince = new TextField();
    txtCity = new TextField();
    txtPostal = new TextField();
    txtPhone = new TextField();
    txtEmail = new TextField();

    GridPane lpane = new GridPane();
    lpane.add(lblName, 0, 0);
    lpane.add(txtName, 1, 0);    
    lpane.add(lblAddress, 0, 1);
    lpane.add(txtAddress, 1, 1);    
    lpane.add(lblProvince, 0, 2);
    lpane.add(txtProvince, 1, 2);    
    lpane.add(lblCity, 0, 3);
    lpane.add(txtCity, 1, 3);    
    lpane.add(lblPostal, 0, 4);
    lpane.add(txtPostal, 1, 4);    
    lpane.add(lblPhone, 0, 5);
    lpane.add(txtPhone, 1, 5);    
    lpane.add(lblEmail, 0, 6);
    lpane.add(txtEmail, 1, 6);
     
    // button to display
    Button btnDisplay = new Button("Display");
    Button btnClearAll = new Button("Clear");
    lpane.add(btnDisplay, 0, 7);
    lpane.add(btnClearAll, 1, 7);
    btnDisplay.setOnAction(e -> displayEntries()); //calls method to display info to text area
    btnClearAll.setOnAction(e -> ClearAll());
    
    // Center pane. check boxes
    studentBox = new CheckBox("Student Council");    
    volunteerBox = new CheckBox("Volunteer Work");    
    VBox vBox = new VBox(studentBox, volunteerBox);
    vBox.setAlignment(Pos.BASELINE_CENTER);
    vBox.setPadding(new Insets(10,20,10,20));
    
    // Right pane. Radio button and combo box
    FlowPane flowPane = new FlowPane();
    flowPane.setAlignment(Pos.TOP_RIGHT);
    flowPane.setPadding(new Insets(10,20,10,20));  
    radioCS = new RadioButton("Computer Science ");  //create radio buttons
    radioBusi = new RadioButton("Business");
    btnGroup = new ToggleGroup();
    radioCS.setToggleGroup(btnGroup);  //add radio buttons to same group to ensure only one can be selected
    radioBusi.setToggleGroup(btnGroup);
    flowPane.getChildren().add(radioCS);
    flowPane.getChildren().add(radioBusi);    
    radioCS.setSelected(false);
    radioBusi.setSelected(false);
    
    
    // combo box setup    
    comBox = new ComboBox<String>(FXCollections.observableArrayList());
    comBox.setMaxWidth(210);
    ObservableList<String> listCS = FXCollections.observableArrayList(coursesCS); //Turn string array into list for display
    ObservableList<String> listBusi = FXCollections.observableArrayList(coursesBusi);
    		
    radioCS.setOnMouseClicked(mouseEvent -> { // Clears list then populates with courses from program    	
    	comBox.getItems().clear();
    	comBox.getItems().addAll(listCS);    	  	
    });    
    radioBusi.setOnMouseClicked(mouseEvent -> {
    	comBox.getItems().clear();
    	comBox.getItems().addAll(listBusi);
    });
   	
    
	// list view setup		
	listView = new ListView<>(FXCollections.observableArrayList());
	listView.setPrefSize(210, 210);
	listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	BorderPane bPane = new BorderPane();
	bPane.setRight(listView);
	
	// combo box selection adds to list view
	comBox.setOnAction((e -> {
		String selectedItem = comBox.getSelectionModel().getSelectedItem();
		ObservableList<String> listItems = listView.getItems();
		if (selectedItem != null) {	  // Prevents 'null' from appearing in list view when switching between radio buttons/programs.			
			if (!listItems.contains(selectedItem)) { // Checks if combo box item doesn't exist, then adds			
				listItems.add(selectedItem);  
			}
		} 		
	}));

	//adding radio buttons and combo box to right pane
    VBox vBox2 = new VBox(flowPane, comBox, bPane);
    vBox2.setAlignment(Pos.TOP_RIGHT);
    vBox2.setPadding(new Insets(10,20,10,20));
    
    // text area
    textArea = new TextArea();
    GridPane descArea = new GridPane();
    descArea.add(textArea, 0, 0);
    textArea.setMaxWidth(700);
    
    // Place nodes in the pane     
    root.setRight(vBox2);
    root.setBottom(descArea);
    root.setLeft(lpane);
    root.setCenter(vBox); 
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(root, 1000, 400);
    primaryStage.setTitle("Student Entry Form"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  public void displayEntries() {
	  textArea.clear();
	  
	  // display text field items
	  String name = txtName.getText(); 
	  String addr = txtAddress.getText();
	  String prov = txtProvince.getText(); 
	  String city = txtCity.getText();
	  String postal = txtPostal.getText();
	  String phone = txtPhone.getText();
	  String email = txtEmail.getText();
	  textArea.appendText("Name: "+name+"\n"+"Address: "+addr+". "+city+", "+prov+". "+postal+"\nPhone: "+phone+"\nEmail: "+email+"\n");
	  
	  // display check box items
	  if (volunteerBox.isSelected() && studentBox.isSelected()) {
		  textArea.appendText("Extracurriculars: On the Student Council and Volunteers\n");
	  } else if (studentBox.isSelected()) {
		  textArea.appendText("Extracurriculars: On the Student Council\n");
	  } else if (volunteerBox.isSelected()) {
		  textArea.appendText("Extracurriculars: Student Volunteer\n");
	  }
	  
	  //displaying list view items	  
	  String listViewItems = listView.getItems().stream().map(Object::toString).collect(Collectors.joining(", "));
	  textArea.appendText("Courses: "+listViewItems+"\n");
	  
  }
  
  public void ClearAll() {
	  textArea.clear();
	  txtName.setText("");
	  txtAddress.setText("");
	  txtProvince.setText("");
	  txtCity.setText("");
	  txtPostal.setText("");
	  txtPhone.setText("");
	  txtEmail.setText("");
	  volunteerBox.setSelected(false);
	  studentBox.setSelected(false);
	  radioCS.setSelected(false);
	  radioBusi.setSelected(false);
	  comBox.getItems().clear();
	  listView.getItems().clear();
  }
  	  
  public static void main(String[] args) {
	    launch(args);
	  }
} 
