package khjin001010.kr.hs.emirim.activitytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button but_second = (Button)findViewById(R.id.but_second);
        but_second.setOnClickListener(butSecondHandler);

    }
    View.OnClickListener butSecondHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
