package practiceDeitel.springBootRestApplication;

public class SpringBootRestApi {
        private String number;
        private String verb;
        private String pluralModifier;

        public String make(char candidate, int count){
            createPluralDependentMessageParts(count);
            return String.format("");
        }

        private void createPluralDependentMessageParts(int count) {
                if (count == 0){
                        thereAreNoLetters();
                }
                else if(count == 1){
                        thereIsOneLetter();
                }
                else{
                        thereAreManyLetters(count);
                }
        }

        private void thereAreManyLetters(int count) {
                number = Integer.toString(count);
                verb = "are";
                pluralModifier = "s";
        }

        private void thereIsOneLetter() {
                number = "1";
                verb = "is";
                pluralModifier =" ";
        }

        private void thereAreNoLetters() {
                number = "NO";
                verb = "are";
                pluralModifier ="s";
        }

}
