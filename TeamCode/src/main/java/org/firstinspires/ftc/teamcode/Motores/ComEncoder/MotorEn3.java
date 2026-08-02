//Um botão move o motor para uma posição e volta para a inicial :
//Pressionar A para target position e voltar ao ponto zero
//Treina: Controle sequencial

package org.firstinspires.ftc.teamcode.Motores.ComEncoder;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class MotorEn3 extends OpMode {
    private DcMotor motorEn3;
    private double ticks = 537.7;
    private double newTarget;
    private boolean estadoAnt = false;

    @Override
    public void init() {
        motorEn3 = hardwareMap.get(DcMotor.class, "MotorEn3");
        motorEn3.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorEn3.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    @Override
    public void loop() {
        boolean apenasPress = gamepad1.a && !estadoAnt;

        if (apenasPress) {
            if (motorEn3.getTargetPosition() == 0) {
                motorEn3.setTargetPosition((int)ticks);
                motorEn3.setPower(0.5);
            } else {
                motorEn3.setTargetPosition(0);
                motorEn3.setPower(0.5);
            }
        }

        estadoAnt = gamepad1.a;
        telemetry.addData("Target Pos: ", motorEn3.getTargetPosition());
        telemetry.addData("Current Pos: ", motorEn3.getCurrentPosition());
        telemetry.update();
    }
}
