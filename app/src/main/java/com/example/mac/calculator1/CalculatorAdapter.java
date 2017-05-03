package com.example.mac.calculator1;

/**
 * Created by mac on 17/5/2.
 */
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CalculatorAdapter extends BaseAdapter{
    private Context mContext;
    private String[] mStrs=null;

    public CalculatorAdapter(Context context,String[] strs){
        this.mContext=context;
        this.mStrs = strs;
    }

    @Override
    public int getCount(){
        return mStrs.length;
    }
    @Override
    public Object getItem(int position){
        return mStrs[position];
    }
    @Override
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        View view=View.inflate(mContext,R.layout.item_button,null);
        TextView textView=(TextView)view.findViewById(R.id.txt_button);
        String str=mStrs[position];
        textView.setText(str);
        //此处主要是为Back和ce两个按钮单独设置按下效果，根据str的值来设置效果
        if(str.equals("Back")){
            textView.setBackgroundResource(R.drawable.selector_button_backspace);
            textView.setTextColor(Color.WHITE);
        }else if(str.equals("CE")){
            textView.setBackgroundResource(R.drawable.selector_button_backspace);
            textView.setTextColor(Color.WHITE);
        }
        return view;
    }

}

