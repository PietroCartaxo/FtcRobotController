package org.firstinspires.ftc.teamcode.Sensores.EncodersExternos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EnEx4 extends OpMode {

    private double tickstot = 537.7;
    private DcMotor encoderExterno;

    @Override
    public void init() {
        encoderExterno = hardwareMap.get(DcMotor.class, "encoder");

        encoderExterno.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        int alvoTicks = (int)(tickstot * 3);
        encoderExterno.setTargetPosition(alvoTicks);
        encoderExterno.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        encoderExterno.setPower(0.5);
    }

    @Override
    public void loop() {
        telemetry.addData("Alvo (Ticks)", encoderExterno.getTargetPosition());
        telemetry.addData("Posicao Atual", encoderExterno.getCurrentPosition());
        telemetry.update();
    }
}
