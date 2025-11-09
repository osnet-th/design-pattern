package structural.proxy.example.proxy;

import structural.proxy.example.media.ThirdPartyYouTubeClass;
import structural.proxy.example.media.ThirdPartyYouTubeLib;
import structural.proxy.example.media.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();


    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }


    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list form cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video form cache");
        }

        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
