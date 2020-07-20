package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ValuePesanActivity extends AppCompatActivity {

    private static final String ACTION_UPDATE_NOTIFICATION =
            "com.android.example.notifyme.ACTION_UPDATE_NOTIFICATION";
    private static final String PRIMARY_CHANNEL_ID =
            "primary_notification_channel";
    private static final int NOTIFICATION_ID = 0;
    private NotificationManager mNotifyManager;
//    private NotificationReceiver mReceiver = new NotificationReceiver();

    TextView Vnama,Vnohp,Valamat,Vpilihan,Vtanggal,Vcard,Vpaket,Vtotal;
    Button submit;

//    private DatabaseReference databasegetpesbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_pesan);

//        databasegetpesbox = FirebaseDatabase.getInstance().getReference("pembox");

        Vnama = findViewById(R.id.vnama);
        Vnohp = findViewById(R.id.vwa);
        Valamat = findViewById(R.id.valamat);
        Vpilihan = findViewById(R.id.vpil);
        Vtanggal = findViewById(R.id.vtanggal);
        Vcard = findViewById(R.id.vcard);
//        Vpaket = findViewById(R.id.vpaket);
        Vtotal = findViewById(R.id.vtotal);
        submit = findViewById(R.id.submit);

        Intent valuebox = getIntent();
        String vnama = valuebox.getStringExtra("extraNama");
        String vnohp = valuebox.getStringExtra("extraNohp");
        String valamat = valuebox.getStringExtra("extraAlamat");
        String Vpilihan = valuebox.getStringExtra("extraPilihan");
        String vtanggal = valuebox.getStringExtra("extraTanggal");
        String vpaket = valuebox.getStringExtra("extraCard");
        String vporsi = valuebox.getStringExtra("extraPaket");
        String vtotal = valuebox.getStringExtra("extraTotal");

        Vnama.setText(vnama);
        Vnohp.setText(vnohp);
        Valamat.setText(valamat);
//        Vpilihan.setText(vpilihan);
        Vtanggal.setText(vtanggal);
//        Vcard.setText(vcard);
//        Vporsi.setText(vporsi);
        Vtotal.setText(vtotal);

        //Firebase Init
//        storage = FirebaseStorage.getInstance();
//        storageReference = storage.getReference();

//        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.O){
//            NotificationChannel ch = new NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager mn = getSystemService(NotificationManager.class);
//            mn.createNotificationChannel(ch);
//        }
//        createNotificationChannel();
//        registerReceiver(mReceiver, new IntentFilter(ACTION_UPDATE_NOTIFICATION));
//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(getApplicationContext(), BuktiTfPesta.class);
////                startActivity(intent);
//                Intent intent = new Intent(ValuePesanActivity.this, Main2Activity.class);
//                startActivity(intent);
//                notifikasi();
//            }
//        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String VelNama = Vnama.getText().toString();
//                String VelAlamat = Valamat.getText().toString();
                Intent bktbox = new Intent(ValuePesanActivity.this, Main2Activity.class);
//                bktbox.putExtra("Velnama", VelNama);
//                bktbox.putExtra("Velalamat", VelAlamat);
//                startActivity(bktbox);
//                getpesbox();
            }
        });
    }

    private void getpesbox(){
        String Nama = Vnama.getText().toString().trim();
        String Nohp = Vnohp.getText().toString().trim();
        String Alamat = Valamat.getText().toString().trim();
        String Sppil = Vpilihan.getText().toString().trim();
        String Tanggal = Vtanggal.getText().toString().trim();
        String Card = Vcard.getText().toString().trim();
        String Paket = Vpaket.getText().toString().trim();
//        String Porsi = Vporsi.getText().toString().trim();
        int Total = Integer.parseInt(Vtotal.getText().toString().trim());

        if(!TextUtils.isEmpty(Nama)){

//            String id = databasegetpesbox.push().getKey();

//            getpesbox pesbox = new getpesbox(id,Nama,Nohp,Alamat,Sppil,Tanggal,Paket,Total);

//            databasegetpesbox.child(id).setValue(pesbox);

            Toast.makeText(this, "Pemesanan Catering Box", Toast.LENGTH_LONG).show();


        }else {
            Toast.makeText(this,"Anda Belum Mengisi Pemesanan", Toast.LENGTH_LONG).show();
        }

    }
}
