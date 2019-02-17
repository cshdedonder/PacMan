package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
@XmlRootElement(name = "line")
@XmlAccessorType(XmlAccessType.FIELD)
public class LineGroup extends CellGroup {

    @XmlElement(name = "start")
    private PositionConfig startPos;
    @XmlElement(name = "end")
    private PositionConfig endPos;

    public LineGroup() {
    }

    public PositionConfig getStartPos() {
        return startPos;
    }

    public void setStartPos(PositionConfig startPos) {
        this.startPos = startPos;
    }

    public PositionConfig getEndPos() {
        return endPos;
    }

    public void setEndPos(PositionConfig endPos) {
        this.endPos = endPos;
    }

    @Override
    public Set<PositionConfig> getPositions() {
        Set<PositionConfig> out = new HashSet<>();
        if (startPos.getPosX() == endPos.getPosX()) {
            if (startPos.getPosY() < endPos.getPosY()) {
                for (int y = startPos.getPosY(); y <= endPos.getPosY(); y++) {
                    out.add(new PositionConfig(startPos.getPosX(), y));
                }
            } else {
                for (int y = startPos.getPosY(); y <= endPos.getPosY(); y--) {
                    out.add(new PositionConfig(startPos.getPosX(), y));
                }
            }
        } else {
            if (startPos.getPosX() < endPos.getPosX()) {
                for (int x = startPos.getPosX(); x <= endPos.getPosX(); x++) {
                    out.add(new PositionConfig(x, startPos.getPosY()));
                }
            } else {
                for (int x = startPos.getPosX(); x <= endPos.getPosX(); x--) {
                    out.add(new PositionConfig(x, startPos.getPosY()));
                }
            }
        }
        return out;
    }
}
