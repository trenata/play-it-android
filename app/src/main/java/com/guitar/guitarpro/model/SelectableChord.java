package com.guitar.guitarpro.model;

public class SelectableChord {

    private final boolean isSelected;
    private final Chord chord;

    public SelectableChord(Chord chord, boolean isSelected) {
        this.chord = chord;
        this.isSelected = isSelected;
    }

    public Chord getChord(){
        return chord;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
