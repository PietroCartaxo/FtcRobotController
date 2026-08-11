package org.firstinspires.ftc.teamcode.Sensores.Análogico;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.AnalogInput;

public class Analo1 extends OpMode {

    private AnalogInput analosensor;

    @Override
    public void init() {
        analosensor = hardwareMap.get(AnalogInput.class, "sensor");
    }

    @Override
    public void loop() {
        telemetry.addData("Voltage: ", analosensor.getVoltage());
    }
}
