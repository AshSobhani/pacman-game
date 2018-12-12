package controller;



import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BarObstacle extends Rectangle {

    private static Color mazeColour;

    public static double THICKNESS = 25;
    /**
     *
     * @param x
     * @param y
     * @param orientation - horizontal or vertical
     * @param length - the length of the bar (1 == 100px)
     */
    public BarObstacle(double x, double y, String orientation, double length) {
        this.setX(x);
        this.setY(y);
        if (orientation.equals("horizontal")) {
            this.setHeight(BarObstacle.THICKNESS);
            this.setWidth(length * BarObstacle.THICKNESS);
        } else {
            this.setHeight(length * BarObstacle.THICKNESS);
            this.setWidth(BarObstacle.THICKNESS);
        }
          this.setFill(mazeColour);
//        this.setStrokeWidth(3);
    }


    public static void setMazeColour(Color chosenColour) {
        mazeColour = chosenColour;
    }
}
