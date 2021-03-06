package com.example.murodjonrahimov.hackathon.controller;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.murodjonrahimov.hackathon.R;
import com.example.murodjonrahimov.hackathon.views.ParksViewHolder;
import com.example.murodjonrahimov.hackathon.model.Park;
import java.util.List;


public class ParksAdapter extends RecyclerView.Adapter<ParksViewHolder> {

    private List<Park> listOfParks;

    public ParksAdapter(List<Park> listOfParks) {
        this.listOfParks = listOfParks;
    }

    @Override
    public ParksViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.parks_itemview_layot, parent, false);
        return new ParksViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ParksViewHolder holder, int position) {

        Park parks = listOfParks.get(position);
        holder.onBind(parks);
    }

    @Override
    public int getItemCount() {
        return listOfParks.size();
    }
}
