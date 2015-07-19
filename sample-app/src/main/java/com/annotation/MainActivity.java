package com.annotation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.annotation.core.PizzaFactory;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    private PizzaFactory factory = new PizzaFactory();

    @InjectView(R.id.text) TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.cheese) void onClickCheese() {
        setText(factory.create("Cheese").getPrice());
    }

    @OnClick(R.id.margherita) void onClickMargherita() {
        setText(factory.create("Margherita").getPrice());
    }

    @OnClick(R.id.pepperoni) void onClickPepperoni() {
        setText(factory.create("Pepperoni").getPrice());
    }

    void setText(float price){
        text.setText("$" + price);
    }

}
