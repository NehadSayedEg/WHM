package com.example.whm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.MyViewHolder2> {
    String data3[], data4[];
    int images2[];
    Context context1;

    public MyAdapter2(Context ct1, String s3[], String s4[], int img2[]) {
        context1 = ct1;
        data3 = s3;
        data4 = s4;
        images2 = img2;
    }

    @NonNull
    @Override
    public MyAdapter2.MyViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context1);
        View view = inflater.inflate(R.layout.my_row2, parent, false);

        return new MyViewHolder2(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter2.MyViewHolder2 holder, int position) {
        holder.textView3.setText(data3[position]);
        holder.textView4.setText(data4[position]);
        holder.imageView2.setImageResource(images2[position]);
    }

    @Override
    public int getItemCount() {
        return images2.length;
    }

    public class MyViewHolder2 extends RecyclerView.ViewHolder {
        TextView textView3, textView4;
        ImageView imageView2;


        public MyViewHolder2(@NonNull View itemView) {
            super(itemView);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            imageView2 = itemView.findViewById(R.id.imageView2);

        }
    }
}