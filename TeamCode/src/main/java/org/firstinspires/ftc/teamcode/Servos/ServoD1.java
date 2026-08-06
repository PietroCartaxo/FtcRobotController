//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.Servo;
//
//@TeleOp()
//public class ServoD1 extends OpMode {
//    private Servo servoD1;
//
//    @Override
//    public void init() {
//        servoD1 = hardwareMap.get(Servo.class, "servod");
//    }
//
//    @Override
//    public void loop() {
//        if (gamepad1.a) {
//            servoD1.setPosition(0.0);
//        } else if (gamepad1.b) {
//            servoD1.setPosition(1.0);
//        }
//        telemetry.addData("Servo Position", servoD1.getPosition());
//        telemetry.update();
//    }
//}
