package com.agrima.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int i =0;
    int price =0;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view) {
        display(++i);//i++
        calculatePrice(50);
    }
    public void decrement(View view) {

        display(--i);
        calculatePrice(-50);
    }
    public void onSubmit(View view){
        TextView display_message = (TextView) findViewById(R.id.displayMessage);

        EditText name = (EditText) findViewById(R.id.name);
        userName = name.getText().toString();
        display_message.setText("Thank You!"+userName);
        name.setFocusable(false);
        Button plus = (Button) findViewById(R.id.plus);
        plus.setClickable(false);
        Button minus = (Button) findViewById(R.id.minus);
        minus.setClickable(false);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void updatePrice(View view)
    {
        //boolean checked = ((CheckBox) view).isChecked();
        CheckBox box = (CheckBox) view;
        if(box.isChecked())
        calculatePrice(10);
        else
            calculatePrice(-10);
    }
    public void calculatePrice(int p){
        price += p;
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("Rs. "+price);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);//setters and getters
    }
}