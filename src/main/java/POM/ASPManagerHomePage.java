package POM;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    @FindBy(id = "LogoutModalBtn")
    private WebElement confirmLogout;

    @FindBy(id = "CancelBtn")
    private WebElement cancelLogout;
    @FindBy(id = "closeModal")
    private WebElement closeLogoutPopUp;
    @FindBy(id="offTrackPatients")
    private WebElement totalOffTrackPatients;

    @FindBy(id = "atRiskPatients")
    private WebElement atRiskPatients;
    @FindBy(id = "onTrackBtn")
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

    @FindBy(id = "notificationIcon")
    private WebElement notificationIcon;
    @FindBy(xpath = "//div[@class='text-sm font-normal text-textSecondary']")
    private WebElement patientStatusDistributionDropdown;
    @FindBy(xpath = "//ul[@id=\"hoverMenuItemsParent\"]/li[1]")
    private WebElement sevenDays;

    @FindBy(xpath = "//ul[@id=\"hoverMenuItemsParent\"]/li[2]")
    private WebElement monthly;
    @FindBy(xpath = "//ul[@id=\"hoverMenuItemsParent\"]/li[3]")
    private WebElement quarterly;
    @FindBy(xpath = "//ul[@id=\"hoverMenuItemsParent\"]/li[4]")
    private WebElement yearly;
    @FindBy(id = "dashboardRow0")
    private WebElement patientFirstRow;

    ///////////////////////////////////STAGE OVERVIEW////////////////////////////////////////////////
    @FindBy(id = "scheduleMammogramBtn")
    private WebElement scheduleMammogramButton;
    public void clickScheduleMammogramButton(){
        scheduleMammogramButton.click();
    }
    @FindBy(id = "editDateBtn")
    private WebElement editDateButton;
    public void clickEditDate(){
        editDateButton.click();
    }
    @FindBy(xpath = "//button[@type='button']//*[name()='svg']")
    private WebElement calendarIcon;
    public void clickOnCalendarIcon(){
        calendarIcon.click();
    }
    @Getter
    @FindBy(xpath = "//div[@class=\"MuiPickersFadeTransitionGroup-root css-1bx5ylf\"]")
    private WebElement calendarDateDropdown;
    @FindBy(xpath = "//div[@class=\"MuiPickersYear-root css-1p8hrm8\"]/button")
    List<WebElement> year;
    public List<WebElement> getYear(){
        return year;
    }
    @FindBy(xpath = "//div[@class=\"MuiPickersMonth-root css-1t72fib\"]")
    List<WebElement> month;
    public List<WebElement> getMonth(){
        return month;
    }
    @FindBy(xpath = "//div[@role=\"rowgroup\"]/div/button")
     List<WebElement> day;
    public List<WebElement> getDay(){
        return day;
    }
    @FindBy(xpath = "//div[@class=\"ml-auto mt-auto text-base font-semibold\"]/div[@xpath=\"1\"]")
    private WebElement mammogramDate;

    public String getMammogramDate() {
        return mammogramDate.getText();
    }

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
    public WebElement getNotificationIcon() {
        return notificationIcon;
    }
    public WebElement getPatientStatusDistributionDropdown() {
        return patientStatusDistributionDropdown;
    }

    public WebElement getSevenDays() {
        return sevenDays;
    }

    public WebElement getMonthly() {
        return monthly;
    }

    public WebElement getQuarterly() {
        return quarterly;
    }

    public WebElement getYearly() {
        return yearly;
    }
    public WebElement getConfirmLogout() {
        return confirmLogout;
    }

    public WebElement getCancelLogout() {
        return cancelLogout;
    }

    public WebElement getCloseLogoutPopUp() {
        return closeLogoutPopUp;
    }
    public WebElement getPatientFirstRow(){return patientFirstRow;}
    public void setCalendarDateField(String calendarDateField) {
        getCalendarDateField().sendKeys(calendarDateField);
    }
    public void clickNotificationIcon(){
        getNotificationIcon().click();
    }
    public ASPManagerHomePage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
}
