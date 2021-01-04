package utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import test.java.BaseTest;

import java.util.List;

public class ElementFetch {
    public WebElement getWebElement( String identifierType, String identifierValue) {
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElement(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElement(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElement(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElement(By.xpath(identifierValue));
            default:
                return null;
        }


    }


    public List<WebElement> getListWebElements(String identifierType, String identifierValue) {
        switch (identifierType){
            case "ID":
                return BaseTest.driver.findElements(By.id(identifierValue));
            case "CSS":
                return BaseTest.driver.findElements(By.cssSelector(identifierValue));
            case "TAGNAME":
                return BaseTest.driver.findElements(By.tagName(identifierValue));
            case "XPATH":
                return BaseTest.driver.findElements(By.xpath(identifierValue));
            default:
                return null;
        }


    }
}
