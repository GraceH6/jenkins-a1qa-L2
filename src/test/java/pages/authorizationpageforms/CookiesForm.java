package pages.authorizationpageforms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class CookiesForm extends Form {
    private final IButton acceptCookiesButton = getElementFactory().getButton(
            By.xpath("//button[contains(@class, 'button--transparent')]"), "Accept cookies button");

    public CookiesForm() {
        super(By.xpath("//div[contains(@class, 'cookies')]"), "Cookies banner");
    }

    public void acceptCookies() {
        acceptCookiesButton.click();
    }
}
