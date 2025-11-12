package structural.proxy.example.media;

import java.util.HashMap;

/*
* 원격 서비스 인터페이스
* */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}