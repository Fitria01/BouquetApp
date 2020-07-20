//package com.example.project.ui.pemesanan;
//
//import android.app.DatePickerDialog;
//import android.content.Intent;
//import android.graphics.Color;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.DatePicker;
//import android.widget.EditText;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//
//import com.example.project.R;
//
//import java.util.Calendar;
//
//public class SlideshowFragment extends Fragment {
//
//    TextView tv_tanggal, hrg;
//    EditText et_nama, et_wa, et_alamat, et_total, et_card, et_tanggal;
//    RadioGroup rgpilih;
//    RadioButton rose, peony, wisuda;
//    Spinner pilihan;
//    Button simpan, plus, min;
//    Integer valuejumlah = 0;
//    int harga [] = { 30000, 35000, 40000};
//    TextView tv_angka;
//    DatePickerDialog.OnDateSetListener setListener;
//
//
//
//
////    private SlideshowViewModel slideshowViewModel;
//
//    public View onCreateView(LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        slideshowViewModel =
////                ViewModelProviders.of(this).get(SlideshowViewModel.class);
//        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
//        hrg = root.findViewById(R.id.hrg);
//        tv_tanggal = root.findViewById(R.id.tv_tanggal);
//        et_nama = root.findViewById(R.id.et_nama);
//        et_wa = root.findViewById(R.id.et_wa);
//        et_alamat = root.findViewById(R.id.et_alamat);
//        et_card = root.findViewById(R.id.et_card);
//        et_total = root.findViewById(R.id.et_total);
//        rgpilih = root.findViewById(R.id.rgpilih);
//        rose = root.findViewById(R.id.rose);
//        peony = root.findViewById(R.id.peony);
//        wisuda = root.findViewById(R.id.wisuda);
//        pilihan = root.findViewById(R.id.pilihan);
//        simpan = root.findViewById(R.id.simpan);
//        plus = root.findViewById(R.id.plus);
//        min = root.findViewById(R.id.min);
//        et_tanggal = root.findViewById(R.id.et_tanggal);
//
//        if (savedInstanceState != null) {
//            String nilaiSaved = savedInstanceState.getString("nilai");
//            tv_angka.setText(nilaiSaved);
//        }
//
//        Calendar calendar = Calendar.getInstance();
//        final int year = calendar.get(Calendar.YEAR);
//        final int month = calendar.get(Calendar.MONTH);
//        final int day = calendar.get(Calendar.DAY_OF_MONTH);
//
////        tvtgl.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                DatePickerDialog datePickerDialog = new DatePickerDialog(
////                        SlideshowFragment.this,R.style.Theme_AppCompat_DayNight_Dialog_MinWidth, setListener, year, month, day);
////                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
////                datePickerDialog.show();
////            }
////        });
//
//        setListener = new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                month = month + 1;
//                String date = day + "/" + month + "/" + year;
//                tvtgl.setText(date);
//            }
//        };
////        et_tanggal.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View v) {
////                DatePickerDialog datePickerDialog = new DatePickerDialog(
////                        SlideshowFragment.this, new DatePickerDialog.OnDateSetListener() {
////                    @Override
////                    public void onDateSet(DatePicker view, int year, int month, int day) {
////                        month = month + 1;
////                        String date = day + "/" + month + "/" + year;
////                        et_tanggal.setText(date);
////                    }
////                }, year, month, day);
////                datePickerDialog.show();
////            }
////        });
//        plus.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                valuejumlah += 1;
//                tv_angka.setText(valuejumlah.toString());
//                int tot =Integer.parseInt(tv_angka.getText().toString());
//                int hrd = Integer.parseInt(hrg.getText().toString());
//                int total = tot*hrd;
//                et_total.setText(String.valueOf(total));
//            }
//        });
//        min.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (valuejumlah > 1){
//                    valuejumlah -= 1;
//                    tv_angka.setText(valuejumlah.toString());
//                    int tot =Integer.parseInt(tv_angka.getText().toString());
//                    int hrd = Integer.parseInt(hrg.getText().toString());
//                    int total = tot*hrd;
//                    et_total.setText(String.valueOf(total));
//                }
//            }
//        });
//
//        simpan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String vNama = et_nama.getText().toString();
//                String vNohp = et_wa.getText().toString();
//                String vAlamat = et_alamat.getText().toString();
//                String Spbox = String.valueOf(pilihan.getSelectedItem());
//                String vTanggal = et_tanggal.getText().toString();
//                String pilpkt = " ";
//                if (rose.isChecked()){
//                    pilpkt+= "Rose Style";
//                }
//                if (peony.isChecked()){
//                    pilpkt+= "Peony Style";
//                }
//                if (wisuda.isChecked()){
//                    pilpkt+= "Wisuda Style";
//                }
//                String vPorsi = tv_angka.getText().toString();
//                String vTotal = et_total.getText().toString();
//
//
//                if (vNama.isEmpty()) {
//                    et_nama.setError("Nama tidak boleh kosong");
//                    et_nama.requestFocus();
//                    return;
//                }
//                if (vNama.length() < 3) {
//                    et_nama.setError("Nama harus lebih dari 2 karakter");
//                    return;
//                }
//
//                if (vNohp.isEmpty()) {
//                    et_wa.setError("Nomor telpon tidak boleh kosong");
//                    et_wa.requestFocus();
//                    return;
//                }
//                if (vNohp.length() < 12) {
//                    et_wa.setError("Masukan nomor telepon yang valid");
//                    return;
//                }
//                if (vAlamat.isEmpty()) {
//                    et_alamat.setError("Alamat tidak boleh kosong");
//                    et_alamat.requestFocus();
//                    return;
//                }
//
//                Intent box = new Intent(SlideshowFragment.this, ValueBoxActivity.class);
//                box.putExtra("extraNama", vNama);
//                box.putExtra("extraNohp", vNohp);
//                box.putExtra("extraAlamat", vAlamat);
//                box.putExtra("extraSpbox", Spbox);
//                box.putExtra("extraTanggal", vTanggal);
//                box.putExtra("extraPaket", pilpkt);
//                box.putExtra("extraPorsi", vPorsi);
//                box.putExtra("extraTotal", vTotal);
//                startActivity(box);
//
//            }
//        });
//
//    }
//
////
////    public void onRadioButtonClicked(View view) {
////        // Is the button now checked?
////        boolean checked = ((RadioButton) view).isChecked();
////        // Check which radio button was clicked.
////        switch (view.getId()) {
////            case R.id.pktayam:
////                if (checked)
////                    // Same day service
////                    ettotal.setText(String.valueOf(harga[0]));
////                hrg.setText(String.valueOf(harga[0]));
////                displayToast(getString(R.string.pktayam));
////                break;
////            case R.id.pktcumi:
////                if (checked)
////                    // Next day delivery
////                    ettotal.setText(String.valueOf(harga[2]));
////                hrg.setText(String.valueOf(harga[2]));
////
////                displayToast(getString(R.string.pktcumi));
////                break;
////            case R.id.pktudang:
////                if (checked)
////                    // Next day delivery
////                    ettotal.setText(String.valueOf(harga[1]));
////                hrg.setText(String.valueOf(harga[1]));
////
////                displayToast(getString(R.string.pktudang));
////                break;
////            case R.id.pktdaging:
////                if (checked)
////                    // Next day delivery
////                    ettotal.setText(String.valueOf(harga[3]));
////                hrg.setText(String.valueOf(harga[3]));
////
////                displayToast(getString(R.string.pktdaging));
////                break;
////            default:
////                // Do nothing.
////                break;
////        }
//    }
//    private void displayToast(String message) {
////        Toast.makeText(getApplicationContext(), message,
////                Toast.LENGTH_SHORT).show();
//    }
//
//
//
////        return root;
//    }
//}