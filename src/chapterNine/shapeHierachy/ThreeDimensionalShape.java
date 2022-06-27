package chapterNine.shapeHierachy;

public class ThreeDimensionalShape extends Shape{
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    private String shapeName;
    public ThreeDimensionalShape(String name, int face) {
        super(name, face);
    }
}
