package chapterTen.PayrollSystem;

import chapterEight.Date;

public class PieceWorker extends Employee{
    private double wages;
    private double pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wages, double pieces) {
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wages <= 0.0) throw new IllegalArgumentException("Wages must be greater than zero");
        if (pieces <= 0.0) throw new IllegalArgumentException("Pieces Cannot be less than zero");
        this.wages = wages;
        this.pieces = pieces;
    }

    @Override
    public double earnings() {
        return getWages() * getPieces();
    }

    @Override
    public String toString() {
       return String.format("%s %s; %s: #%, .2f","Piece-salaried",super.toString(), "Piece: %.2f", getPieces(), "Wages: %.2f", getWages());
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        if (wages <= 0.0) throw new IllegalArgumentException("Wages must be greater than zero");
        this.wages = wages;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        if (pieces <= 0.0) throw new IllegalArgumentException("Pieces Cannot be less than zero");

        this.pieces = pieces;
    }
}

