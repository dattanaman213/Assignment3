package com.datta.naman.assign2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<ModelFood> mList;

    FoodAdapter(Context context, ArrayList<ModelFood> list)
    {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        View view = layoutInflater.inflate(R.layout.rv_food_items,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i)
    {
        ModelFood foodItem = mList.get(i);
       ImageView image = viewHolder.imageView;
       TextView line1 = viewHolder.text_1;
       TextView line2 = viewHolder.text_2;
       TextView line3 = viewHolder.date1;

       image.setImageResource(foodItem.getImage());
       line1.setText(foodItem.getLine1());
       line2.setText(foodItem.getLine2());
       line3.setText(foodItem.getLine3());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder

    {

        ImageView imageView;
        TextView text_1,text_2,date1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            text_1 = itemView.findViewById(R.id.textView1);
            text_2 = itemView.findViewById(R.id.textView2);
            date1 = itemView.findViewById(R.id.dateView);
        }
    }
}
