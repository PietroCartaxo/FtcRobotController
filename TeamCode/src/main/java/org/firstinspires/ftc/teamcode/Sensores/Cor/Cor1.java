package org.firstinspires.ftc.teamcode.Sensores.Cor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class Cor1 extends OpMode {

    private ColorSensor sencor;

    @Override
    public void init() {
        sencor = hardwareMap.get(ColorSensor.class, "sencor");
    }

    @Override
    public void loop() {
        telemetry.addData("Red", sencor.red());
        telemetry.addData("Green", sencor.green());
        telemetry.addData("Blue", sencor.blue());
        telemetry.update();
    }
}
