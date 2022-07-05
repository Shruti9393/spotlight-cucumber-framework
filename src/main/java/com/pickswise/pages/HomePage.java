package com.pickswise.pages;


import com.pickswise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shruti
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='truste-consent-button']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//div[@class='Select_select__24c5n']")
    WebElement allSportsButtonClick;

    @CacheLookup
    @FindBy(xpath = "//select[@class='Select_select__24c5n']")
    WebElement kboFromDropdown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='EventShortcutCarouselCard_teamNames__1Vvw8']")
    List<WebElement> kboNames;


    //click on accpet cookies
    public void clickOnCookies() {
        clickOnElement(acceptCookies);
        log.info("Clicking on start accept cookies" + acceptCookies.toString());
    }

    //    click on All sports button
    public void clickOnSportsButton() {
        clickOnElement(allSportsButtonClick);
        log.info("Clicking on allSports Button Button" + allSportsButtonClick.toString());
    }

    //select sport from droppdown
    public void selectkbofromdroppdown(String text) {
        selectByVisibleTextFromDropDown(kboFromDropdown, text);
        log.info("Selecting kbo from droppdown" + text + " from dropdown " + kboFromDropdown.toString());
    }

    public String selectsport() {
        for (WebElement data : kboNames) {
            // System.out.println(data.getText());
        }
        int count = kboNames.size() / 2;//Total  size = 6  so devide by 2
        String str = kboNames.get(0).getText() + kboNames.get(1).getText();
        return str;
    }


}




