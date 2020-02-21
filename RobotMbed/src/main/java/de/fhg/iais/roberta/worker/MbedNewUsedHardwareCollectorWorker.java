package de.fhg.iais.roberta.worker;

import de.fhg.iais.roberta.components.Project;
import de.fhg.iais.roberta.visitor.collect.AbstractNewUsedHardwareCollectorVisitor;
import de.fhg.iais.roberta.visitor.collect.MbedNewUsedHardwareCollectorVisitor;

public final class MbedNewUsedHardwareCollectorWorker extends AbstractNewUsedHardwareCollectorWorker {
    @Override
    protected AbstractNewUsedHardwareCollectorVisitor getVisitor(Project project) {
        return new MbedNewUsedHardwareCollectorVisitor();
    }
}