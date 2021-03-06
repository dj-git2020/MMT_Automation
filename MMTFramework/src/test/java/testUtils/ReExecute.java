package testUtils;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class ReExecute implements IRetryAnalyzer {
 
  private int retryCount = 0;
  private static final int maxRetryCount = 2;
 
  @Override
  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
      retryCount++;
      
      System.out.println("Re-Execute MethodName" + result.getMethod().getMethodName());
      return true;
    }
    return false;
  }
}
