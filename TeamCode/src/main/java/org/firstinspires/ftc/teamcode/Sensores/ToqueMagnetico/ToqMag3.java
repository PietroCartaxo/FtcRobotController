package org.firstinspires.ftc.teamcode.Sensores.ToqueMagnetico;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class ToqMag3 extends OpMode {

    private int contador = 0;
    private boolean foiPressionadoAntes = false;
    private TouchSensor touch;

    @Override
    public void init() {
        touch = hardwareMap.get(TouchSensor.class, "touch");
    }

    @Override
    public void loop() {
        boolean EstadoAtual = touch.isPressed();

        if (EstadoAtual && !foiPressionadoAntes) {
            contador++;
        }
        foiPressionadoAntes = EstadoAtual;
    }
}
