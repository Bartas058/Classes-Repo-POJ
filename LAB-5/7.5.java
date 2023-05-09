interface AudioDevice {
    public void play();
    public void stop();
}

interface PortableAudioDevice extends AudioDevice {
    public void chargeBattery();
}

interface StationaryAudioDevice extends AudioDevice {
    public void connectPower();
}

class MP3Player implements PortableAudioDevice {
    @Override
    public void play() {
        System.out.println("MP3Player: Odtwarzanie muzyki");
    }

    @Override
    public void stop() {
        System.out.println("MP3Player: Zatrzymanie odtwarzania");
    }

    @Override
    public void chargeBattery() {
        System.out.println("MP3Player: Ładowanie baterii");
    }
}

class Radio implements StationaryAudioDevice {
    @Override
    public void play() {
        System.out.println("Radio: Odtwarzanie stacji radiowej");
    }

    @Override
    public void stop() {
        System.out.println("Radio: Zatrzymanie odtwarzania");
    }

    @Override
    public void connectPower() {
        System.out.println("Radio: Podłączanie do zasilania");
    }
}