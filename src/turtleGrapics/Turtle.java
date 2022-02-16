package turtleGrapics;

import static turtleGrapics.PenState.*;

public class Turtle {

   private Pen biro = new Pen();
    public Pen getPen() {
        return biro;
    }

    public void penDown() {
        biro.setState(DOWN);
    }
    public void penUp() {
        biro.setState(UP);
    }
}
