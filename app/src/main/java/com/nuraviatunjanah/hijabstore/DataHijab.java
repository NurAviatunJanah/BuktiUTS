package com.nuraviatunjanah.hijabstore;

import java.util.ArrayList;

public class DataHijab {
    private static String[] HijabNames = {
            "Hijab Rabbani",
            "Hijab Elzatta",
            "Hijab Madina",
            "Hijab Bella",
            "Hijab Tesavara",
            "Hijab Uniqo",
            "Hijab Sqware",
            "Hijab Kairo",
            "Hijab Trend"
    };

    private static String[] HijabDetails = {
            "Hijab Rabbani memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Elzatta memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Madina memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Bella memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Tesavara memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Uniqo memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Sqware memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Kairo memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya.",
            "Hijab Trend.id memiliki berbagai jenis dan warna, dengan bahan yang terjamin akan kualitasnya."
    };

    private static int[] HijabImages = {
            R.drawable.hijabrabbani,
            R.drawable.hijabelzatta,
            R.drawable.hijabmadina,
            R.drawable.hijabbella,
            R.drawable.hijabtesavara,
            R.drawable.hijabuniqo,
            R.drawable.hijabsqware,
            R.drawable.hijabkairo,
            R.drawable.hijabtrend
    };

    private static String[] HijabHarga={
            "Hijab Rabbani : Rp. 50.000",
            "Hijab Elzatta : Rp. 50.000",
            "Hijab Madina : Rp. 50.000",
            "Hijab Bella : Rp. 50.000",
            "Hijab Tesavara : Rp. 50.000",
            "Hijab Uniqo: Rp. 50.000",
            "Hijab Sqware : Rp. 50.000",
            "Hijab Kairo : Rp. 50.000",
            "Hijab Trend : Rp. 50.000"

    };

    static ArrayList<Hijab> getListData() {
        ArrayList<Hijab> list = new ArrayList<>();
        for (int position = 0; position < HijabNames.length; position++) {
            Hijab hijab = new Hijab();
            hijab.setName(HijabNames[position]);
            hijab.setDetail(HijabDetails[position]);
            hijab.setPhoto(HijabImages[position]);
            hijab.setHarga(HijabHarga[position]);
            list.add(hijab);
        }
        return list;
    }
}
