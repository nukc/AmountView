package com.github.nukc.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.github.nukc.amountview.AmountView;


public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AmountView mAmountView = (AmountView) findViewById(R.id.amountView);
        mAmountView.setGoods_storage(10);
        mAmountView.setListener(new AmountView.OnAmountChangeListener() {
            @Override
            public void onAmountChange(View view, int amount) {
                Toast.makeText(getApplicationContext(), amount + "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
