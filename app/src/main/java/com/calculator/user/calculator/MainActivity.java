package com.calculator.user.calculator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity  {
    private Button addition, substraction, multiplication, division, modulus, delete, clear, dot, squareroot, equal;
    private Button one, two, three, four, five, six, seven, eight, nine, zero;
    private EditText resulttext;
    float mValueOne, mValueTwo;
    double squarer;

    boolean mAddition, mSubtract, mMultiplication, mDivision,mModulus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton();
        resulttext = (EditText) findViewById(R.id.resulttext);


    }

    public void initButton() {

        addition = (Button) findViewById(R.id.addition);
        substraction = (Button) findViewById(R.id.substraction);
        multiplication = (Button) findViewById(R.id.multiplication);
        division = (Button) findViewById(R.id.division);
        modulus = (Button) findViewById(R.id.modulus);
        squareroot = (Button) findViewById(R.id.squareroot);
        clear = (Button) findViewById(R.id.clear);
        delete = (Button) findViewById(R.id.delete);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button) findViewById(R.id.result);

        one = (Button) findViewById(R.id.one);
        zero = (Button) findViewById(R.id.zero);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "1");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "2");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "3");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "4");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "5");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "6");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "7");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "8");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "9");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resulttext.setText(resulttext.getText() + "0");
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

            }
        });

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (resulttext == null) {
                    resulttext.setText("");
                } else {

                    mValueOne = Float.parseFloat(resulttext.getText() + "");
                    mAddition = true;
                    resulttext.setText(null);
                    int id = v.getId();
                    String resourcename = v.getResources().getResourceEntryName(id);
                    int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                    MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mp) {
                            mp.start();
                        }
                    });

                }
            }
        });

        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mValueOne = Float.parseFloat(resulttext.getText() + "");
                resulttext.setText(null);
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mValueOne = Float.parseFloat(resulttext.getText() + "");
                mMultiplication = true;
                resulttext.setText(null);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mValueOne = Float.parseFloat(resulttext.getText() + "");
                mDivision = true;
                resulttext.setText(null);
            }
        });
        modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mValueOne = Float.parseFloat(resulttext.getText() + "");
                mModulus = true;
                resulttext.setText(null);
            }
        });
        squareroot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                squarer = Double.parseDouble(resulttext.getText() + "");
                resulttext.setText(Math.sqrt(squarer)+" ");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                mValueTwo = Float.parseFloat(resulttext.getText() + "");

                if (mAddition == true) {

                    resulttext.setText(mValueOne + mValueTwo + "");
                    mAddition = false;
                }


                if (mSubtract == true) {
                    resulttext.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (mMultiplication == true) {
                    resulttext.setText(mValueOne * mValueTwo + "");
                    mMultiplication = false;
                }

                if (mDivision == true) {
                    resulttext.setText(mValueOne / mValueTwo + "");
                    mDivision = false;
                }
                if (mModulus == true) {
                    resulttext.setText(mValueOne % mValueTwo + "");
                    mModulus = false;
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                resulttext.setText("");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                resulttext.setText(resulttext.getText() + ".");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                String resourcename = v.getResources().getResourceEntryName(id);
                int mymusic = v.getResources().getIdentifier(resourcename, "raw", "com.calculator.user.calculator");
                MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),mymusic);
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mp) {
                        mp.start();
                    }
                });

                resulttext.setText(resulttext.getText().toString().substring(0,resulttext.length()-1) + "");
            }
        });
    }


}


