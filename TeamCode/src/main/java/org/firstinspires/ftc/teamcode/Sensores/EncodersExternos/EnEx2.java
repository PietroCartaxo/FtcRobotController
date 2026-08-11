package org.firstinspires.ftc.teamcode.Sensores.EncodersExternos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EnEx2 extends OpMode {

    private DcMotor encoderExterno;

    @Override
    public void init() {
        // Mapeamento do encoder
        encoderExterno = hardwareMap.get(DcMotor.class, "encoder");
    }

    @Override
    public void loop() {
        // 1. Verifica se o botão A foi pressionado
        if (gamepad1.a) {
            encoderExterno.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        }

        // 2. Mostra a posição
        telemetry.addData("Posicao", encoderExterno.getCurrentPosition());
        telemetry.update();
    }
}
