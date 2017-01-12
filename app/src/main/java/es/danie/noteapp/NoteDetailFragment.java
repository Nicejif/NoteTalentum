package es.danie.noteapp;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteDetailFragment extends Fragment {

    EditText titleText;
    EditText descriptionText;

    public NoteDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_note_detail, container, false);
        titleText= (EditText) view.findViewById(R.id.fragment_note_detail_title);
        descriptionText= (EditText) view.findViewById(R.id.fragment_note_detail_description);
        return view;

    }


    @Override
    public void onPause() {
        super.onPause();

        //save all from screen to disk: fragment is going to be destroy

        saveAllDataToDisk();
    }

    @Override
    public void onResume() {
        super.onResume();

        // load data to show on screen (if any)

        loadAllDataToDisk();
    }

    private void saveAllDataToDisk() {
        // abro el fichero
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        //se necesita un editor para grabar
        SharedPreferences.Editor editor = preferences.edit();
        //leo lo que has escrito en pantalla
        //tomas el texto con getText().toString()
        String title = titleText.getText().toString();
        String description = descriptionText.getText().toString();

        //grabo eso en el fichero
        editor.putString("NOTE_TITLE",title);
        editor.putString("NOTE_DESCRIPTION",description);
    }

    private void loadAllDataToDisk() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        String noteTitle=preferences.getString("NOTE_TITLE", "");
        String noteDescription= preferences.getString("NOTE_DESCRIPTION", "");

        titleText.setText(noteTitle);
        descriptionText.setText(noteDescription);
    }

}
