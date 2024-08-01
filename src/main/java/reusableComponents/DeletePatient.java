package reusableComponents;

import genericUtility.BasePage;

public class DeletePatient extends BasePage{
    public void deletePatient(String name)
    {
        login.superAdminLogin(home);
        superAdmin.clickPatients();
        superAdmin.clickSearch();
        superAdmin.setSearchField(name);
    }

}
