package com.sri.aiapracticework.topmovies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.sri.aiapracticework.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListItemViewHolder> {

    private List<ViewModel> list;

    ListAdapter(List<ViewModel> list) {
        this.list = list;
    }

    @NotNull
    @Override
    public ListItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row, parent, false);
        return new ListItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ListItemViewHolder holder, int position) {

        holder.itemName.setText(list.get(position).getName());
        holder.countryName.setText(list.get(position).getCountry());

    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    static class ListItemViewHolder extends RecyclerView.ViewHolder {

        TextView itemName;
        TextView countryName;

        private ListItemViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.textView_fragmentlist_task_name);
            countryName = itemView.findViewById(R.id.textView_fragmentlist_country_name);
        }
    }
}

