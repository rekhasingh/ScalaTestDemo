package com.glassbeam
import org.scalatest.selenium._
import org.scalatest.selenium.Firefox
import org.openqa.selenium.WebElement
import org.scalatest.FlatSpec
import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.How

class Elements{
                  val host = "http://arubatest31.qatest.com/gb/ui/prod/signin.cgi"
                  @FindBy(how = How.NAME, using = "username")
                  var loginEdit : WebElement = null
                  @FindBy(how = How.NAME, using = "password")
                  var passwordEdit : WebElement = null
                  @FindBy(how = How.NAME, using = "Log In")
                  var loginButton : WebElement = null
                  @FindBy(how = How.LINK_TEXT, using = "http://www.glassbeam.com")
                  var logolink : WebElement = null
}
