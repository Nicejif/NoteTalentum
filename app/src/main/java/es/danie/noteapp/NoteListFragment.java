package es.danie.noteapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NoteListFragment extends Fragment {


    private RecyclerView recyclerView;

    public NoteListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_note_list, container, false);

        recyclerView= (RecyclerView) view.findViewById(R.id.recycleview_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }

    public void setAdapter(NoteAdapter adapter) {

        recyclerView.setAdapter(adapter);
    }
}
