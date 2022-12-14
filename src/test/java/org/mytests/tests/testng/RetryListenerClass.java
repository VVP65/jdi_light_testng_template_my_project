package org.mytests.tests.testng;

import org.mytests.tests.testng.RetryFailedTestCases;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListenerClass implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor, Method testMethod)	{
        Class<?> retry = testAnnotation.getRetryAnalyzerClass();
        if (retry == null)	{
            testAnnotation.setRetryAnalyzer(RetryFailedTestCases.class);
        }

    }
}
