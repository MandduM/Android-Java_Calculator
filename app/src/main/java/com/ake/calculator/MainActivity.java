package com.ake.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.ake.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    boolean plus,multi,div,minus;

    Double valueOne,valueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Listener();
        Transactions();

    }
    public void Listener(){
        binding.button1.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"1");
            binding.solution.setText(binding.result.getText());
        });

        binding.button2.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"2");
            binding.solution.setText(binding.result.getText());
        });

        binding.button3.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"3");
            binding.solution.setText(binding.result.getText());
        });

        binding.button4.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"4");
            binding.solution.setText(binding.result.getText());
        });

        binding.button5.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"5");
            binding.solution.setText(binding.result.getText());
        });

        binding.button6.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"6");
            binding.solution.setText(binding.result.getText());
        });

        binding.button7.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"7");
            binding.solution.setText(binding.result.getText());
        });

        binding.button8.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"8");
            binding.solution.setText(binding.result.getText());
        });

        binding.button9.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"9");
            binding.solution.setText(binding.result.getText());
        });

        binding.button0.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+"0");
            binding.solution.setText(binding.result.getText());
        });

        binding.buttonAC.setOnClickListener(view -> {
            binding.result.setText("");
        });

        binding.buttonCom.setOnClickListener(view -> {
            binding.result.setText(binding.result.getText()+".");
            binding.solution.setText(binding.result.getText());
        });
    }

    public void Transactions() {

        binding.buttonPlus.setOnClickListener(view -> {
            if (!binding.result.getText().toString().matches("")) {

                valueOne = Double.parseDouble(binding.result.getText() + "");
                plus = true;
                binding.result.setText(null);

            } else {
                binding.result.setText("");
            }
        });

        binding.buttonMinus.setOnClickListener(view -> {
            if (!binding.result.getText().toString().matches("")) {

                valueOne = Double.parseDouble(binding.result.getText() + "");
                minus = true;
                binding.result.setText(null);

            } else {
                binding.result.setText("");
            }
        });

        binding.buttonMulti.setOnClickListener(view -> {
            if (!binding.result.getText().toString().matches("")) {

                valueOne = Double.parseDouble(binding.result.getText() + "");
                multi = true;
                binding.result.setText(null);

            } else {
                binding.result.setText("");
            }
        });

        binding.buttonDiv.setOnClickListener(view -> {
            if (!binding.result.getText().toString().matches("")) {

                valueOne = Double.parseDouble(binding.result.getText() + "");
                div = true;
                binding.result.setText(null);
            }else {
                binding.result.setText("");
            }

        });

        binding.buttonEqual.setOnClickListener(view -> {
           valueTwo = Double.parseDouble(binding.result.getText()+"");
           if(plus == true){
               binding.result.setText(valueOne+valueTwo+"");
               binding.solution.setText(valueOne+"+"+valueTwo);
               plus=false;
           }

            if(minus == true){
                binding.result.setText(valueOne-valueTwo+"");
                binding.solution.setText(valueOne+"-"+valueTwo);
                minus=false;
            }

            if(multi == true){
                binding.result.setText(valueOne*valueTwo+"");
                binding.solution.setText(valueOne+"*"+valueTwo);
                multi=false;
            }

            if(div == true){
                binding.result.setText(valueOne/valueTwo+"");
                binding.solution.setText(valueOne+"/"+valueTwo);
                div=false;
            }
        });
    }
}