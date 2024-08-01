package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PatientDashboard {
    @FindBy(id = "changePreferenceBtn")
    private WebElement changeButton;
    @FindBy(xpath = "//div[@class=\"rounded-lg MuiBox-root css-5d0srb\"]/div[2]/div")
    private WebElement communicationPreferenceDropDown;
    @FindBy(xpath = "//div[@class=\"rounded-lg MuiBox-root css-5d0srb\"]/div[2]/ul/li[1]")
    private WebElement email;
    @FindBy(xpath = "//div[@class=\"rounded-lg MuiBox-root css-5d0srb\"]/div[2]/ul/li[2]")
    private WebElement sms;
    @FindBy(id = "preferenceCancelBtn")
    private WebElement preferenceCancelButton;
    @FindBy(id = "savePreferenceBtn")
    private WebElement preferenceSaveButton;
    @FindBy(id = "preferenceCloseBtn")
    private WebElement preferenceCloseButton;
    @FindBy(id = "openEditDetailsModalBtn")
    private WebElement editDetails;

    @FindBy(id = "patientPhoneInput")
    private WebElement patientPhoneNumber;

    @FindBy(id = "patientMobileInput")
    private WebElement patientAlternatePhone;
    @FindBy(id = "patientAddressInput")
    private WebElement patientAddress;
    @FindBy(id = "cancelBtn")
    private WebElement cancelButton;
    @FindBy(id = "saveBtn")
    private WebElement saveButton;


    public WebElement getChangeButton() {
        return changeButton;
    }

    public WebElement getCommunicationPreferenceDropDown() {
        return communicationPreferenceDropDown;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSms() {
        return sms;
    }

    public WebElement getPreferenceCancelButton() {
        return preferenceCancelButton;
    }

    public WebElement getPreferenceSaveButton() {
        return preferenceSaveButton;
    }

    public WebElement getPreferenceCloseButton() {
        return preferenceCloseButton;
    }
    public WebElement getEditDetails() {
        return editDetails;
    }

    public WebElement getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public WebElement getPatientAlternatePhone() {
        return patientAlternatePhone;
    }

    public WebElement getPatientAddress() {
        return patientAddress;
    }

    public WebElement getCancelButton() {
        return cancelButton;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }
    public void selectEmail(){
        getChangeButton().click();
        getEmail().click();
    }
    public void selectSMS(){
        getChangeButton().click();
        getSms().click();
    }
    public void savePreference(){
        getPreferenceSaveButton().click();
    }
    public void cancelPreference(){
        getPreferenceCancelButton().click();
    }
    public void closePreference(){
        getPreferenceCloseButton().click();
    }
    public void setPatientPhoneNumber(String patientPhoneNumber) {
        getPatientPhoneNumber().sendKeys(patientPhoneNumber);
    }

    public void setPatientAlternatePhone(String patientAlternatePhone) {
        getPatientAlternatePhone().sendKeys(patientAlternatePhone);
    }

    public void setPatientAddress(String patientAddress) {
        getPatientAlternatePhone().sendKeys(patientAddress);
    }
    public void saveUserDetails(){
        getSaveButton().click();
    }
    public void cancelUserDetails(){
        getCancelButton().click();
    }
}
