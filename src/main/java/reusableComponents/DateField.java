package reusableComponents;

import genericUtility.BasePage;

public class DateField extends BasePage {

        public void clearDateField() throws InterruptedException {
            webDriverUtility.doubleclick(driver,asp.getCalendarDateField());
            webDriverUtility.backspace(driver, asp.getCalendarDateField());
        }
    }
