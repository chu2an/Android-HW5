package app.iecs.fcu.android_hw5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chuan.an on 2017/5/6.
 */

public class PlayerArrayAdapter extends ArrayAdapter<myListview> {
    Context context;
    public PlayerArrayAdapter(Context context, ArrayList<myListview> items){
        super(context,0,items);
        this.context = context;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater myInflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView==null){
            itemlayout = (LinearLayout)myInflater.inflate(R.layout.list_item, null);
        }
        else{
            itemlayout = (LinearLayout) convertView;
        }
        myListview item = (myListview)getItem(position);
        ImageView iv_imageA = (ImageView)itemlayout.findViewById(R.id.iv_image_A);
        iv_imageA.setImageResource(item.imageA);
        TextView tv_textA = (TextView)itemlayout.findViewById(R.id.tv_text_A);
        tv_textA.setText(item.textA);
        ImageView iv_imageB = (ImageView)itemlayout.findViewById(R.id.iv_image_B);
        iv_imageA.setImageResource(item.imageB);
        TextView tv_textB = (TextView)itemlayout.findViewById(R.id.tv_text_B);
        tv_textA.setText(item.textB);


        return itemlayout;
    }
}
