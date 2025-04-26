package design.patterns.Structural.Adapter;

public class MP4Adapter implements MediaPlayer {
    private MP4Player mp4Player;
    public MP4Adapter(MP4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String fileName) {
        if(fileName.contains(".mp4")){
            mp4Player.play(fileName);
        }
        else{
           System.out.println("Invalid Audio File");
        }
    }
}
