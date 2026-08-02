//Motor com velocidade proporcional ao trigger :
//Utilizar algum trigger para controlar a potência;
//Treina: Gamepads e set power

package org.firstinspires.ftc.teamcode.Motores.SemEncoder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp()
public class MotorNoEn2 extends LinearOpMode {
    private DcMotor motorNoEn2;

    @Override
    public void runOpMode() {
        motorNoEn2 = hardwareMap.get(DcMotor.class, "MotorEn");

        waitForStart();

        while (opModeIsActive()) {
            motorNoEn2.setPower(gamepad1.right_trigger);
            telemetry.addData("Motor Power", motorNoEn2.getPower());
            telemetry.update();
        }
    }
}

