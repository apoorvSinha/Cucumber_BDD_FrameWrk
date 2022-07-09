package Testng_D.Tests;

import Testng_D.base_steps.BaseSteps;
import Testng_D.Objects.LogsObjects;
import org.openqa.selenium.logging.Logs;
import org.testng.annotations.Test;

public class GettingLogs extends BaseSteps{

    @Test(priority = 1)
    public void navigation(){
        LogsObjects.ClickSystemMainMenu();
        LogsObjects.ClickLogsSubMenu();
    }
    @Test(priority = 2)
    public void getting_logs_level(){
        LogsObjects.ClickLogLevel("warning");
        LogsObjects.ClickSearchButton();
    }
    @Test(priority = 3)
    public void PrintLogsMessage() throws InterruptedException {
        LogsObjects.ClickNextButton();
    }


}
