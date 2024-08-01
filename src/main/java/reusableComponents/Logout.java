package reusableComponents;

import genericUtility.BasePage;

public class Logout extends BasePage{
    public void confirmLogout(){
        asp.getLogout().click();
        asp.getConfirmLogout().click();
    }
    public void cancelLogout(){
        asp.getLogout().click();
        asp.getCancelLogout().click();
    }
    public void closeLogoutPopUp(){
        asp.getLogout().click();
        asp.getCloseLogoutPopUp().click();
    }
}
