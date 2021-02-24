package lab4;


import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class PaneOrganizer {

	public PaneOrganizer() {
		// TODO: instantiate the BorderPane and call the private methods here

	}

	// TODO: make public getRoot() method that returns the BorderPane

	// TODO: make private createRectsPane() method that creates the user-responsive rectsPane

	// TODO: make private createLabelPane() method that creates the labelPane


	/**
	 * The purpose of this EventHandler is to detect user key input
	 * and to have a specific response depending on which key is pressed.
	 */
	public class KeyHandler implements EventHandler<KeyEvent> {
		@Override
		public void handle(KeyEvent e) {
			KeyCode keyPressed = e.getCode();
			if (keyPressed == KeyCode.SPACE) {
					System.out.println("Spacebar!");
			}

			// TODO: add switch statement for keyPressed input

			// TODO: consume the event here

		}
	}
}
