package cl.ipvg.evaluacin1tallerdenuevastecnologas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bti;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(this, MainActivity2.class);

        bti = (ImageButton) findViewById(R.id.imgBtIntent2);
        bti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intent);
            }
        });

    }
}