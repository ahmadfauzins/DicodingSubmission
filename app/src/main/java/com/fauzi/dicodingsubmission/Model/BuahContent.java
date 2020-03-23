package com.fauzi.dicodingsubmission.Model;

import com.fauzi.dicodingsubmission.R;

import java.util.ArrayList;

public class BuahContent {
    public static String[]namabuah ={
            "APEL","BENGKOANG","JERUK","KIWI","LEMON","MANGGA","MANGGIS","MELON","NANAS","STROBERI"
    };

    public static String[]manfaat={
            "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
            "Bengkuang atau bengkoang (Pachyrhizus erosus) dikenal dari umbi (cormus) putihnya yang bisa dimakan sebagai komponen rujak dan asinan atau dijadikan masker untuk menyegarkan wajah dan memutihkan kulit. Tumbuhan yang berasal dari Benua Amerika ini termasuk dalam suku polong-polongan atau Fabaceae.",
            "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.",
            "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, Tiongkok.",
            "Sitrun, jeruk sitrun (dari bahasa Belanda, citroen), atau limun (bahasa Arab: ليمون\u200E), limau (bahasa Portugis: limão), atau lemon adalah sejenis jeruk yang buahnya biasa dipakai sebagai penyedap dan penyegar dalam banyak seni boga dunia.",
            "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dan suku Anacardiaceae. Pohon mangga termasuk tumbuhan tingkat tinggi yang struktur batangnya (habitus) termasuk kelompok arboreus, yaitu tumbuhan berkayu yang mempunyai tinggi batang lebih dari 5 m. Mangga bisa mencapai tinggi antara 10 hingga 40 m.",
            "Manggis (Garcinia mangostana L.) adalah sejenis pohon hijau abadi dari daerah tropika yang diyakini berasal dari Semenanjung Malaya dan menyebar ke Kepulauan Nusantara. Tumbuh hingga mencapai 7 sampai 25 meter. Buahnya juga disebut manggis, berwarna merah keunguan ketika matang, meskipun ada pula varian yang kulitnya berwarna merah. Buah manggis dalam perdagangan dikenal sebagai \"ratu buah\", sebagai pasangan durian, si \"raja buah\". Buah ini mengandung mempunyai aktivitas antiinflamasi dan antioksidan. Sehingga di luar negeri buah manggis dikenal sebagai buah yang memiliki kadar antioksidan tertinggi di dunia.",
            "Melon (Cucumis melo L.) merupakan nama buah sekaligus tanaman yang menghasilkannya, yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. Bagian yang dimakan adalah daging buah (mesokarp). Teksturnya lunak, berwarna putih sampai merah, tergantung kultivarnya.",
            "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae). Perawakan (habitus) tumbuhannya rendah, herba (menahun) dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal. Buahnya dalam bahasa Inggris disebut sebagai pineapple karena bentuknya yang seperti pohon pinus.",
            "Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae. Secara umum buah ini bukanlah buah, melainkan buah palsu,[1] artinya daging buahnya tidak berasal dari ovari tanaman (achenium) tetapi dari bagian bawah hypanthium yang berbentuk mangkok[2] tempat ovari tanaman itu berada.[3][4]",

    };

    private static int[] buahImage= {
            R.drawable.apel,
            R.drawable.bengkoang,
            R.drawable.jeruk,
            R.drawable.kiwi,
            R.drawable.lemon,
            R.drawable.mangga,
            R.drawable.manggis,
            R.drawable.melon,
            R.drawable.nanas,
            R.drawable.stro
    };

    public static ArrayList<Buah> getListData() {
        ArrayList<Buah> list = new ArrayList<>();
        for (int position = 0; position < namabuah.length; position++) {
            Buah place = new Buah();
            place.setName(namabuah[position]);
            place.setManfaat(manfaat[position]);
            place.setPhoto(buahImage[position]);
            list.add(place);
        }
        return list;
    }


}
