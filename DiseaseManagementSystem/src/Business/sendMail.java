/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.Properties;
import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;

import javax.mail.*;

import javax.mail.internet.*;

import com.sun.mail.smtp.*;

/**
 *
 * @author anurag
 */
public class sendMail {
    public static void send(String toMail,String Subject,String text) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.gmail.com");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("aedassignmentstest@gmail.com"));
        msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse(toMail, false));
        msg.setSubject(Subject);
        msg.setText(text);
        msg.setHeader("X-Mailer", "AED's program");
        msg.setSentDate(new Date());
        try (SMTPTransport t = (SMTPTransport)session.getTransport("smtps")) {
            t.connect("smtp.gmail.com", "aedgroup26@gmail.com", "yejicwebhmvlwrti");
            t.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Response: " + t.getLastServerResponse());
        }
    }
}
