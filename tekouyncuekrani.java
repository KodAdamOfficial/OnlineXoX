package com.example.cengizhank.xox_derleme;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static java.sql.Types.NULL;


public class tekouyncuekrani extends AppCompatActivity{
    private ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    private int sira,syc=0;
    private TextView txtX,txtO,txtKazanan;
    private ImageView ivSira;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tekoyuncuekrani);
        ib1 = findViewById(R.id.ib1);
        ib2 = findViewById(R.id.ib2);
        ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4);
        ib5 = findViewById(R.id.ib5);
        ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7);
        ib8 = findViewById(R.id.ib8);
        ib9 = findViewById(R.id.ib9);
        txtO = findViewById(R.id.txtO);
        txtX = findViewById(R.id.txtX);
        ivSira=findViewById(R.id.ivSira);
        Random r = new Random();
        sira = r.nextInt(2);
        final int list [] = {2,3,4,5,6,7,8,9,10};
        txtX.setText("Sen");
        txtO.setText("Bilgisayar");
        txtKazanan = findViewById(R.id.txtKazanan);
        if(sira == 0){
            ivSira.setImageResource(R.drawable.x);
        }
        else{
            ivSira.setImageResource(R.drawable.o);
            pcHamle(list);
            kazanan_kontrol(list);
        }
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib1.setImageResource(R.drawable.x);
                list[0]=0;
                ib1.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib2.setImageResource(R.drawable.x);
                list[1]=0;
                ib2.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib3.setImageResource(R.drawable.x);
                list[2]=0;
                ib3.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib4.setImageResource(R.drawable.x);
                list[3]=0;
                ib4.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib5.setImageResource(R.drawable.x);
                list[4]=0;
                ib5.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib6.setImageResource(R.drawable.x);
                list[5]=0;
                ib6.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib7.setImageResource(R.drawable.x);
                list[6]=0;
                ib7.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib8.setImageResource(R.drawable.x);
                list[7]=0;
                ib8.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ivSira.setImageResource(R.drawable.o);
                ib9.setImageResource(R.drawable.x);
                list[8]=0;
                ib9.setEnabled(false);
                kazanan_kontrol(list);

                if(kazanan_kontrol(list) != true){
                    pcHamle(list);
                    kazanan_kontrol(list);}
            }
        });

    }
    public void pcHamle(int list[]){
        Random r =new Random();
        int i;
        boolean b=true;
        while (true) {
            i=r.nextInt(9);
            switch (i) {
                case 0:
                    if (list[i] == 2) {
                        ib1.setImageResource(R.drawable.o);
                        ib1.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 1:
                    if (list[i] == 3) {
                        ib2.setImageResource(R.drawable.o);
                        ib2.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 2:
                    if (list[i] == 4) {
                        ib3.setImageResource(R.drawable.o);
                        ib3.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 3:
                    if (list[i] == 5) {
                        ib4.setImageResource(R.drawable.o);
                        ib4.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 4:
                    if (list[i] == 6) {
                        ib5.setImageResource(R.drawable.o);
                        ib5.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 5:
                    if (list[i] == 7) {
                        ib6.setImageResource(R.drawable.o);
                        ib6.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 6:
                    if (list[i] == 8) {
                        ib7.setImageResource(R.drawable.o);
                        ib7.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 7:
                    if (list[i] == 9) {
                        ib8.setImageResource(R.drawable.o);
                        ib8.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                case 8:
                    if (list[i] == 10) {
                        ib9.setImageResource(R.drawable.o);
                        ib9.setEnabled(false);
                        list[i] = 1;
                        ivSira.setImageResource(R.drawable.x);
                        b=false;
                        kazanan_kontrol(list);
                    }

                    break;
                default:
                    break;
            }
            if(!b)
            {break;}
        }

    }
    public boolean kazanan_kontrol(int list[]){
        boolean kontrol = false;
        int sayac=0;
        if(list[0] == list[1] && list[2]==list[1]){
            kontrol = true;
            if(list[1]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[1]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[0] == list[3] && list[3]==list[6]){
            kontrol = true;
            if(list[0]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[0]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[0] == list[4] && list[4]==list[8]){
            kontrol = true;
            if(list[0]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[0]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[1] == list[4] && list[4]==list[7]){
            kontrol = true;
            if(list[1]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[1]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[2] == list[5] && list[5]==list[8]){
            kontrol = true;
            if(list[2]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[2]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[3] == list[4] && list[4]==list[5]){
            kontrol = true;
            if(list[3]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[3]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[6] == list[7] && list[7]==list[8]){
            kontrol = true;
            if(list[6]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[6]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else if(list[2] == list[4] && list[4]==list[6]){
            kontrol = true;
            if(list[6]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[6]==1){
                txtKazanan.setText("Kazanan O!");
            }
        }
        else{
            for(int i=0;i<9;i++){
                if(list[i]==0 || list[i]==1){
                    sayac++;
                }
            }
            if(sayac ==9){
                txtKazanan.setText("Berabere !");
            }

        }
        if(kontrol == true){
            ib1.setEnabled(false);
            ib2.setEnabled(false);
            ib3.setEnabled(false);
            ib4.setEnabled(false);
            ib5.setEnabled(false);
            ib6.setEnabled(false);
            ib7.setEnabled(false);
            ib8.setEnabled(false);
            ib9.setEnabled(false);
        }
        return kontrol;
    }
}
