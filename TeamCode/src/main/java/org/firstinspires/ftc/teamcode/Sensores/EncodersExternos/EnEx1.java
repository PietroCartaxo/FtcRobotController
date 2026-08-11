package org.firstinspires.ftc.teamcode.Sensores.EncodersExternos;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class EnEx1 extends OpMode {

    private DcMotor encoderExterno;

    @Override
    public void init() {
        // Mapeamento do encoder
        encoderExterno = hardwareMap.get(DcMotor.class, "encoder");
    }

    @Override
    public void loop() {
        // Pega a posição em ticks do encoder
        int posicaoTicks = encoderExterno.getCurrentPosition();

        telemetry.addData("Posicao do Encoder (Ticks): ", posicaoTicks);
        telemetry.update();
    }
}