package com.glassbeam.*
import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.selenium.Firefox
import org.scalatest.selenium.HtmlUnit


class LoginSpec extends FlatSpec  with ShouldMatchers with Firefox  {
        val host = "http://arubatest31.qatest.com/gb/ui/prod/signin.cgi"

         "Login Operations" should "be successfull" in{

    go to(host) // will open the arubatest31.glassbeam.com in browser
    Thread.sleep(20 * 1000)
    println(pageTitle)
   // Next Step will verify the page title
    assert( pageTitle === "Glassbeam - Product Intelligence on Demand")
    println("I m in the test")
    Thread.sleep(10 * 1000)
    //find the username editbox
    val textfield_loginusername= id("form-login-username").webElement
    //Enter the username -rekha
    textfield_loginusername.sendKeys("rekha")
    val textfield_password = id("form-login-password").webElement
    textfield_password.sendKeys("demo")
    //click on Log-in button
    click on "Log In"
    println(pageTitle)
    assert( pageTitle === "Glassbeam")
  }








  }


