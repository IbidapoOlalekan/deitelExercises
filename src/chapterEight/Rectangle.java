package chapterEight;

public class Rectangle {
    private float length = 1;
    private float width = 1;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        if (length > 0.0 & length < 20.0){
            this.length = length;
        }
        else {
            throw new IllegalArgumentException("Length Is Invalid");
        }

    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width < 20){
            this.width = width;
        }
        else {
            throw new IllegalArgumentException("Width Is Invalid");
        }

    }

    public float perimeter() {
        float perimeter = 2 * (getLength() + getWidth());
        return perimeter;
    }

    public float area() {
        return getLength() * getWidth();
    }
}
