package com.example.renters.helper;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.renters.R;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.AdapterAllCategoriesViewHolder>{

    ArrayList<CategoriesHelperClass> mostViewedLocations;
    private final CategoryViewInterface categoryViewInterface;

    public CategoriesAdapter(ArrayList<CategoriesHelperClass> mostViewedLocations,CategoryViewInterface categoryViewInterface) {
        this.mostViewedLocations = mostViewedLocations ;
        this.categoryViewInterface = categoryViewInterface ;
    }
    @NonNull
    @Override
    public AdapterAllCategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_card_design, parent, false);
        AdapterAllCategoriesViewHolder lvh = new AdapterAllCategoriesViewHolder(view,categoryViewInterface);
        return lvh;
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterAllCategoriesViewHolder holder, int position) {
        CategoriesHelperClass helperClass = mostViewedLocations.get(position);
        holder.imageView.setImageResource(helperClass.getPropeprty());
        holder.textView.setText(helperClass.getDescription());
        holder.relativeLayout.setBackground(helperClass.getGradient2());
    }
    @Override
    public int getItemCount() {
        return mostViewedLocations.size();
    }
    public static class AdapterAllCategoriesViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout relativeLayout;
        ImageView imageView;
        TextView textView;
        public AdapterAllCategoriesViewHolder(@NonNull View itemView,CategoryViewInterface categoryViewInterface) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.background_gradient);
            imageView = itemView.findViewById(R.id.ct_image);
            textView = itemView.findViewById(R.id.ct_title);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(categoryViewInterface != null)
                    {
                        int pos = getAdapterPosition();

                        if(pos != RecyclerView.NO_POSITION)
                            categoryViewInterface.onItemClick(pos);
                    }
                }
            });
        }
    }

}
