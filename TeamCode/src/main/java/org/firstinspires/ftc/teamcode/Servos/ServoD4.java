//package org.firstinspires.ftc.teamcode.Servos;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.hardware.Servo;
//
//public class ServoD4  extends OpMode {
//
//    private Servo servoD4;
//
//    @Override
//    public void init() {
//        servoD4 = hardwareMap.get(Servo.class, "servod4");
//    }
//
//    @Override
//    public void loop() {
//        servoD4.setPosition(gamepad1.right_trigger);
//        telemetry.addData("Servo Position", servoD4.getPosition());
//        telemetry.update();
//    }
//
//}
