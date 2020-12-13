package com.example.whm.UI.StoresActivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whm.Model.Users;
import com.example.whm.R;

import java.util.List;

public class StoresAdapter extends RecyclerView.Adapter<StoresAdapter.StoresViewHolder>{

    //private ArrayList<Stores> storesList = new ArrayList<>();
    private List<Users> storesList ;
    Context context;

    public StoresAdapter(List<Users> storesList, Context context) {
        this.storesList = storesList;
        this.context =  context;
    }

    @NonNull
    @Override
    public StoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.store_item, parent,  false);

        return new StoresViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StoresViewHolder holder, int position) {
       // Stores stores = storesList.get(position);
//        holder.store_id_tv.setText(storesList.get(position).getUserId());
        holder.store_name_en_tv.setText(storesList.get(position).getUserNameEn());


        // holder.store_name_en_tv.setText(data1[position]);
       // holder.store_id_tv.setText(data2[position]);
       // holder.store_imageView.setImageResource(images[position]) ;

    }

    @Override
    public int getItemCount() {
        return storesList.size();
    }


    public void setStoresList(List<Users>storesList){
        this.storesList = storesList;
        notifyDataSetChanged();

    }

    public static class StoresViewHolder extends RecyclerView.ViewHolder{
        TextView store_name_en_tv , store_id_tv;
        ImageView store_imageView;

        public StoresViewHolder(@NonNull View itemView) {
            super(itemView);
            store_name_en_tv = itemView.findViewById(R.id.store_name_en);
            store_id_tv =itemView.findViewById(R.id.store_id);
            store_imageView = itemView.findViewById(R.id.imageView);

        }
    }
}
