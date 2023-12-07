package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.structural.ActuatorPin;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;

public class ActionSensor extends Action {
    private SIGNAL value;
    private ActuatorPin actuator;

    public SIGNAL getValue() {
        return value;
    }
    public SIGNAL getOppositeValue(){
        if(value == SIGNAL.HIGH){
            return SIGNAL.LOW;
        }
        return SIGNAL.HIGH;
    }

    public void setValue(SIGNAL value) {
        this.value = value;
    }

    public ActuatorPin getActuator() {
        return actuator;
    }

    public void setActuator(ActuatorPin actuator) {
        this.actuator = actuator;
    }

    @Override
    public String toString() {
        return "ActionSensor{" +
                "value=" + value +
                ", actuator=" + actuator +
                '}';
    }
}
