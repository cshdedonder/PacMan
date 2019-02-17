package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.*;
import java.util.Set;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlSeeAlso({LineGroup.class, SingletonGroup.class, RectangleGroup.class})
public abstract class CellGroup {

    @XmlAttribute
    private boolean pellets;

    abstract Set<PositionConfig> getPositions();

    boolean hasPellets() {
        return pellets;
    }
}
