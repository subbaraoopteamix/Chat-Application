package com.chatbot.opteamix.chatbot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import Adapter.ChatAdapter;

public class ChatActivity extends Activity {

 public  List<String> chatMessagesList = new ArrayList<String>();

   public AppCompatEditText messgaeBox;

   public AppCompatImageView messageSendButton;

   public String userMessage;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private  RecyclerView.LayoutManager  mLayoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        messgaeBox = (AppCompatEditText)  findViewById(R.id.user_comments);

        messageSendButton= (AppCompatImageView)  findViewById(R.id.send_comment);

   mRecyclerView = (RecyclerView) findViewById(R.id.chat_messages);



       chatMessagesList.add("Hi");
        chatMessagesList.add("Hello");
        chatMessagesList.add("How are you");
        chatMessagesList.add("I am good");
        chatMessagesList.add("How about you");
        chatMessagesList.add("Great");
        chatMessagesList.add("How is your work");
        chatMessagesList.add("Cool!!!");
       /* chatMessagesList.add("On which Platform working");
        chatMessagesList.add("Android");*/


        Log.d("Size:","" + chatMessagesList.size());



        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
     //   mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);




            // specify an adapter (see also next example)
            mAdapter = new ChatAdapter(chatMessagesList);

            mRecyclerView.setAdapter(mAdapter);

            mAdapter.notifyDataSetChanged();





/*

       messageSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userMessage= messgaeBox.getText().toString();

                //create Array List of chat messages.

                chatMessagesList.add(userMessage);

             */
/*   mRecyclerView = (RecyclerView) findViewById(R.id.chat_messages);

                // use this setting to improve performance if you know that changes
                // in content do not change the layout size of the RecyclerView
                mRecyclerView.setHasFixedSize(true);

                // use a linear layout manager
                mLayoutManager = new LinearLayoutManager(ChatActivity.this);
                mRecyclerView.setLayoutManager(mLayoutManager);


                // specify an adapter (see also next example)
                mAdapter = new ChatAdapter(chatMessagesList);

                mRecyclerView.setAdapter(mAdapter);

                mAdapter.notifyItemInserted(chatMessagesList.size());*//*

                mAdapter.notifyDataSetChanged();


                messgaeBox.setText("");


            }
        });
*/





    }




}
