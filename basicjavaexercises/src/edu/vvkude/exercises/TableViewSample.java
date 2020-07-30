package edu.vvkude.exercises;

// javafx packages
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

// Example of a table in javafx from docs.oracle

public class TableViewSample extends Application {
	
	private TableView table = new TableView();
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) {
		Scene scene = new Scene(new Group());
		stage.setTitle("Sample of a Table");
		stage.setWidth(600);
		stage.setHeight(800);
		
		final Label label = new Label("Address Book");
		label.setFont(new Font("Georgia", 20));
		
		table.setEditable(true);
		
		TableColumn firstNameColumn = new TableColumn("First Name");
		TableColumn lastNameColumn = new TableColumn("Last Name");
		TableColumn emailColumn = new TableColumn("Email Address");
		
		table.getColumns().addAll(firstNameColumn, lastNameColumn, emailColumn);
		
		final VBox vbox = new VBox();
		vbox.setSpacing(8);
		vbox.setPadding(new Insets(8, 0, 0, 8));
		vbox.getChildren().addAll(label, table);
		
		((Group) scene.getRoot()).getChildren().addAll(vbox);
		
		stage.setScene(scene);
		stage.show();
	}

}
