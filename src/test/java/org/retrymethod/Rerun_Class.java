package org.retrymethod;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.lang3.ObjectUtils.Null;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Rerun_Class implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		IRetryAnalyzer ra = annotation.getRetryAnalyzer();

		if (ra == null) {

			annotation.setRetryAnalyzer(Failed.class);
		}

	}

}
