package reusableComponents;

import genericUtility.BasePage;

public class DeletePatient extends BasePage{
    public void deletePatient()
    {
        login.superAdminLogin(home);
        superAdmin.clickPatients();
        superAdmin.clickSearch();
        superAdmin.setSearchField("elton.dcunha@revealhealthtech.com");
    }

}
