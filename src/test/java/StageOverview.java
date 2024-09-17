import genericUtility.BasePage;
import genericUtility.GetCurrentDate;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import testData.PatientEnrollment;

import java.time.LocalDate;

public class StageOverview extends BasePage {
    @Test(dataProvider = "patientInfo & contactInformation", dataProviderClass = PatientEnrollment.class)
    public void completingStageOverviewForPatient(String firstName,String lastName,String ohip,
                                                  String mrn,String email,String mobile,String createPass, String confirmPass,String otp) throws InterruptedException {
        login.aspManagerLogin(home);
        asp.getManagePatientsTab().click();
        asp.getOnTrackPatients().click();
        superAdmin.setSearchField(ohip);
        Thread.sleep(5000);
        asp.getPatientFirstRow().click();
        asp.clickEditDate();
        Thread.sleep(2000);
        asp.clickOnCalendarIcon();
        Thread.sleep(2000);
        asp.getCalendarDateDropdown().click();

        LocalDate currentDate = GetCurrentDate.getCurrentDate();
        // Extract year, month, and day
        int year = GetCurrentDate.getCurrentYear(currentDate);
        String yearString = String.valueOf(year);
        String month = GetCurrentDate.getCurrentMonth(currentDate);
        int day = GetCurrentDate.getCurrentDay(currentDate);
        String dayString = String.valueOf(day);

        for (WebElement months : asp.getMonth()){
            String monthValue = months.getText();
            if (monthValue.equalsIgnoreCase(month)){
                months.click();
                for (WebElement years: asp.getYear()) {
                    String yearValue = years.getText();
                    if (yearValue.equalsIgnoreCase(yearString)){
                        years.click();
                        for (WebElement days: asp.getDay()){
                            String dayValue = days.getText();
                            if (dayValue.equalsIgnoreCase(dayString)){
                                days.click();
                                break;
                            }
                        }
                        break;
                    }
                }break;
            }
        }
        System.out.println(asp.getMammogramDate());
        //Assert.assertEquals(asp.getMammogramDate(),);

    }
}
