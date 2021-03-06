package com.guitar.guitarpro.connectivity;


import com.guitar.guitarpro.model.Chord;

public class MockGuitarConnectionManager implements GuitarConnectionManager {

    private static MockGuitarConnectionManager INSTANCE;

    private boolean isConnected = false;

    private MockGuitarConnectionManager() {
        // Avoids direct instantiation
    }

    public static MockGuitarConnectionManager getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MockGuitarConnectionManager();
        }
        return INSTANCE;
    }

    @Override
    public boolean isConnected() {
        System.out.println("MockGuitarConnectionManager.isConnected: " + isConnected);
        return isConnected;
    }

    @Override
    public void connect(ConnectionCallback connectionCallback) {
        System.out.println("MockGuitarConnectionManager.connect");
        isConnected = true;
        connectionCallback.onConnected();
    }

    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println("MockGuitarConnectionManager.disconnect");
    }

    @Override
    public void sendChord(Chord chord) {
        System.out.println("MockGuitarConnectionManager.sendChord");
    }
}
