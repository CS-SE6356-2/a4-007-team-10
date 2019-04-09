import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	@Test
	void testShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		assertTrue(cart.getItemCount() == 0);
	}
	
	@Test
	void testEmpty() {
		ShoppingCart cart = new ShoppingCart();
		Product testItem = new Product("Test Item", 5.50);
		cart.addItem(testItem);
		cart.empty();
		assertTrue(cart.getItemCount() == 0);
	}

}
