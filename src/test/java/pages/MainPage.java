package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ILink mainPageNextPageLink = getElementFactory().getLink(By.xpath(
            "//a[contains(@class, 'start__link')]"), "Link to the next page");

    public MainPage() {
        super(By.xpath("//button[contains(@class, 'start__button')]"), "Start button");
    }

    public void clickOnNextPageLink() {
        mainPageNextPageLink.click();
    }
}
