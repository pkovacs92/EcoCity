package com.example.ecocity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnNews, btnCommunity, btnMap, btnEvents, btnCreateEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        btnNews = findViewById(R.id.btnNews);
        btnCommunity = findViewById(R.id.btnCommunity);
        btnMap = findViewById(R.id.btnMap);
        btnEvents = findViewById(R.id.btnEvents);
        btnCreateEvent = findViewById(R.id.btnCreateEvent);

        btnNews.setOnClickListener(this);
        btnCommunity.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnEvents.setOnClickListener(this);
        btnCreateEvent.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.equals(btnNews)){
            //redirect to news activity
            Intent intent = new Intent(EventsActivity.this, NewsActivity.class);
            startActivity(intent);
        }else if(view.equals(btnCommunity)){
            //redirect to community activity
            Intent intent = new Intent(EventsActivity.this, CommunityActivity.class);
            startActivity(intent);
        }else if(view.equals(btnMap)){
            //redirect to map activity
            Intent intent = new Intent(EventsActivity.this, MapActivity.class);
            startActivity(intent);
        }else if(view.equals(btnEvents)){
            //redirect to events activity
            Intent intent = new Intent(EventsActivity.this, EventsActivity.class);
            startActivity(intent);
        }else if(view.equals(btnCreateEvent)){
            //redirect to events activity
            Intent intent = new Intent(EventsActivity.this, CreateEventActivity.class);
            startActivity(intent);
        }
    }
}