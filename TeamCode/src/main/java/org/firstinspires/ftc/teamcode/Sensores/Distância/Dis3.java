//package org.firstinspires.ftc.teamcode.Sensores.Distância;
//
//import com.qualcomm.robotcore.eventloop.opmode.OpMode;
//import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
//import com.qualcomm.robotcore.hardware.DcMotor;
//import com.qualcomm.robotcore.hardware.DistanceSensor;
//
//import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
//
//@TeleOp
//public class Dis3 extends OpMode {
//
//    private DistanceSensor dssensor;
//    private DcMotor motor;
//
//    @Override
//    public void init() {
//        dssensor = hardwareMap.get(DistanceSensor.class, "sensor");
//        motor = hardwareMap.get(DcMotor.class, "motor");
//        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
//    }
//
//    @Override
//    public void loop() {
//        double distance = dssensor.getDistance(DistanceUnit.CM);
//        double velocidade = distance / 100.0;
//
//        motor.setPower(velocidade);
//
//        telemetry.addData("Distância (cm)", distance);
//        telemetry.addData("Potência", motor.getPower());
//        telemetry.update();
//    }
//}