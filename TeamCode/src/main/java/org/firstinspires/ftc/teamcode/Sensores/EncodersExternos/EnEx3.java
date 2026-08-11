package org.firstinspires.ftc.teamcode.Sensores.EncodersExternos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EnEx3 extends OpMode {

    private double tickstot = 537.7;
    private DcMotor encoderExterno;

    @Override
    public void init() {
        encoderExterno = hardwareMap.get(DcMotor.class, "encoder");
    }

    @Override
    public void loop() {
        int ticksAtuais = encoderExterno.getCurrentPosition();

        // Conversão de ticks para graus
        double graus = (ticksAtuais / tickstot) * 360.0;

        telemetry.addData("Ticks", ticksAtuais);
        telemetry.addData("Graus", graus);
        telemetry.update();
    }
}
