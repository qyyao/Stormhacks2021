package com.example.stormhacks2021;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileMedicationRecyclerAdapter extends RecyclerView.Adapter<ProfileMedicationRecyclerAdapter.MyViewHolder> {
    private ArrayList<Medication> medicationList;

    public ProfileMedicationRecyclerAdapter (ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView medicationName;
        private ImageView medicationCheck;

        public MyViewHolder(final View view){
            super(view);
            medicationName = view.findViewById(R.id.medication_name_text);
            medicationCheck = view.findViewById(R.id.medication_check_image);
        }
    }

    @NonNull
    @Override
    public ProfileMedicationRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View medicationView = LayoutInflater.from(parent.getContext()).inflate(R.layout.medicine_object, parent, false);
        return new MyViewHolder(medicationView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        String name = medicationList.get(position).Name;
        holder.medicationName.setText(name);

        if (medicationList.get(position).ifTaken == true) {
            holder.medicationCheck.setBackgroundResource(R.drawable.medication_checked);
        } else {
            holder.medicationCheck.setBackgroundResource(R.drawable.medication_uncheked);
        }

    }

    @Override
    public int getItemCount() {
        return medicationList.size();
    }

    public interface SeniorRecyclerViewClickListener{
        void onClick(View v, int position);
    }
}
