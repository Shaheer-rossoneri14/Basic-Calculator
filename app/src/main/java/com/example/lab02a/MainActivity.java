package com.example.lab02a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double in1 = 0, in2 = 0;
    TextView edittext1;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7,
            button_8, button_9, button_Add, button_Sub,
            button_Mul, button_Div, button_Equ, button_Del, button_Dot, button_Remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.b0);
        button_1 = (Button) findViewById(R.id.b1);
        button_2 = (Button) findViewById(R.id.b2);
        button_3 = (Button) findViewById(R.id.b3);
        button_4 = (Button) findViewById(R.id.b4);
        button_5 = (Button) findViewById(R.id.b5);
        button_6 = (Button) findViewById(R.id.b6);
        button_7 = (Button) findViewById(R.id.b7);
        button_8 = (Button) findViewById(R.id.b8);
        button_9 = (Button) findViewById(R.id.b9);
        button_Dot = (Button) findViewById(R.id.bDot);
        button_Add = (Button) findViewById(R.id.badd);
        button_Sub = (Button) findViewById(R.id.bsub);
        button_Mul = (Button) findViewById(R.id.bmul);
        button_Div = (Button) findViewById(R.id.biv);
        button_Remainder = (Button) findViewById(R.id.BRemain);
        button_Del = (Button) findViewById(R.id.buttonDel);
        button_Equ = (Button) findViewById(R.id.buttoneql);

        edittext1 = (TextView) findViewById(R.id.display);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "1");
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "2");
            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "3");
            }
        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "4");
            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "5");
            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "6");
            }
        });

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "7");
            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "8");
            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "9");
            }
        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText(edittext1.getText() + "0");
            }
        });

        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Add = true;
                    deci = false;
                    edittext1.setText(edittext1.getText() + "+");
                }
            }
        });

        button_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Sub = true;
                    deci = false;
                    edittext1.setText(edittext1.getText() + "-");
                }
            }
        });

        button_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Multiply = true;
                    deci = false;
                    edittext1.setText(edittext1.getText() + "*");
                }
            }
        });

        button_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Divide = true;
                    deci = false;
                    edittext1.setText(edittext1.getText() + "/");
                }
            }
        });

        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edittext1.getText().length() != 0) {
                    in1 = Float.parseFloat(edittext1.getText() + "");
                    Remainder = true;
                    deci = false;
                    edittext1.setText(edittext1.getText() + "%");
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    in2 = Float.parseFloat(edittext1.getText() + "");
                }

                if (Add) {
                    double sum1 = in1 + in2;
                    String a = String.valueOf(sum1);
                    edittext1.setText(a);
                    Add = false;
                }

                if (Sub) {
                    double diff1 = in1 - in2;
                    String b = String.valueOf(diff1);
                    edittext1.setText(b);
                    Sub = false;
                }

                if (Multiply) {
                    double mul1 = in1 * in2;
                    String c = String.valueOf(mul1);
                    edittext1.setText(c);
                    Multiply = false;
                }

                if (Divide) {
                    double div1 = in1 / in2;
                    String d = String.valueOf(div1);
                    edittext1.setText(d);
                    Divide = false;
                }
                if (Remainder) {
                    double rem1 = in1 % in2;
                    String e = String.valueOf(rem1);
                    edittext1.setText(e);
                    Remainder = false;
                }
            }
        });

        button_Del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edittext1.setText("");
                in1 = 0.0;
                in2 = 0.0;
            }
        });

        button_Dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    edittext1.setText(edittext1.getText() + ".");
                    deci = true;
                }

            }
        });
    }
}
