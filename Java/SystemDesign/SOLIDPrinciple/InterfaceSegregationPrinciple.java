package SystemDesign.SOLIDPrinciple;

// The Interface Segregation Principle states that no client should be forced to depend on methods it does not use.

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllinOne implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class InterfaceSegregationPrinciple {
    
}
