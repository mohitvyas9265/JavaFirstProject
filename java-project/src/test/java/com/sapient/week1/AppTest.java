package com.sapient.week1;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	 @Before
    public void setup() {
        checks = new CheckEven();
    }
	
    
    @Test
    public void testCheckEven() {
        boolean result = checks.check(2);
        assertTrue(result==1);
    }
	@Test
    public void testCheckEven() {
        boolean result = checks.check(3);
        assertTrue(result==0);
    }
	@Test
    public void testCheckEven() {
        boolean result = checks.check(0);
        assertTrue(result==1);
    }
	@Test
    public void testCheckEven() {
        boolean result = checks.check(5);
        assertTrue(result==0);
    }
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
