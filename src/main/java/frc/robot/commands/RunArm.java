/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.revrobotics.ControlType;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Arm;

public class RunArm extends Command {
  public RunArm() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.arm);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.arm.elbowPID.setP(0.01);
    Robot.arm.elbowPID.setI(0);
    Robot.arm.elbowPID.setD(0.001);
    Robot.arm.elbowPID.setOutputRange(-0.5,0.5);

    Robot.arm.wristPID.setP(0.01);
    Robot.arm.wristPID.setI(0);
    Robot.arm.wristPID.setD(0.001);
    Robot.arm.wristPID.setOutputRange(-0.5,0.5);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.arm.elbowPID.setReference(0, ControlType.kPosition);
    Robot.arm.wristPID.setReference(Robot.arm.armEncoder/2, ControlType.kPosition);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
