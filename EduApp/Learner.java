import java.util.ArrayList;

public class Learner {
    string name;
    string onboarder;
    ArrayList<String> pastCampaigns;
    String currentCampaign;
    String dateAdded;
    String contact;
    Boolean onHold;

    public Learner(String name, String onboarder, String dateAdded, String contact) {
        this.name = name;
        this.onboarder = onboarder;
        this.dateAdded = dateAdded;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getOnboarder() {
        return onboarder;
    }

    public ArrayList<String> getPastCampaigns() {
        return pastCampaigns;
    }

    public void addCampaign(String campaign) {
        this.pastCampaigns.add(campaign);
    }

    public String getCurrentCampaign() {
        return currentCampaign;
    }

    public void setCurrentCampaign(String campaign) {
        this.currentCampaign = campaign;
    }

     public String getDateAdded() {
        return dateAdded;
    }

     public String getContact() {
        return contact;
    }

    public void toggleOnHold() {
        if (this.onHold == true) {
            this.onHold = false;
        }

        else {
            this.onHold = true;
        }
    }
}