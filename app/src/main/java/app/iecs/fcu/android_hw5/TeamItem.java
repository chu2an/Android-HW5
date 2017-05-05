package app.iecs.fcu.android_hw5;

import android.widget.ImageView;

/**
 * Created by Chuan.an on 2017/5/6.
 */

public class TeamItem {
    int LogoA;
    String TeamNameA;
    int TeamScoreA;
    int LogoB;
    String TeamNameB;
    int TeamScoreB;

    public TeamItem(int logoA, String teamNameA, int teamScoreA, int logoB, String teamNameB, int teamScoreB) {
        LogoA = logoA;
        TeamNameA = teamNameA;
        TeamScoreA = teamScoreA;
        LogoB = logoB;
        TeamNameB = teamNameB;
        TeamScoreB = teamScoreB;
    }
}
