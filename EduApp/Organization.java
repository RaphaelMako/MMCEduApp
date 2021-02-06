public class Organization {
    string name;
    string[] MMCcontacts;
    string campaignDescription;
    string description;
    int dueDate;
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

    public String getContacts() {
        return MMCcontacts;
    }

    public ArrayList<String> getCampaignDescription() {
        return campaignDescription;
    }

    public void addCampaignDescription(String description) {
        this.pastCampaigns.add(description);
    }

    public int getdueDate() {
        return dueDate;
    }

    public void setDueDate(int date) {
        this.dueDate = date;
    }

     public String getDateAdded() {
        return dateAdded;
    }

     public String getContact() {
        return contact;
    }
}

