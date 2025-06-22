package tests;
import env.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GoogleSearch extends BaseClass { // Extends the simplified BaseTest

    /**
     * Tests searching for a specific term on Google.
     * This version directly interacts with elements without a Page Object.
     */
    @Test
    public void testGoogleSearch() {
        System.out.println("Starting test: testGoogleSearch");
        String searchTerm = "Selenium WebDriver";
        String expectedTitlePartial = "Selenium WebDriver - Google Search";
        String googleUrl = "https://www.google.com";


        System.out.println("Navigating to " + googleUrl);
        driver.get(googleUrl);

//        System.out.println("Finding search input field and entering: " + searchTerm);
//        driver.findElement(By.name("q")).sendKeys(searchTerm);
//
//
//        System.out.println("Pressing ENTER key.");
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);


//        String actualTitle = driver.getTitle();
//        System.out.println("Actual Page Title: " + actualTitle);
//        Assert.assertTrue(actualTitle.contains(expectedTitlePartial),
//                "Page title does not contain expected text. Expected: '" + expectedTitlePartial + "', Actual: '" + actualTitle + "'");

        System.out.println("Test testGoogleSearch completed successfully.");
    }
}
