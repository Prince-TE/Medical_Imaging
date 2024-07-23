package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuperAdminHomePage {
    public SuperAdminHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "asp-managerBtn")
    private WebElement aspManagersTab;
    @FindBy(id = "asp-doctorBtn")
    private WebElement providersTab;
    @FindBy(id = "asp-patientBtn")
    private WebElement patientsTab;
    @FindBy(id = "searchInput")
    private WebElement searchField;
    @FindBy(xpath = "//div[@class='cursor-pointer']")
    private WebElement filter;
    @FindBy(id = "addNewUserBtn")
    private WebElement addNewUserButton;

    public WebElement getAspManagersTab(){return aspManagersTab;}
    public WebElement getProvidersTab(){return providersTab;}
    public WebElement getPatientsTab() {
        return patientsTab;
    }
    public WebElement getSearchField() {return searchField;}
    public WebElement getFilter() {
        return filter;
    }
    public WebElement getAddNewUserButton() {
        return addNewUserButton;
    }

    public void setSearchField(String searchField){
        getSearchField().sendKeys(searchField);
    }

    public void clickASPManagers(){
        aspManagersTab.click();
    }
    public void clickProviders(){
        providersTab.click();
    }
    public void clickPatients(){
        patientsTab.click();
    }
    public void clickSearch(){
        searchField.click();
    }
    public void clickFilter(){
        filter.click();
    }
    public void clickAddNewUser(){
        addNewUserButton.click();
    }


}
