import java.util.ArrayList;

public class Organization {
    String name;
    String[] MMCcontacts;
    ArrayList<Campaign> pastCampaigns;
    String description;
    String dateAdded;
    String contact;

    public Organization(String name, String[] MMCcontacts, String dateAdded, String contact, String description) {
        this.name = name;
        this.MMCcontacts = MMCcontacts;
        this.dateAdded = dateAdded;
        this.contact = contact;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String[] getContacts() {
        return MMCcontacts;
    }

    public void setMMCcontacts(String[] MMCcontacts) {
        this.MMCcontacts = MMCcontacts;
    }

    public ArrayList<Campaign> getPastCampaigns() {
        return pastCampaigns;
    }

    public void addPastCampaign(Campaign campaign) {
        this.pastCampaigns.add(campaign);
    }

    public String getDescription() {
        return description;
    }

     public String getDateAdded() {
        return dateAdded;
    }

     public String getContact() {
        return contact;
    }
}

