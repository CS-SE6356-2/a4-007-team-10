import java.util.*;

public class ShoppingCart {
	
	private ArrayList items;
	private double balance = 0.0;
	
	public ShoppingCart() {
		items = new ArrayList();
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addItem(Product item) {
		items.add(item);
		balance += item.getPrice();
	}
	
	public void removeItem(Product item)
			throws ProductNotFoundException {
		int index = items.indexOf(item);
		
		if (index == -1) {
			throw new ProductNotFoundException();
		}
		
		balance -= item.getPrice();
		items.remove(index);
	}
	
	public int getItemCount() {
		return items.size();
	}
	
	public void empty() {
		items.clear();
	}
}

