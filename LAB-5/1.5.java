interface Drawable {
    public void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Rysuję okrąg");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Rysuję kwadrat");
    }
}