package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "singleton")
public class SingletonGroup extends CellGroup {

    @XmlElement
    private PositionConfig position;

    @Override
    Set<PositionConfig> getPositions() {
        return Set.of(position);
    }

    public PositionConfig getPosition() {
        return position;
    }

    public void setPosition(PositionConfig position) {
        this.position = position;
    }
}
