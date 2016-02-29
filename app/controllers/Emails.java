package controllers;

import helpers.ConfigProvider;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by User on 12/18/2015.
 */
public class Emails extends Controller {
    public Result sendMail() {
        //taking values from input fields
        DynamicForm form = Form.form().bindFromRequest();
        String name = form.field("name").value();
        String lastname = form.field("lastname").value();
        String mail = form.field("mail").value();
        String message = form.field("message").value();

        /* sending an email*/
            SimpleEmail email = new SimpleEmail();
            email.setHostName(ConfigProvider.SMTP_HOST);
            email.setSmtpPort(Integer.parseInt(ConfigProvider.SMTP_PORT));
            try {
                /*Configuring mail*/
                email.setAuthentication(ConfigProvider.MAIL_FROM, ConfigProvider.MAIL_FROM_PASS);
                email.setFrom(ConfigProvider.MAIL_FROM);
                email.setStartTLSEnabled(true);
                email.setDebug(true);
                email.addTo(ConfigProvider.SMTP_USER);
                email.setSubject("Pitanje");
                email.setMsg(name + " " +lastname +"\n" + mail + "\n\n" +"\n" + message);

                email.send();
            } catch (EmailException e) {
                e.printStackTrace();
            }
            /*If mail is sent flash appears and user is redirected to index page */
            flash("success", "Vasa poruka je poslana. Potrudit cemo se da odgovorimo u najkracem mogucem roku. Zahvaljujemo !");
            return redirect(routes.Application.contact());

    }

}
