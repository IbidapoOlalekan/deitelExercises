package chapterNine.quadrilateralHierachy;

public class Quadrilateral {
    private Point pointOne;
    private Point pointTwo;
    private Point pointThree;
    private Point pointFour;

    public Quadrilateral(Point pointOne, Point pointTwo, Point pointThree, Point pointFour){
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
        this.pointThree = pointThree;
        this.pointFour = pointFour;
    }
    public Point getPointOne() {
        return pointOne;
    }

    public void setPointOne(Point pointOne) {
        this.pointOne = pointOne;
    }

    public Point getPointTwo() {
        return pointTwo;
    }

    public void setPointTwo(Point pointTwo) {
        this.pointTwo = pointTwo;
    }

    public Point getPointThree() {
        return pointThree;
    }

    public void setPointThree(Point pointThree) {
        this.pointThree = pointThree;
    }

    public Point getPointFour() {
        return pointFour;
    }

    public void setPointFour(Point pointFour) {
        this.pointFour = pointFour;
    }
}
