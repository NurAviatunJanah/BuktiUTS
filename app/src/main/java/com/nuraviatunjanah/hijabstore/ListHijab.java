package com.nuraviatunjanah.hijabstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListHijab extends RecyclerView.Adapter<ListHijab.ListViewHolder> {
    private OnItemClickCallback onItemClickCallback;

    private ArrayList<Hijab> listHijab;

    public ListHijab(ArrayList<Hijab> list) {
        this.listHijab = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListHijab.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_hijab, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListHijab.ListViewHolder holder, int position) {
        Hijab hijab = listHijab.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hijab.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(hijab.getName());
        holder.tvDetail.setText(hijab.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listHijab.get(holder.getAdapterPosition()));
            }
        });
    }
    @Override
    public int getItemCount() {
        return listHijab.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Hijab data);
    }

}
