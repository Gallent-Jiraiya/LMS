package com.group7.lms.email;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


import com.group7.lms.email.EmailService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmailService{

	 private final static Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	    private final JavaMailSender mailSender = null;

		public JavaMailSender getMailSender() {
			return mailSender;
		}
		
		
		public void send(String to, String email) {
	        try {

	            MimeMessage mimeMessage = mailSender.createMimeMessage();
	            MimeMessageHelper helper =  new MimeMessageHelper(mimeMessage, "utf-8");
	            helper.setText(email, true);
	            helper.setTo(to);
	            helper.setSubject("Confirm Your Email");
	            helper.setFrom("iptteam4@gmail.com");
	            mailSender.send(mimeMessage);

	        }
	        catch (MessagingException e) {
	            LOGGER.error("failed to send email", e);
	            throw new IllegalStateException("failed to send email");
	        }

	    }
	
}