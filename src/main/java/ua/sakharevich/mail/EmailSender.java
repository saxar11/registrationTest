package ua.sakharevich.mail;

/**
 * Created by Pavel Sakharevich on 21.05.2015.
 * This is the simple class that show how to send e-mails from smtp server. I use gmail.
 * It is created with help from http://www.mkyong.com/java/javamail-api-sending-email-via-gmail-smtp-example/
 */
        import javax.mail.*;
        import javax.mail.internet.InternetAddress;
        import javax.mail.internet.MimeMessage;
        import java.io.IOException;
        import java.io.InputStream;
        import java.util.Properties;


public class EmailSender {

    public void send(String recipient, String subject, String text) {

        Properties props = new Properties();

        // this way we obtain mail.properties file from resources
        InputStream in = null;
        try {
            in = getClass().getResourceAsStream("/mail.properties");
            if (in == null) {
                throw new IllegalStateException(
                        "File must be resides in classpath: mail.properties");
            }
            props.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Get authentication
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {

                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(props.getProperty("mail.username"),
                                props.getProperty("mail.password"));
                    }
                });
        //Create message
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(props.getProperty("mail.username"))); //set sender email
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient)); //set recipient
            message.setSubject(subject); //set subject of email
            message.setText(text); //set text of the message

            //Send message
            Transport.send(message);

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

}
