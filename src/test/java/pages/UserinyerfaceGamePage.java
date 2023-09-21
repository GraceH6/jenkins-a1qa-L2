package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import pages.authorizationpageforms.CookiesForm;

public class UserinyerfaceGamePage extends Form {
    private CookiesForm cookiesForm;

    public UserinyerfaceGamePage() {
        super(By.xpath("//div[contains(@class, 'logo__icon')]"), "Userinyerface logo icon");
        cookiesForm = new CookiesForm();
    }

    public CookiesForm getCookiesForm() {
        return cookiesForm;
    }
}
