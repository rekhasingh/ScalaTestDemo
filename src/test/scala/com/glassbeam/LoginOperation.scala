package com.glassbeam.*
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.selenium.Firefox
import com.glassbeam._
import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.Dimension
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.htmlunit.HtmlUnitDriver

class LoginSpec extends FlatSpec {
  val driver = new HtmlUnitDriver
  //val host = "http://arubatest31.qatest.com/gb/ui/prod/signin.cgi"
  val elementLocators = PageFactory.initElements(driver, classOf[Elements])
  val Inputs= new Input

  "Firefox window" should "get maximized" in {
    println("Test to maximize firefox window.")
    driver.manage().window().maximize()
  }

  "Login Operations" should "be successfull" in {
    println("Login Operation to GBApps Functionality.")
                driver.get(Inputs.host) // will open the arubatest31.glassbeam.com in browser
                Thread.sleep(3 * 1000)
                println(driver.getTitle())
    // Next Step will verify the page title
    assert(driver.getTitle() === "Glassbeam - Product Intelligence on Demand")
    println("I m in the test")
    elementLocators.loginEdit.sendKeys(Inputs.username)
    println("loginedit")
    elementLocators.passwordEdit.sendKeys(Inputs.password)
    //click on Log-in buttonedit
    elementLocators.loginButton.click()
    println(driver.getTitle())
    assert(driver.getTitle() === "Glassbeam")
  }

  "Glassbeam logo " should "be present" in {
    Thread.sleep(10 * 1000)
    println("I am testing Glassbeam logo is present or not")
}
}
