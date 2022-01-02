package chapterFive;

import java.util.Objects;

public class AutoPolicy {

    private int accountNumber;
    private String makeAndModel;
    private String state;

    public AutoPolicy(int accountNumber,String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.setMakeAndModel(makeAndModel);
        this.state = state;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }
    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA": case "NH": case "VT": case "ME":
                noFaultState = true;
                break;

            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
