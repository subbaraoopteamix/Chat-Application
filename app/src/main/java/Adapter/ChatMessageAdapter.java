/*
package Adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;


import com.chatbot.opteamix.chatbot.R;

*
 * Created by SGangavaram on 3/27/2017.



public class ChatMessageAdapter   extends RecyclerView.Adapter<ChatMessageAdapter.ViewHolder> {



    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.parentLL)
        LinearLayout parentView;
        @BindView(R.id.bidder_name)
        AppCompatTextView bidderName;
        @BindView(R.id.bidder_clarification_count)
        AppCompatTextView bidderClarificationCount;
        //   @BindView(R.id.bidder_image_view)
        // ImageView bidderImageView;




        public ViewHolder(View view, final BidClarificationListAdapter.OnItemClickListener onItemClickListener) {
            super(view);


            ButterKnife.bind(this, view);
            parentView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (onItemClickListener != null) {
                        onItemClickListener.onItemClick(biddersList.get(getAdapterPosition()), BidClarificationListAdapter.ViewHolder.this);
                    }
                }
            });
        }
    }




    public interface OnItemClickListener {
        void onItemClick(OGTBidClarification bidderDetails, BidClarificationListAdapter.ViewHolder viewHolder);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bidders_clarificaiton_list, parent, false);

        ViewHolder viewHolder = new ViewHolder(view, onItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final OGTBidClarification bidderDetails = biddersList.get(position);
        try {
            holder.bidderName.setText(bidderDetails.getCompanyName());
            if (bidderDetails.getCounts() != null) {
                holder.bidderClarificationCount.setText("" + bidderDetails.getCounts());
                holder.bidderClarificationCount.setVisibility(View.VISIBLE);
            } else
                holder.bidderClarificationCount.setVisibility(View.INVISIBLE);
  Picasso.with(context).load(WebApiURLConstants.BASE_URL + WebApiURLConstants.IMAGE + "ogt/" + "IR/IR_Profile_Logo/2/2_PK72.PNG")
                    .resize(50,50)
                    .error(R.drawable.user_placeholder)
                    .placeholder(R.drawable.user_placeholder)
                    .into(holder.bidderImageView);


        } catch (Exception e) {
            e.printStackTrace();
            ;
        }

    }




    @Override
    public int getItemCount() {
        int size = biddersList == null ? 0 : biddersList.size();
        if (onEmptyDataSetListener != null) {
            if (size > 0) {
                onEmptyDataSetListener.onEmptyList(false);
            } else {
                onEmptyDataSetListener.onEmptyList(true);
            }
        }
        return size;
    }



}
*/
