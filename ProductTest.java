import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	public void increaseSizeWhenAdded()										//test 3: increments size when new item is added
	{
			ShoppingCart cart = new ShoppingCart();
			int oldCount = cart.getItemCount();

			cart.addItem(new Product("Item1", 300.0));
			cart.addItem(new Product("Item2", 500.0));

			int newCount = cart.getItemCount();

			assertTrue(newCount > oldCount);
	}

	//test 4 - balance adding update
	@Test
	public void BalanceUpdateTest() 
	{
			ShoppingCart cart = new ShoppingCart();
			double balance = cart.getBalance();
			cart.addItem(new Product("product1", 30.00));
			
			assertEquals(balance + 30.00, cart.getBalance());
			//update balance
			balance = cart.getBalance();
			
			//check again
			cart.addItem(new Product("product2", 75.25));
			assertEquals(balance + 75.25, cart.getBalance());		
	}

	
	// test 5
	@Test																									//test 5: decreases in size when item is removed
	public void decreaseSizeWhenRemoved() throws ProductNotFoundException
	{
			ShoppingCart cart = new ShoppingCart();

			cart.addItem(new Product("Item1", 300.0));
			cart.addItem(new Product("Item2", 500.0));

			int oldCount = cart.getItemCount();

			cart.removeItem(new Product("Item1", 300.0));

			int newCount = cart.getItemCount();

			assertTrue(newCount < oldCount);
	}
	
	// test 6 - balance removal update
	public void BalanceDecreaseTest() 
	{
			ShoppingCart cart = new ShoppingCart();
			double balance = cart.getBalance();
			Product prod1 = new Product("product1", 30.00);
			Product prod2 = new Product("product2", 15.00);
			
			cart.addItem(prod1);
			cart.addItem(prod2);
			
			assertEquals(balance + 45.00, cart.getBalance());
			//update balance
			balance = cart.getBalance();
			
			//check again
			cart.removeItem(prod2);
			assertEquals(balance - 15.00, cart.getBalance());		
	}

}
