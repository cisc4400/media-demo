package edu.fordham.videodemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button oaBtn = findViewById(R.id.oaBtn);
        oaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = Environment.getExternalStorageDirectory().getPath() + "/Download/demo.mp4";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setDataAndType(Uri.parse(videoPath), "video/mp4");
                startActivity(intent);
            }
        });

        Button vvBtn = findViewById(R.id.vvBtn);
        vvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), VideoViewActivity.class);
                startActivity(intent);
            }
        });

        Button mpBtn = findViewById(R.id.mpBtn);
        mpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MediaPlayerActivity.class);
                startActivity(intent);
            }
        });

        Button pickBtn = findViewById(R.id.pickBtn);
        pickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PickPhotoActivity.class);
                startActivity(intent);
            }
        });
    }
}