package test;

import org.testng.annotations.Test;


public class MainSteps extends Base {

    @Test
    public void testMain() {
        app.login.setLogin(accountInfo);
        app.search.searchProfile(profileInfo);
        app.scrollHelper.scroll();
        app.download.searchAndSave();

    }
}

