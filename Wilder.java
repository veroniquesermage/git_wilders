package fr.wildcodeschool.main;

public class Wilder {
    private String firstName;
    private boolean aware;

    public Wilder(String firstName, boolean aware) {
        this.firstName = firstName;
        this.aware = aware;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware() {
        this.aware = aware;
    }

    public String whoAmI(){
        if (isAware()) {
            return "Je m'appelle " + getFirstName() + " et je suis aware.";
        } else {
            return "Je m'appelle " + getFirstName() + " et je ne suis pas aware.";
        }
    }
}
