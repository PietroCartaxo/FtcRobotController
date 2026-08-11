package org.firstinspires.ftc.teamcode.Sensores.Cor;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;

public class Cor2 extends OpMode {

    private ColorSensor sencor;

    @Override
    public void init() {
        sencor = hardwareMap.get(ColorSensor.class, "sencor");
    }

    @Override
    public void loop() {
        if (sencor.red() > sencor.blue()) {
            telemetry.addData("Cor Mais Forte:", " Vermelho");
        } else {
            telemetry.addData("Cor Mais Forte:", " Azul");
        }
        telemetry.update();
    }
}
