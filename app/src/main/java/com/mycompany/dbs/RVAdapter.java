package com.mycompany.dbs;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Muhammad on 07/08/2015.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.EventViewHolder> {

    public static class EventViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        //TextView personName;
        //TextView personAge;
        TextView eventDate;
        TextView eventTitle;
        TextView eventDepartment;

        EventViewHolder(View itemView){
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.my_card_view);
            //personName = (TextView) itemView.findViewById(R.id.person_name);
            //personAge = (TextView) itemView.findViewById(R.id.person_age);
            eventDate = (TextView) itemView.findViewById(R.id.event_date);
            eventTitle = (TextView) itemView.findViewById(R.id.event_title);
            eventDepartment = (TextView) itemView.findViewById(R.id.event_department);
        }

    }

    /*List<Person> persons;

    RVAdapter(List<Person> persons){
        this.persons = persons;
    }*/

    List<TrainingEvent> trainingEvents;

    RVAdapter(List<TrainingEvent> trainingEvents){
        this.trainingEvents = trainingEvents;
    }


    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        EventViewHolder pvh = new EventViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
        eventViewHolder.eventDate.setText(trainingEvents.get(i).date);
        eventViewHolder.eventTitle.setText(trainingEvents.get(i).title);
        eventViewHolder.eventDepartment.setText(trainingEvents.get(i).department);
    }

    @Override
    public int getItemCount() {
        return trainingEvents.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
