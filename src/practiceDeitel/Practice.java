package practiceDeitel;

public class Practice {
//        private String firstName;
//        private String lastName;
//        private double salary;
//
//        public Practice(String firstName, String lastName, double salary){
//                this.firstName =firstName;
//                this.lastName = lastName;
//                this.salary = salary;
//        }
//
//        public void setFirstName(String firstName){
//                this.firstName = firstName;
//        }
//        public String getFirstName(){
//                return firstName;
//        }
//
//        public void setLastName(String lastName){
//                this.lastName = lastName;
//        }
//
//        public String getLastName() {
//                return lastName;
//        }
//
//        public void setSalary(){
//                this.salary = salary;
//        }
//        public double getSalary() {
//                return salary;
//        }
//
//        public double getYearlySalary(){
//                return getSalary() * 12;
//        }
//
//        public double getTenPercentRaise(){
//                double raise  = 0.10 * getYearlySalary();
//                return getYearlySalary() + raise;
//        }

       /* private String name;
        private  double average;

        public Practice(String name, double average){
                this.name = name;
                if (average > 0.0 ){
                        if (average <= 100){
                                this.average= average;
                        }
                }

        }

        public void setName(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setAverage(double average) {
                if (average > 0.0 ){
                        if (average <= 100){
                                this.average= average;
                        }
                }
        }

        public double getAverage() {
                return average;
        }

        public String getGrade(){
                String letterGrade = "";

                if (average >= 90){
                        letterGrade = "A";
                }
                else {
                        if (average >= 80){
                                letterGrade  ="B";
                        }
                        else{
                                if (average >= 70){
                                        letterGrade = "C";
                                }
                                else{
                                        if (average >= 60){
                                                letterGrade  ="D";
                                        }
                                        else{
                                                letterGrade = "F";
                                        }
                                }
                        }
                }

                return letterGrade;*/

                //Chapter three

        private String name;
        private double average;

        public Practice(String name, double average){
                this.name = name;
                if (average > 0.0){
                        if (average <= 100){
                                this.average = average;
                        }
                }

        }

        public void setName(String name){
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setAverage(double average) {
                if (average > 0.0){
                        if (average <= 100){
                                this.average = average;
                        }
                }
        }


        public double getAverage() {
                return average;
        }

        public String getLetterGrade(){
                String letterGrade = "";

                if (average >= 90){
                        letterGrade = "A";
                }
                else {
                        if (average >= 80){
                                letterGrade = "B";
                        }
                        else{
                                if (average >= 70){
                                        letterGrade  = "C";
                                }
                                else {
                                        letterGrade = "F";
                                }
                        }
                }
                return letterGrade;
        }
}
