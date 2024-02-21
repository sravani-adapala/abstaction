package model;

public class SoundSystem {
    public String soundSystemFrequency;

    public SoundSystem(String soundSystemFrequency){
        this.soundSystemFrequency=soundSystemFrequency;
    }

    public String getSoundSystemFrequency() {
        return soundSystemFrequency;
    }

    @Override
    public String toString() {
        return "SoundSystem{" +
                "soundSystemFrequency='" + soundSystemFrequency + '\'' +
                '}';
    }
}
