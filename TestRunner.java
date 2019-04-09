import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {

	public static void main(String[] args) {
		//Test ShoppingCart
		Result SCresult = JUnitCore.runClasses(ShoppingCartTest.class);
		for(Failure failure : result.getFailures()) {
		for(Failure failure : SCresult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(result.wasSuccessful());
		System.out.println(SCresult.wasSuccessful());

		//Test Product
		Result productResult = JUnitCore.runClasses(ProductTest.class);
		for(Failure failure : productResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(productResult.wasSuccessful());


		//Test ProductNotFoundException
		Result exceptionResult = JUnitCore.runClasses(ExceptionTest.class);
		for(Failure failure : exceptionResult.getFailures()) {
			System.out.println(failure.toString());
		}

		System.out.println(exceptionResult.wasSuccessful());
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
