package com.example.whm.UI.BalancesActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whm.Model.Item;
import com.example.whm.R;

import java.util.List;

public class BalanceAdapter extends RecyclerView.Adapter<BalanceAdapter.BalanceViewHolder>{

    //private ArrayList<Stores> storesList = new ArrayList<>();
    List<Item> itemList ;
    Context context;

    public BalanceAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context =  context;
    }

    @NonNull
    @Override
    public BalanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_item, parent,  false);
        return new BalanceAdapter.BalanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.whm.UI.BalancesActivity.BalanceAdapter.BalanceViewHolder holder, int position) {
        // Stores stores = storesList.get(position);
//        holder.store_id_tv.setText(storesList.get(position).getUserId());
        holder.store_name_en_tv.setText(itemList.get(position).getItemNameEn());


        // holder.store_name_en_tv.setText(data1[position]);
        // holder.store_id_tv.setText(data2[position]);
        // holder.store_imageView.setImageResource(images[position]) ;


    }



    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public void setItemList(List<Item>itemsList){
        this.itemList = itemsList;
        notifyDataSetChanged();

    }

    public static class BalanceViewHolder extends RecyclerView.ViewHolder{
        TextView store_name_en_tv , store_id_tv;
        ImageView store_imageView;

        public BalanceViewHolder(@NonNull View itemView) {
            super(itemView);
            store_name_en_tv = itemView.findViewById(R.id.store_name_en);
            store_id_tv =itemView.findViewById(R.id.store_id);
            store_imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
