package ua.kpi.comsys.iv7214.moviesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import static ua.kpi.comsys.iv7214.moviesapp.Adaptery.getResId;


public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        getIncomingIntent();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("name") &&
                getIntent().hasExtra("year") && getIntent().hasExtra("imdbID")){
            String title = getIntent().getStringExtra("name");
            String poster = getIntent().getStringExtra("image");
            String imdbID = getIntent().getStringExtra("imdbID");
            String year = getIntent().getStringExtra("year");

            setData(title, year, imdbID, poster);
        }
    }

    private void setData(String title, String year, String imdbID, String poster){
        TextView name = findViewById(R.id.nameText2);
        TextView yr = findViewById(R.id.yearText2);
        TextView id = findViewById(R.id.idText);
        name.setText(title);
        yr.setText(year);
        id.setText(imdbID);

        ImageView image = findViewById(R.id.imageView);
        int resID = getResId(poster, R.drawable.class);
        Glide.with(this).load(resID).into(image);

    }


}
