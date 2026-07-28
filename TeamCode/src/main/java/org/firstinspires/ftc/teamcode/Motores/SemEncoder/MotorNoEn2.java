package org.firstinspires.ftc.teamcode.Motores.SemEncoder;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class MotorNoEn2 extends LinearOpMode {
    private DcMotor motorNoEn2;

    boolean invertido = false;
    boolean bumperAnterior = false;

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

