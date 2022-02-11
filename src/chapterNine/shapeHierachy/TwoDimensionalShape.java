package chapterNine.shapeHierachy;

public class TwoDimensionalShape extends Shape {
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    private String shapeName ;
    private int dimension;
    public TwoDimensionalShape(String name, int face) {
        super(name, face);
        this.dimension = 2;

    }

}
