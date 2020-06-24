package test;

import accountInfo.AccountInfo;
import accountInfo.AccountInfoFactory;
import accountInfo.ProfileInfo;
import accountInfo.ProfileInfoFactory;

public class Base {
    protected App app = new App();
    protected AccountInfo accountInfo = AccountInfoFactory.getValidAccount();
    protected ProfileInfo profileInfo= ProfileInfoFactory.profileInfo();


}
