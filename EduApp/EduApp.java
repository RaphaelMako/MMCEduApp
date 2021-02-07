import java.util.ArrayList;

public class EduApp {
    public static void main(String[] args) {
        Learner Mako = new Learner("Mako", "Mako", "Feb 7 2020", "Mako");
        String[] Ana = {"Ana"};
        Organization MMCinc = new Organization("MMCinc", Ana, "Feb 1 2021", "something", "Cool");
        ArrayList<Learner> people = new ArrayList<Learner>();
        people.add(Mako);
        Campaign MMCtest = new Campaign(MMCinc, people, "fun stuff with cool people", Ana);
        
    }
}