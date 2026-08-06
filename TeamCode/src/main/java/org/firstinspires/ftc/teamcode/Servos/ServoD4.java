//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.CRServo;
//
//@TeleOp()
//public class ServoD4  extends OpMode {
//
//    private CRServo servoD4;
//
//    @Override
//    public void init() {
//        servoD4 = hardwareMap.get(CRServo.class, "servod");
//    }
//
//    @Override
//    public void loop() {
//        servoD4.setPower(gamepad1.right_trigger);
//        telemetry.addData("Servo Position", servoD4.getPower());
//        telemetry.update();
//    }
//
//}
