package com.example.whm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter3 extends RecyclerView.Adapter<MyAdapter3.MyViewHolder3> {

    String data5[], data6[];
    int images3[];
    Context context2;

    public MyAdapter3(Context ct2, String s5[], String s6[], int img3[]) {
        context2 = ct2;
        data5 = s5;
        data6 = s6;
        images3 = img3;
    }
    @NonNull
    @Override
    public MyAdapter3.MyViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context2);
        View view = inflater.inflate(R.layout.my_row3, parent, false);

        return new MyAdapter3.MyViewHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter3.MyViewHolder3 holder, int position) {
        holder.textView5.setText(data5[position]);
        holder.textView6.setText(data6[position]);
        holder.imageView3.setImageResource(images3[position]);
    }

    @Override
    public int getItemCount() {
        return images3.length;
    }

    public class MyViewHolder3 extends RecyclerView.ViewHolder {
        TextView textView5, textView6;
        ImageView imageView3;
        public MyViewHolder3(@NonNull View itemView) {
            super(itemView);
            textView5 = itemView.findViewById(R.id.textView5);
            textView6 = itemView.findViewById(R.id.textView6);
            imageView3 = itemView.findViewById(R.id.imageView3);

        }
    }
}
