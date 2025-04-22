package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Mosque;

public class JamiaMasjid implements Mosque {

    @Override
    public void performWudu() {
        System.out.println("Performing Wudu at Jamia Masjid");
    }

    @Override
    public void offerNamaz() {
        System.out.println("Offering Namaz at Jamia Masjid");
    }

    @Override
    public void listenKhutbah() {
        System.out.println("Listening to Khutbah at Jamia Masjid");
    }

    @Override
    public void reciteQuran() {
        System.out.println("Reciting Quran at Jamia Masjid");
    }

    @Override
    public void giveZakat() {
        System.out.println("Giving Zakat at Jamia Masjid");
    }
}
