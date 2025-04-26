package design.patterns.Structural.Adapter;

/*
Client Code
 */
public class AudioPlayer implements MediaPlayer {

    MP4Player mp4Player = new MP4Player();

    @Override
    public void play(String fileName) {
        if(fileName.contains(".mp4")){
            mp4Player.play(fileName);
        }else{
            System.out.println("Playing Audio file-"+fileName);
        }
    }
}
