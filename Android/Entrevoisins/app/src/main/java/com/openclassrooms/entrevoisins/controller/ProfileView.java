package com.openclassrooms.entrevoisins.controller;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

public class ProfileView extends AppCompatActivity {

    private Neighbour neighbour;
    private ImageView mBackButton;
    private FloatingActionButton mFavButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_view);

       mBackButton = findViewById(R.id.back_button);
       mFavButton = findViewById(R.id.fab_fav);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on termine l'activité
                ProfileView.this.finish();
            }
        });

        mFavButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // L'étoile devient repmlie ou se vide

                if(neighbour.isFavorite()) {
                    mFavButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_star_border_yellow_24dp));
                    neighbour.setFavorite(false);
                } else {
                    mFavButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_star_yellow_24dp));
                    neighbour.setFavorite(true);
                }
            }
        });

        getIncomingIntent();

        if(neighbour.isFavorite()) {
            mFavButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_star_yellow_24dp));
        } else {
            mFavButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_star_border_yellow_24dp));
        }
    }

    private void getIncomingIntent() {
        if(getIntent().hasExtra("neighbourId")) {
            int neighbourId = getIntent().getIntExtra("neighbourId", -1);
            neighbour = DI.getNeighbourApiService().getNeighbourById(neighbourId);

            ImageView img = findViewById(R.id.ic_avatar);
            Glide.with(this)
                    .asBitmap()
                    .load(neighbour.getAvatarUrl())
                    .into(img);

            TextView nom = findViewById(R.id.name);
            nom.setText(neighbour.getName());

            TextView nom_cv = findViewById(R.id.name_cv);
            nom_cv.setText(neighbour.getName());

            TextView tel = findViewById(R.id.tel);
            tel.setText(neighbour.getTelNumber());

            TextView localisation = findViewById(R.id.localisation);
            localisation.setText(neighbour.getAdress());

            TextView fb = findViewById(R.id.fb);
            fb.setText(neighbour.getFacebook());

        }
    }
}
