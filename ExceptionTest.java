import org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

// test 6 : when item not in cart is removed
class ExceptionTest {


	@Test
	public void NotFoundException() throws ProductNotFoundException{
			ShoppingCart testCart=new ShoppingCart();
			// item outside of cart
			Product testItem=new Product("test", 10.50);
			// item in cart
			Product testItem2=new Product("test2", 22.00);
			testCart.addItem(testItem2);
			
			//attempt removal of item not inside cart
			try {
				cart.removeItem(testItem);
				fail();
				
			}catch(ProductNotFoundException e) {
				
			}
		}

	}

