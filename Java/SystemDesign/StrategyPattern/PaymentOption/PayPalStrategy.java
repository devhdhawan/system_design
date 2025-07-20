package SystemDesign.StrategyPattern.PaymentOption;

public class PayPalStrategy implements PaymentStrategy {
    String email;
    String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
    
}
