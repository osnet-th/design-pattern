package structural.facade.example.media;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result) {
        System.out.println("Fixing audio mixer");
        return new File("tmp");
    }
}
