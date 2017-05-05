package app.iecs.fcu.android_hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import app.iecs.fcu.android_hw5.TeamItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ArrayList<TeamItem> teamlist = new ArrayList<TeamItem>();
        // 將 TeamItem 形狀的 ArrayList     new進來

        teamlist.add(new TeamItem(
                R.drawable.nba_cavaliers , "騎士" , 89 ,
                R.drawable.nba_raptors , "暴龍" , 106 ));
        teamlist.add(new TeamItem(
                R.drawable.nba_spurs , "馬刺" , 111 ,
                R.drawable.nba_rockets , "火箭" , 95 ));
        //將兩筆資料存入 Arraylist 中

        TeamArrayAdapter adapter = new TeamArrayAdapter(this,teamlist);
        //將 Arraylist 導向 ArrarAdapter

        lv = (ListView)findViewById(R.id.lv);
        lv.setAdapter(adapter);
        // Adapter 導入 ListView
        //lv.setOnItemClickListener(itemclick);
    }
    /*private AdapterView.OnItemClickListener itemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivity.this, "Click "+position, Toast.LENGTH_SHORT).show();
        }
    };*/
}
