package com.katalon.demo.certification.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MappingLogin {
    public static  final Target USERNAME=Target.the("Enter the username").located(By.id("txt-username"));
    public static  final Target PASSWORD=Target.the("Enter the password").located(By.id("txt-password"));
    public static  final Target ACCESSBUTTON=Target.the("Click on the button to access the platform").located(By.id("btn-login"));



}
