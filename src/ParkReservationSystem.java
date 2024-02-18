import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ParkReservationSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Root layout
        BorderPane root = new BorderPane();
        //
        // Left VBox
        VBox leftBox = new VBox(10);
        leftBox.setPadding(new Insets(15));
        Label hourLabel = new Label("Hour (08:00 to 20:00 with 4 hours option for visit):");
        ComboBox<String> hourDropdown = new ComboBox<>();
        hourDropdown.getItems().addAll("08:00", "12:00", "16:00", "20:00");
        Button nextButton = new Button("Next");
        leftBox.getChildren().addAll(hourLabel, hourDropdown, nextButton);
        
        // Center Calendar
        DatePicker calendar = new DatePicker();
        
        // Right VBox
        VBox rightBox = new VBox(10);
        rightBox.setPadding(new Insets(15));
        ComboBox<String> parkNameDropdown = new ComboBox<>();
        parkNameDropdown.getItems().addAll("Safari", "Hai Bar", "Tanahi"); // Added park names here
        parkNameDropdown.setPromptText("Select park name");
        ComboBox<Integer> visitorsDropdown = new ComboBox<>();
        for (int i = 1; i <= 15; i++) {
            visitorsDropdown.getItems().add(i);
        }
        visitorsDropdown.setPromptText("Number of visitors (1-15)");
        Button backButton = new Button("Back");
        rightBox.getChildren().addAll(parkNameDropdown, visitorsDropdown, backButton);
        
        // Adding to root
        root.setLeft(leftBox);
        root.setCenter(calendar);
        root.setRight(rightBox);
        
        // Scene and stage setup
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setTitle("Park Reservation System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
