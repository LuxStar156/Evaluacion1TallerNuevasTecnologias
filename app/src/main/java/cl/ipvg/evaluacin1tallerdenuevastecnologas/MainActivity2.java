package cl.ipvg.evaluacin1tallerdenuevastecnologas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button bti1;
    Button bti2;
    Intent intent1;
    Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        intent1 = new Intent(this, MainActivity3.class);
        intent2 = new Intent(this, MainActivity.class);

        bti1 = (Button) findViewById(R.id.imgBtIntent3);
        bti2 = (Button) findViewById(R.id.btBack1);
        bti1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });

        bti2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2);
            }
        });


    }
}