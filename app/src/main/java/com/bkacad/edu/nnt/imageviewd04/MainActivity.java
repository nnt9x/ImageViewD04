package com.bkacad.edu.nnt.imageviewd04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // View
    private ImageView imgAnimal;
    private Button btn;
    // Clicked
    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Bind Id
        imgAnimal = findViewById(R.id.imgAnimal);
        btn = findViewById(R.id.btn);

        // OnClick
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isClicked == false) {
                    imgAnimal.setImageDrawable(getDrawable(R.drawable.img_dog));
                    isClicked = true;
                } else {
                    imgAnimal.setImageDrawable(getDrawable(R.drawable.img_cat));
                    isClicked = false;
                }
            }
        });
    }
}