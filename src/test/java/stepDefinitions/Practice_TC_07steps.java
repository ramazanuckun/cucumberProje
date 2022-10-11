package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PracticeTC07Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class Practice_TC_07steps {
    PracticeTC07Page practiceTC07Page = new PracticeTC07Page();




    @Then("Test Case buttonu na tıklayın")
    public void test_case_buttonu_na_tıklayın() {
        practiceTC07Page.testCaseLink.click();
    }

    @Then("İlgili sayfanın ekran görüntüsünü alın")
    public void ilgili_sayfanın_ekran_görüntüsünü_alın() {
        try {
            ReusableMethods.getScreenshot("TestCase07 Page");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("Tarayıcıyı baslatarak {string} url'sine gidin")
    public void tarayıcıyıBaslatarakUrlSineGidin(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }

    @Then("Ana sayfanın basarıyla görünür oldugunu dogrulayın")
    public void anaSayfanınBasarıylaGörünürOldugunuDogrulayın() {
        String homeUrl ="https://automationexercise.com/";
        Assert.assertEquals("home url eşit değil",homeUrl,Driver.getDriver().getCurrentUrl());
    }

    @Then("Kullanıcının test case sayfasına basarıyla yönlendirildigini dogrulayın")
    public void kullanıcınınTestCaseSayfasınaBasarıylaYönlendirildiginiDogrulayın() {
        Assert.assertTrue(practiceTC07Page.testCaseTitle.isDisplayed());
    }
}

