/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double rightTrigger = Robot.controllerSecondary.getTriggerAxis(Hand.kRight);
    double leftTrigger = Robot.controllerSecondary.getTriggerAxis(Hand.kLeft);
    Robot.intake.intakeMotor.set((rightTrigger - leftTrigger)*0.5);
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
