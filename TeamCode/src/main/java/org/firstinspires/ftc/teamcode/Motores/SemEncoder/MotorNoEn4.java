package org.firstinspires.ftc.teamcode.Motores.SemEncoder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorNoEn4 extends LinearOpMode {
    private DcMotor motorNoEn4;

    boolean invertido = false;
    boolean bumperAnterior = false;

    @Override
    public void runOpMode() throws InterruptedException {
        motorNoEn4 = hardwareMap.get(DcMotor.class, "MotorNoEn4");

        waitForStart();

            while(opModeIsActive()){
                if(gamepad1.right_bumper && !bumperAnterior){
                    invertido = !invertido;
                }
                bumperAnterior = gamepad1.right_bumper;

                if (invertido) {
                    motorNoEn4.setPower(-1.0);
                } else {
                    motorNoEn4.setPower(1.0);
                }

                telemetry.addData("Motor Power", motorNoEn4.getPower());
                telemetry.addData("Invertido", invertido);
                telemetry.update();
            }
        }
    }
}
