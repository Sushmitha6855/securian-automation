package com.securian.test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.securian.pageobjects.RetirementCalculatorPage;
import com.securian.utilities.GlobalParams;

public class RetirementCalculatorTest extends BaseTest{
	
	RetirementCalculatorPage retirementCalculatorPage;
	
	@BeforeClass
	public void setup() {
		retirementCalculatorPage = new RetirementCalculatorPage(driver);
	}
	
	//@Test
	public void testRetirementCalculatorWithRequiredFields() throws InterruptedException {
		driver.get(GlobalParams.getEnvProperties().get("application.url"));
		retirementCalculatorPage.enterCurrentAge("40");
		retirementCalculatorPage.enterRetirementAge("68");
		retirementCalculatorPage.enterCurrentAnnualIncome("100000");
		retirementCalculatorPage.enterCurrentTotalSavings("500000");
		retirementCalculatorPage.enterCurrentAnnualSavings("10");
		retirementCalculatorPage.enterSavingsIncreaseRate("1");
		retirementCalculatorPage.selectSocialBenefits("Yes");
		retirementCalculatorPage.selectMaritalStatus("Married");
		retirementCalculatorPage.calculate();
		Thread.sleep(10000);
		Assert.assertTrue(retirementCalculatorPage.isResultsDisplayed(), "Results is not displayed");
	}
	
	@Test
	public void testAdditonalSocialSecurityFieldsOnRetirementCalculator() throws InterruptedException {
		driver.get(GlobalParams.getEnvProperties().get("application.url"));
		retirementCalculatorPage.enterCurrentAge("40");
		retirementCalculatorPage.enterRetirementAge("68");
		retirementCalculatorPage.enterCurrentAnnualIncome("100000");
		retirementCalculatorPage.enterCurrentTotalSavings("500000");
		retirementCalculatorPage.enterCurrentAnnualSavings("10");
		retirementCalculatorPage.enterSavingsIncreaseRate("1");
		retirementCalculatorPage.selectSocialBenefits("Yes");
		Assert.assertTrue(retirementCalculatorPage.isMaritalStatusDisplayed(), "Marital Status is not displayed");
		Assert.assertTrue(retirementCalculatorPage.isSocialSecurityOverrideAmountDisplayed(), "Social Security Override Amount is not displayed");
		retirementCalculatorPage.selectSocialBenefits("No");
		Assert.assertFalse(retirementCalculatorPage.isMaritalStatusDisplayed(), "Marital Status is displayed");
		Assert.assertFalse(retirementCalculatorPage.isSocialSecurityOverrideAmountDisplayed(), "Social Security Override Amount is displayed");
		Assert.assertTrue(retirementCalculatorPage.isResultsDisplayed(), "Results is not displayed");
	}
	
	//@Test
	public void testRetirementCalculatorWithAllFields() throws InterruptedException {
		driver.get(GlobalParams.getEnvProperties().get("application.url"));
		retirementCalculatorPage.enterCurrentAge("40");
		retirementCalculatorPage.enterRetirementAge("68");
		retirementCalculatorPage.enterCurrentAnnualIncome("100000");
		retirementCalculatorPage.enterSpouseIncome("75000");
		retirementCalculatorPage.enterCurrentTotalSavings("500000");
		retirementCalculatorPage.enterCurrentAnnualSavings("10");
		retirementCalculatorPage.enterSavingsIncreaseRate("1");
		retirementCalculatorPage.selectSocialBenefits("Yes");
		retirementCalculatorPage.selectMaritalStatus("Married");
		retirementCalculatorPage.enterSocialSecurityOverrideAmount("4000");
		retirementCalculatorPage.clickAdjustDefaultValuesLink();
		retirementCalculatorPage.enterAdditionalIncome("500");
		retirementCalculatorPage.enterRetirementDuration("20");
		retirementCalculatorPage.selectInflationOption("Yes");
		retirementCalculatorPage.enterRetirementAnnualIncome("75");
		retirementCalculatorPage.enterPreRetirementROI("8");
		retirementCalculatorPage.enterPostRetirementROI("5");
		retirementCalculatorPage.saveChanges();
		retirementCalculatorPage.calculate();
		Assert.assertTrue(retirementCalculatorPage.isResultsDisplayed(), "Results is not displayed");
	}
}