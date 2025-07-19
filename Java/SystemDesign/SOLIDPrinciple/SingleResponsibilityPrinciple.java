package SystemDesign.SOLIDPrinciple;

class Invoice{
    int calculateLogic(int amount){
      return amount + amount * 10 / 100; // Example logic for calculating total with tax  
    }
}

class InvoicePrinter{
    void printInvoice(int amount){
        System.out.println("Invoice Amount: " + amount);
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        int amount = 1000; // Example amount
        int total = invoice.calculateLogic(amount); // Calculate total amount

        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice(total); // Print the invoice
    }
}
