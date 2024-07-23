package reusableComponents;

import genericUtility.BasePage;

public class DeletePatient extends BasePage{
Login logIn = new Login();
    public void deletePatient()
    {
        logIn.superAdminLogin();
        superAdmin.clickPatients();
        superAdmin.clickSearch();
        superAdmin.setSearchField("elton.dcunha@revealhealthtech.com");
    }

}
