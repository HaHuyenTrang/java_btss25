package bai4;

public class Adapter implements MediaPlayer{
    AdvancedMediaPlayer advanceMediaplayer = new AdvancedMediaPlayer();
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaplayer.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaplayer.playVlc(fileName);
        } else {
            System.out.println("Audio không đúng định dạng");
        }
    }
}
