package co.com.tcs.training.retomobileoutlook.models;

public class TextEmail {
    private String emailContact;
    private String affair;
    private String message;

    public TextEmail(String emailContact, String affair, String message) {
        this.emailContact = emailContact;
        this.affair = affair;
        this.message = message;
    }

    public String getEmailContact() {
        return emailContact;
    }

    public void setEmailContact(String emailContact) {
        this.emailContact = emailContact;
    }

    public String getAffair() {
        return affair;
    }

    public void setAffair(String affair) {
        this.affair = affair;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
