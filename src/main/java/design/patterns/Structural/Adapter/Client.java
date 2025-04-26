package design.patterns.Structural.Adapter;

/*
Client Code testing
 */
public class Client {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("audio.mp4");
        audioPlayer.play("audio.mp3");
    }
}
