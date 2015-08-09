package com.mycompany.dbs;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hafizh Hasrindra on 009, 09-Aug-15.
 */
public class KnowledgeAdapter extends RecyclerView.Adapter<KnowledgeAdapter.ViewHolder> {

    private List<KnowledgeItem> mItems;

    public KnowledgeAdapter() {
        super();
        mItems = new ArrayList<KnowledgeItem>();

        for (int i = 0; i < 3; i++) {
            KnowledgeItem item = new KnowledgeItem("Article Title", "Article Category", R.drawable.knowledge_thumb, "Greyhound divisively hello coldly wonderfully marginally far upon excluding");
            mItems.add(item);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.knowledge_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        KnowledgeItem item = mItems.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvCategory.setText(item.getCategory());
        holder.imgThumbnail.setImageResource(item.getThumbnail());
        holder.tvDescription.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public TextView tvCategory;
        public ImageView imgThumbnail;
        public TextView tvDescription;

        public ViewHolder(View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.knowledge_title);
            tvCategory = (TextView) itemView.findViewById(R.id.knowledge_category);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.knowledge_thumbnail);
            tvDescription = (TextView) itemView.findViewById(R.id.knowledge_description);
        }
    }

}
