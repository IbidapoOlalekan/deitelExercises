package turtleGrapics;

public class Position {
    private int row;
    private int column;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Position{");
        sb.append("row=").append(row);
        sb.append("column=").append(column);
        sb.append("}");
        return sb.toString();
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public boolean equals(Object toBeCompared){
        if (!toBeCompared.getClass().equals(this.getClass())){
            return false;
        }
        Position compared = (Position) toBeCompared;
        if(this.row == compared.row && this.column == compared.column){
            return true;
        }
        return false;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }

    public void setRow(int currentRow) {
        row = currentRow;
    }
    public int getRow() {
       return row;
    }
}
