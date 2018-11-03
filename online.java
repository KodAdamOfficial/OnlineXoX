package com.example.cengizhank.xox_derleme;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class online extends AppCompatActivity {
    private ImageButton ib1,ib2,ib3,ib4,ib5,ib6,ib7,ib8,ib9;
    private int sira,syc=0,indis,Kisi_cntrl;
    private TextView txtX,txtO,txtKazanan;
    private ImageView ivSira;
    private String odId=idKayit.id;
    private String cntrl = "",cntrl2="";
    private DatabaseReference mDatabase;
    private int KisiSira=idKayit.kisiSira;
    private int list [] = {2,3,4,5,6,7,8,9,10};
    private ProgressDialog pD;
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private boolean stopped = false;
    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online);
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
        mDatabase=FirebaseDatabase.getInstance().getReference().child("Odalar").child(odId);
        sira = idKayit.sira;
        if(sira==0)
            ivSira.setImageResource(R.drawable.x);
        else if(sira==1)
            ivSira.setImageResource(R.drawable.o);
        txtX.setText("Player 1");
        txtO.setText("Player 2");
        txtKazanan = findViewById(R.id.txtKazanan2);
        progressBar=findViewById(R.id.progressBar1);
        progressBar.setMax(10);
        progressBar.setIndeterminate(false);
        baslangıcHali();
        pD = new ProgressDialog(this);
        pD.setTitle("Bekleme..");
        pD.setMessage("Player 2 Bekleniyor..");
        pD.setCanceledOnTouchOutside(false);
        pD.show();
        Balslama();
        listenerData();
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[0]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[0]=1;
                        sira =0;
                    }
                    cntrl2="Tus1";
                    indis=0;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[1]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[1]=1;
                        sira =0;
                    }
                    cntrl2="Tus2";
                    indis=1;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }


            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[2]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[2]=1;
                        sira =0;
                    }
                    cntrl2="Tus3";
                    indis=2;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);

                }

            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[3]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[3]=1;
                        sira =0;
                    }
                    cntrl2="Tus4";
                    indis=3;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);

                }

            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[4]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[4]=1;
                        sira =0;
                    }
                    cntrl2="Tus5";
                    indis=4;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }


            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){if(sira==0){
                    list[5]=0;
                    sira =1;
                }
                else if(sira==1){
                    list[5]=1;
                    sira =0;
                }
                    cntrl2="Tus6";
                    indis=5;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);}


            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[6]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[6]=1;
                        sira =0;
                    }
                    cntrl2="Tus7";
                    indis=6;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }


            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[7]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[7]=1;
                        sira =0;
                    }
                    cntrl2="Tus8";
                    indis=7;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }


            }
        });
        ib9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(KisiSira==sira){
                    if(sira==0){
                        list[8]=0;
                        sira =1;
                    }
                    else if(sira==1){
                        list[8]=1;
                        sira =0;
                    }
                    cntrl2="Tus9";
                    indis=8;
                    updateData(list,cntrl2,indis);
                    kazanan_kontrol(list);
                }

            }
        });
    }
    public void kazanan_kontrol(int list[]){
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
            stopped=true;
        }
    }
    public void updateData(int liste[],String tusAdi, int indis){
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Odalar").child(odId);
        mDatabase.child("Sıra").setValue(sira);
        mDatabase.child(tusAdi).setValue(liste[indis]);
        listenerData();
    }
    public void listenerData(){
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Odalar").child(odId);
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                cntrl = String.valueOf(dataSnapshot.child("Sıra").getValue());
                siraDegis(cntrl);
                Kisi_cntrl=Integer.parseInt(String.valueOf(dataSnapshot.child("kisi_sayisi").getValue()));
                Balslama();
                list[0]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus1").getValue()));
                list[1]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus2").getValue()));
                list[2]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus3").getValue()));
                list[3]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus4").getValue()));
                list[4]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus5").getValue()));
                list[5]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus6").getValue()));
                list[6]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus7").getValue()));
                list[7]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus8").getValue()));
                list[8]=Integer.parseInt(String.valueOf(dataSnapshot.child("Tus9").getValue()));
                hamleIsle();
                kazanan_kontrol(list);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public void siraDegis(String Sira){
        ivSira=findViewById(R.id.ivSira2);
        if(Sira.equals("0"))
        {ivSira.setImageResource(R.drawable.x);
        sira=0;progresdegis();}
        else if(Sira.equals("1"))
        {ivSira.setImageResource(R.drawable.o);
        sira=1;progresdegis();}
    }
    public void hamleIsle(){
                if(list[0]==0){ib1.setImageResource(R.drawable.x);ib1.setEnabled(false);}
                else if(list[0]==1){ib1.setImageResource(R.drawable.o);ib1.setEnabled(false);}


                if(list[1]==0){ib2.setImageResource(R.drawable.x);ib2.setEnabled(false);}
                else if(list[1]==1){ib2.setImageResource(R.drawable.o);ib2.setEnabled(false);}


                if(list[2]==0){ib3.setImageResource(R.drawable.x);ib3.setEnabled(false);}
                else if(list[2]==1){ib3.setImageResource(R.drawable.o);ib3.setEnabled(false);}


                if(list[3]==0){ib4.setImageResource(R.drawable.x);ib4.setEnabled(false);}
                else if(list[3]==1){ib4.setImageResource(R.drawable.o);ib4.setEnabled(false);}


                if(list[4]==0){ib5.setImageResource(R.drawable.x);ib5.setEnabled(false);}
                else if(list[4]==1){ib5.setImageResource(R.drawable.o);ib5.setEnabled(false);}


                if(list[5]==0){ib6.setImageResource(R.drawable.x);ib6.setEnabled(false);}
                else if(list[5]==1){ib6.setImageResource(R.drawable.o);ib6.setEnabled(false);}


                if(list[6]==0){ib7.setImageResource(R.drawable.x);ib7.setEnabled(false);}
                else if(list[6]==1){ib7.setImageResource(R.drawable.o);ib7.setEnabled(false);}


                if(list[7]==0){ib8.setImageResource(R.drawable.x);ib8.setEnabled(false);}
                else if(list[7]==1){ib8.setImageResource(R.drawable.o);ib8.setEnabled(false);}


                if(list[8]==0){ib9.setImageResource(R.drawable.x);ib9.setEnabled(false);}
                else if(list[8]==1){ib9.setImageResource(R.drawable.o);ib9.setEnabled(false);}

    }
    public void Balslama(){
        if(Kisi_cntrl==2){pD.dismiss();
        if(syc==0){setKronometre().start();syc=1;}
            }
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
    private  void progresdegis(){
        baslangıcHali();
    }
    private void baslangıcHali() {
        progressStatus=0;
        progressBar.setProgress(progressStatus);
        if(sira==0)
            progressBar.getProgressDrawable().setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        else if(sira==1)
            progressBar.getProgressDrawable().setColorFilter(Color.GREEN, android.graphics.PorterDuff.Mode.SRC_IN);
    }
}
