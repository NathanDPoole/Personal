package com.revature.webdriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.revature.pom.CurriculaPageTrainer;
import com.revature.pom.CurriculaPageVP;
import com.revature.pom.LoginPage;
import com.revature.pom.NavBar;
import com.revature.pom.SettingsPage;

public class TestingActions {
	static WebDriver wd = null;
	static LoginPage login = null;
	static NavBar nb = null;
	static SettingsPage sp = null;
	static CurriculaPageTrainer cpt = null;
	
	public static void main(String[] args) {
		openAppChrome();
		loginVP();
		goToSettings();
		checkSettingsElement();
		logout();
		closeApp();
	}

	static void openAppChrome() {
		File f1 = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", f1.getAbsolutePath());
		wd = new ChromeDriver();
		wd.get("https://dev.assignforce.revaturelabs.com");
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	static void openAppFirefox() {
		File f1 = new File("src/main/resources/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", f1.getAbsolutePath());
		wd = new FirefoxDriver();
		wd.get("https://dev.assignforce.revaturelabs.com");
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	static void loginVP() {
		LoginPage login = new LoginPage(wd);
		login.username.sendKeys("test.vpoftech@revature.com.int1");
		login.password.sendKeys("yuvi1712");
		login.Login.click();
		nb = new NavBar(wd);
	}

	static void loginTrainer() {
		login = new LoginPage(wd);
		login.username.sendKeys("test.trainer@revature.com.int1");
		login.password.sendKeys("trainer123");
		login.Login.click();
	}

	static void logout() {
		nb.logout.click();
	}

	static void closeApp() {
		wd.quit();
	}
	
	static void goToSettings() {
		nb.settings.click();
		sp = new SettingsPage(wd);
	}
	
	static void checkSettingsElement() {
		sp.timelineTrainersPerPage.clear();
		sp.timelineTrainersPerPage.sendKeys("15");
		
		sp.reportsOutgoingGrads.clear();
		sp.reportsOutgoingGrads.sendKeys("15");
		
		sp.reportsCandidatesIncoming.clear();
		sp.reportsCandidatesIncoming.sendKeys("15");
		
		sp.defaultBatchLocation.sendKeys("Revature HQ");
		sp.defaultBatchLocation.click();
		
		sp.defaultBatchBuilding.sendKeys("Campus");
		sp.defaultBatchBuilding.click();
		
		sp.minimumBatchSize.clear();
		sp.minimumBatchSize.sendKeys("15");
		
		sp.maximumBatchSize.clear();
		sp.maximumBatchSize.sendKeys("15");
		
		sp.defaultBatchLengh.clear();
		sp.defaultBatchLengh.sendKeys("15");
		
		sp.minimumDayBetweenTrainerBatches.clear();
		sp.minimumDayBetweenTrainerBatches.sendKeys("15");
		
		sp.resetBtn.click();
		sp.saveBtn.click();

		shortPause();
	}
	
	static void goToCurricula() {
		nb.curriculum.click();
		cpt = new CurriculaPageTrainer(wd);
	}
	
	static void checkCurriculaTrainer() {
		cpt.curriculaTogleContent.click();
		cpt.focusesToggleContent.click();
		shortPause();
	}
	
	static void checkCurriculaVp() {
		CurriculaPageVP.addNewCurriculum(wd).click();
		CurriculaPageVP.coreCurriculaToggleContent(wd).click();
		CurriculaPageVP.editCurriculaBtn(wd).click();
		CurriculaPageVP.removeCoreBtn(wd).click();
		
		CurriculaPageVP.addNewFocus(wd).click();
		CurriculaPageVP.focusesToggleContent(wd).click();
		CurriculaPageVP.editFocusBtn(wd).click();
		CurriculaPageVP.removeFocusBtn(wd).click();
		
		CurriculaPageVP.skillsToggleContent(wd).click();
		CurriculaPageVP.skillNameText(wd).clear();
		CurriculaPageVP.skillNameText(wd).sendKeys("Ballin");
		CurriculaPageVP.createBtn(wd).click();
	}
	
	static void shortPause() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
