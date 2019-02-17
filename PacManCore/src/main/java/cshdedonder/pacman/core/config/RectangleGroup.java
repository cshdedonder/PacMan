package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rectangle")
public class RectangleGroup extends CellGroup {

    @XmlElement(name = "topleft")
    private PositionConfig topLeftPosition;

    @XmlElement(name = "bottomright")
    private PositionConfig bottomRightPosition;

    @Override
    Set<PositionConfig> getPositions() {
        Set<PositionConfig> out = new HashSet<>();
        for (int x = topLeftPosition.getPosX(); x <= bottomRightPosition.getPosX(); x++) {
            for (int y = topLeftPosition.getPosY(); y <= bottomRightPosition.getPosY(); y++) {
                out.add(new PositionConfig(x, y));
            }
        }
        return out;
    }

    public PositionConfig getTopLeftPosition() {
        return topLeftPosition;
    }

    public void setTopLeftPosition(PositionConfig topLeftPosition) {
        this.topLeftPosition = topLeftPosition;
    }

    public PositionConfig getBottomRightPosition() {
        return bottomRightPosition;
    }

    public void setBottomRightPosition(PositionConfig bottomRightPosition) {
        this.bottomRightPosition = bottomRightPosition;
    }
}
