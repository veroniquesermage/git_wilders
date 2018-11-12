package fr.wildcodeschool.main;

public class Classroom {
    public static void main(String[] args) {

        Wilder jerem = new Wilder("Jérémie",true);
        System.out.println(jerem.whoAmI());

        Wilder nathan = new Wilder("Nathan", false);
        System.out.print(nathan.whoAmI());
        }
    }



