import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner
{
    public static void main(String[] args)
    {
          Result result = JUnitCore.runClasses(JavaTestClass.class);
        
          for (Failure failure : result.getFailures())
          {
             System.out.println(failure.toString());
          }

          System.out.println("Total Test cases : "+ result.getRunCount()) ;
          System.out.println("Total Failure count : "+ result.getFailureCount()) ;
          System.out.println("End Result : "+ result.wasSuccessful());
    }
}
