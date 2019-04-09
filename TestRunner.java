import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {

	@Test
	void test() {
		fail("Not yet implemented");
	}

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
}

}
