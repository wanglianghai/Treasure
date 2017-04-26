package com.bignerdranch.android.gettreasure;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Administrator on 2017/4/25/025.
 */

public class TreasureFragment extends Fragment{
   public static TreasureFragment newInstance() {
       return new TreasureFragment();
   }
    private ImageBottom mImageBottom;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageBottom = new ImageBottom(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_treasure, container, false);

        RecyclerView mTreasureRecyclerView = (RecyclerView) v.findViewById(R.id.fragment_treasure_recycler_view);
        mTreasureRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        mTreasureRecyclerView.setAdapter(new ImgAdapter());
        return v;
    }

    private class ImgHolder extends RecyclerView.ViewHolder {
        private Button mButton;

        public ImgHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.list_item_botton, container, false));

            mButton = (Button) itemView.findViewById(R.id.list_item_bottom_button);
        }
    }

    private class ImgAdapter extends RecyclerView.Adapter<ImgHolder>{
        @Override
        public ImgHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new ImgHolder(inflater, parent);
        }

        @Override
        public void onBindViewHolder(ImgHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }
    }
}
