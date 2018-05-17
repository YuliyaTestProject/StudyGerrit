package Portal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopMenuPage extends BasePage{

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/catalog']")
    private WebElement catalog;

}
