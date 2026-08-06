//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.Servo;
//
//@TeleOp()
//public class ServoD5 extends OpMode {
//
//    private Servo servoD5;
//
//    @Override
//    public void init() {
//        servoD5 = hardwareMap.get(Servo.class, "servod");
//    }
//
//    @Override
//    public void loop() {
//        if(gamepad1.right_trigger > 0.1){
//            servoD5.setPosition(1.0);
//        } else if(gamepad1.left_trigger > 0.1){
//            servoD5.setPosition(0.0);
//        }
//        telemetry.addData("Servo Position", servoD5.getPosition());
//        telemetry.update();
//    }
//}
