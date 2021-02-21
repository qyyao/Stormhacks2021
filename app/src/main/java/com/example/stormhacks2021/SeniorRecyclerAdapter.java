    package com.example.stormhacks2021;

    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.TextView;

    import androidx.annotation.NonNull;
    import androidx.recyclerview.widget.RecyclerView;

    import java.util.List;

    public class SeniorRecyclerAdapter extends RecyclerView.Adapter<SeniorRecyclerAdapter.MyViewHolder> {
        private List<Senior> seniorsList;
        private SeniorRecyclerViewClickListener listener;

        public SeniorRecyclerAdapter(List<Senior> seniorsList, SeniorRecyclerViewClickListener listener) {
            this.seniorsList = seniorsList;
            this.listener = listener;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
            private TextView seniorName;

            public MyViewHolder(final View view){
                super(view);
                seniorName = view.findViewById(R.id.senior_name_text);
                view.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                listener.onClick(view, getAdapterPosition());
            }
        }

        @NonNull
        @Override
        public SeniorRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View seniorView = LayoutInflater.from(parent.getContext()).inflate(R.layout.senior_item, parent, false);
            return new MyViewHolder(seniorView);
        }

        @Override
        public void onBindViewHolder(@NonNull SeniorRecyclerAdapter.MyViewHolder holder, int position) {
            String name = seniorsList.get(position).getFirstName() + " " + seniorsList.get(position).getLastName();
            holder.seniorName.setText(name);
        }

        @Override
        public int getItemCount() {
            return seniorsList.size();
        }

        public interface SeniorRecyclerViewClickListener{
            void onClick(View v, int position);
        }
    }
