package com.example.renters.helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.renters.R;
import com.google.android.gms.common.Feature;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.FeaturedViewHolder> {
    
    
    ArrayList<FeaturedHelperClass> featuredLocations;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredLocations)
    {
        this.featuredLocations=featuredLocations;
    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,description;
        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.featured_image);
            title=itemView.findViewById(R.id.featured_title);
            description=itemView.findViewById(R.id.featured_description);

        }
    }
    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);

        FeaturedViewHolder featuredViewHolder=new FeaturedViewHolder(view);

        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {

        FeaturedHelperClass featuredHelperClass = featuredLocations.get(position);
        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.description.setText(featuredHelperClass.getDescription());
        holder.title.setText(featuredHelperClass.getTitle());
    }

    @Override
    public int getItemCount() {

        return featuredLocations.size();
    }
}
