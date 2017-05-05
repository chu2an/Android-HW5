package app.iecs.fcu.android_hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chuan.an on 2017/5/6.
 */

public class TeamArrayAdapter extends ArrayAdapter<TeamItem> {

    Context context;

    public TeamArrayAdapter(Context context, ArrayList<TeamItem> items){
        super(context,0,items);
        this.context = context;
    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        // LayoutInflater 的作用是將 "xml版面" 轉換成 "list物件"
        RelativeLayout itemlayout = null;
        if(convertView == null){
            itemlayout = (RelativeLayout) inflater.inflate(R.layout.listitem,null);
        }
        else{
            itemlayout = (RelativeLayout) convertView;
        }
        TeamItem item = (TeamItem)getItem(position);

        ImageView iv_logoA = (ImageView)itemlayout.findViewById(R.id.iv_TeamLogo_A);
        iv_logoA.setImageResource(item.LogoA);

        TextView tv_nameA = (TextView)itemlayout.findViewById(R.id.tv_TeamName_A);
        tv_nameA.setText(item.TeamNameA);

        TextView tv_scoreA = (TextView)itemlayout.findViewById(R.id.tv_TeamScore_A);
        tv_scoreA.setText(item.TeamScoreA);

        ImageView iv_logoB = (ImageView)itemlayout.findViewById(R.id.iv_TeamLogo_B);
        iv_logoB.setImageResource(item.LogoB);

        TextView tv_nameB = (TextView)itemlayout.findViewById(R.id.tv_TeamName_B);
        tv_nameB.setText(item.TeamNameB);

        TextView tv_scoreB = (TextView)itemlayout.findViewById(R.id.tv_TeamScore_B);
        tv_scoreB.setText(item.TeamScoreB);

        return itemlayout;
    }
}
