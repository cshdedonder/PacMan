package cshdedonder.pacman.core.config;

import javax.xml.bind.annotation.*;
import java.util.Set;

@SuppressWarnings("unused")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardConfig {

    @XmlElement(name = "pac-man")
    private PacManConfig pacManConfig;

    @XmlElementWrapper(name = "board-config")
    @XmlAnyElement
    private Set<CellGroup> cellGroups;

    @XmlElementWrapper(name = "house-config")
    @XmlAnyElement
    private Set<CellGroup> houseGroup;

    @XmlElementWrapper(name = "power-pellet-config")
    @XmlElement(name = "power-pellet")
    private Set<PositionConfig> powerPelletPositions;

    @XmlElementWrapper(name = "state-duration-config")
    @XmlElement(name = "state-duration")
    private Set<StateDurationConfig> stateDurationConfig;

    @XmlElementWrapper(name = "level-config")
    @XmlElement(name = "level")
    private Set<LevelConfig> levelConfigs;

    public BoardConfig() {
    }

    public Set<StateDurationConfig> getStateDurationConfig() {
        return stateDurationConfig;
    }

    public void setStateDurationConfig(Set<StateDurationConfig> stateDurationConfig) {
        this.stateDurationConfig = stateDurationConfig;
    }

    public Set<LevelConfig> getLevelConfigs() {
        return levelConfigs;
    }

    public void setLevelConfigs(Set<LevelConfig> levelConfigs) {
        this.levelConfigs = levelConfigs;
    }

    public PacManConfig getPacManConfig() {
        return pacManConfig;
    }

    public void setPacManConfig(PacManConfig pacManConfig) {
        this.pacManConfig = pacManConfig;
    }

    public Set<CellGroup> getCellGroups() {
        return cellGroups;
    }

    public void setCellGroups(Set<CellGroup> cellGroups) {
        this.cellGroups = cellGroups;
    }

    public Set<CellGroup> getHouseGroup() {
        return houseGroup;
    }

    public void setHouseGroup(Set<CellGroup> houseGroup) {
        this.houseGroup = houseGroup;
    }

    public Set<PositionConfig> getPowerPelletPositions() {
        return powerPelletPositions;
    }

    public void setPowerPelletPositions(Set<PositionConfig> powerPelletPositions) {
        this.powerPelletPositions = powerPelletPositions;
    }
}
