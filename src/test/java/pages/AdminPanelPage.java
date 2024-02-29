package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPanelPage extends BasePage {

    @FindBy (xpath = "(//*[@stroke='currentColor'])[5]")
    public WebElement adminPanelIkon;
}
