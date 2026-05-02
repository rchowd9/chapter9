public void printReceipt(double price, int quantity)
{
    // Calculate total
    double total = calculateTotal(price, quantity);
    displayReceipt(quantity, total);
    
    // Apply discount if quantity > 10
    private double calculateTotal(double price, int quantity) 
    {
        double total = price * quantity;
        if (quantity > 10) 
        {
            total *= 0.9;
        }
        return total;
    }

    // Print receipt

    private void displayReceipt(int quantity, double total)
    {
      System.out.println("Receipt");
      System.out.println("Items: " + quantity);
      System.out.println("Total: " + total);
    }
}
