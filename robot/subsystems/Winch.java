/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
/* FRC Team 7890 SeQuEnCe                                                     */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.kCANIds;

public class Winch extends SubsystemBase {

  private final WPI_TalonFX leftBlackMotor = new WPI_TalonFX(kCANIds.iClimbLeft);
  private final WPI_TalonFX rightGreenMotor = new WPI_TalonFX(kCANIds.iClimbRight);

  public Winch() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void leftUp() {
    leftBlackMotor.set(0.3);
  }

  public void rightUp() {
    rightGreenMotor.set(0.3);
  }

  public void leftStop() {
    leftBlackMotor.stopMotor();
  }

  public void rightStop() {
    rightGreenMotor.stopMotor();
  }

}
