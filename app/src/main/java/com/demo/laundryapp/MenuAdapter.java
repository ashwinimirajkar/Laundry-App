package com.demo.laundryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuAdapter extends BaseAdapter {

    Context context;
    ImageView iconImageView;
    TextView titleTextView;
    TextView dayTextView;

    public MenuAdapter(Context context){
        this.context = context;
    }
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = null;
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.gridview_item, null);
        iconImageView = (ImageView) view.findViewById(R.id.iconImageView);
        titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        dayTextView = (TextView) view.findViewById(R.id.dayTextView);

        iconImageView.setImageResource(imageIds[position]);
        titleTextView.setText(titleStrings[position]);
        dayTextView.setText(subStrings[position]);



        return view;
    }

   private Integer[] imageIds = {
           R.drawable.wash,
           R.drawable.iron,
           R.drawable.hanger,
           R.drawable.profile
   };

   private Integer[] titleStrings = {
           R.string.wash_and_iron,
           R.string.only_iron,
           R.string.dry_cleaning,
           R.string.account
   };

   private Integer[] subStrings = {
           R.string.three_days,
           R.string.two_days,
           R.string.three_days,
           R.string.user_name
   };
}
