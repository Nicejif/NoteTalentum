package es.danie.noteapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import es.danie.noteapp.model.Note;


public class NoteRowViewHolder extends RecyclerView.ViewHolder {

    private TextView noteTitleText;
    private TextView noteTextText;

    private Note note;

    public NoteRowViewHolder(View itemView) {
        super(itemView);

        noteTitleText = (TextView) itemView.findViewById(R.id.row_note_title);
        noteTextText= (TextView) itemView.findViewById(R.id.row_note_text);
    }

    public Note getNote(Note note) {
        return this.note;
    }

    public void setNote(Note note) {
        this.note = note;

        noteTitleText.setText(note.getTitle());
        noteTextText.setText(note.getText());
    }
}
