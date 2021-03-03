package lab4;


import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class PaneOrganizer {

	private BorderPane _root;
	private KeyableRect _leftRect;
	private KeyableRect _centerRect;
	private KeyableRect _rightRect;

	public PaneOrganizer() {
		_root = new BorderPane();
		this.createRectsPane();
		_root.setStyle("-fx-background-color: orange;");
		this.createLabelPane();
		// TODO: instantiate the BorderPane and call the private methods here

	}

	public BorderPane getRoot(){
		return _root;
	}

	private void createRectsPane(){
		Pane rectsPane = new Pane();
		rectsPane.setPrefSize(Constants.RECT_PANE_PREF_WIDTH,Constants.RECT_PANE_PREF_HEIGHT);
		rectsPane.setStyle("-fx-background-color: #FFFFFF;");
		_root.setTop(rectsPane);
		_leftRect = new KeyableRect(Constants.LEFT_RECT_X, Constants.LEFT_RECT_Y, Color.BLUE);
		_centerRect = new KeyableRect(Constants.CENTER_RECT_X, Constants.CENTER_RECT_Y, Color.YELLOW);
		_rightRect = new KeyableRect(Constants.RIGHT_RECT_X, Constants.RIGHT_RECT_Y, Color.RED);
		rectsPane.getChildren().addAll(_leftRect.getRectNode(), _centerRect.getRectNode(), _rightRect.getRectNode());
		rectsPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		rectsPane.setFocusTraversable(true);
	}

	private void createLabelPane() {
		VBox labelPane = new VBox();
		Label label = new Label("Introduction to JavaFX!");
		labelPane.getChildren().add(label);
		labelPane.setAlignment(Pos.CENTER);
		_root.setBottom(labelPane);


	}

	// TODO: make public getRoot() method that returns the BorderPane

	// TODO: make private createRectsPane() method that creates the user-responsive rectsPane

	// TODO: make private createLabelPane() method that creates the labelPane


	/**
	 * The purpose of this EventHandler is to detect user key input
	 * and to have a specific response depending on which key is pressed.
	 */
	private class KeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent e) {
			KeyCode keyPressed = e.getCode();
			if (keyPressed == KeyCode.SPACE) {
					System.out.println("Spacebar!");
			}
			e.consume();

			// TODO: add switch statement for keyPressed input

			// TODO: consume the event here

		}
	}
}
