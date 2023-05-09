import java.awt.Rectangle;

interface Resizable {
    public void resize(double scaleFactor);
}

class ResizableRectangle extends Rectangle implements Resizable {

    public ResizableRectangle() {
        // Default constructor
    }

    @Override
    public void resize(double scaleFactor) {
        setSize((int) (getWidth() * scaleFactor), (int) (getHeight() * scaleFactor));
    }
}