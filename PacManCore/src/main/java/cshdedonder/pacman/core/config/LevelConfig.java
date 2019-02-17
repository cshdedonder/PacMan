package cshdedonder.pacman.core.config;

import cshdedonder.pacman.core.Fruit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
public class LevelConfig {

    @XmlAttribute
    private int level;
    @XmlAttribute
    private Fruit fruit;
    @XmlAttribute(name = "vulnerable")
    private int blueTime;
    @XmlAttribute(name = "warning")
    private int flashes;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public int getBlueTime() {
        return blueTime;
    }

    public void setBlueTime(int blueTime) {
        this.blueTime = blueTime;
    }

    public int getFlashes() {
        return flashes;
    }

    public void setFlashes(int flashes) {
        this.flashes = flashes;
    }


}
