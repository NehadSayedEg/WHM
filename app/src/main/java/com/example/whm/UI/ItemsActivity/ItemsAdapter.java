package com.example.whm.UI.ItemsActivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whm.Model.Item;
import com.example.whm.Model.Store;
import com.example.whm.R;

import java.util.List;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder>{
    private List<Item> itemList ;
    Context context;

    public ItemsAdapter(List<Item> itemList, Context context) {
        this.itemList = itemList;
        this.context =  context;
    }

    @NonNull
    @Override
    public ItemsAdapter.ItemsViewHolder  onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_item, parent,  false);
        return new ItemsAdapter.ItemsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

        holder.item_name_en_tv.setText(itemList.get(position).getItemNameEn());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    public void setItemList(List<Item>itemsList){
        this.itemList = itemsList;
        notifyDataSetChanged();
        Log.e("Store Sze list" , itemsList.size() +"size");
    }

    public static class ItemsViewHolder extends RecyclerView.ViewHolder{
        TextView item_name_en_tv , item_id_tv;
        ImageView store_imageView;

        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name_en_tv = itemView.findViewById(R.id.item_name_en);
            item_id_tv =itemView.findViewById(R.id.item_id);

        }
    }
}
