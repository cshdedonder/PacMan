package cshdedonder.pacman.core.config;

import cshdedonder.pacman.core.GameState;

import javax.xml.bind.annotation.*;
import java.util.List;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class StateDurationConfig {

    @XmlAttribute(required = true, name = "level")
    private int level;

    @XmlElementWrapper(name = "state-durations")
    @XmlElement(name = "state-duration")
    private List<StateDuration> stateDurations;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<StateDuration> getStateDurations() {
        return stateDurations;
    }

    public void setStateDurations(List<StateDuration> stateDurations) {
        this.stateDurations = stateDurations;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    public static class StateDuration {

        @XmlAttribute
        private GameState state;
        @XmlAttribute
        private int duration;

        public GameState getState() {
            return state;
        }

        public void setState(GameState state) {
            this.state = state;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }
    }
}
