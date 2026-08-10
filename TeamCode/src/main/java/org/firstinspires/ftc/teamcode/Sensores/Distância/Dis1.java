package org.firstinspires.ftc.teamcode.Sensores.Distância;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class Dis1 extends OpMode {

    private DistanceSensor dssensor;

    @Override
    public void init() {
        dssensor = hardwareMap.get(DistanceSensor.class,"dssensor");
    }

    @Override
    public void loop() {
        telemetry.addLine("Telemetry Distance Sensor");
        telemetry.addData("Distance (cm)", dssensor.getDistance(DistanceUnit.CM));
        telemetry.update();
    }
}
