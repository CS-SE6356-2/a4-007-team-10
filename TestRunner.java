import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {

	public static void main(String[] args) {
		//Test ShoppingCart
		Result SCresult = JUnitCore.runClasses(ShoppingCartTest.class);
		for(Failure failure : SCresult.getFailures()) {
			System.out.println(failure.toString());
		}

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


}
