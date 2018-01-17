package com.example.student.kolokwiumpum;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-17.
 */

public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder> {

    ArrayList<Lekarz> list = new ArrayList<>();
    LekarzAdapter(ArrayList<Lekarz> lekarze) {
        this.list = lekarze;
    }

    @Override
    public LekarzAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(LekarzAdapter.ViewHolder holder, int position) {
        holder.setImie(list.get(position).getImie());
        holder.setSpecjalizacja(list.get(position).getSpecjalizacja());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imieNazwisko)
        TextView imieNazwisko;

        @BindView(R.id.specjalnosc)
        TextView specjalnosc;

        @BindView(R.id.buttonWybierz)
        Button buttonWybierz;

        @OnClick(R.id.buttonWybierz)
        void onNameClick(){
            buttonWybierz.setText("Wybrano");
        }

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setImie(String imie) {
            imieNazwisko.setText(imie);
        }

        public void setSpecjalizacja(String specjalizacja) {
            specjalnosc.setText(specjalizacja);
        }
    }
}
