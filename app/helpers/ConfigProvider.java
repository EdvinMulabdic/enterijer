package helpers;

import play.Play;

/**
 * Created by User on 12/18/2015.
 */
public class ConfigProvider {

    // Configurations for email
    public static final String SMTP_HOST = Play.application().configuration().getString("smtp.host");
    public static final String SMTP_PORT = Play.application().configuration().getString("smtp.port");
    public static final String SMTP_PORT1 = Play.application().configuration().getString("smtp.port1");
    public static final String SMTP_SSL = Play.application().configuration().getString("smtp.ssl");
    public static final String SMTP_USER = Play.application().configuration().getString("mail.smtp.user");
    public static final String SMTP_PASS = Play.application().configuration().getString("mail.smtp.pass");
    public static final String MAIL_TLS = Play.application().configuration().getString("mail.tls");
    public static final String MAIL_POP_BEFORE_SMTP = Play.application().configuration().getString("mail.popbeforesmtp");
    public static final String MAIL_FROM = Play.application().configuration().getString("mailFrom");
    public static final String MAIL_FROM_PASS = Play.application().configuration().getString("mailFromPass");

}
