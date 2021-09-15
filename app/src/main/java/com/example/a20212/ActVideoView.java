package com.example.a20212;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class ActVideoView extends AppCompatActivity {
VideoView videoView;
ImageButton control;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_video_view);
        videoView = (VideoView) findViewById(R.id.videoView);
        /*String ruta ="android.rosource://"+ getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(ruta);*/
        Uri uri = Uri.parse("http://techslides.com/demos/sample-videos/small.mp4");
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        control=(ImageButton)findViewById(R.id.imageButton5);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}