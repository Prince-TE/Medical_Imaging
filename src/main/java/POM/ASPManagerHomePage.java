package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ASPManagerHomePage {
    @FindBy(xpath = "//a[@class=\"m-2.5 flex items-center gap-2 rounded-md bg-lightLogoColor text-logoColor p-2 font-medium hover:bg-lightLogoColor active\"]")
    private WebElement homeTab;
    @FindBy(xpath = "//div[contains(text(),\"Manage Patients\")]")
    private WebElement managePatientsTab;
    @FindBy(xpath = "//div[normalize-space()=\"Campaign Dashboard\"]")
    private WebElement campaignDashboardTab;
    @FindBy(xpath = "//div[normalize-space()=\"OBSP Dashboard\"]")
    private WebElement obspDashboardTab;
    @FindBy(xpath = "//div[normalize-space()=\"Help & Support\"]")
    private WebElement helpSupportLink;
    @FindBy(xpath = "//div[normalize-space()=\"Logout\"]")
    private WebElement logout;
    @FindBy(id="offTrackPatients")
    private WebElement totalOffTrackPatients;

    @FindBy(id = "atRiskPatients")
    private WebElement atRiskPatients;
    @FindBy(id = "onTrackPatients")
    private WebElement onTrackPatients;
    @FindBy(id = "managePatientsBtn")
    private WebElement managePatientsButtonUnderPatientStatus;
    @FindBy(xpath = "//body/div[@id=\"root\"]/div[contains(@class,\"flex flex-1 flex-col lg:flex-row\")]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div")
    private WebElement scheduledAppointments;
    @FindBy(xpath = "//body/div[@id=\"root\"]/div[contains(@class,\"flex flex-1 flex-col lg:flex-row\")]/div[2]/div[2]/div/div[3]/div[2]/div[2]/div[1]")
    private WebElement rescheduledAppointments;

    @FindBy(xpath = "//body/div[@id=\"root\"]/div[contains(@class,\"flex flex-1 flex-col lg:flex-row\")]/div[2]/div[2]/div/div[3]/div[2]/div[3]/div[1]")
    private WebElement patientsEligibleButNotScheduled;
    @FindBy(xpath = "//body/div[@id=\"root\"]/div[contains(@class,\"flex flex-1 flex-col lg:flex-row\")]/div[2]/div[2]/div/div[3]/div[2]/div[4]/div[1]")
    private WebElement calledAppointments;

    @FindBy(xpath = "//input[@placeholder=\"MMMM YYYY\"]")
    private WebElement calendarDateField;

    public WebElement getHomeTab() {
        return homeTab;
    }

    public WebElement getManagePatientsTab() {
        return managePatientsTab;
    }

    public WebElement getCampaignDashboardTab() {
        return campaignDashboardTab;
    }

    public WebElement getObspDashboardTab() {
        return obspDashboardTab;
    }

    public WebElement getHelpSupportLink() {
        return helpSupportLink;
    }

    public WebElement getLogout() {
        return logout;
    }

    public WebElement getTotalOffTrackPatients() {
        return totalOffTrackPatients;
    }

    public WebElement getAtRiskPatients() {
        return atRiskPatients;
    }

    public WebElement getOnTrackPatients() {
        return onTrackPatients;
    }

    public WebElement getManagePatientsButtonUnderPatientStatus() {
        return managePatientsButtonUnderPatientStatus;
    }

    public WebElement getScheduledAppointments() {
        return scheduledAppointments;
    }

    public WebElement getRescheduledAppointments() {
        return rescheduledAppointments;
    }

    public WebElement getPatientsEligibleButNotScheduled() {
        return patientsEligibleButNotScheduled;
    }

    public WebElement getCalledAppointments() {
        return calledAppointments;
    }

    public WebElement getCalendarDateField() {
        return calendarDateField;
    }
    public void setCalendarDateField(String calendarDateField) {
        getCalendarDateField().sendKeys(calendarDateField);
    }
    public ASPManagerHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
