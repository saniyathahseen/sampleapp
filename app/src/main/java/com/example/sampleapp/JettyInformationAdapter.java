package com.example.sampleapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

// FirebaseRecyclerAdapter is a class provided by 
// FirebaseUI. it provides functions to bind, adapt and show 
// database contents in a Recycler View 
public class JettyInformationAdapter extends FirebaseRecyclerAdapter<JettyInformation, JettyInformationAdapter.JettyInformationsViewholder> {

    public JettyInformationAdapter(
            @NonNull FirebaseRecyclerOptions<JettyInformation> options)
    {
        super(options);
    }

    // Function to bind the view in Card view(here 
    // "JettyInformation.xml") iwth data in 
    // model class(here "JettyInformation.class") 
    @Override
    protected void
    onBindViewHolder(@NonNull JettyInformationsViewholder holder,
                     int position, @NonNull JettyInformation model)
    {

        // Add firstname from model class (here 
        // "JettyInformation.class")to appropriate view in Card 
        // view (here "JettyInformation.xml") 
        holder.jettyname.setText(model.getJettyname());

    }

    // Function to tell the class about the Card view (here 
    // "JettyInformation.xml")in 
    // which the data will be shown 
    @NonNull
    @Override
    public JettyInformationsViewholder
    onCreateViewHolder(@NonNull ViewGroup parent,int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.jetty_info_card, parent, false);
        return new JettyInformationAdapter.JettyInformationsViewholder(view);
    }

    // Sub Class to create references of the views in Crad 
    // view (here "JettyInformation.xml") 
    class JettyInformationsViewholder
            extends RecyclerView.ViewHolder {
        TextView jettyname;
        public JettyInformationsViewholder(@NonNull View itemView)
        {
            super(itemView);

            jettyname= itemView.findViewById(R.id.jetty_name);
        }
    }
}
