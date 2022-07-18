package Testng_D.Tests;

import Testng_D.base_steps.BaseSteps;
import Testng_D.Objects.LogsObjects;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.Test;

public class GettingLogs extends BaseSteps{

    @Test(priority = 2)
    public void navigation(){
        logsobjects.ClickSystemMainMenu();
        logsobjects.ClickLogsSubMenu();
    }
    @Test(priority = 3)
    public void getting_logs_level(){
        logsobjects.ClickLogLevel("warning");
        logsobjects.ClickSearchButton();
    }
    @Test(priority = 4)
    public void PrintLogsMessage() throws InterruptedException {
        logsobjects.ClickNextButton();
    }


}
