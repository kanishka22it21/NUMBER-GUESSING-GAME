import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;
public class Main extends Application {

    private int targetNumber;
    private int attemptCount;
    private TextField guessInput;
    private Label feedbackLabel;
    private Label attemptLabel;

    @Override
    public void start(Stage primaryStage) {
        // Initialize the UI components
        guessInput = new TextField();
        guessInput.setPromptText("Enter your guess");

        Button guessButton = new Button("Guess");
        guessButton.setOnAction(e -> makeGuess());

        feedbackLabel = new Label("Guess a number between 1 and 100");
        attemptLabel = new Label("Attempts: 0");

        Button resetButton = new Button("Reset");
        resetButton.setOnAction(e -> resetGame());

        VBox vbox = new VBox(10, guessInput, guessButton, feedbackLabel, attemptLabel, resetButton);
        vbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);

        // Set background color using inline CSS
        vbox.setStyle("-fx-background-color: pink;");

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Number Guessing Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Initialize the game
        resetGame();
    }

    private void makeGuess() {
        String inputText = guessInput.getText();
        if (inputText.isEmpty()) {
            feedbackLabel.setText("Please enter a number.");
            return;
        }

        try {
            int guess = Integer.parseInt(inputText);
            attemptCount++;
            attemptLabel.setText("Attempts: " + attemptCount);

            if (guess < targetNumber) {
                feedbackLabel.setText("Too low! Try again.");
            } else if (guess > targetNumber) {
                feedbackLabel.setText("Too high! Try again.");
            } else {
                feedbackLabel.setText("Congratulations! You guessed it right.");
            }
        } catch (NumberFormatException e) {
            feedbackLabel.setText("Invalid number. Please enter a valid number.");
        }
    }

    private void resetGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // Number between 1 and 100
        attemptCount = 0;
        attemptLabel.setText("Attempts: 0");
        feedbackLabel.setText("Guess a number between 1 and 100");
        guessInput.clear();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
