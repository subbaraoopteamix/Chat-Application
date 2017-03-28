package Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chatbot.opteamix.chatbot.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SGangavaram on 3/24/2017.
 */

public class ChatAdapter  extends RecyclerView.Adapter<ChatAdapter.ViewHolder>{


   public List<String> chatList= new ArrayList<>();


   public ChatAdapter(List<String> chatMessages) {
       chatList= chatMessages;
    }



    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {

        // each data item is just a string in this case
       /* public CardView cardView;

        public TextView chatMessage;

        public ImageView senderImage;

        public ImageView receiverImage;

        public TextView ReceiverMessage;
        */


        public  LinearLayout entire_layout;

        public LinearLayout receiver_layout;

        public LinearLayout sender_layout;

        public TextView senderMessage;

        public TextView receiverMessage;


        public ViewHolder(LinearLayout v) {
            super(v);

           // cardView = v;

            /*chatMessage = (TextView)  cardView.findViewById(R.id.messageContent);

            ReceiverMessage = (TextView)  cardView.findViewById(R.id.ReceiverMessageContent);

            senderImage= (ImageView) cardView.findViewById(R.id.sender_Image);

            receiverImage = (ImageView) cardView.findViewById(R.id.receiver_Image);*/


            entire_layout = v;

            sender_layout = (LinearLayout) entire_layout.findViewById(R.id.SenderLayout);

            receiver_layout = (LinearLayout) entire_layout.findViewById(R.id.ReceiverLayout);

            senderMessage = (TextView) entire_layout.findViewById(R.id.senderMessageContent);

            receiverMessage  = (TextView) entire_layout.findViewById(R.id.ReceiverMessageContent);

        }
    }



    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // create a new view
        /*CardView v = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.messages_view, parent, false);
*/

        LinearLayout linearLayout =(LinearLayout) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.messages_display, parent, false);


       // TextView chatMessage = (TextView)   parent.findViewById(R.id.messageContent);

        // set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(linearLayout);
        return vh;
    }

    @Override
    public void onBindViewHolder(ChatAdapter.ViewHolder holder, int position) {


        Log.d("position:-","" +position);


        if(  (position % 2 ==0) ) {

            holder.sender_layout.setVisibility(View.VISIBLE);

            holder.receiver_layout.setVisibility(View.GONE);

            holder.senderMessage.setText(chatList.get(position));

           // holder.chatMessage.setText(chatList.get(position));

        }
        else {
            holder.receiver_layout.setVisibility(View.VISIBLE);

            holder.sender_layout.setVisibility(View.GONE);

            holder.receiverMessage.setText(chatList.get(position));

          //  holder.ReceiverMessage.setText(chatList.get(position));

        }

    }

    @Override
    public int getItemCount() {

        if( chatList.size() > 0) {
           return chatList.size() ;
        }
        else {
            return 0;
        }
    }

}
