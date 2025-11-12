package structural.proxy.example;

import structural.proxy.example.downloader.YouTubeDownloader;
import structural.proxy.example.media.ThirdPartyYouTubeClass;
import structural.proxy.example.proxy.YouTubeCacheProxy;

public class Demo {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }

    private static long test(YouTubeDownloader youTubeDownloader) {
        long startTime = System.currentTimeMillis();

        youTubeDownloader.renderPopularVideos();
        youTubeDownloader.renderVideoPage("catzzzzzzzzz");
        youTubeDownloader.renderPopularVideos();
        youTubeDownloader.renderVideoPage("dancesvideoo");
        youTubeDownloader.renderVideoPage("catzzzzzzzzz");
        youTubeDownloader.renderVideoPage("someothervid");
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
