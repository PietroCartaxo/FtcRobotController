//Um botão move o motor para uma posição e volta para a inicial :
//Pressionar A para target position e voltar ao ponto zero
//Treina: Controle sequencial

package org.firstinspires.ftc.teamcode.Motores.ComEncoder;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class MotorEn4 extends OpMode {

    private DcMotor motorEn4;
    private double ticks = 537.7;
    private double newTarget;

    private boolean estadoAnt = false;

    @Override
    public void init() {
        motorEn4 = hardwareMap.get(DcMotor.class, "MotorEn");
        motorEn4.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorEn4.setTargetPosition(0);
        motorEn4.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorEn4.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    @Override
    public void loop() {
        boolean apenasPress = gamepad1.a && !estadoAnt;

        if (apenasPress) {
            if (motorEn4.getTargetPosition() == 0) {
                motorEn4.setTargetPosition((int)ticks);
                motorEn4.setPower(0.5);
            } else {
                motorEn4.setTargetPosition(0);
                motorEn4.setPower(0.5);
            }
        }

        estadoAnt = gamepad1.a;
        telemetry.addData("Target Pos: ", motorEn4.getTargetPosition());
        telemetry.addData("Current Pos: ", motorEn4.getCurrentPosition());
        telemetry.update();
    }
}

