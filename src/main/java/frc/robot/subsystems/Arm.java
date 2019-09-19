/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.revrobotics.CANPIDController;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * Add your docs here.
 */
public class Arm extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public double armEncoder = 0; 
  public double wristEncoder = 0; 

  public CANSparkMax wristMotor = new CANSparkMax(5, MotorType.kBrushless);
  public CANSparkMax elbowMotor = new CANSparkMax(6, MotorType.kBrushless);

  public CANPIDController wristPID = new CANPIDController(wristMotor);
  public CANPIDController elbowPID = new CANPIDController(elbowMotor);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  public void armToAngle(double angle) {


  }
}
