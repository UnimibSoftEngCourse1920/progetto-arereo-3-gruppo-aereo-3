package mailManagment;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import dataManagment.GestioneAereoportoDatabase;

public class GestoreMail {
	private static Log logger=LogFactory.getLog(GestioneAereoportoDatabase.class);

	final private String username = "aereo3project@gmail.com";
    final private String psw = "ProgettoAereo3!";
    
    private static GestoreMail instance = null;
    
    static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;
    
    private GestoreMail() {
    	mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
    }
    
    public static GestoreMail getInstance() {
    	if (instance == null)
    		instance = new GestoreMail();
    	return instance;
    }
    
    private void generateMail(String mail, String subject, String content) throws MessagingException{
    	getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		
		try {
			generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(mail));
		} catch(AddressException e) {
			logger.error(e);;
		}
		
		generateMailMessage.setSubject(subject);
		generateMailMessage.setContent(content, "text/html");
    }
    
    public void sendMail(String mail, String subject, String content) {
    	try {
    		this.generateMail(mail, subject, content);
	    	
    		Transport transport = getMailSession.getTransport("smtp");
	    	 
			transport.connect("smtp.gmail.com", username, psw);
			transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
			transport.close();
			
		} catch (MessagingException e) {
    		logger.error(e);
    	}
    }
}
