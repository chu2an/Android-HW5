package app.iecs.fcu.android_hw5;

import android.app.ListActivity;

import java.util.ArrayList;

/**
 * Created by Chuan.an on 2017/5/6.
 */

public class myListview {
    String textA;
    String textB;
    int imageA;
    int imageB;
    public myListview( int imageA , String textA , int imageB , String textB ) {
        this.textA = textA;
        this.textB = textB;
        this.imageA = imageA;
        this.imageB = imageB;
    } //真不愧是Java語言，Constructor還是可以Auto Generate
}
