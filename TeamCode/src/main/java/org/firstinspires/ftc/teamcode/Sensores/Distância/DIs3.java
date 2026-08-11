package org.firstinspires.ftc.teamcode.Sensores.Distância;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class DIs3 extends OpMode {

    private DistanceSensor dssensor;
    private DcMotor motor;
    private double ticks = 537.7;
    private double newTarget;
    private double distance = dssensor.getDistance(DistanceUnit.CM);

    @Override
    public void init() {
        dssensor = hardwareMap.get(DistanceSensor.class,"sensor");
        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        double velocidade = distance / 100.0;
        motor.setPower(velocidade);
    }
}
