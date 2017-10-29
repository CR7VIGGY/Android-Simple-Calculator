package com.example.admin.calculator;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends ActionBarActivity implements View.OnClickListener
{
    private Button add,sub,mul,div;
    private TextView result;
    private EditText num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        add = (Button)findViewById(R.id.add);
        sub = (Button)findViewById(R.id.sub);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        result = (TextView)findViewById(R.id.result);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();

        switch(view.getId())
        {
            case R.id.add :
                int addition = Integer.parseInt(s1)+Integer.parseInt(s2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.sub :
                int subtraction = Integer.parseInt(s1)-Integer.parseInt(s2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.mul :
                int multiplication = Integer.parseInt(s1)*Integer.parseInt(s2);
                result.setText(String.valueOf(multiplication));
                break;
            case R.id.div :
                try
                {
                    double division = (double)(Integer.parseInt(s1)/Integer.parseInt(s2));
                    result.setText(String.valueOf(division));
                }
                catch(Exception e)
                {
                    result.setText("Indeterminate Form");
                }

                break;

        }
    }
}
