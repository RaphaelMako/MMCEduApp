import java.util.ArrayList;

public class Campaign {
    Organization organization;
    ArrayList<Learner> learners;
    String campaignDescription;
    int progress;
    boolean onTrack;
    String[] leaders;

    public Campaign(Organization organization, ArrayList<Learner> learners, String campaignDescription, String[] leaders) {
        this.organization = organization;
        this.learners = learners;
        this.campaignDescription = campaignDescription;
        this.leaders = leaders;
        this.progress = 0;
        this.onTrack = true;
    }

    public String getCampaignDescription() {
        return campaignDescription;
    }

    public String[] getLeaders() {
        return leaders;
    }

    public ArrayList<Learner> getLearners() {
        return learners;
    }

    public void addLearners(Learner learner) {
        this.learners.add(learner);
    }

    public Organization getOrganization() {
        return organization;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void onTrackToggle() {
        if (this.onTrack == true) {
            this.onTrack = false;
        }

        else {
            this.onTrack = true;
        }
    }
}