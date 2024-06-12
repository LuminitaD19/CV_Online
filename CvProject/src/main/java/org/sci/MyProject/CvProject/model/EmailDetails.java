package org.sci.MyProject.CvProject.model;

public class EmailDetails {
    private String recipient;
    private String sender;
    private String body;
    private  String subject;
    private String firstName;
    private String lastName;

    public EmailDetails() {

    }

    public EmailDetails(String sender,String recipient, String body, String subject, String firstName, String lastName) {
        this.recipient = recipient;
        this.sender = sender;
        this.body = body;
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getRecipient() {
        return recipient;
    }
    public String getSender() {
        return sender;
    }
    public String getBody(){ return body;}
    public String getSubject(){ return subject;}

    public String getFirstName() { return firstName; }
     public String getLastName() { return lastName;}

    public void setBody(String body) { this.body = body; }

    public void setRecipient(String recipient) {this.recipient = recipient;}
    public void setSender(String sender) {this.sender = sender;}

    public void setSubject(String subject) { this.subject = subject; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
}
