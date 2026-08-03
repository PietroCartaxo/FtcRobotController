//Ligar o motor em exatamente uma rotação :
//Mudando o modo do motor e usando suas funções;
//Treina: Modo RUN_TO_POSITION
//
//package org.firstinspires.ftc.teamcode.Motores.ComEncoder;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//
//@TeleOp()
//public class MotorEn1 extends OpMode {
//    private DcMotor motorEn1;
//    private double ticks = 537.7;
//    private double newTarget;
//
//    @Override
//    public void init() {
//        motorEn1 = hardwareMap.get(DcMotor.class, "MotorEn1");
//        motorEn1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        motorEn1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//    }
//
//    @Override
//    public void loop() {
//
//        if (gamepad1.a) {
//            motorEn1.setTargetPosition((int) ticks);
//            motorEn1.setPower(0.5);
//        }
//        telemetry.addData("Status", "Running to " + ticks);
//        telemetry.addData("Current Pos", motorEn1.getCurrentPosition());
//        telemetry.update();
//    }
//}
