package isa.FishingAdventure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;

import org.springframework.stereotype.Service;

import isa.FishingAdventure.dto.UserDto;
import isa.FishingAdventure.model.ConfirmationToken;
import isa.FishingAdventure.security.util.TokenUtils;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Autowired
	private ConfirmationTokenService confirmationTokenService;
	
	@Autowired
	private TokenUtils tokenUtils;

	@Autowired
	private Environment env;

	@Async
	public void sendEmail(String email, String subject, String text) throws MailException, InterruptedException {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(email);
		mail.setFrom(env.getProperty("spring.mail.username"));
		mail.setSubject(subject);
		mail.setText(text);
		javaMailSender.send(mail);

		System.out.println("Email sent!");
	}

}