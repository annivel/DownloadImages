package test;

import Helper.CloseHelper;
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
    public CloseHelper close;

    public App() {
        login = new LoginHelper();
        search = new SearchPageHelper();
        download = new Download();
        scrollHelper=new ScrollHelper();
        close= new CloseHelper();
    }

}
