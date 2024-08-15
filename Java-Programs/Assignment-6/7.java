/* Create an interface called Player. The interface has an abstract method called play() that displays a message describing the meaning of “play” to the class. Create classes called Child, Musician. and Actor that all implement Player. Create an application that demonstrates the use of the classes (UsePlayer.java). */

interface Player {
    void play();
}
class Child implements Player {
    @Override
    public void play() {
        System.out.println("A child plays with toys and games.");
    }
}
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("A musician plays musical instruments.");
    }
}
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("An actor plays roles in movies, plays, or TV shows.");
    }
}
public class UsePlayer {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();
        System.out.println("Meaning of 'play' for different players:");
        System.out.println("----------------------------------------");
        child.play();
        musician.play();
        actor.play();
    }
}
