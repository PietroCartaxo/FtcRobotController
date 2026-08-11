package org.firstinspires.ftc.teamcode.Sensores.EncodersExternos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EnEx5 extends OpMode {

    private DcMotor encoderExterno;
    private final double tickstot = 537.6;

    @Override
    public void init() {
        encoderExterno = hardwareMap.get(DcMotor.class, "encoder");
        encoderExterno.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        encoderExterno.setTargetPosition((int) tickstot);
        encoderExterno.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        encoderExterno.setPower(0.5);
    }

    @Override
    public void loop() {
        if (!encoderExterno.isBusy() && encoderExterno.getTargetPosition() != 0) {
            encoderExterno.setTargetPosition(0);
            encoderExterno.setPower(0.5);
        }

        telemetry.addData("Alvo", encoderExterno.getTargetPosition());
        telemetry.addData("Posicao Atual", encoderExterno.getCurrentPosition());
        telemetry.update();
    }
}