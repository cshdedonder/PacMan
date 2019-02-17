package cshdedonder.pacman.core.config;

import cshdedonder.pacman.core.util.Cardinal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
public class PacManConfig {

    @XmlAttribute(required = true, name = "x")
    private double startX;

    @XmlAttribute(required = true, name = "y")
    private double startY;

    @XmlAttribute(required = true, name = "lives")
    private int numberOfLives;

    @XmlAttribute(required = true, name = "start")
    private Cardinal startCardinal;

    public PacManConfig() {
    }

    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    public Cardinal getStartCardinal() {
        return startCardinal;
    }

    public void setStartCardinal(Cardinal startCardinal) {
        this.startCardinal = startCardinal;
    }
}
