import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {       
        // DI SINI YANG DIGANTI: Character → GameCharacter
        GameCharacter William = new GameCharacter("William Simanjuntak", 100, 1);

        Label nameLabel   = new Label("Name: "   + William.showName());
        Label levelLabel  = new Label("Level: "  + William.showLevel());
        Label healthLabel = new Label("Health: " + William.showHealth()); 

        Button levelUpButton = new Button("Level Up");
        levelUpButton.setOnAction(e -> {
            William.levelUp();
            levelLabel.setText("Level: "  + William.showLevel());
            healthLabel.setText("Health: " + William.showHealth());    
        });

        // PAKAI VBOX SAJA — lebih simpel dan rapi
        VBox vbox = new VBox(20); 
        vbox.setAlignment(Pos.CENTER);
        vbox.setPadding(new Insets(30));
        vbox.getChildren().addAll(nameLabel, levelLabel, healthLabel, levelUpButton);

        Scene scene = new Scene(vbox, 400, 250);
        primaryStage.setTitle("Character Info");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


        //untuk menjalankan aplikasi, buka terminal dan ketikan perintah berikut
        // javac --module-path "C:\javafx\javafx-sdk-21.0.9\lib" --add-modules javafx.controls Main.java

        //setelah tidak ada Error lalu jalankan perintah berikut
        //java --module-path "C:\javafx\javafx-sdk-21.0.9\lib" --add-modules javafx.controls Main