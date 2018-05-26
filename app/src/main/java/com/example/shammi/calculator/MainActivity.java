package com.example.shammi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button percentBtn, plusminus, clearBtn;
    TextView screen, screen2;

    double number, answer;
    int calculation;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        percentBtn = findViewById(R.id.percent);
        plusminus = findViewById(R.id.plusminus);
        screen = findViewById(R.id.result);
        screen2 = findViewById(R.id.numbers);
        clearBtn = findViewById(R.id.clearBtn);

        clearBtn.setOnClickListener(this);

        percentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (result == "") {
                        return;
                    } else {
                        Double res = answer / 100;
                        screen.setText(String.valueOf(res));
                    }
                }
            }
        });

        plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    if (answer != 0) {
                        if (answer >= 0) {
                            screen.setText("-" + answer);
                        } else if (answer <= 0) {
                            screen.setText("+" + answer * (-1));
                        }
                    } else {
                        if (answer >= 0) {
                            screen.setText("-" + result);
                        } else if (answer <= 0) {
                            screen.setText("+" + result);

                        }

                    }
                }
            }
        });
    }

    public void oneBtn(View view) {
        screen.setText(screen.getText() + "1");
    }

    public void twoBtn(View view) {
        screen.setText(screen.getText() + "2");
    }

    public void threeBtn(View view) {
        screen.setText(screen.getText() + "3");
    }

    public void fourBtn(View view) {
        screen.setText(screen.getText() + "4");
    }

    public void fiveBtn(View view) {
        screen.setText(screen.getText() + "5");
    }

    public void sixBtn(View view) {
        screen.setText(screen.getText() + "6");
    }

    public void sevenBtn(View view) {
        screen.setText(screen.getText() + "7");
    }

    public void eightBtn(View view) {
        screen.setText(screen.getText() + "8");
    }

    public void nineBtn(View view) {
        screen.setText(screen.getText() + "9");
    }

    public void zeroBtn(View view) {
        screen.setText(screen.getText() + "0");
    }

    public void pointBtn(View view) {
        screen.setText(screen.getText() + ".");
    }

    public void plusBtn(View view) {
        number = Double.parseDouble((String) screen.getText());
        calculation = '+';
        screen.setText("");
        screen2.setText(number + "+");
    }

    public void minusBtn(View view) {
        number = Double.parseDouble((String) screen.getText());
        calculation = '-';
        screen.setText("");
        screen2.setText(number + "-");
    }

    public void mulBtn(View view) {
        number = Double.parseDouble((String) screen.getText());
        calculation = '*';
        screen.setText("");
        screen2.setText(number + "*");
    }

    public void divBtn(View view) {
        number = Double.parseDouble(String.valueOf(screen.getText()));
        calculation = '/';
        screen.setText("");
        screen2.setText(number + "/");
    }


    public void arithmetic_operation() {
        switch (calculation) {
            case '+':
                answer = number + Double.parseDouble(String.valueOf(screen.getText()));
                screen.setText(String.format("%.2f", answer));
                screen2.setText(null);
                result = String.valueOf(screen);
                break;

            case '-':
                answer = number - Double.parseDouble(String.valueOf(screen.getText()));
                screen.setText(String.format("%.2f", answer));
                screen2.setText(null);
                result = String.valueOf(screen);
                break;

            case '*':
                answer = number * Double.parseDouble(String.valueOf(screen.getText()));
                screen.setText(String.format("%.2f", answer));
                screen2.setText(null);
                result = String.valueOf(screen);
                break;


            case '/':
                answer = number / Double.parseDouble(String.valueOf(screen.getText()));
                screen.setText(String.format("%.2f", answer));
                screen2.setText(null);
                result = String.valueOf(screen);
                break;
        }
    }

    public void calculateBtn(View view) {
        arithmetic_operation();
    }

    @Override
    public void onClick(View v) {
        screen.setText("");
        screen2.setText("");
        number = 0.0;
        answer = 0.0;
        result = "";
    }
}
