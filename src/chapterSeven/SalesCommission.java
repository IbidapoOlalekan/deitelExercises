package chapterSeven;


public class SalesCommission {
    private String companyName;
    private int[] salaries;

    public SalesCommission(String companyName, int[] salaryArray){
        this.companyName = companyName;
        salaries = salaryArray;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String displayMessage(){
        return  String.format("Welcome to the sales commission for %s",getCompanyName());
    }

    public void processSalaries(){
        outputSalaries();
        getCommissions();
        outputBarChart();
    }


    private int getCommissions() {
        int salary = 0;
        int employee = 0;
        System.out.println("\nThe total salary after the commission:");

        for (int i : salaries){
            salary = (int)(i + (i * 0.09) + 200);

            System.out.printf("Employee %2d: %3dn", i + 1, salary);
            employee ++;
        }
        return salary;
    }


    private void outputSalaries() {
        System.out.println("The initial salary is : ");

        for (int i = 0; i < salaries.length; i++){
            System.out.printf("Employee %2d: %3dn", i + 1, salaries[i] );
        }
    }
    private void outputBarChart() {
        System.out.println("\n Salary Distribution: ");

        int frequency[] = new int[11];

        for (int salary: salaries){
            ++frequency[salary/100];
        }

        for (int count = 2; count < frequency.length; count++){
            if (count == 10){
                System.out.printf("$" + "%4d and over.", 1000);
            }
            else{
                System.out.printf("$" + "%3d-" + "$" + "%3d:",count * 100, count * 100 + 99);
            }

            for (int stars = 0; stars < frequency[count];stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
