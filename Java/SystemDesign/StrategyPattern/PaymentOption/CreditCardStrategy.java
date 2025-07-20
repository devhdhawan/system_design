package SystemDesign.StrategyPattern.PaymentOption;


public class CreditCardStrategy implements PaymentStrategy {
    String name;
    String cardNumber;
    String cvv;
    String expiryDate;
    public CreditCardStrategy(String name, String cardNumber, String cvv, String expiryDate) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        
    }
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    
}
