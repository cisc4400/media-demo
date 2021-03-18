package edu.fordham.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        VideoView vv = findViewById(R.id.videoView);

        String videoPath = Environment.getExternalStorageDirectory().getPath() + "/Download/demo.mp4";
        Log.i("videodemo", videoPath);
        vv.setVideoPath(videoPath);

        MediaController mc = new MediaController(this);
        vv.setMediaController(mc);

        vv.start();
    }
}