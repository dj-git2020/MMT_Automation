package testUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.IListenersAnnotation;
import org.testng.annotations.ITestAnnotation;

public class ReExecuteListener implements IAnnotationTransformer
{

	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		//IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
		Class<? extends IRetryAnalyzer> analyzer = arg0.getRetryAnalyzerClass();
				if(analyzer!= null)
				{
					arg0.setRetryAnalyzer(ReExecute.class);
				}
	}

	@Override
	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);
	}

	@Override
	public void transform(IDataProviderAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, method);
	}

	@Override
	public void transform(IFactoryAnnotation annotation, Method method) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, method);
	}

	@Override
	public void transform(IListenersAnnotation annotation, Class<?> testClass) {
		// TODO Auto-generated method stub
		IAnnotationTransformer.super.transform(annotation, testClass);
	}
		
}