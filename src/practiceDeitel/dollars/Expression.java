package practiceDeitel.dollars;

public interface Expression {
    Money reduce(Bank bank, String to);
}
