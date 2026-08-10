package org.firstinspires.ftc.teamcode.Sensores.ToqueMagnetico;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

public class ToqMag1 extends OpMode {

    // Declaração das variáveis
    private TouchSensor touch1;
    private Servo servo1;

    @Override
    public void init() {
        touch1 = hardwareMap.get(TouchSensor.class, "touch");
        servo1 = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop() {
        if(touch1.isPressed()){
            servo1.setPosition(1.0);
        } else {
            servo1.setPosition(0.0);
        }
    }
}
