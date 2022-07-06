package Testng_D.Tests;

import Testng_D.base_steps.BaseSteps;
import Testng_D.Objects.LogsObjects;
import org.testng.annotations.Test;

public class GettingLogs extends BaseSteps {

    @Test
    public void navigation(){
        logs = new LogsObjects(driver);
        logs.ClickSystemMainMenu();
        logs.ClickLogsSubMenu();
    }
    @Test
    public void getting_logs_level(){
        logs.ClickLogLevel("warning");
        logs.ClickSearchButton();
    }
    @Test
    public void PrintLogsMessage() throws InterruptedException {
        logs.ClickNextButton();
    }


}
