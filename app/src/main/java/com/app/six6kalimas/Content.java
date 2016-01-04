package com.app.six6kalimas;

import java.util.ArrayList;

/**
 * Created by Krishna on 02-05-2015.
 */


public class Content {

    public static ArrayList<String> Names;
    public static ArrayList<String> NamesSub;
    public static ArrayList<String> Images;
    public static ArrayList<String> Wallpaper;
    public static ArrayList<String> Audio;
    public static ArrayList<String> BIG_Images;
    public static ArrayList<String> Sub_heading;
    public static ArrayList<String> Description;


    Content(){
        this.Names = new ArrayList<String>();
        this.NamesSub = new ArrayList<String>();
        this.Sub_heading = new ArrayList<String>();
        this.Images = new ArrayList<String>();
        this.Wallpaper = new ArrayList<String>();
        this.BIG_Images = new ArrayList<String>();
        this.Audio = new ArrayList<String>();
        this.Description = new ArrayList<String>();

        this.Names.add(0,"1. Kalma (Tayyabah)");
        this.Names.add(1,"2. Kalma (Shahaadat)");
        this.Names.add(2,"3. Kalma (Tumjeed)");
        this.Names.add(3,"4. Kalma (Tauhid)");
        this.Names.add(4,"5. Kalma (Astaghfar)");
        this.Names.add(5,"6. Kalma (Rud-A-Kuffer)");



       


        //this.Audio.add(0,"null");
        for(int i=1;i<=7;i++){
            this.Audio.add(i-1,"audio"+i);
        }

        for(int j=1;j<=7;j++){
            this.Images.add(j-1,"name"+j+"_small");
        }

        for(int k=1;k<=7;k++){
            this.BIG_Images.add(k-1,"name"+k);
        }

        for(int a=1;a<=7;a++){
            this.Wallpaper.add(a-1,"name"+a+"_wallpaper");
        }


        this.NamesSub.add(0,"1.The Word of Purity (Tayyabah)");
        this.NamesSub.add(1,"2.The word of Testimony (Shahaadat)");
        this.NamesSub.add(2,"3.The word of Glorification (Tumjeed)");
        this.NamesSub.add(3,"4.The word of Unity (Tauhid)");
        this.NamesSub.add(4,"5.The word of Penitence (Astaghfar)");
        this.NamesSub.add(5,"6.The words of rejecting disbelief (Rud-A-Kuffer)");


        this.Sub_heading.add(0,"لآ اِلَهَ اِلّا اللّهُ مُحَمَّدٌ رَسُوُل اللّهِ");
        this.Sub_heading.add(1,"اشْهَدُ انْ لّآ اِلهَ اِلَّا اللّهُ وَحْدَه لَا شَرِيْكَ لَه، وَ اَشْهَدُ اَنَّ مُحَمَّدً اعَبْدُهوَرَسُولُه");
        this.Sub_heading.add(2,"سُبْحَان لِلّه وَ الْحَمْدُ   لِلّهِ وَ لآ اِلهَ اِلّا اللّهُ، وَ اللّهُ اَكْبَرُ وَلا حَوْلَ وَلاَ قُوَّة  ِلَّا بِاللّهِ الْعَلِىّ الْعَظِيْم");
        this.Sub_heading.add(3,"لا الهَ اِلَّا اللّهُ وَحْدَهُ لا شَرِيْكَ لَهْ، لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْى وَ يُمِيْتُ وَ هُوَحَىُّ لَّا يَمُوْتُ اَبَدًا اَبَدًا ط ذُو الْجَلَالِ وَ الْاِكْرَامِ ط بِيَدِهِ الْخَيْرُ ط وَهُوَ عَلى كُلِّ شَئ ٍ قَدِيْرٌ ط");
        this.Sub_heading.add(4,"اسْتَغْفِرُ اللّهَ رَبِّىْ مِنْ كُلِّ ذَنْبٍ اَذْنَبْتُه عَمَدًا اَوْ خَطَاً سِرًّا اَوْ عَلَانِيَةً وَاَتُوْبُ اِلَيْهِ مِنْ الذَّنْبِ الَّذِىْ اَعْلَمُ وَ مِنْ الذَّنْبِ الَّذِىْ لا اَعْلَمُ اِنَّكَ اَنْتَ عَلَّامُ الغُيُبِ وَ سَتَّارُ الْعُيُوْبِ و َغَفَّارُ الذُّنُوْبِ وَ لا حَوْلَ وَلا قُوَّةَ اِلَّا بِاللّهِ الْعَلِىِّ العَظِيْم ");
        this.Sub_heading.add(5,"اَللَّهُمَّ اِنِّيْ اَعُوْذُ بِكَ مِنْ اَنْ اُشْرِكَ بِكَ شَيْئًا وَّ اَنَا اَعْلَمُ بِهِ وَ اَسْتَغْفِرُكَ لِمَا لَا اَعْلَمُ بِهِ تُبْتُ عَنْهُ وَ تَبَرَّأتُ مِنَ الْكُفْرِ وَ الشِّرْكِ وَ الْكِذْبِ وَ الْمَعَاصِيْ كُلِّهَا اَسْلَمْتُ وَ آمَنْتُ وَ اَقُوْلُ لَا اِلَهَ اِلَّا اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِ - ");



        // position 12  13  14 39 59 65 66 75 94
        this.Description.add(0,"La ilaha ill Allah Muhammadur-Rasul Allah                                              " +
                "              (There is no God but Allah Muhammad is the Messenger of Allah)");
        this.Description.add(1,"I bear witness that no-one is worthy of worship but Allah, the One alone, without partner, and I bear witness that Muhammad is His servant and Messenger ");
        this.Description.add(2,"Glory be to Allah and Praise to Allah, and there is no God but Allah, and Allah is the Greatest - And there is no Might or Power except with Allah.");
        this.Description.add(3,"(There is) none worthy of worship except Allah. He is only One. (There is) no partners for Him. For Him (is) the kingdom. And for - Him (is) the Praise. He gives life and causes death. And He (is) Alive. He will not die, never, ever. Possessor of Majesty and Reverence. In His hand (is) the goodness. And He (is) the goodness. And He (is) on everything powerful.");
        this.Description.add(4,"I seek forgiveness from Allah, my lord, from every sin I committed knowingly or unknowingly, secretly or openly, and I turn towards Him from the sin that I know and from the sin that I do not know. Certainly You, You (are) the knower of the hidden things and the Concealer (of) the mistakes and the Forgiver (of) the sins. And (there is) no power and no strength except  from Allah, the Most High, the Most Great.");
        this.Description.add(5,"O Allah! Certainly I seek protection with You from, that I associate partner with You anything and I know it. And I seek - forgiveness from You for that I do not know it. I repended from it and I made myself free from disbelief and polytheism and the falsehood and the back-biting and the innovation and the tell-tales and the bad deeds and the blame and the disobedience, all of them. And I submit and I say (there is) none worthy of worship except Allah, Muhammad is the Messenger of Allah .");

    }

}
