package com.example.stormhacks2021.homepage;
import com.example.stormhacks2021.AppManager;
import com.example.stormhacks2021.R;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpActivity extends AppCompatActivity {

    private Button button;

    AppManager appManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        appManager = AppManager.getInstance();

        setUpButtons();
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("My Notification","Alerts", NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }

    private void setUpButtons() {
        Button hungryButton = findViewById(R.id.help_hungry_btn);
        Button thirstyButton = findViewById(R.id.help_thirsty_btn);
        Button lonelyButton = findViewById(R.id.help_lonely_btn);
        Button injuredButton = findViewById(R.id.help_injury_btn);
        Button washroomButton = findViewById(R.id.help_washroom_btn);

        hungryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is hungry");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(HelpActivity.this);
                //Notification Code Below
                NotificationCompat.Builder builder=new NotificationCompat.Builder(HelpActivity.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " is hungry!");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(HelpActivity.this);
                managerCompat.notify(1,builder.build());
                //Notification Code Finished

                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();

            }
        });

        thirstyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is thirsty");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(HelpActivity.this);
                //Notification Code Below
                NotificationCompat.Builder builder=new NotificationCompat.Builder(HelpActivity.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " is thirsty!");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(HelpActivity.this);
                managerCompat.notify(1,builder.build());
                //Notification Code Finished

                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();

            }
        });

        lonelyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is lonely");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(HelpActivity.this);
                //Notification Code Below
                NotificationCompat.Builder builder=new NotificationCompat.Builder(HelpActivity.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " is lonely.");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(HelpActivity.this);
                managerCompat.notify(1,builder.build());
                //Notification Code Complete
                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();

            }
        });

        injuredButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " is injured");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(HelpActivity.this);
                //Notification Code Below
                NotificationCompat.Builder builder=new NotificationCompat.Builder(HelpActivity.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " is injured!");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(HelpActivity.this);
                managerCompat.notify(1,builder.build());
                //Notification Code Complete
                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();

            }
        });


        washroomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appManager.getCurrentSenior().notifyCareGiver(appManager.getCurrentSenior().getFirstName() + " needs washroom");

                final AlertDialog.Builder alertDialog = new AlertDialog.Builder(HelpActivity.this);
                //Notification Code Below
                NotificationCompat.Builder builder=new NotificationCompat.Builder(HelpActivity.this, "My Notification");
                builder.setContentTitle("Alert!");
                String name = appManager.getCurrentSenior().getFirstName();
                builder.setContentTitle(name + " needs washroom!");
                builder.setSmallIcon(R.drawable.ic_launcher_background);
                builder.setAutoCancel(true);

                NotificationManagerCompat managerCompat = NotificationManagerCompat.from(HelpActivity.this);
                managerCompat.notify(1,builder.build());
                //Notification Code Complete
                alertDialog.setTitle("Help is on the way!");

                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        moveTaskToBack(false);
                        finish();
                    }
                });
                alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog1 = alertDialog.create();
                alertDialog1.show();

            }
        });

    }
}
