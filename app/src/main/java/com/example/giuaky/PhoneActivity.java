package com.example.giuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PhoneActivity extends AppCompatActivity {
    private static final String[] PRODUCTS = new String[]
            {
                    "Iphone 14 Promax 1TB Deep Purple",
                    "Iphone 14 Pro 512GB Gold",
                    "Iphone 14 256GB Silver",
                    "Iphone 13 Promax 1TB Pink",
                    "Iphone 13 Pro 512GB Blue",
                    "Iphone 13 256GB Silver",
            };

    private static final String[] COST = new String[]{
            "50.000.000 VND",
            "48.500.000 VND",
            "45.000.000 VND",
            "41.500.000 VND",
            "37.500.000 VND",
            "35.500.000 VND",
    };

    private static final int[] IMAGES=new int[]{
            R.drawable.ip14pmpurple,
            R.drawable.ip14pgold,
            R.drawable.ip14silver,
            R.drawable.ip13pink,
            R.drawable.ip13blue,
            R.drawable.ip13silver,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        AutoCompleteTextView textView = findViewById(R.id.product);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line, PRODUCTS);

        textView.setAdapter(adapter);

        TextView tvCost=findViewById(R.id.tvCost);
        Button btnSearch=findViewById(R.id.button2);
        ImageView imageView=findViewById(R.id.image);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item=textView.getText().toString();
                for(int i=0;i<PRODUCTS.length;i++){
                    if(item.equals(PRODUCTS[i].toString())){
                        tvCost.setText(COST[i].toString());
                        imageView.setImageResource(IMAGES[i]);
                        break;
                    }
                }
            }
        });

    }
}