package com.example.vanhuy.androiddashboarddesignactivity;

/**
 * Created by Vanhuy on Mar/25/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle; import android.view.View;
import android.widget.Button;
import vanhuy.DashboardLayout.R;

public class AndroidDashboardDesignActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard_layout);
        /*
        ￼* Creating all buttons instances
        ￼*/
        // Dashboard News feed button
        Button news_feed_button = (Button) findViewById(R.id.news_feed_button);
        // Dashboard Friends button
        Button friends_button = (Button) findViewById(R.id.friends_button);
        // Dashboard Messages button
        Button messages_button = (Button) findViewById(R.id.messages_button);
        // Dashboard Places button
        Button places_button = (Button) findViewById(R.id.places_button);
        // Dashboard Events button
        Button events_button = (Button) findViewById(R.id.events_button);
        // Dashboard Photos button
        Button photos_button = (Button) findViewById(R.id.photos_button);
        /*
        ￼* Handling all button click events
        ￼*/
        // Listening to News Feed button click
        news_feed_button.setOnClickListener(
                new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            // Launching News Feed Screen
                 Intent i = new Intent(getApplicationContext(),
                         NewsFeedActivity.class);
                startActivity(i);
            }

        });

        // Listening Friends button click

        friends_button.setOnClickListener(
                new View.OnClickListener() {
              @Override
              public void onClick(View view) {
              // Launching News Feed Screen
                  Intent i = new Intent(getApplicationContext(),
                          FriendsActivity.class);
                  startActivity(i);
              }
         });

        // Listening Messages button click
        messages_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(),
                        MessagesActivity.class);
                startActivity(i);
            }
        });

        // Listening to Places button click
        places_button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
            // Launching News Feed Screen
             Intent i = new Intent(getApplicationContext(),
                      PlacesActivity.class);

                startActivity(i);

            }
      });
        //Listening to Events button click
        events_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(),
                        startActivity(i);
                EventsActivity.class);
            }
        });
        // Listening to Photos button click
        photos_button.setOnClickListener(new View.OnClickListener() {
            ￼@Override
             public void onClick(View view) { // Launching News Feed Screen
                Intent i = new Intent(getApplicationContext(),
                        PhotosActivity.class);
                startActivity(i);
            }
        });
        // Listening to Events button click
        events_button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  // Launching News Feed Screen
                  Intent i = new Intent(getApplicationContext(),
                          PhotosActivity.class);
                  startActivity(i);
              }
                                                  ￼
    }
            }
                ￼

}
