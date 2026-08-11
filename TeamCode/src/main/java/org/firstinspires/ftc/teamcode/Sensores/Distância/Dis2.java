package org.firstinspires.ftc.teamcode.Sensores.Distância;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Dis2 extends OpMode {

    private DistanceSensor dssensor;
    private DcMotor motor;
    private double ticks = 537.7;
    private double newTarget;

    @Override
    public void init() {
        dssensor = hardwareMap.get(DistanceSensor.class,"sensor");
        motor = hardwareMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        if(dssensor.getDistance(DistanceUnit.CM) < 10){
            motor.setPower(0.5);
        } else {
            motor.setPower(0.0);
        }
        telemetry.addData("Distance (cm)", dssensor.getDistance(DistanceUnit.CM));
        telemetry.update();
    }
}
