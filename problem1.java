public void printReceipt(double price, int quantity)
{
    // Calculate total
    double total = calculateTotal(price, quantity);
    displayReceipt(quantity, total);
    
    // Apply discount if quantity > 10
    if (quantity > 10) 
    {
        total = total * 0.9;
    }

    // Print receipt

    private void displayReceipt(int quantity, double total)
    {
      System.out.println("Receipt");
      System.out.println("Items: " + quantity);
      System.out.println("Total: " + total);
    }
}
