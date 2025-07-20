package SystemDesign.StrategyPattern.PaymentOption;

public class Main {
    public static void main(String[] args){
        PaymentStrategy creditCard=new CreditCardStrategy("John Doe", "1234567890123456", "123", "12/25");

        ShoppingCart cart=new ShoppingCart(creditCard);
        cart.checkout(100);
        
        PaymentStrategy paypal=new PayPalStrategy("hdhawan@company.com","password123");
        cart = new ShoppingCart(paypal);
        cart.checkout(200);
        
    }
}
