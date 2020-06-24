package test;

import Helper.LoginHelper;
import Helper.ScrollHelper;
import Helper.SearchPageHelper;
import tools.Download;
import tools.Scroll;

public class App {
    public LoginHelper login;
    public SearchPageHelper search;
    public Download download;
    public ScrollHelper scrollHelper;

    public App() {
        login = new LoginHelper();
        search = new SearchPageHelper();
        download = new Download();
        scrollHelper=new ScrollHelper();
    }

}
