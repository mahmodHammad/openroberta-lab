package de.fhg.iais.roberta.visitor.collect;
import java.util.ArrayList;
import java.util.List;

import de.fhg.iais.roberta.syntax.BlockType;
import de.fhg.iais.roberta.syntax.sensor.generic.KeysSensor;
import de.fhg.iais.roberta.util.Pair;

public class AbstractNewUsedHardwareCollectorVisitor implements ICollectorVisitor {
    protected final List<Pair<BlockType, String>> blockPortMap = new ArrayList<>();

    @Override
    public Void visitKeysSensor(KeysSensor<Void> keysSensor) {
        this.blockPortMap.add(Pair.of(keysSensor.getKind(), keysSensor.getPort()));
        return null;
    }
}
