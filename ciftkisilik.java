package com.example.cengizhank.xox_derleme;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.Random;
public class ciftkisilik extends AppCompatActivity{
    private ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    private int sira,syc=0;
    private int [] liste;
    private TextView txtX,txtO,txtKazanan;
    private ImageView ivSira;
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private boolean stopped = false;
    private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciftkisilik);
        ib1 = findViewById(R.id.ib15);
        ib2 = findViewById(R.id.ib14);
        ib3 = findViewById(R.id.ib13);
        ib4 = findViewById(R.id.ib11);
        ib5 = findViewById(R.id.ib12);
        ib6 = findViewById(R.id.ib10);
        ib7 = findViewById(R.id.ib);
        ib8 = findViewById(R.id.ib17);
        ib9 = findViewById(R.id.ib16);
        txtO = findViewById(R.id.txtO2);
        txtX = findViewById(R.id.txtX2);
        ivSira=findViewById(R.id.ivSira2);
        progressBar=findViewById(R.id.progressBar1);
        progressBar.setMax(10);
        progressBar.setIndeterminate(false);
        Random r = new Random();
        sira = r.nextInt(2);
        baslangıcHali();
        setKronometre().start();
        final int list [] = {2,3,4,5,6,7,8,9,10};
        txtX.setText("Player 1");
        txtO.setText("Player 2");
        txtKazanan = findViewById(R.id.txtKazanan2);
        if(sira == 0){
            ivSira.setImageResource(R.drawable.x);
        }
        else{
            ivSira.setImageResource(R.drawable.o);
        }
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib1.setImageResource(R.drawable.x);
                    list[0]=0;
                }
                else if(sira==1){
                    ib1.setImageResource(R.drawable.o);
                    list[0]=1;
                }
                ib1.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib2.setImageResource(R.drawable.x);
                    list[1]=0;
                }
                else if(sira==1){
                    ib2.setImageResource(R.drawable.o);
                    list[1]=1;
                }
                ib2.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib3.setImageResource(R.drawable.x);
                    list[2]=0;
                }
                else if(sira==1){
                    ib3.setImageResource(R.drawable.o);
                    list[2]=1;
                }
                ib3.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib4.setImageResource(R.drawable.x);
                    list[3]=0;
                }
                else if(sira==1){
                    ib4.setImageResource(R.drawable.o);
                    list[3]=1;
                }
                ib4.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib5.setImageResource(R.drawable.x);
                    list[4]=0;
                }
                else if(sira==1){
                    ib5.setImageResource(R.drawable.o);
                    list[4]=1;
                }
                ib5.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib6.setImageResource(R.drawable.x);
                    list[5]=0;
                }
                else if(sira==1){
                    ib6.setImageResource(R.drawable.o);
                    list[5]=1;
                }
                ib6.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib7.setImageResource(R.drawable.x);
                    list[6]=0;
                }
                else if(sira==1){
                    ib7.setImageResource(R.drawable.o);
                    list[6]=1;
                }
                ib7.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib8.setImageResource(R.drawable.x);
                    list[7]=0;
                }
                else if(sira==1){
                    ib8.setImageResource(R.drawable.o);
                    list[7]=1;
                }
                ib8.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sira==0){
                    ib9.setImageResource(R.drawable.x);
                    list[8]=0;
                }
                else if(sira==1){
                    ib9.setImageResource(R.drawable.o);
                    list[8]=1;
                }
                ib9.setEnabled(false);
                liste=list;
                kazanan_kontrol(list);
                if(kazanan_kontrol(list)!=true){
                    if(sira==0){
                        ivSira.setImageResource(R.drawable.o);
                        sira=1;
                    }
                    else{
                        ivSira.setImageResource(R.drawable.x);
                        sira=0;
                    }
                    progresdegis();
                }
            }
        });
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
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[0] == list[3] && list[3]==list[6]){
            kontrol = true;
            if(list[0]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[0]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[0] == list[4] && list[4]==list[8]){
            kontrol = true;
            if(list[0]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[0]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[1] == list[4] && list[4]==list[7]){
            kontrol = true;
            if(list[1]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[1]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[2] == list[5] && list[5]==list[8]){
            kontrol = true;
            if(list[2]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[2]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[3] == list[4] && list[4]==list[5]){
            kontrol = true;
            if(list[3]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[3]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[6] == list[7] && list[7]==list[8]){
            kontrol = true;
            if(list[6]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[6]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else if(list[2] == list[4] && list[4]==list[6]){
            kontrol = true;
            if(list[6]==0){
                txtKazanan.setText("Kazanan X !");
            }
            else if(list[6]==1){
                txtKazanan.setText("Kazanan O !");
            }
        }
        else{
            for(int i=0;i<9;i++){
                if(list[i]==0 || list[i]==1){
                    sayac++;
                }
            }
            if(sayac ==9){
                txtKazanan.setText("Berabere !");kontrol = true;
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
            stopped=true;
        }
        return kontrol;
    }
    private void baslangıcHali() {
        progressStatus=0;
        progressBar.setProgress(progressStatus);
        if(sira==0)
            progressBar.getProgressDrawable().setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        else if(sira==1)
            progressBar.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
    }
    private  void progresdegis(){
        baslangıcHali();
    }
    private Thread setKronometre(){
        return new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 10) {
                    if(stopped==true)
                        break;
                    progressStatus ++;
                   handler.post(new Runnable() {public void run() {progressBar.setProgress(progressStatus); }});
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(progressStatus==10){
                   handler.post(new Runnable() {
                       @Override
                       public void run() {
                           stopped=true;
                           sureDoldu();
                       }
                   });

                }
            }
        });
    }
    public void sureDoldu(){
        if(sira==0){
            txtKazanan.setText("Kazanan o !"); }
        else if(sira==1){
            txtKazanan.setText("Kazanan x !"); }
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
}
