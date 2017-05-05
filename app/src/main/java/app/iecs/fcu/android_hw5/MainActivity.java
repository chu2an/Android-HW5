package app.iecs.fcu.android_hw5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<myListview> playerlist = new ArrayList<myListview>();

        playerlist.add(new myListview(
                R.drawable.nba_cavaliers,"騎士",
                R.drawable.nba_raptors,"暴龍"));
        playerlist.add(new myListview(
                R.drawable.nba_spurs,"馬刺",
                R.drawable.nba_rockets,"火箭"));

        PlayerArrayAdapter myAdapter =
                new PlayerArrayAdapter(this, playerlist);

        ListView lv_view = (ListView)findViewById(R.id.lv);
        lv_view.setAdapter(myAdapter);
        //lv_view.setOnItemClickListener(itemclick);
    }

}
