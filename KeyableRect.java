package lab4;


import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class KeyableRect {

	private Rectangle _rect;

	public KeyableRect(double x, double y, Color color) {
		_rect = new Rectangle();
		_rect.setHeight(Constants.RECT_HEIGHT);
		_rect.setWidth(Constants.RECT_WIDTH);
		_rect.setFill(color);
		_rect.setX(x);
		_rect.setY(y);
		// TODO: instantiate the Rectangle object

		// TODO: modify the constructor's parameters so that it takes in two doubles for the x and y locations, as well as a Color.

		// TODO: set the rectangle's size using the width and height constants in the Constants class
		// TODO: set the rectangle's location and color using the values passed in as parameters

	}

	public Node getRectNode(){
		return _rect;
	}

	// TODO: create public getRectNode() method that returns the Rectangle object

	// TODO: create public changeColor() method that changes the Rectangle to a randomly generated color

}
