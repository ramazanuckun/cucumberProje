package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class BlueRentaCar {

    BrcPage brcPage=new BrcPage();
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda() {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
brcPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.emailPaswordOnay.sendKeys("rrr@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {

        brcPage.paswordButton.sendKeys("12345");
    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        brcPage.ikinciLogin.click();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
    }

    @And("kulllanici sayfayi kapatir")
    public void kulllaniciSayfayiKapatir() {
    }
}
