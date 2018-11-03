package com.example.cengizhank.xox_derleme;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Random;

public class odabul extends AppCompatActivity{
    private DatabaseReference mDatabase;
    private String odaID="";
    private Button btnKur,btnBul;
    private int sayac =0,sira,kisiSira;
    private String kisiSayisi ="",odaId="";
    private boolean islem=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odabul);
        btnBul = findViewById(R.id.btnOdaBul);
        btnKur = findViewById(R.id.btnOdaKur);
        btnKur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                odaID = "";
                Random r = new Random();
                sira = r.nextInt(2);
                idKayit.sira = sira;
                idKayit.kisiSira = sira;
                idolustur();
                idKayit.id=odaID;

                mDatabase = FirebaseDatabase.getInstance().getReference().child("Odalar").child(odaID);
                HashMap<String,String> userMap = new HashMap<>();
                userMap.put("kisi_sayisi","1");
                userMap.put("odaID",odaID);
                userMap.put("Sıra",String.valueOf(sira));
                userMap.put("Tus1","2");
                userMap.put("Tus2","3");
                userMap.put("Tus3","4");
                userMap.put("Tus4","5");
                userMap.put("Tus5","6");
                userMap.put("Tus6","7");
                userMap.put("Tus7","8");
                userMap.put("Tus8","9");
                userMap.put("Tus9","10");
                userMap.put("Baslan","0");
                mDatabase.setValue(userMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Intent myIntent = new Intent(odabul.this, online.class);
                            startActivity(myIntent);
                        }
                    }
                });
            }
        });

        btnBul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                islem=true;
                mDatabase = FirebaseDatabase.getInstance().getReference().child("Odalar");
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange (@NonNull DataSnapshot dataSnapshot) {
                        if(islem)
                            for(DataSnapshot ds: dataSnapshot.getChildren()) {
                                kisiSayisi = String.valueOf(ds.child("kisi_sayisi").getValue());
                                odaId = String.valueOf(ds.child("odaID").getValue());
                                kisiSira=Integer.parseInt(String.valueOf(ds.child("Sıra").getValue()));
                                if(kisiSayisi.equals("1")){
                                    idKayit.id=odaId;
                                    mDatabase = FirebaseDatabase.getInstance().getReference().child("Odalar").child(odaId);
                                    HashMap<String, Object> userMap2 = new HashMap<>();
                                    userMap2.put("kisi_sayisi","2");
                                    mDatabase.updateChildren(userMap2).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                        }
                                    });
                                    sayac++;
                                    Intent myIntent = new Intent(odabul.this, online.class);
                                    startActivity(myIntent);

                                }
                                if(sayac !=0){
                                    sayac =0;
                                    islem=false;
                                    break;
                                }
                            }

                    }
                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
                if(kisiSira==0){
                    idKayit.kisiSira=1;}
                else if(kisiSira==1){
                    idKayit.kisiSira=0;}
            }
        });
    }

    private void idolustur(){
        String harfler[] = {"erddr34g","sd5rj6t6j","hsre5hj","54e6jrt","hje56uj","6r7jry","etyjetry","rthrthg","er5rytj"};
        Random r = new Random();
        int a,b;
        b = r.nextInt(4);
        for(int i =0;i<b+1;i++){
            a = r.nextInt(8);
            odaID += harfler[a];
        }
    }
}
