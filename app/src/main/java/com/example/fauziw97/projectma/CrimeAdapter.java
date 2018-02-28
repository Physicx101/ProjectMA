package com.example.fauziw97.projectma;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Fauziw97 on 28/02/18.
 */

public class CrimeAdapter extends RecyclerView.Adapter<CrimeAdapter.ViewHolder> {
    CrimeModel mCrimeModel;
    private Context mContext;
    private List<CrimeModel> mCrimeModels;

    public CrimeAdapter(Context mContext, List<CrimeModel> mCrimeModels) {
        this.mContext = mContext;
        this.mCrimeModels = mCrimeModels;
    }

    @Override
    public CrimeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_crime, parent, false);
        ButterKnife.bind(this,view);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CrimeAdapter.ViewHolder holder, int position) {
      // holder.root.setTag(mCrimeModels.get(position));
       mCrimeModel = mCrimeModels.get(position);
       holder.crimeTitle.setText(mCrimeModel.getTitle());
       holder.crimeDesc.setText(mCrimeModel.getDesc());
        Glide.with(mContext)
                .load(mCrimeModel.getImage())
                .into(holder.crimeImage);
    }

    @Override
    public int getItemCount() {
        return mCrimeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.crimeImage)
        ImageView crimeImage;
        @BindView(R.id.crimeTitle)
        TextView crimeTitle;
        @BindView(R.id.crimeDesc)
        TextView crimeDesc;
        View root;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
    }
}
