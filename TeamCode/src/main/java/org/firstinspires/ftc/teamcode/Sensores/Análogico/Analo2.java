package org.firstinspires.ftc.teamcode.Sensores.Análogico;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.AnalogInput;
import com.qualcomm.robotcore.hardware.Servo;

public class Analo2 extends OpMode {

    private AnalogInput analosensor;
    private Servo servo;

    @Override
    public void init() {
        analosensor = hardwareMap.get(AnalogInput.class, "sensor");
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        servo.setPosition(analosensor.getVoltage()/3.3);
        telemetry.addData("Posição", servo.getPosition());
    }
}
