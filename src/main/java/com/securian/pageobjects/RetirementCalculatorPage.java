package com.securian.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetirementCalculatorPage {
	
	WebDriver driver = null;
	public RetirementCalculatorPage(WebDriver driver) {
		this.driver = driver;
	}

	By currentAgeTextbox = By.xpath("//input[@id='current-age']");
	By retirementAgeTextbox = By.xpath("//input[@id='retirement-age']");
	By currentAnnualIncomeTextbox = By.xpath("//input[@id='current-income']");
	By spouseIncomeTextbox = By.xpath("//input[@id='spouse-income']");
	By currentTotalSavingsTextbox = By.xpath("//input[@id='current-total-savings']");
	By currentAnnualSavingsTextbox = By.xpath("//input[@id='current-annual-savings']");
	By savingsIncreaseRateTextbox = By.xpath("//input[@id='savings-increase-rate']");
	By socialBenefitsYesRadioButton = By.xpath("//input[@id='yes-social-benefits']/following-sibling::label");
	By socialBenefitsNoRadioButton = By.xpath("//input[@id='no-social-benefits']/following-sibling::label");
	By singleMaritalStatusRadioButton = By.xpath("//input[@id='single']/following-sibling::label");
	By marriedMaritalStatusRadioButton = By.xpath("//input[@id='married']/following-sibling::label");
	By socialSecurityOverrideAmountTextbox = By.xpath("//input[@id='social-security-override']");
	By adjustDefaultValuesLink = By.xpath("//a[@role='button' and text()='Adjust default values']");
	By calculateButton = By.xpath("//button[@data-tag-id='submit']");
	By results = By.xpath("//div[@id='calculator-results-container']/h3[text()='Results']");
	
	By additionalIncome = By.xpath("//input[@id='additional-income']");
	By includeInflation = By.xpath("//input[@id='include-inflation']/following-sibling::label");
	By excludeInflation = By.xpath("//input[@id='exclude-inflation']/following-sibling::label");
	By retirementDuration = By.xpath("//input[@id='retirement-duration']");
	By retirementAnnualIncome = By.xpath("//input[@id='retirement-annual-income']");
	By preRetirementROI = By.xpath("//input[@id='pre-retirement-roi']");
	By postRetirementROI = By.xpath("//input[@id='post-retirement-roi']");
	By saveChangesButton = By.xpath("//button[text()='Save changes']");
	
	/**
	 * This method is used to enter current age in the Current Age text box on Retirement calculator page
	 * 
	 * @param currentAge
	 */
	public void enterCurrentAge(String currentAge) {
		driver.findElement(currentAgeTextbox).click();
		driver.findElement(currentAgeTextbox).sendKeys(currentAge);
	}
	
	/**
	 * This method is used to enter Retirement Age in the Retirement Age text box on Retirement calculator page
	 * 
	 * @param retirementAge
	 */
	public void enterRetirementAge(String retirementAge) {
		driver.findElement(retirementAgeTextbox).click();
		driver.findElement(retirementAgeTextbox).sendKeys(retirementAge);
	}
	
	/**
	 * This method is used to enter current annual income in the Current Annual Income text box on Retirement calculator page
	 * 
	 * @param currentAnnualIncome
	 */
	public void enterCurrentAnnualIncome(String currentAnnualIncome) {
		driver.findElement(currentAnnualIncomeTextbox).click();
		driver.findElement(currentAnnualIncomeTextbox).sendKeys(currentAnnualIncome);
	}
	
	/**
	 * This method is used to enter spouse income in the Spouse Income text box on Retirement calculator page
	 * 
	 * @param spouseIncome
	 */
	public void enterSpouseIncome(String spouseIncome) {
		driver.findElement(spouseIncomeTextbox).click();
		driver.findElement(spouseIncomeTextbox).sendKeys(spouseIncome);
	}
	
	/**
	 * This method is used to enter current total savings in the Current Total Savings text box on Retirement calculator page
	 * 
	 * @param totalSavings
	 */
	public void enterCurrentTotalSavings(String currentTotalSavings) {
		driver.findElement(currentTotalSavingsTextbox).click();
		driver.findElement(currentTotalSavingsTextbox).sendKeys(currentTotalSavings);
	}
	
	/**
	 * This method is used to enter current annual savings in the Current Annual Savings text box on Retirement calculator page
	 * 
	 * @param currentAnnualSavings
	 */
	public void enterCurrentAnnualSavings(String currentAnnualSavings) {
		driver.findElement(currentAnnualSavingsTextbox).click();
		driver.findElement(currentAnnualSavingsTextbox).sendKeys(currentAnnualSavings);
	}
	
	/**
	 * This method is used to enter savings increase rate in the Savings Increase Rate text box on Retirement calculator page
	 * 
	 * @param savingsIncreaseRate
	 */
	public void enterSavingsIncreaseRate(String savingsIncreaseRate) {
		driver.findElement(savingsIncreaseRateTextbox).click();
		driver.findElement(savingsIncreaseRateTextbox).sendKeys(savingsIncreaseRate);
	}
	
	/**
	 * This method is used to select Social Benefit option on Retirement calculator page
	 * 
	 * @param socialBenefitOption
	 */
	public void selectSocialBenefits(String socialBenefitOption) {
		if(socialBenefitOption.equalsIgnoreCase("Yes")) {
			driver.findElement(socialBenefitsYesRadioButton).click();
		} else {
			driver.findElement(socialBenefitsNoRadioButton).click();
		}
		
	}
	
	/**
	 * This method is used to select Marital Status on Retirement calculator page
	 * 
	 * @param option
	 */
	public void selectMaritalStatus(String option) {
		if(option.equalsIgnoreCase("Single")) {
			driver.findElement(singleMaritalStatusRadioButton).click();
		} else {
			driver.findElement(marriedMaritalStatusRadioButton).click();
		}
		
	}
	
	/**
	 * This method is used to enter social security override amount in the Social Security Override Amount text box on Retirement calculator page
	 * 
	 * @param socialSecurityOverrideAmount
	 */
	public void enterSocialSecurityOverrideAmount(String socialSecurityOverrideAmount) {
		driver.findElement(socialSecurityOverrideAmountTextbox).click();
		driver.findElement(socialSecurityOverrideAmountTextbox).sendKeys(socialSecurityOverrideAmount);
	}
	
	/**
	 * This method is used to click on Adjust Default Values Link on Retirement calculator page
	 * 
	 */
	public void clickAdjustDefaultValuesLink() {
		driver.findElement(adjustDefaultValuesLink).click();
	}
	
	/**
	 * This method is used to click on Calculate button on Retirement calculator page
	 * 
	 */
	public void calculate() {
		driver.findElement(calculateButton).click();
	}
	
	/**
	 * This method is used to enter Additional Income amount in the Additional Income text box on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param additionalIncomeAmount
	 */
	public void enterAdditionalIncome(String additionalIncomeAmount) {
		driver.findElement(additionalIncome).click();
		driver.findElement(additionalIncome).sendKeys(additionalIncomeAmount);
	}
	
	/**
	 * This method is used to select Inflation option on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param option
	 */
	public void selectInflationOption(String option) {
		if(option.equalsIgnoreCase("Yes")) {
			driver.findElement(includeInflation).click();
		} else {
			driver.findElement(excludeInflation).click();
		}
		
	}
	
	/**
	 * This method is used to enter Retirement Duration in the Retirement Duration text box on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param duration
	 */
	public void enterRetirementDuration(String duration) {
		driver.findElement(retirementDuration).click();
		driver.findElement(retirementDuration).sendKeys(duration);
	}
	
	/**
	 * This method is used to enter Retirement Annual Income in the Retirement Annual Income text box on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param annualIncome
	 */
	public void enterRetirementAnnualIncome(String annualIncome) {
		driver.findElement(retirementAnnualIncome).click();
		driver.findElement(retirementAnnualIncome).sendKeys(annualIncome);
	}
	
	/**
	 * This method is used to enter pre Retirement ROI in the Pre Retirement ROI text box on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param preRetirementRate
	 */
	public void enterPreRetirementROI(String preRetirementRate) {
		driver.findElement(preRetirementROI).click();
		driver.findElement(preRetirementROI).sendKeys(preRetirementRate);
	}
	
	/**
	 * This method is used to enter post Retirement ROI in the Post Retirement ROI text box on Default calculator values overlay on Retirement calculator page
	 * 
	 * @param postRetirementRate
	 */
	public void enterPostRetirementROI(String postRetirementRate) {
		driver.findElement(postRetirementROI).click();
		driver.findElement(postRetirementROI).sendKeys(postRetirementRate);
	}
	
	/**
	 * This method is used to click on Save Changes button on Default calculator values overlay on Retirement calculator page
	 * 
	 */
	public void saveChanges() {
		driver.findElement(saveChangesButton).click();
	}
	
	public boolean isResultsDisplayed() {
		return driver.findElement(results).isDisplayed();
	}
	
	public boolean isMaritalStatusDisplayed() {
		return driver.findElement(marriedMaritalStatusRadioButton).isDisplayed();
	}
	
	public boolean isSocialSecurityOverrideAmountDisplayed() {
		return driver.findElement(socialSecurityOverrideAmountTextbox).isDisplayed();
	}
}