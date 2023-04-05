package com.katalon.demo.certification.co.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillFormPage {
    public static  final Target FACILITY=Target.the("Enter the facility").locatedBy(("//div[@class='form-group']//div[@class='col-sm-4']//select[@id='combo_facility']"));
    public static  final Target APPLY_FORM_HOSPITAL=Target.the("check Request hospital readmission").located(By.id("chk_hospotal_readmission"));
    public static  final Target PROGRAM=Target.the("Click in medicare").located(By.id("radio_program_medicare"));
    public static  final Target VISIT_DATE=Target.the("Enter the date").located(By.id("txt_visit_date"));
    public static  final Target COMMENT=Target.the("comments section").located(By.id("txt_comment"));
    public static final Target CONFIRMATION_FORM = Target.the("click on the save button ").located(By.id("btn-book-appointment"));

    public static final Target CONFIRMATION_TEST = Target.the("Message ").locatedBy(("//*[@id='summary']/div/div/div[1]/p"));


}
