package co.com.tcs.training.retomobileoutlook.models;

public class TextImage {
    private String emailContact;
    private String affair;

    public TextImage(String emailContact, String affair) {
        this.emailContact = emailContact;
        this.affair = affair;
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
}
