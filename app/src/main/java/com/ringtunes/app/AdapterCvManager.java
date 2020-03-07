package com.ringtunes.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterCvManager extends RecyclerView.Adapter<AdapterCvManager.MyViewHolder> {
    List<NewModel> dummyModelPackages = new ArrayList<>();
    ProgressBar progressBar;
    Activity context;
    private List<NewModel> retailItemList;
    private List<NewModel> itemsListFiltered;
    TextView ringname;
    RecyclerView recyclerView;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView cvname, cvrlettername, defaults;
        LinearLayout linearLayout;
        LinearLayout playfile;
        public ImageView playpause;

        public MyViewHolder(View view) {
            super(view);
            playfile = view.findViewById(R.id.playfile);
            linearLayout = view.findViewById(R.id.largeLabel);
            defaults = view.findViewById(R.id.text);
            playpause = view.findViewById(R.id.imageview);

        }
    }

    public AdapterCvManager(RecyclerView recyclerView, Activity context, List<NewModel> retailItems, TextView textView) {
        this.recyclerView = recyclerView;
        this.context = context;
//        this.listener = listener;
        this.retailItemList = retailItems;
        this.itemsListFiltered = retailItems;
        this.ringname = textView;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tableitem5, parent, false);

        return new MyViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        final NewModel contact = itemsListFiltered.get(position);
        final MediaPlayer mediaPlayer = MediaPlayer.create(context, contact.getResource());

        if (position % 2 == 1) {
            // Set a background color for ListView regular row/item
            holder.linearLayout.setBackgroundColor(context.getColor(R.color.rowcolor));
        } else {
            // Set the background color for alternate row/item
            holder.linearLayout.setBackgroundColor(context.getColor(R.color.colorPrimaryDark));
        }
        holder.defaults.setText("" + contact.getTitle());
        holder.playpause.setImageDrawable(context.getDrawable(R.drawable.play));

        holder.playfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ringname.setText("" + contact.getTitle());
                if (mediaPlayer != null) {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();

                        holder.playpause.setImageDrawable(context.getDrawable(R.drawable.play));
                    } else {
                        mediaPlayer.start();
                        holder.playpause.setImageDrawable(context.getDrawable(R.drawable.pause));
                    }
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemsListFiltered.size();
    }

}