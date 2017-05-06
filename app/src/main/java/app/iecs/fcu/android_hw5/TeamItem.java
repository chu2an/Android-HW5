package app.iecs.fcu.android_hw5;

import android.widget.ImageView;

/**
 * Created by Chuan.an on 2017/5/6.
 */

public class TeamItem {

    int LogoA,LogoB;
    String TeamNameA,TeamNameB;
    String TeamScoreA,TeamScoreB;

    public TeamItem(int logoA,  String teamNameA , String teamScoreA ,int logoB, String teamNameB, String teamScoreB) {
        LogoA = logoA;
        LogoB = logoB;
        TeamNameA = teamNameA;
        TeamNameB = teamNameB;
        TeamScoreA = teamScoreA;
        TeamScoreB = teamScoreB;
    }
}

