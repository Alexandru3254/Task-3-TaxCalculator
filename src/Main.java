class  TaxCalculator {
    public static void main(String[] args) {

        double price  = 3.5;
        double tax = 4.1;
        int quantity = 37;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt";
        total = price * quantity * tax;


        System.out.println(message);
        System.out.println("Total cost with tax is " + total);
    }
}