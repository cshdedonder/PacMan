import cshdedonder.pacman.core.Fruit;
import cshdedonder.pacman.core.GameState;
import cshdedonder.pacman.core.config.*;
import cshdedonder.pacman.core.util.Cardinal;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.List;
import java.util.Set;

public class MarshalTest {

    @Test
    public void testMarshalling() throws JAXBException {
        SingletonGroup singletonGroup = new SingletonGroup();
        singletonGroup.setPosition(new PositionConfig(0, 0));

        LineGroup lineGroup = new LineGroup();
        lineGroup.setStartPos(new PositionConfig(1, 1));
        lineGroup.setEndPos(new PositionConfig(1, 5));

        PacManConfig config = new PacManConfig();
        config.setNumberOfLives(3);
        config.setStartCardinal(Cardinal.EAST);
        config.setStartX(2.5);
        config.setStartY(1.3);

        StateDurationConfig stateDurationConfig = new StateDurationConfig();
        stateDurationConfig.setStateDurations(List.of(new StateDurationConfig.StateDuration() {{
            setDuration(20);
            setState(GameState.CHASE);
        }}, new StateDurationConfig.StateDuration() {{
            setDuration(30);
            setState(GameState.FRIGHTENED);
        }}));

        Set<LevelConfig> levelConfigs = Set.of(new LevelConfig() {{
            setBlueTime(10);
            setFlashes(4);
            setFruit(Fruit.APPLE);
            setLevel(1);
        }}, new LevelConfig() {{
            setLevel(2);
            setFruit(Fruit.BELL);
            setFlashes(8);
            setBlueTime(40);
        }});

        BoardConfig boardConfig = new BoardConfig();
        boardConfig.setCellGroups(Set.of(singletonGroup, lineGroup));
        boardConfig.setPacManConfig(config);
        boardConfig.setPowerPelletPositions(Set.of(new PositionConfig(5, 5), new PositionConfig(3, 3)));
        boardConfig.setLevelConfigs(levelConfigs);
        boardConfig.setStateDurationConfig(Set.of(stateDurationConfig));

        JAXBContext context = JAXBContext.newInstance(BoardConfig.class, CellGroup.class);
        context.createMarshaller().marshal(boardConfig, new File("marshal-test.xml"));
    }

    @Test
    public void testDefault() {
        BoardConfig config = BoardConfig.getDefault();
        System.out.println(config.toString());
    }
}
