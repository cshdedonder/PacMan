package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@SuppressWarnings({"unused", "WeakerAccess"})
@XmlRootElement(name = "position")
@XmlAccessorType(XmlAccessType.FIELD)
public class PositionConfig {

    @XmlAttribute(required = true, name = "x")
    private int posX;
    @XmlAttribute(required = true, name = "y")
    private int posY;

    public PositionConfig() {
    }

    public PositionConfig(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
