package com.cc.accelerator.entity;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

//@Data
//@Document("Sensor")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sensor {

	@Id
	@JsonProperty("_id")
	private String id;
	@JsonProperty("Version")
	private Integer version;
	@JsonProperty("subjectId")
	private Integer subjectId;
	@JsonProperty("encounterId")
	private Integer encounterId;
	@JsonProperty("date")
	private String date;
	@JsonProperty("frameRate")
	private Integer frameRate;
	@JsonProperty("index")
	private Integer index;
	@JsonProperty("nHumanReadTime")
	private String nHumanReadTime;
	@JsonProperty("time")
	private Integer time;
	@JsonProperty("ms")
	private Integer ms;
	@JsonProperty("type")
	private String type;
	@JsonProperty("orientation_Pelvis_q0")
	private Double orientationPelvisQ0;
	@JsonProperty("orientation_Pelvis_q1")
	private Double orientationPelvisQ1;
	@JsonProperty("orientation_Pelvis_q2")
	private Double orientationPelvisQ2;
	@JsonProperty("orientation_Pelvis_q3")
	private Double orientationPelvisQ3;
	@JsonProperty("position_Pelvis_x")
	private Double positionPelvisX;
	@JsonProperty("position_Pelvis_y")
	private Double positionPelvisY;
	@JsonProperty("position_Pelvis_z")
	private Double positionPelvisZ;
	@JsonProperty("velocity_Pelvis_x")
	private Double velocityPelvisX;
	@JsonProperty("velocity_Pelvis_y")
	private Double velocityPelvisY;
	@JsonProperty("velocity_Pelvis_z")
	private Double velocityPelvisZ;
	@JsonProperty("acceleration_Pelvis_x")
	private Double accelerationPelvisX;
	@JsonProperty("acceleration_Pelvis_y")
	private Double accelerationPelvisY;
	@JsonProperty("acceleration_Pelvis_z")
	private Double accelerationPelvisZ;
	@JsonProperty("angularVelocity_Pelvis_x")
	private Double angularVelocityPelvisX;
	@JsonProperty("angularVelocity_Pelvis_y")
	private Double angularVelocityPelvisY;
	@JsonProperty("angularVelocity_Pelvis_z")
	private Double angularVelocityPelvisZ;
	@JsonProperty("angularAcceleration_Pelvis_x")
	private Double angularAccelerationPelvisX;
	@JsonProperty("angularAcceleration_Pelvis_y")
	private Double angularAccelerationPelvisY;
	@JsonProperty("angularAcceleration_Pelvis_z")
	private Double angularAccelerationPelvisZ;
	@JsonProperty("contact_Pelvis")
	private Integer contactPelvis;
	@JsonProperty("orientation_L5_q0")
	private Double orientationL5Q0;
	@JsonProperty("orientation_L5_q1")
	private Double orientationL5Q1;
	@JsonProperty("orientation_L5_q2")
	private Double orientationL5Q2;
	@JsonProperty("orientation_L5_q3")
	private Double orientationL5Q3;
	@JsonProperty("position_L5_x")
	private Double positionL5X;
	@JsonProperty("position_L5_y")
	private Double positionL5Y;
	@JsonProperty("position_L5_z")
	private Double positionL5Z;
	@JsonProperty("velocity_L5_x")
	private Double velocityL5X;
	@JsonProperty("velocity_L5_y")
	private Double velocityL5Y;
	@JsonProperty("velocity_L5_z")
	private Double velocityL5Z;
	@JsonProperty("acceleration_L5_x")
	private Double accelerationL5X;
	@JsonProperty("acceleration_L5_y")
	private Double accelerationL5Y;
	@JsonProperty("acceleration_L5_z")
	private Double accelerationL5Z;
	@JsonProperty("angularVelocity_L5_x")
	private Double angularVelocityL5X;
	@JsonProperty("angularVelocity_L5_y")
	private Double angularVelocityL5Y;
	@JsonProperty("angularVelocity_L5_z")
	private Double angularVelocityL5Z;
	@JsonProperty("angularAcceleration_L5_x")
	private Double angularAccelerationL5X;
	@JsonProperty("angularAcceleration_L5_y")
	private Double angularAccelerationL5Y;
	@JsonProperty("angularAcceleration_L5_z")
	private Double angularAccelerationL5Z;
	@JsonProperty("contact_L5")
	private Integer contactL5;
	@JsonProperty("orientation_L3_q0")
	private Double orientationL3Q0;
	@JsonProperty("orientation_L3_q1")
	private Double orientationL3Q1;
	@JsonProperty("orientation_L3_q2")
	private Double orientationL3Q2;
	@JsonProperty("orientation_L3_q3")
	private Double orientationL3Q3;
	@JsonProperty("position_L3_x")
	private Double positionL3X;
	@JsonProperty("position_L3_y")
	private Double positionL3Y;
	@JsonProperty("position_L3_z")
	private Double positionL3Z;
	@JsonProperty("velocity_L3_x")
	private Double velocityL3X;
	@JsonProperty("velocity_L3_y")
	private Double velocityL3Y;
	@JsonProperty("velocity_L3_z")
	private Double velocityL3Z;
	@JsonProperty("acceleration_L3_x")
	private Double accelerationL3X;
	@JsonProperty("acceleration_L3_y")
	private Double accelerationL3Y;
	@JsonProperty("acceleration_L3_z")
	private Double accelerationL3Z;
	@JsonProperty("angularVelocity_L3_x")
	private Double angularVelocityL3X;
	@JsonProperty("angularVelocity_L3_y")
	private Double angularVelocityL3Y;
	@JsonProperty("angularVelocity_L3_z")
	private Double angularVelocityL3Z;
	@JsonProperty("angularAcceleration_L3_x")
	private Double angularAccelerationL3X;
	@JsonProperty("angularAcceleration_L3_y")
	private Double angularAccelerationL3Y;
	@JsonProperty("angularAcceleration_L3_z")
	private Double angularAccelerationL3Z;
	@JsonProperty("contact_L3")
	private Integer contactL3;
	@JsonProperty("orientation_T12_q0")
	private Double orientationT12Q0;
	@JsonProperty("orientation_T12_q1")
	private Double orientationT12Q1;
	@JsonProperty("orientation_T12_q2")
	private Double orientationT12Q2;
	@JsonProperty("orientation_T12_q3")
	private Double orientationT12Q3;
	@JsonProperty("position_T12_x")
	private Double positionT12X;
	@JsonProperty("position_T12_y")
	private Double positionT12Y;
	@JsonProperty("position_T12_z")
	private Double positionT12Z;
	@JsonProperty("velocity_T12_x")
	private Double velocityT12X;
	@JsonProperty("velocity_T12_y")
	private Double velocityT12Y;
	@JsonProperty("velocity_T12_z")
	private Double velocityT12Z;
	@JsonProperty("acceleration_T12_x")
	private Double accelerationT12X;
	@JsonProperty("acceleration_T12_y")
	private Double accelerationT12Y;
	@JsonProperty("acceleration_T12_z")
	private Double accelerationT12Z;
	@JsonProperty("angularVelocity_T12_x")
	private Double angularVelocityT12X;
	@JsonProperty("angularVelocity_T12_y")
	private Double angularVelocityT12Y;
	@JsonProperty("angularVelocity_T12_z")
	private Double angularVelocityT12Z;
	@JsonProperty("angularAcceleration_T12_x")
	private Double angularAccelerationT12X;
	@JsonProperty("angularAcceleration_T12_y")
	private Double angularAccelerationT12Y;
	@JsonProperty("angularAcceleration_T12_z")
	private Double angularAccelerationT12Z;
	@JsonProperty("contact_T12")
	private Integer contactT12;
	@JsonProperty("orientation_T8_q0")
	private Double orientationT8Q0;
	@JsonProperty("orientation_T8_q1")
	private Double orientationT8Q1;
	@JsonProperty("orientation_T8_q2")
	private Double orientationT8Q2;
	@JsonProperty("orientation_T8_q3")
	private Double orientationT8Q3;
	@JsonProperty("position_T8_x")
	private Double positionT8X;
	@JsonProperty("position_T8_y")
	private Double positionT8Y;
	@JsonProperty("position_T8_z")
	private Double positionT8Z;
	@JsonProperty("velocity_T8_x")
	private Double velocityT8X;
	@JsonProperty("velocity_T8_y")
	private Double velocityT8Y;
	@JsonProperty("velocity_T8_z")
	private Double velocityT8Z;
	@JsonProperty("acceleration_T8_x")
	private Double accelerationT8X;
	@JsonProperty("acceleration_T8_y")
	private Double accelerationT8Y;
	@JsonProperty("acceleration_T8_z")
	private Double accelerationT8Z;
	@JsonProperty("angularVelocity_T8_x")
	private Double angularVelocityT8X;
	@JsonProperty("angularVelocity_T8_y")
	private Double angularVelocityT8Y;
	@JsonProperty("angularVelocity_T8_z")
	private Double angularVelocityT8Z;
	@JsonProperty("angularAcceleration_T8_x")
	private Double angularAccelerationT8X;
	@JsonProperty("angularAcceleration_T8_y")
	private Double angularAccelerationT8Y;
	@JsonProperty("angularAcceleration_T8_z")
	private Double angularAccelerationT8Z;
	@JsonProperty("contact_T8")
	private Integer contactT8;
	@JsonProperty("orientation_Neck_q0")
	private Double orientationNeckQ0;
	@JsonProperty("orientation_Neck_q1")
	private Double orientationNeckQ1;
	@JsonProperty("orientation_Neck_q2")
	private Double orientationNeckQ2;
	@JsonProperty("orientation_Neck_q3")
	private Double orientationNeckQ3;
	@JsonProperty("position_Neck_x")
	private Double positionNeckX;
	@JsonProperty("position_Neck_y")
	private Double positionNeckY;
	@JsonProperty("position_Neck_z")
	private Double positionNeckZ;
	@JsonProperty("velocity_Neck_x")
	private Double velocityNeckX;
	@JsonProperty("velocity_Neck_y")
	private Double velocityNeckY;
	@JsonProperty("velocity_Neck_z")
	private Double velocityNeckZ;
	@JsonProperty("acceleration_Neck_x")
	private Double accelerationNeckX;
	@JsonProperty("acceleration_Neck_y")
	private Double accelerationNeckY;
	@JsonProperty("acceleration_Neck_z")
	private Double accelerationNeckZ;
	@JsonProperty("angularVelocity_Neck_x")
	private Double angularVelocityNeckX;
	@JsonProperty("angularVelocity_Neck_y")
	private Double angularVelocityNeckY;
	@JsonProperty("angularVelocity_Neck_z")
	private Double angularVelocityNeckZ;
	@JsonProperty("angularAcceleration_Neck_x")
	private Double angularAccelerationNeckX;
	@JsonProperty("angularAcceleration_Neck_y")
	private Double angularAccelerationNeckY;
	@JsonProperty("angularAcceleration_Neck_z")
	private Double angularAccelerationNeckZ;
	@JsonProperty("contact_Neck")
	private Integer contactNeck;
	@JsonProperty("orientation_Head_q0")
	private Double orientationHeadQ0;
	@JsonProperty("orientation_Head_q1")
	private Double orientationHeadQ1;
	@JsonProperty("orientation_Head_q2")
	private Double orientationHeadQ2;
	@JsonProperty("orientation_Head_q3")
	private Double orientationHeadQ3;
	@JsonProperty("position_Head_x")
	private Double positionHeadX;
	@JsonProperty("position_Head_y")
	private Double positionHeadY;
	@JsonProperty("position_Head_z")
	private Double positionHeadZ;
	@JsonProperty("velocity_Head_x")
	private Double velocityHeadX;
	@JsonProperty("velocity_Head_y")
	private Double velocityHeadY;
	@JsonProperty("velocity_Head_z")
	private Double velocityHeadZ;
	@JsonProperty("acceleration_Head_x")
	private Double accelerationHeadX;
	@JsonProperty("acceleration_Head_y")
	private Double accelerationHeadY;
	@JsonProperty("acceleration_Head_z")
	private Double accelerationHeadZ;
	@JsonProperty("angularVelocity_Head_x")
	private Double angularVelocityHeadX;
	@JsonProperty("angularVelocity_Head_y")
	private Double angularVelocityHeadY;
	@JsonProperty("angularVelocity_Head_z")
	private Double angularVelocityHeadZ;
	@JsonProperty("angularAcceleration_Head_x")
	private Double angularAccelerationHeadX;
	@JsonProperty("angularAcceleration_Head_y")
	private Double angularAccelerationHeadY;
	@JsonProperty("angularAcceleration_Head_z")
	private Double angularAccelerationHeadZ;
	@JsonProperty("contact_Head")
	private Integer contactHead;
	@JsonProperty("orientation_RightShoulder_q0")
	private Double orientationRightShoulderQ0;
	@JsonProperty("orientation_RightShoulder_q1")
	private Double orientationRightShoulderQ1;
	@JsonProperty("orientation_RightShoulder_q2")
	private Double orientationRightShoulderQ2;
	@JsonProperty("orientation_RightShoulder_q3")
	private Double orientationRightShoulderQ3;
	@JsonProperty("position_RightShoulder_x")
	private Double positionRightShoulderX;
	@JsonProperty("position_RightShoulder_y")
	private Double positionRightShoulderY;
	@JsonProperty("position_RightShoulder_z")
	private Double positionRightShoulderZ;
	@JsonProperty("velocity_RightShoulder_x")
	private Double velocityRightShoulderX;
	@JsonProperty("velocity_RightShoulder_y")
	private Double velocityRightShoulderY;
	@JsonProperty("velocity_RightShoulder_z")
	private Double velocityRightShoulderZ;
	@JsonProperty("acceleration_RightShoulder_x")
	private Double accelerationRightShoulderX;
	@JsonProperty("acceleration_RightShoulder_y")
	private Double accelerationRightShoulderY;
	@JsonProperty("acceleration_RightShoulder_z")
	private Double accelerationRightShoulderZ;
	@JsonProperty("angularVelocity_RightShoulder_x")
	private Double angularVelocityRightShoulderX;
	@JsonProperty("angularVelocity_RightShoulder_y")
	private Double angularVelocityRightShoulderY;
	@JsonProperty("angularVelocity_RightShoulder_z")
	private Double angularVelocityRightShoulderZ;
	@JsonProperty("angularAcceleration_RightShoulder_x")
	private Double angularAccelerationRightShoulderX;
	@JsonProperty("angularAcceleration_RightShoulder_y")
	private Double angularAccelerationRightShoulderY;
	@JsonProperty("angularAcceleration_RightShoulder_z")
	private Double angularAccelerationRightShoulderZ;
	@JsonProperty("contact_RightShoulder")
	private Integer contactRightShoulder;
	@JsonProperty("orientation_RightUpperArm_q0")
	private Double orientationRightUpperArmQ0;
	@JsonProperty("orientation_RightUpperArm_q1")
	private Double orientationRightUpperArmQ1;
	@JsonProperty("orientation_RightUpperArm_q2")
	private Double orientationRightUpperArmQ2;
	@JsonProperty("orientation_RightUpperArm_q3")
	private Double orientationRightUpperArmQ3;
	@JsonProperty("position_RightUpperArm_x")
	private Double positionRightUpperArmX;
	@JsonProperty("position_RightUpperArm_y")
	private Double positionRightUpperArmY;
	@JsonProperty("position_RightUpperArm_z")
	private Double positionRightUpperArmZ;
	@JsonProperty("velocity_RightUpperArm_x")
	private Double velocityRightUpperArmX;
	@JsonProperty("velocity_RightUpperArm_y")
	private Double velocityRightUpperArmY;
	@JsonProperty("velocity_RightUpperArm_z")
	private Double velocityRightUpperArmZ;
	@JsonProperty("acceleration_RightUpperArm_x")
	private Double accelerationRightUpperArmX;
	@JsonProperty("acceleration_RightUpperArm_y")
	private Double accelerationRightUpperArmY;
	@JsonProperty("acceleration_RightUpperArm_z")
	private Double accelerationRightUpperArmZ;
	@JsonProperty("angularVelocity_RightUpperArm_x")
	private Double angularVelocityRightUpperArmX;
	@JsonProperty("angularVelocity_RightUpperArm_y")
	private Double angularVelocityRightUpperArmY;
	@JsonProperty("angularVelocity_RightUpperArm_z")
	private Double angularVelocityRightUpperArmZ;
	@JsonProperty("angularAcceleration_RightUpperArm_x")
	private Double angularAccelerationRightUpperArmX;
	@JsonProperty("angularAcceleration_RightUpperArm_y")
	private Double angularAccelerationRightUpperArmY;
	@JsonProperty("angularAcceleration_RightUpperArm_z")
	private Double angularAccelerationRightUpperArmZ;
	@JsonProperty("contact_RightUpperArm")
	private Integer contactRightUpperArm;
	@JsonProperty("orientation_RightForeArm_q0")
	private Double orientationRightForeArmQ0;
	@JsonProperty("orientation_RightForeArm_q1")
	private Double orientationRightForeArmQ1;
	@JsonProperty("orientation_RightForeArm_q2")
	private Double orientationRightForeArmQ2;
	@JsonProperty("orientation_RightForeArm_q3")
	private Double orientationRightForeArmQ3;
	@JsonProperty("position_RightForeArm_x")
	private Double positionRightForeArmX;
	@JsonProperty("position_RightForeArm_y")
	private Double positionRightForeArmY;
	@JsonProperty("position_RightForeArm_z")
	private Double positionRightForeArmZ;
	@JsonProperty("velocity_RightForeArm_x")
	private Double velocityRightForeArmX;
	@JsonProperty("velocity_RightForeArm_y")
	private Double velocityRightForeArmY;
	@JsonProperty("velocity_RightForeArm_z")
	private Double velocityRightForeArmZ;
	@JsonProperty("acceleration_RightForeArm_x")
	private Double accelerationRightForeArmX;
	@JsonProperty("acceleration_RightForeArm_y")
	private Double accelerationRightForeArmY;
	@JsonProperty("acceleration_RightForeArm_z")
	private Double accelerationRightForeArmZ;
	@JsonProperty("angularVelocity_RightForeArm_x")
	private Double angularVelocityRightForeArmX;
	@JsonProperty("angularVelocity_RightForeArm_y")
	private Double angularVelocityRightForeArmY;
	@JsonProperty("angularVelocity_RightForeArm_z")
	private Double angularVelocityRightForeArmZ;
	@JsonProperty("angularAcceleration_RightForeArm_x")
	private Double angularAccelerationRightForeArmX;
	@JsonProperty("angularAcceleration_RightForeArm_y")
	private Double angularAccelerationRightForeArmY;
	@JsonProperty("angularAcceleration_RightForeArm_z")
	private Double angularAccelerationRightForeArmZ;
	@JsonProperty("contact_RightForeArm")
	private Integer contactRightForeArm;
	@JsonProperty("orientation_RightHand_q0")
	private Double orientationRightHandQ0;
	@JsonProperty("orientation_RightHand_q1")
	private Double orientationRightHandQ1;
	@JsonProperty("orientation_RightHand_q2")
	private Double orientationRightHandQ2;
	@JsonProperty("orientation_RightHand_q3")
	private Double orientationRightHandQ3;
	@JsonProperty("position_RightHand_x")
	private Double positionRightHandX;
	@JsonProperty("position_RightHand_y")
	private Double positionRightHandY;
	@JsonProperty("position_RightHand_z")
	private Double positionRightHandZ;
	@JsonProperty("velocity_RightHand_x")
	private Double velocityRightHandX;
	@JsonProperty("velocity_RightHand_y")
	private Double velocityRightHandY;
	@JsonProperty("velocity_RightHand_z")
	private Double velocityRightHandZ;
	@JsonProperty("acceleration_RightHand_x")
	private Double accelerationRightHandX;
	@JsonProperty("acceleration_RightHand_y")
	private Double accelerationRightHandY;
	@JsonProperty("acceleration_RightHand_z")
	private Double accelerationRightHandZ;
	@JsonProperty("angularVelocity_RightHand_x")
	private Double angularVelocityRightHandX;
	@JsonProperty("angularVelocity_RightHand_y")
	private Double angularVelocityRightHandY;
	@JsonProperty("angularVelocity_RightHand_z")
	private Double angularVelocityRightHandZ;
	@JsonProperty("angularAcceleration_RightHand_x")
	private Double angularAccelerationRightHandX;
	@JsonProperty("angularAcceleration_RightHand_y")
	private Double angularAccelerationRightHandY;
	@JsonProperty("angularAcceleration_RightHand_z")
	private Double angularAccelerationRightHandZ;
	@JsonProperty("contact_RightHand")
	private Integer contactRightHand;
	@JsonProperty("orientation_LeftShoulder_q0")
	private Double orientationLeftShoulderQ0;
	@JsonProperty("orientation_LeftShoulder_q1")
	private Double orientationLeftShoulderQ1;
	@JsonProperty("orientation_LeftShoulder_q2")
	private Double orientationLeftShoulderQ2;
	@JsonProperty("orientation_LeftShoulder_q3")
	private Double orientationLeftShoulderQ3;
	@JsonProperty("position_LeftShoulder_x")
	private Double positionLeftShoulderX;
	@JsonProperty("position_LeftShoulder_y")
	private Double positionLeftShoulderY;
	@JsonProperty("position_LeftShoulder_z")
	private Double positionLeftShoulderZ;
	@JsonProperty("velocity_LeftShoulder_x")
	private Double velocityLeftShoulderX;
	@JsonProperty("velocity_LeftShoulder_y")
	private Double velocityLeftShoulderY;
	@JsonProperty("velocity_LeftShoulder_z")
	private Double velocityLeftShoulderZ;
	@JsonProperty("acceleration_LeftShoulder_x")
	private Double accelerationLeftShoulderX;
	@JsonProperty("acceleration_LeftShoulder_y")
	private Double accelerationLeftShoulderY;
	@JsonProperty("acceleration_LeftShoulder_z")
	private Double accelerationLeftShoulderZ;
	@JsonProperty("angularVelocity_LeftShoulder_x")
	private Double angularVelocityLeftShoulderX;
	@JsonProperty("angularVelocity_LeftShoulder_y")
	private Double angularVelocityLeftShoulderY;
	@JsonProperty("angularVelocity_LeftShoulder_z")
	private Double angularVelocityLeftShoulderZ;
	@JsonProperty("angularAcceleration_LeftShoulder_x")
	private Double angularAccelerationLeftShoulderX;
	@JsonProperty("angularAcceleration_LeftShoulder_y")
	private Double angularAccelerationLeftShoulderY;
	@JsonProperty("angularAcceleration_LeftShoulder_z")
	private Double angularAccelerationLeftShoulderZ;
	@JsonProperty("contact_LeftShoulder")
	private Integer contactLeftShoulder;
	@JsonProperty("orientation_LeftUpperArm_q0")
	private Double orientationLeftUpperArmQ0;
	@JsonProperty("orientation_LeftUpperArm_q1")
	private Double orientationLeftUpperArmQ1;
	@JsonProperty("orientation_LeftUpperArm_q2")
	private Double orientationLeftUpperArmQ2;
	@JsonProperty("orientation_LeftUpperArm_q3")
	private Double orientationLeftUpperArmQ3;
	@JsonProperty("position_LeftUpperArm_x")
	private Double positionLeftUpperArmX;
	@JsonProperty("position_LeftUpperArm_y")
	private Double positionLeftUpperArmY;
	@JsonProperty("position_LeftUpperArm_z")
	private Double positionLeftUpperArmZ;
	@JsonProperty("velocity_LeftUpperArm_x")
	private Double velocityLeftUpperArmX;
	@JsonProperty("velocity_LeftUpperArm_y")
	private Double velocityLeftUpperArmY;
	@JsonProperty("velocity_LeftUpperArm_z")
	private Double velocityLeftUpperArmZ;
	@JsonProperty("acceleration_LeftUpperArm_x")
	private Double accelerationLeftUpperArmX;
	@JsonProperty("acceleration_LeftUpperArm_y")
	private Double accelerationLeftUpperArmY;
	@JsonProperty("acceleration_LeftUpperArm_z")
	private Double accelerationLeftUpperArmZ;
	@JsonProperty("angularVelocity_LeftUpperArm_x")
	private Double angularVelocityLeftUpperArmX;
	@JsonProperty("angularVelocity_LeftUpperArm_y")
	private Double angularVelocityLeftUpperArmY;
	@JsonProperty("angularVelocity_LeftUpperArm_z")
	private Double angularVelocityLeftUpperArmZ;
	@JsonProperty("angularAcceleration_LeftUpperArm_x")
	private Double angularAccelerationLeftUpperArmX;
	@JsonProperty("angularAcceleration_LeftUpperArm_y")
	private Double angularAccelerationLeftUpperArmY;
	@JsonProperty("angularAcceleration_LeftUpperArm_z")
	private Double angularAccelerationLeftUpperArmZ;
	@JsonProperty("contact_LeftUpperArm")
	private Integer contactLeftUpperArm;
	@JsonProperty("orientation_LeftForeArm_q0")
	private Double orientationLeftForeArmQ0;
	@JsonProperty("orientation_LeftForeArm_q1")
	private Double orientationLeftForeArmQ1;
	@JsonProperty("orientation_LeftForeArm_q2")
	private Double orientationLeftForeArmQ2;
	@JsonProperty("orientation_LeftForeArm_q3")
	private Double orientationLeftForeArmQ3;
	@JsonProperty("position_LeftForeArm_x")
	private Double positionLeftForeArmX;
	@JsonProperty("position_LeftForeArm_y")
	private Double positionLeftForeArmY;
	@JsonProperty("position_LeftForeArm_z")
	private Double positionLeftForeArmZ;
	@JsonProperty("velocity_LeftForeArm_x")
	private Double velocityLeftForeArmX;
	@JsonProperty("velocity_LeftForeArm_y")
	private Double velocityLeftForeArmY;
	@JsonProperty("velocity_LeftForeArm_z")
	private Double velocityLeftForeArmZ;
	@JsonProperty("acceleration_LeftForeArm_x")
	private Double accelerationLeftForeArmX;
	@JsonProperty("acceleration_LeftForeArm_y")
	private Double accelerationLeftForeArmY;
	@JsonProperty("acceleration_LeftForeArm_z")
	private Double accelerationLeftForeArmZ;
	@JsonProperty("angularVelocity_LeftForeArm_x")
	private Double angularVelocityLeftForeArmX;
	@JsonProperty("angularVelocity_LeftForeArm_y")
	private Double angularVelocityLeftForeArmY;
	@JsonProperty("angularVelocity_LeftForeArm_z")
	private Double angularVelocityLeftForeArmZ;
	@JsonProperty("angularAcceleration_LeftForeArm_x")
	private Double angularAccelerationLeftForeArmX;
	@JsonProperty("angularAcceleration_LeftForeArm_y")
	private Double angularAccelerationLeftForeArmY;
	@JsonProperty("angularAcceleration_LeftForeArm_z")
	private Double angularAccelerationLeftForeArmZ;
	@JsonProperty("contact_LeftForeArm")
	private Integer contactLeftForeArm;
	@JsonProperty("orientation_LeftHand_q0")
	private Double orientationLeftHandQ0;
	@JsonProperty("orientation_LeftHand_q1")
	private Double orientationLeftHandQ1;
	@JsonProperty("orientation_LeftHand_q2")
	private Double orientationLeftHandQ2;
	@JsonProperty("orientation_LeftHand_q3")
	private Double orientationLeftHandQ3;
	@JsonProperty("position_LeftHand_x")
	private Double positionLeftHandX;
	@JsonProperty("position_LeftHand_y")
	private Double positionLeftHandY;
	@JsonProperty("position_LeftHand_z")
	private Double positionLeftHandZ;
	@JsonProperty("velocity_LeftHand_x")
	private Double velocityLeftHandX;
	@JsonProperty("velocity_LeftHand_y")
	private Double velocityLeftHandY;
	@JsonProperty("velocity_LeftHand_z")
	private Double velocityLeftHandZ;
	@JsonProperty("acceleration_LeftHand_x")
	private Double accelerationLeftHandX;
	@JsonProperty("acceleration_LeftHand_y")
	private Double accelerationLeftHandY;
	@JsonProperty("acceleration_LeftHand_z")
	private Double accelerationLeftHandZ;
	@JsonProperty("angularVelocity_LeftHand_x")
	private Double angularVelocityLeftHandX;
	@JsonProperty("angularVelocity_LeftHand_y")
	private Double angularVelocityLeftHandY;
	@JsonProperty("angularVelocity_LeftHand_z")
	private Double angularVelocityLeftHandZ;
	@JsonProperty("angularAcceleration_LeftHand_x")
	private Double angularAccelerationLeftHandX;
	@JsonProperty("angularAcceleration_LeftHand_y")
	private Double angularAccelerationLeftHandY;
	@JsonProperty("angularAcceleration_LeftHand_z")
	private Double angularAccelerationLeftHandZ;
	@JsonProperty("contact_LeftHand")
	private Integer contactLeftHand;
	@JsonProperty("orientation_RightUpperLeg_q0")
	private Double orientationRightUpperLegQ0;
	@JsonProperty("orientation_RightUpperLeg_q1")
	private Double orientationRightUpperLegQ1;
	@JsonProperty("orientation_RightUpperLeg_q2")
	private Double orientationRightUpperLegQ2;
	@JsonProperty("orientation_RightUpperLeg_q3")
	private Double orientationRightUpperLegQ3;
	@JsonProperty("position_RightUpperLeg_x")
	private Double positionRightUpperLegX;
	@JsonProperty("position_RightUpperLeg_y")
	private Double positionRightUpperLegY;
	@JsonProperty("position_RightUpperLeg_z")
	private Double positionRightUpperLegZ;
	@JsonProperty("velocity_RightUpperLeg_x")
	private Double velocityRightUpperLegX;
	@JsonProperty("velocity_RightUpperLeg_y")
	private Double velocityRightUpperLegY;
	@JsonProperty("velocity_RightUpperLeg_z")
	private Double velocityRightUpperLegZ;
	@JsonProperty("acceleration_RightUpperLeg_x")
	private Double accelerationRightUpperLegX;
	@JsonProperty("acceleration_RightUpperLeg_y")
	private Double accelerationRightUpperLegY;
	@JsonProperty("acceleration_RightUpperLeg_z")
	private Double accelerationRightUpperLegZ;
	@JsonProperty("angularVelocity_RightUpperLeg_x")
	private Double angularVelocityRightUpperLegX;
	@JsonProperty("angularVelocity_RightUpperLeg_y")
	private Double angularVelocityRightUpperLegY;
	@JsonProperty("angularVelocity_RightUpperLeg_z")
	private Double angularVelocityRightUpperLegZ;
	@JsonProperty("angularAcceleration_RightUpperLeg_x")
	private Double angularAccelerationRightUpperLegX;
	@JsonProperty("angularAcceleration_RightUpperLeg_y")
	private Double angularAccelerationRightUpperLegY;
	@JsonProperty("angularAcceleration_RightUpperLeg_z")
	private Double angularAccelerationRightUpperLegZ;
	@JsonProperty("contact_RightUpperLeg")
	private Integer contactRightUpperLeg;
	@JsonProperty("orientation_RightLowerLeg_q0")
	private Double orientationRightLowerLegQ0;
	@JsonProperty("orientation_RightLowerLeg_q1")
	private Double orientationRightLowerLegQ1;
	@JsonProperty("orientation_RightLowerLeg_q2")
	private Double orientationRightLowerLegQ2;
	@JsonProperty("orientation_RightLowerLeg_q3")
	private Double orientationRightLowerLegQ3;
	@JsonProperty("position_RightLowerLeg_x")
	private Double positionRightLowerLegX;
	@JsonProperty("position_RightLowerLeg_y")
	private Double positionRightLowerLegY;
	@JsonProperty("position_RightLowerLeg_z")
	private Double positionRightLowerLegZ;
	@JsonProperty("velocity_RightLowerLeg_x")
	private Double velocityRightLowerLegX;
	@JsonProperty("velocity_RightLowerLeg_y")
	private Double velocityRightLowerLegY;
	@JsonProperty("velocity_RightLowerLeg_z")
	private Double velocityRightLowerLegZ;
	@JsonProperty("acceleration_RightLowerLeg_x")
	private Double accelerationRightLowerLegX;
	@JsonProperty("acceleration_RightLowerLeg_y")
	private Double accelerationRightLowerLegY;
	@JsonProperty("acceleration_RightLowerLeg_z")
	private Double accelerationRightLowerLegZ;
	@JsonProperty("angularVelocity_RightLowerLeg_x")
	private Double angularVelocityRightLowerLegX;
	@JsonProperty("angularVelocity_RightLowerLeg_y")
	private Double angularVelocityRightLowerLegY;
	@JsonProperty("angularVelocity_RightLowerLeg_z")
	private Double angularVelocityRightLowerLegZ;
	@JsonProperty("angularAcceleration_RightLowerLeg_x")
	private Double angularAccelerationRightLowerLegX;
	@JsonProperty("angularAcceleration_RightLowerLeg_y")
	private Double angularAccelerationRightLowerLegY;
	@JsonProperty("angularAcceleration_RightLowerLeg_z")
	private Double angularAccelerationRightLowerLegZ;
	@JsonProperty("contact_RightLowerLeg")
	private Integer contactRightLowerLeg;
	@JsonProperty("orientation_RightFoot_q0")
	private Double orientationRightFootQ0;
	@JsonProperty("orientation_RightFoot_q1")
	private Double orientationRightFootQ1;
	@JsonProperty("orientation_RightFoot_q2")
	private Double orientationRightFootQ2;
	@JsonProperty("orientation_RightFoot_q3")
	private Double orientationRightFootQ3;
	@JsonProperty("position_RightFoot_x")
	private Double positionRightFootX;
	@JsonProperty("position_RightFoot_y")
	private Double positionRightFootY;
	@JsonProperty("position_RightFoot_z")
	private Double positionRightFootZ;
	@JsonProperty("velocity_RightFoot_x")
	private Double velocityRightFootX;
	@JsonProperty("velocity_RightFoot_y")
	private Double velocityRightFootY;
	@JsonProperty("velocity_RightFoot_z")
	private Double velocityRightFootZ;
	@JsonProperty("acceleration_RightFoot_x")
	private Double accelerationRightFootX;
	@JsonProperty("acceleration_RightFoot_y")
	private Double accelerationRightFootY;
	@JsonProperty("acceleration_RightFoot_z")
	private Double accelerationRightFootZ;
	@JsonProperty("angularVelocity_RightFoot_x")
	private Double angularVelocityRightFootX;
	@JsonProperty("angularVelocity_RightFoot_y")
	private Double angularVelocityRightFootY;
	@JsonProperty("angularVelocity_RightFoot_z")
	private Double angularVelocityRightFootZ;
	@JsonProperty("angularAcceleration_RightFoot_x")
	private Double angularAccelerationRightFootX;
	@JsonProperty("angularAcceleration_RightFoot_y")
	private Double angularAccelerationRightFootY;
	@JsonProperty("angularAcceleration_RightFoot_z")
	private Double angularAccelerationRightFootZ;
	@JsonProperty("contact_RightFoot")
	private Integer contactRightFoot;
	@JsonProperty("orientation_RightToe_q0")
	private Double orientationRightToeQ0;
	@JsonProperty("orientation_RightToe_q1")
	private Double orientationRightToeQ1;
	@JsonProperty("orientation_RightToe_q2")
	private Double orientationRightToeQ2;
	@JsonProperty("orientation_RightToe_q3")
	private Double orientationRightToeQ3;
	@JsonProperty("position_RightToe_x")
	private Double positionRightToeX;
	@JsonProperty("position_RightToe_y")
	private Double positionRightToeY;
	@JsonProperty("position_RightToe_z")
	private Double positionRightToeZ;
	@JsonProperty("velocity_RightToe_x")
	private Double velocityRightToeX;
	@JsonProperty("velocity_RightToe_y")
	private Double velocityRightToeY;
	@JsonProperty("velocity_RightToe_z")
	private Double velocityRightToeZ;
	@JsonProperty("acceleration_RightToe_x")
	private Double accelerationRightToeX;
	@JsonProperty("acceleration_RightToe_y")
	private Double accelerationRightToeY;
	@JsonProperty("acceleration_RightToe_z")
	private Double accelerationRightToeZ;
	@JsonProperty("angularVelocity_RightToe_x")
	private Double angularVelocityRightToeX;
	@JsonProperty("angularVelocity_RightToe_y")
	private Double angularVelocityRightToeY;
	@JsonProperty("angularVelocity_RightToe_z")
	private Double angularVelocityRightToeZ;
	@JsonProperty("angularAcceleration_RightToe_x")
	private Double angularAccelerationRightToeX;
	@JsonProperty("angularAcceleration_RightToe_y")
	private Double angularAccelerationRightToeY;
	@JsonProperty("angularAcceleration_RightToe_z")
	private Double angularAccelerationRightToeZ;
	@JsonProperty("contact_RightToe")
	private Integer contactRightToe;
	@JsonProperty("orientation_LeftUpperLeg_q0")
	private Double orientationLeftUpperLegQ0;
	@JsonProperty("orientation_LeftUpperLeg_q1")
	private Double orientationLeftUpperLegQ1;
	@JsonProperty("orientation_LeftUpperLeg_q2")
	private Double orientationLeftUpperLegQ2;
	@JsonProperty("orientation_LeftUpperLeg_q3")
	private Double orientationLeftUpperLegQ3;
	@JsonProperty("position_LeftUpperLeg_x")
	private Double positionLeftUpperLegX;
	@JsonProperty("position_LeftUpperLeg_y")
	private Double positionLeftUpperLegY;
	@JsonProperty("position_LeftUpperLeg_z")
	private Double positionLeftUpperLegZ;
	@JsonProperty("velocity_LeftUpperLeg_x")
	private Double velocityLeftUpperLegX;
	@JsonProperty("velocity_LeftUpperLeg_y")
	private Double velocityLeftUpperLegY;
	@JsonProperty("velocity_LeftUpperLeg_z")
	private Double velocityLeftUpperLegZ;
	@JsonProperty("acceleration_LeftUpperLeg_x")
	private Double accelerationLeftUpperLegX;
	@JsonProperty("acceleration_LeftUpperLeg_y")
	private Double accelerationLeftUpperLegY;
	@JsonProperty("acceleration_LeftUpperLeg_z")
	private Double accelerationLeftUpperLegZ;
	@JsonProperty("angularVelocity_LeftUpperLeg_x")
	private Double angularVelocityLeftUpperLegX;
	@JsonProperty("angularVelocity_LeftUpperLeg_y")
	private Double angularVelocityLeftUpperLegY;
	@JsonProperty("angularVelocity_LeftUpperLeg_z")
	private Double angularVelocityLeftUpperLegZ;
	@JsonProperty("angularAcceleration_LeftUpperLeg_x")
	private Double angularAccelerationLeftUpperLegX;
	@JsonProperty("angularAcceleration_LeftUpperLeg_y")
	private Double angularAccelerationLeftUpperLegY;
	@JsonProperty("angularAcceleration_LeftUpperLeg_z")
	private Double angularAccelerationLeftUpperLegZ;
	@JsonProperty("contact_LeftUpperLeg")
	private Integer contactLeftUpperLeg;
	@JsonProperty("orientation_LeftLowerLeg_q0")
	private Double orientationLeftLowerLegQ0;
	@JsonProperty("orientation_LeftLowerLeg_q1")
	private Double orientationLeftLowerLegQ1;
	@JsonProperty("orientation_LeftLowerLeg_q2")
	private Double orientationLeftLowerLegQ2;
	@JsonProperty("orientation_LeftLowerLeg_q3")
	private Double orientationLeftLowerLegQ3;
	@JsonProperty("position_LeftLowerLeg_x")
	private Double positionLeftLowerLegX;
	@JsonProperty("position_LeftLowerLeg_y")
	private Double positionLeftLowerLegY;
	@JsonProperty("position_LeftLowerLeg_z")
	private Double positionLeftLowerLegZ;
	@JsonProperty("velocity_LeftLowerLeg_x")
	private Double velocityLeftLowerLegX;
	@JsonProperty("velocity_LeftLowerLeg_y")
	private Double velocityLeftLowerLegY;
	@JsonProperty("velocity_LeftLowerLeg_z")
	private Double velocityLeftLowerLegZ;
	@JsonProperty("acceleration_LeftLowerLeg_x")
	private Double accelerationLeftLowerLegX;
	@JsonProperty("acceleration_LeftLowerLeg_y")
	private Double accelerationLeftLowerLegY;
	@JsonProperty("acceleration_LeftLowerLeg_z")
	private Double accelerationLeftLowerLegZ;
	@JsonProperty("angularVelocity_LeftLowerLeg_x")
	private Double angularVelocityLeftLowerLegX;
	@JsonProperty("angularVelocity_LeftLowerLeg_y")
	private Double angularVelocityLeftLowerLegY;
	@JsonProperty("angularVelocity_LeftLowerLeg_z")
	private Double angularVelocityLeftLowerLegZ;
	@JsonProperty("angularAcceleration_LeftLowerLeg_x")
	private Double angularAccelerationLeftLowerLegX;
	@JsonProperty("angularAcceleration_LeftLowerLeg_y")
	private Double angularAccelerationLeftLowerLegY;
	@JsonProperty("angularAcceleration_LeftLowerLeg_z")
	private Double angularAccelerationLeftLowerLegZ;
	@JsonProperty("contact_LeftLowerLeg")
	private Integer contactLeftLowerLeg;
	@JsonProperty("orientation_LeftFoot_q0")
	private Double orientationLeftFootQ0;
	@JsonProperty("orientation_LeftFoot_q1")
	private Double orientationLeftFootQ1;
	@JsonProperty("orientation_LeftFoot_q2")
	private Double orientationLeftFootQ2;
	@JsonProperty("orientation_LeftFoot_q3")
	private Double orientationLeftFootQ3;
	@JsonProperty("position_LeftFoot_x")
	private Double positionLeftFootX;
	@JsonProperty("position_LeftFoot_y")
	private Double positionLeftFootY;
	@JsonProperty("position_LeftFoot_z")
	private Double positionLeftFootZ;
	@JsonProperty("velocity_LeftFoot_x")
	private Double velocityLeftFootX;
	@JsonProperty("velocity_LeftFoot_y")
	private Double velocityLeftFootY;
	@JsonProperty("velocity_LeftFoot_z")
	private Double velocityLeftFootZ;
	@JsonProperty("acceleration_LeftFoot_x")
	private Double accelerationLeftFootX;
	@JsonProperty("acceleration_LeftFoot_y")
	private Double accelerationLeftFootY;
	@JsonProperty("acceleration_LeftFoot_z")
	private Double accelerationLeftFootZ;
	@JsonProperty("angularVelocity_LeftFoot_x")
	private Double angularVelocityLeftFootX;
	@JsonProperty("angularVelocity_LeftFoot_y")
	private Double angularVelocityLeftFootY;
	@JsonProperty("angularVelocity_LeftFoot_z")
	private Double angularVelocityLeftFootZ;
	@JsonProperty("angularAcceleration_LeftFoot_x")
	private Double angularAccelerationLeftFootX;
	@JsonProperty("angularAcceleration_LeftFoot_y")
	private Double angularAccelerationLeftFootY;
	@JsonProperty("angularAcceleration_LeftFoot_z")
	private Double angularAccelerationLeftFootZ;
	@JsonProperty("contact_LeftFoot")
	private Integer contactLeftFoot;
	@JsonProperty("orientation_LeftToe_q0")
	private Double orientationLeftToeQ0;
	@JsonProperty("orientation_LeftToe_q1")
	private Double orientationLeftToeQ1;
	@JsonProperty("orientation_LeftToe_q2")
	private Double orientationLeftToeQ2;
	@JsonProperty("orientation_LeftToe_q3")
	private Double orientationLeftToeQ3;
	@JsonProperty("position_LeftToe_x")
	private Double positionLeftToeX;
	@JsonProperty("position_LeftToe_y")
	private Double positionLeftToeY;
	@JsonProperty("position_LeftToe_z")
	private Double positionLeftToeZ;
	@JsonProperty("velocity_LeftToe_x")
	private Double velocityLeftToeX;
	@JsonProperty("velocity_LeftToe_y")
	private Double velocityLeftToeY;
	@JsonProperty("velocity_LeftToe_z")
	private Double velocityLeftToeZ;
	@JsonProperty("acceleration_LeftToe_x")
	private Double accelerationLeftToeX;
	@JsonProperty("acceleration_LeftToe_y")
	private Double accelerationLeftToeY;
	@JsonProperty("acceleration_LeftToe_z")
	private Double accelerationLeftToeZ;
	@JsonProperty("angularVelocity_LeftToe_x")
	private Double angularVelocityLeftToeX;
	@JsonProperty("angularVelocity_LeftToe_y")
	private Double angularVelocityLeftToeY;
	@JsonProperty("angularVelocity_LeftToe_z")
	private Double angularVelocityLeftToeZ;
	@JsonProperty("angularAcceleration_LeftToe_x")
	private Double angularAccelerationLeftToeX;
	@JsonProperty("angularAcceleration_LeftToe_y")
	private Double angularAccelerationLeftToeY;
	@JsonProperty("angularAcceleration_LeftToe_z")
	private Double angularAccelerationLeftToeZ;
	@JsonProperty("contact_LeftToe")
	private Integer contactLeftToe;
	@JsonProperty("sensorOrientation_Pelvis_q0")
	private Double sensorOrientationPelvisQ0;
	@JsonProperty("sensorOrientation_Pelvis_q1")
	private Double sensorOrientationPelvisQ1;
	@JsonProperty("sensorOrientation_Pelvis_q2")
	private Double sensorOrientationPelvisQ2;
	@JsonProperty("sensorOrientation_Pelvis_q3")
	private Double sensorOrientationPelvisQ3;
	@JsonProperty("sensorFreeAcceleration_Pelvis_x")
	private Double sensorFreeAccelerationPelvisX;
	@JsonProperty("sensorFreeAcceleration_Pelvis_y")
	private Double sensorFreeAccelerationPelvisY;
	@JsonProperty("sensorFreeAcceleration_Pelvis_z")
	private Double sensorFreeAccelerationPelvisZ;
	@JsonProperty("sensorMagneticField_Pelvis_x")
	private Double sensorMagneticFieldPelvisX;
	@JsonProperty("sensorMagneticField_Pelvis_y")
	private Double sensorMagneticFieldPelvisY;
	@JsonProperty("sensorMagneticField_Pelvis_z")
	private Double sensorMagneticFieldPelvisZ;
	@JsonProperty("sensorOrientation_T8_q0")
	private Double sensorOrientationT8Q0;
	@JsonProperty("sensorOrientation_T8_q1")
	private Double sensorOrientationT8Q1;
	@JsonProperty("sensorOrientation_T8_q2")
	private Double sensorOrientationT8Q2;
	@JsonProperty("sensorOrientation_T8_q3")
	private Double sensorOrientationT8Q3;
	@JsonProperty("sensorFreeAcceleration_T8_x")
	private Double sensorFreeAccelerationT8X;
	@JsonProperty("sensorFreeAcceleration_T8_y")
	private Double sensorFreeAccelerationT8Y;
	@JsonProperty("sensorFreeAcceleration_T8_z")
	private Double sensorFreeAccelerationT8Z;
	@JsonProperty("sensorMagneticField_T8_x")
	private Double sensorMagneticFieldT8X;
	@JsonProperty("sensorMagneticField_T8_y")
	private Double sensorMagneticFieldT8Y;
	@JsonProperty("sensorMagneticField_T8_z")
	private Double sensorMagneticFieldT8Z;
	@JsonProperty("sensorOrientation_Head_q0")
	private Double sensorOrientationHeadQ0;
	@JsonProperty("sensorOrientation_Head_q1")
	private Double sensorOrientationHeadQ1;
	@JsonProperty("sensorOrientation_Head_q2")
	private Double sensorOrientationHeadQ2;
	@JsonProperty("sensorOrientation_Head_q3")
	private Double sensorOrientationHeadQ3;
	@JsonProperty("sensorFreeAcceleration_Head_x")
	private Double sensorFreeAccelerationHeadX;
	@JsonProperty("sensorFreeAcceleration_Head_y")
	private Double sensorFreeAccelerationHeadY;
	@JsonProperty("sensorFreeAcceleration_Head_z")
	private Double sensorFreeAccelerationHeadZ;
	@JsonProperty("sensorMagneticField_Head_x")
	private Double sensorMagneticFieldHeadX;
	@JsonProperty("sensorMagneticField_Head_y")
	private Double sensorMagneticFieldHeadY;
	@JsonProperty("sensorMagneticField_Head_z")
	private Double sensorMagneticFieldHeadZ;
	@JsonProperty("sensorOrientation_RightShoulder_q0")
	private Double sensorOrientationRightShoulderQ0;
	@JsonProperty("sensorOrientation_RightShoulder_q1")
	private Double sensorOrientationRightShoulderQ1;
	@JsonProperty("sensorOrientation_RightShoulder_q2")
	private Double sensorOrientationRightShoulderQ2;
	@JsonProperty("sensorOrientation_RightShoulder_q3")
	private Double sensorOrientationRightShoulderQ3;
	@JsonProperty("sensorFreeAcceleration_RightShoulder_x")
	private Double sensorFreeAccelerationRightShoulderX;
	@JsonProperty("sensorFreeAcceleration_RightShoulder_y")
	private Double sensorFreeAccelerationRightShoulderY;
	@JsonProperty("sensorFreeAcceleration_RightShoulder_z")
	private Double sensorFreeAccelerationRightShoulderZ;
	@JsonProperty("sensorMagneticField_RightShoulder_x")
	private Double sensorMagneticFieldRightShoulderX;
	@JsonProperty("sensorMagneticField_RightShoulder_y")
	private Double sensorMagneticFieldRightShoulderY;
	@JsonProperty("sensorMagneticField_RightShoulder_z")
	private Double sensorMagneticFieldRightShoulderZ;
	@JsonProperty("sensorOrientation_RightUpperArm_q0")
	private Double sensorOrientationRightUpperArmQ0;
	@JsonProperty("sensorOrientation_RightUpperArm_q1")
	private Double sensorOrientationRightUpperArmQ1;
	@JsonProperty("sensorOrientation_RightUpperArm_q2")
	private Double sensorOrientationRightUpperArmQ2;
	@JsonProperty("sensorOrientation_RightUpperArm_q3")
	private Double sensorOrientationRightUpperArmQ3;
	@JsonProperty("sensorFreeAcceleration_RightUpperArm_x")
	private Double sensorFreeAccelerationRightUpperArmX;
	@JsonProperty("sensorFreeAcceleration_RightUpperArm_y")
	private Double sensorFreeAccelerationRightUpperArmY;
	@JsonProperty("sensorFreeAcceleration_RightUpperArm_z")
	private Double sensorFreeAccelerationRightUpperArmZ;
	@JsonProperty("sensorMagneticField_RightUpperArm_x")
	private Double sensorMagneticFieldRightUpperArmX;
	@JsonProperty("sensorMagneticField_RightUpperArm_y")
	private Double sensorMagneticFieldRightUpperArmY;
	@JsonProperty("sensorMagneticField_RightUpperArm_z")
	private Double sensorMagneticFieldRightUpperArmZ;
	@JsonProperty("sensorOrientation_RightForeArm_q0")
	private Double sensorOrientationRightForeArmQ0;
	@JsonProperty("sensorOrientation_RightForeArm_q1")
	private Double sensorOrientationRightForeArmQ1;
	@JsonProperty("sensorOrientation_RightForeArm_q2")
	private Double sensorOrientationRightForeArmQ2;
	@JsonProperty("sensorOrientation_RightForeArm_q3")
	private Double sensorOrientationRightForeArmQ3;
	@JsonProperty("sensorFreeAcceleration_RightForeArm_x")
	private Double sensorFreeAccelerationRightForeArmX;
	@JsonProperty("sensorFreeAcceleration_RightForeArm_y")
	private Double sensorFreeAccelerationRightForeArmY;
	@JsonProperty("sensorFreeAcceleration_RightForeArm_z")
	private Double sensorFreeAccelerationRightForeArmZ;
	@JsonProperty("sensorMagneticField_RightForeArm_x")
	private Double sensorMagneticFieldRightForeArmX;
	@JsonProperty("sensorMagneticField_RightForeArm_y")
	private Double sensorMagneticFieldRightForeArmY;
	@JsonProperty("sensorMagneticField_RightForeArm_z")
	private Double sensorMagneticFieldRightForeArmZ;
	@JsonProperty("sensorOrientation_RightHand_q0")
	private Double sensorOrientationRightHandQ0;
	@JsonProperty("sensorOrientation_RightHand_q1")
	private Double sensorOrientationRightHandQ1;
	@JsonProperty("sensorOrientation_RightHand_q2")
	private Double sensorOrientationRightHandQ2;
	@JsonProperty("sensorOrientation_RightHand_q3")
	private Double sensorOrientationRightHandQ3;
	@JsonProperty("sensorFreeAcceleration_RightHand_x")
	private Double sensorFreeAccelerationRightHandX;
	@JsonProperty("sensorFreeAcceleration_RightHand_y")
	private Double sensorFreeAccelerationRightHandY;
	@JsonProperty("sensorFreeAcceleration_RightHand_z")
	private Double sensorFreeAccelerationRightHandZ;
	@JsonProperty("sensorMagneticField_RightHand_x")
	private Double sensorMagneticFieldRightHandX;
	@JsonProperty("sensorMagneticField_RightHand_y")
	private Double sensorMagneticFieldRightHandY;
	@JsonProperty("sensorMagneticField_RightHand_z")
	private Double sensorMagneticFieldRightHandZ;
	@JsonProperty("sensorOrientation_LeftShoulder_q0")
	private Double sensorOrientationLeftShoulderQ0;
	@JsonProperty("sensorOrientation_LeftShoulder_q1")
	private Double sensorOrientationLeftShoulderQ1;
	@JsonProperty("sensorOrientation_LeftShoulder_q2")
	private Double sensorOrientationLeftShoulderQ2;
	@JsonProperty("sensorOrientation_LeftShoulder_q3")
	private Double sensorOrientationLeftShoulderQ3;
	@JsonProperty("sensorFreeAcceleration_LeftShoulder_x")
	private Double sensorFreeAccelerationLeftShoulderX;
	@JsonProperty("sensorFreeAcceleration_LeftShoulder_y")
	private Double sensorFreeAccelerationLeftShoulderY;
	@JsonProperty("sensorFreeAcceleration_LeftShoulder_z")
	private Double sensorFreeAccelerationLeftShoulderZ;
	@JsonProperty("sensorMagneticField_LeftShoulder_x")
	private Double sensorMagneticFieldLeftShoulderX;
	@JsonProperty("sensorMagneticField_LeftShoulder_y")
	private Double sensorMagneticFieldLeftShoulderY;
	@JsonProperty("sensorMagneticField_LeftShoulder_z")
	private Double sensorMagneticFieldLeftShoulderZ;
	@JsonProperty("sensorOrientation_LeftUpperArm_q0")
	private Double sensorOrientationLeftUpperArmQ0;
	@JsonProperty("sensorOrientation_LeftUpperArm_q1")
	private Double sensorOrientationLeftUpperArmQ1;
	@JsonProperty("sensorOrientation_LeftUpperArm_q2")
	private Double sensorOrientationLeftUpperArmQ2;
	@JsonProperty("sensorOrientation_LeftUpperArm_q3")
	private Double sensorOrientationLeftUpperArmQ3;
	@JsonProperty("sensorFreeAcceleration_LeftUpperArm_x")
	private Double sensorFreeAccelerationLeftUpperArmX;
	@JsonProperty("sensorFreeAcceleration_LeftUpperArm_y")
	private Double sensorFreeAccelerationLeftUpperArmY;
	@JsonProperty("sensorFreeAcceleration_LeftUpperArm_z")
	private Double sensorFreeAccelerationLeftUpperArmZ;
	@JsonProperty("sensorMagneticField_LeftUpperArm_x")
	private Double sensorMagneticFieldLeftUpperArmX;
	@JsonProperty("sensorMagneticField_LeftUpperArm_y")
	private Double sensorMagneticFieldLeftUpperArmY;
	@JsonProperty("sensorMagneticField_LeftUpperArm_z")
	private Double sensorMagneticFieldLeftUpperArmZ;
	@JsonProperty("sensorOrientation_LeftForeArm_q0")
	private Double sensorOrientationLeftForeArmQ0;
	@JsonProperty("sensorOrientation_LeftForeArm_q1")
	private Double sensorOrientationLeftForeArmQ1;
	@JsonProperty("sensorOrientation_LeftForeArm_q2")
	private Double sensorOrientationLeftForeArmQ2;
	@JsonProperty("sensorOrientation_LeftForeArm_q3")
	private Double sensorOrientationLeftForeArmQ3;
	@JsonProperty("sensorFreeAcceleration_LeftForeArm_x")
	private Double sensorFreeAccelerationLeftForeArmX;
	@JsonProperty("sensorFreeAcceleration_LeftForeArm_y")
	private Double sensorFreeAccelerationLeftForeArmY;
	@JsonProperty("sensorFreeAcceleration_LeftForeArm_z")
	private Double sensorFreeAccelerationLeftForeArmZ;
	@JsonProperty("sensorMagneticField_LeftForeArm_x")
	private Double sensorMagneticFieldLeftForeArmX;
	@JsonProperty("sensorMagneticField_LeftForeArm_y")
	private Double sensorMagneticFieldLeftForeArmY;
	@JsonProperty("sensorMagneticField_LeftForeArm_z")
	private Double sensorMagneticFieldLeftForeArmZ;
	@JsonProperty("sensorOrientation_LeftHand_q0")
	private Double sensorOrientationLeftHandQ0;
	@JsonProperty("sensorOrientation_LeftHand_q1")
	private Double sensorOrientationLeftHandQ1;
	@JsonProperty("sensorOrientation_LeftHand_q2")
	private Double sensorOrientationLeftHandQ2;
	@JsonProperty("sensorOrientation_LeftHand_q3")
	private Double sensorOrientationLeftHandQ3;
	@JsonProperty("sensorFreeAcceleration_LeftHand_x")
	private Double sensorFreeAccelerationLeftHandX;
	@JsonProperty("sensorFreeAcceleration_LeftHand_y")
	private Double sensorFreeAccelerationLeftHandY;
	@JsonProperty("sensorFreeAcceleration_LeftHand_z")
	private Double sensorFreeAccelerationLeftHandZ;
	@JsonProperty("sensorMagneticField_LeftHand_x")
	private Double sensorMagneticFieldLeftHandX;
	@JsonProperty("sensorMagneticField_LeftHand_y")
	private Double sensorMagneticFieldLeftHandY;
	@JsonProperty("sensorMagneticField_LeftHand_z")
	private Double sensorMagneticFieldLeftHandZ;
	@JsonProperty("sensorOrientation_RightUpperLeg_q0")
	private Double sensorOrientationRightUpperLegQ0;
	@JsonProperty("sensorOrientation_RightUpperLeg_q1")
	private Double sensorOrientationRightUpperLegQ1;
	@JsonProperty("sensorOrientation_RightUpperLeg_q2")
	private Double sensorOrientationRightUpperLegQ2;
	@JsonProperty("sensorOrientation_RightUpperLeg_q3")
	private Double sensorOrientationRightUpperLegQ3;
	@JsonProperty("sensorFreeAcceleration_RightUpperLeg_x")
	private Double sensorFreeAccelerationRightUpperLegX;
	@JsonProperty("sensorFreeAcceleration_RightUpperLeg_y")
	private Double sensorFreeAccelerationRightUpperLegY;
	@JsonProperty("sensorFreeAcceleration_RightUpperLeg_z")
	private Double sensorFreeAccelerationRightUpperLegZ;
	@JsonProperty("sensorMagneticField_RightUpperLeg_x")
	private Double sensorMagneticFieldRightUpperLegX;
	@JsonProperty("sensorMagneticField_RightUpperLeg_y")
	private Double sensorMagneticFieldRightUpperLegY;
	@JsonProperty("sensorMagneticField_RightUpperLeg_z")
	private Double sensorMagneticFieldRightUpperLegZ;
	@JsonProperty("sensorOrientation_RightLowerLeg_q0")
	private Double sensorOrientationRightLowerLegQ0;
	@JsonProperty("sensorOrientation_RightLowerLeg_q1")
	private Double sensorOrientationRightLowerLegQ1;
	@JsonProperty("sensorOrientation_RightLowerLeg_q2")
	private Double sensorOrientationRightLowerLegQ2;
	@JsonProperty("sensorOrientation_RightLowerLeg_q3")
	private Double sensorOrientationRightLowerLegQ3;
	@JsonProperty("sensorFreeAcceleration_RightLowerLeg_x")
	private Double sensorFreeAccelerationRightLowerLegX;
	@JsonProperty("sensorFreeAcceleration_RightLowerLeg_y")
	private Double sensorFreeAccelerationRightLowerLegY;
	@JsonProperty("sensorFreeAcceleration_RightLowerLeg_z")
	private Double sensorFreeAccelerationRightLowerLegZ;
	@JsonProperty("sensorMagneticField_RightLowerLeg_x")
	private Double sensorMagneticFieldRightLowerLegX;
	@JsonProperty("sensorMagneticField_RightLowerLeg_y")
	private Double sensorMagneticFieldRightLowerLegY;
	@JsonProperty("sensorMagneticField_RightLowerLeg_z")
	private Double sensorMagneticFieldRightLowerLegZ;
	@JsonProperty("sensorOrientation_RightFoot_q0")
	private Double sensorOrientationRightFootQ0;
	@JsonProperty("sensorOrientation_RightFoot_q1")
	private Double sensorOrientationRightFootQ1;
	@JsonProperty("sensorOrientation_RightFoot_q2")
	private Double sensorOrientationRightFootQ2;
	@JsonProperty("sensorOrientation_RightFoot_q3")
	private Double sensorOrientationRightFootQ3;
	@JsonProperty("sensorFreeAcceleration_RightFoot_x")
	private Double sensorFreeAccelerationRightFootX;
	@JsonProperty("sensorFreeAcceleration_RightFoot_y")
	private Double sensorFreeAccelerationRightFootY;
	@JsonProperty("sensorFreeAcceleration_RightFoot_z")
	private Double sensorFreeAccelerationRightFootZ;
	@JsonProperty("sensorMagneticField_RightFoot_x")
	private Double sensorMagneticFieldRightFootX;
	@JsonProperty("sensorMagneticField_RightFoot_y")
	private Double sensorMagneticFieldRightFootY;
	@JsonProperty("sensorMagneticField_RightFoot_z")
	private Double sensorMagneticFieldRightFootZ;
	@JsonProperty("sensorOrientation_LeftUpperLeg_q0")
	private Double sensorOrientationLeftUpperLegQ0;
	@JsonProperty("sensorOrientation_LeftUpperLeg_q1")
	private Double sensorOrientationLeftUpperLegQ1;
	@JsonProperty("sensorOrientation_LeftUpperLeg_q2")
	private Double sensorOrientationLeftUpperLegQ2;
	@JsonProperty("sensorOrientation_LeftUpperLeg_q3")
	private Double sensorOrientationLeftUpperLegQ3;
	@JsonProperty("sensorFreeAcceleration_LeftUpperLeg_x")
	private Double sensorFreeAccelerationLeftUpperLegX;
	@JsonProperty("sensorFreeAcceleration_LeftUpperLeg_y")
	private Double sensorFreeAccelerationLeftUpperLegY;
	@JsonProperty("sensorFreeAcceleration_LeftUpperLeg_z")
	private Double sensorFreeAccelerationLeftUpperLegZ;
	@JsonProperty("sensorMagneticField_LeftUpperLeg_x")
	private Double sensorMagneticFieldLeftUpperLegX;
	@JsonProperty("sensorMagneticField_LeftUpperLeg_y")
	private Double sensorMagneticFieldLeftUpperLegY;
	@JsonProperty("sensorMagneticField_LeftUpperLeg_z")
	private Double sensorMagneticFieldLeftUpperLegZ;
	@JsonProperty("sensorOrientation_LeftLowerLeg_q0")
	private Double sensorOrientationLeftLowerLegQ0;
	@JsonProperty("sensorOrientation_LeftLowerLeg_q1")
	private Double sensorOrientationLeftLowerLegQ1;
	@JsonProperty("sensorOrientation_LeftLowerLeg_q2")
	private Double sensorOrientationLeftLowerLegQ2;
	@JsonProperty("sensorOrientation_LeftLowerLeg_q3")
	private Double sensorOrientationLeftLowerLegQ3;
	@JsonProperty("sensorFreeAcceleration_LeftLowerLeg_x")
	private Double sensorFreeAccelerationLeftLowerLegX;
	@JsonProperty("sensorFreeAcceleration_LeftLowerLeg_y")
	private Double sensorFreeAccelerationLeftLowerLegY;
	@JsonProperty("sensorFreeAcceleration_LeftLowerLeg_z")
	private Double sensorFreeAccelerationLeftLowerLegZ;
	@JsonProperty("sensorMagneticField_LeftLowerLeg_x")
	private Double sensorMagneticFieldLeftLowerLegX;
	@JsonProperty("sensorMagneticField_LeftLowerLeg_y")
	private Double sensorMagneticFieldLeftLowerLegY;
	@JsonProperty("sensorMagneticField_LeftLowerLeg_z")
	private Double sensorMagneticFieldLeftLowerLegZ;
	@JsonProperty("sensorOrientation_LeftFoot_q0")
	private Double sensorOrientationLeftFootQ0;
	@JsonProperty("sensorOrientation_LeftFoot_q1")
	private Double sensorOrientationLeftFootQ1;
	@JsonProperty("sensorOrientation_LeftFoot_q2")
	private Double sensorOrientationLeftFootQ2;
	@JsonProperty("sensorOrientation_LeftFoot_q3")
	private Double sensorOrientationLeftFootQ3;
	@JsonProperty("sensorFreeAcceleration_LeftFoot_x")
	private Double sensorFreeAccelerationLeftFootX;
	@JsonProperty("sensorFreeAcceleration_LeftFoot_y")
	private Double sensorFreeAccelerationLeftFootY;
	@JsonProperty("sensorFreeAcceleration_LeftFoot_z")
	private Double sensorFreeAccelerationLeftFootZ;
	@JsonProperty("sensorMagneticField_LeftFoot_x")
	private Double sensorMagneticFieldLeftFootX;
	@JsonProperty("sensorMagneticField_LeftFoot_y")
	private Double sensorMagneticFieldLeftFootY;
	@JsonProperty("sensorMagneticField_LeftFoot_z")
	private Double sensorMagneticFieldLeftFootZ;
	@JsonProperty("jointAngle_jL5S1_x")
	private Double jointAngleJL5S1X;
	@JsonProperty("jointAngle_jL5S1_y")
	private Double jointAngleJL5S1Y;
	@JsonProperty("jointAngle_jL5S1_z")
	private Double jointAngleJL5S1Z;
	@JsonProperty("jointAngleXZY_jL5S1_x")
	private Double jointAngleXZYJL5S1X;
	@JsonProperty("jointAngleXZY_jL5S1_y")
	private Double jointAngleXZYJL5S1Y;
	@JsonProperty("jointAngleXZY_jL5S1_z")
	private Double jointAngleXZYJL5S1Z;
	@JsonProperty("jointAngle_jL4L3_x")
	private Double jointAngleJL4L3X;
	@JsonProperty("jointAngle_jL4L3_y")
	private Double jointAngleJL4L3Y;
	@JsonProperty("jointAngle_jL4L3_z")
	private Double jointAngleJL4L3Z;
	@JsonProperty("jointAngleXZY_jL4L3_x")
	private Double jointAngleXZYJL4L3X;
	@JsonProperty("jointAngleXZY_jL4L3_y")
	private Double jointAngleXZYJL4L3Y;
	@JsonProperty("jointAngleXZY_jL4L3_z")
	private Double jointAngleXZYJL4L3Z;
	@JsonProperty("jointAngle_jL1T12_x")
	private Double jointAngleJL1T12X;
	@JsonProperty("jointAngle_jL1T12_y")
	private Double jointAngleJL1T12Y;
	@JsonProperty("jointAngle_jL1T12_z")
	private Double jointAngleJL1T12Z;
	@JsonProperty("jointAngleXZY_jL1T12_x")
	private Double jointAngleXZYJL1T12X;
	@JsonProperty("jointAngleXZY_jL1T12_y")
	private Double jointAngleXZYJL1T12Y;
	@JsonProperty("jointAngleXZY_jL1T12_z")
	private Double jointAngleXZYJL1T12Z;
	@JsonProperty("jointAngle_jT9T8_x")
	private Double jointAngleJT9T8X;
	@JsonProperty("jointAngle_jT9T8_y")
	private Double jointAngleJT9T8Y;
	@JsonProperty("jointAngle_jT9T8_z")
	private Double jointAngleJT9T8Z;
	@JsonProperty("jointAngleXZY_jT9T8_x")
	private Double jointAngleXZYJT9T8X;
	@JsonProperty("jointAngleXZY_jT9T8_y")
	private Double jointAngleXZYJT9T8Y;
	@JsonProperty("jointAngleXZY_jT9T8_z")
	private Double jointAngleXZYJT9T8Z;
	@JsonProperty("jointAngle_jT1C7_x")
	private Double jointAngleJT1C7X;
	@JsonProperty("jointAngle_jT1C7_y")
	private Double jointAngleJT1C7Y;
	@JsonProperty("jointAngle_jT1C7_z")
	private Double jointAngleJT1C7Z;
	@JsonProperty("jointAngleXZY_jT1C7_x")
	private Double jointAngleXZYJT1C7X;
	@JsonProperty("jointAngleXZY_jT1C7_y")
	private Double jointAngleXZYJT1C7Y;
	@JsonProperty("jointAngleXZY_jT1C7_z")
	private Double jointAngleXZYJT1C7Z;
	@JsonProperty("jointAngle_jC1Head_x")
	private Double jointAngleJC1HeadX;
	@JsonProperty("jointAngle_jC1Head_y")
	private Double jointAngleJC1HeadY;
	@JsonProperty("jointAngle_jC1Head_z")
	private Double jointAngleJC1HeadZ;
	@JsonProperty("jointAngleXZY_jC1Head_x")
	private Double jointAngleXZYJC1HeadX;
	@JsonProperty("jointAngleXZY_jC1Head_y")
	private Double jointAngleXZYJC1HeadY;
	@JsonProperty("jointAngleXZY_jC1Head_z")
	private Double jointAngleXZYJC1HeadZ;
	@JsonProperty("jointAngle_jRightC7Shoulder_x")
	private Double jointAngleJRightC7ShoulderX;
	@JsonProperty("jointAngle_jRightC7Shoulder_y")
	private Double jointAngleJRightC7ShoulderY;
	@JsonProperty("jointAngle_jRightC7Shoulder_z")
	private Double jointAngleJRightC7ShoulderZ;
	@JsonProperty("jointAngleXZY_jRightC7Shoulder_x")
	private Double jointAngleXZYJRightC7ShoulderX;
	@JsonProperty("jointAngleXZY_jRightC7Shoulder_y")
	private Double jointAngleXZYJRightC7ShoulderY;
	@JsonProperty("jointAngleXZY_jRightC7Shoulder_z")
	private Double jointAngleXZYJRightC7ShoulderZ;
	@JsonProperty("jointAngle_jRightShoulder_x")
	private Double jointAngleJRightShoulderX;
	@JsonProperty("jointAngle_jRightShoulder_y")
	private Double jointAngleJRightShoulderY;
	@JsonProperty("jointAngle_jRightShoulder_z")
	private Double jointAngleJRightShoulderZ;
	@JsonProperty("jointAngleXZY_jRightShoulder_x")
	private Double jointAngleXZYJRightShoulderX;
	@JsonProperty("jointAngleXZY_jRightShoulder_y")
	private Double jointAngleXZYJRightShoulderY;
	@JsonProperty("jointAngleXZY_jRightShoulder_z")
	private Double jointAngleXZYJRightShoulderZ;
	@JsonProperty("jointAngle_jRightElbow_x")
	private Double jointAngleJRightElbowX;
	@JsonProperty("jointAngle_jRightElbow_y")
	private Double jointAngleJRightElbowY;
	@JsonProperty("jointAngle_jRightElbow_z")
	private Double jointAngleJRightElbowZ;
	@JsonProperty("jointAngleXZY_jRightElbow_x")
	private Double jointAngleXZYJRightElbowX;
	@JsonProperty("jointAngleXZY_jRightElbow_y")
	private Double jointAngleXZYJRightElbowY;
	@JsonProperty("jointAngleXZY_jRightElbow_z")
	private Double jointAngleXZYJRightElbowZ;
	@JsonProperty("jointAngle_jRightWrist_x")
	private Double jointAngleJRightWristX;
	@JsonProperty("jointAngle_jRightWrist_y")
	private Double jointAngleJRightWristY;
	@JsonProperty("jointAngle_jRightWrist_z")
	private Double jointAngleJRightWristZ;
	@JsonProperty("jointAngleXZY_jRightWrist_x")
	private Double jointAngleXZYJRightWristX;
	@JsonProperty("jointAngleXZY_jRightWrist_y")
	private Double jointAngleXZYJRightWristY;
	@JsonProperty("jointAngleXZY_jRightWrist_z")
	private Double jointAngleXZYJRightWristZ;
	@JsonProperty("jointAngle_jLeftC7Shoulder_x")
	private Double jointAngleJLeftC7ShoulderX;
	@JsonProperty("jointAngle_jLeftC7Shoulder_y")
	private Double jointAngleJLeftC7ShoulderY;
	@JsonProperty("jointAngle_jLeftC7Shoulder_z")
	private Double jointAngleJLeftC7ShoulderZ;
	@JsonProperty("jointAngleXZY_jLeftC7Shoulder_x")
	private Double jointAngleXZYJLeftC7ShoulderX;
	@JsonProperty("jointAngleXZY_jLeftC7Shoulder_y")
	private Double jointAngleXZYJLeftC7ShoulderY;
	@JsonProperty("jointAngleXZY_jLeftC7Shoulder_z")
	private Double jointAngleXZYJLeftC7ShoulderZ;
	@JsonProperty("jointAngle_jLeftShoulder_x")
	private Double jointAngleJLeftShoulderX;
	@JsonProperty("jointAngle_jLeftShoulder_y")
	private Double jointAngleJLeftShoulderY;
	@JsonProperty("jointAngle_jLeftShoulder_z")
	private Double jointAngleJLeftShoulderZ;
	@JsonProperty("jointAngleXZY_jLeftShoulder_x")
	private Double jointAngleXZYJLeftShoulderX;
	@JsonProperty("jointAngleXZY_jLeftShoulder_y")
	private Double jointAngleXZYJLeftShoulderY;
	@JsonProperty("jointAngleXZY_jLeftShoulder_z")
	private Double jointAngleXZYJLeftShoulderZ;
	@JsonProperty("jointAngle_jLeftElbow_x")
	private Double jointAngleJLeftElbowX;
	@JsonProperty("jointAngle_jLeftElbow_y")
	private Double jointAngleJLeftElbowY;
	@JsonProperty("jointAngle_jLeftElbow_z")
	private Double jointAngleJLeftElbowZ;
	@JsonProperty("jointAngleXZY_jLeftElbow_x")
	private Double jointAngleXZYJLeftElbowX;
	@JsonProperty("jointAngleXZY_jLeftElbow_y")
	private Double jointAngleXZYJLeftElbowY;
	@JsonProperty("jointAngleXZY_jLeftElbow_z")
	private Double jointAngleXZYJLeftElbowZ;
	@JsonProperty("jointAngle_jLeftWrist_x")
	private Double jointAngleJLeftWristX;
	@JsonProperty("jointAngle_jLeftWrist_y")
	private Double jointAngleJLeftWristY;
	@JsonProperty("jointAngle_jLeftWrist_z")
	private Double jointAngleJLeftWristZ;
	@JsonProperty("jointAngleXZY_jLeftWrist_x")
	private Double jointAngleXZYJLeftWristX;
	@JsonProperty("jointAngleXZY_jLeftWrist_y")
	private Double jointAngleXZYJLeftWristY;
	@JsonProperty("jointAngleXZY_jLeftWrist_z")
	private Double jointAngleXZYJLeftWristZ;
	@JsonProperty("jointAngle_jRightHip_x")
	private Double jointAngleJRightHipX;
	@JsonProperty("jointAngle_jRightHip_y")
	private Double jointAngleJRightHipY;
	@JsonProperty("jointAngle_jRightHip_z")
	private Double jointAngleJRightHipZ;
	@JsonProperty("jointAngleXZY_jRightHip_x")
	private Double jointAngleXZYJRightHipX;
	@JsonProperty("jointAngleXZY_jRightHip_y")
	private Double jointAngleXZYJRightHipY;
	@JsonProperty("jointAngleXZY_jRightHip_z")
	private Double jointAngleXZYJRightHipZ;
	@JsonProperty("jointAngle_jRightKnee_x")
	private Double jointAngleJRightKneeX;
	@JsonProperty("jointAngle_jRightKnee_y")
	private Double jointAngleJRightKneeY;
	@JsonProperty("jointAngle_jRightKnee_z")
	private Double jointAngleJRightKneeZ;
	@JsonProperty("jointAngleXZY_jRightKnee_x")
	private Double jointAngleXZYJRightKneeX;
	@JsonProperty("jointAngleXZY_jRightKnee_y")
	private Double jointAngleXZYJRightKneeY;
	@JsonProperty("jointAngleXZY_jRightKnee_z")
	private Double jointAngleXZYJRightKneeZ;
	@JsonProperty("jointAngle_jRightAnkle_x")
	private Double jointAngleJRightAnkleX;
	@JsonProperty("jointAngle_jRightAnkle_y")
	private Double jointAngleJRightAnkleY;
	@JsonProperty("jointAngle_jRightAnkle_z")
	private Double jointAngleJRightAnkleZ;
	@JsonProperty("jointAngleXZY_jRightAnkle_x")
	private Double jointAngleXZYJRightAnkleX;
	@JsonProperty("jointAngleXZY_jRightAnkle_y")
	private Double jointAngleXZYJRightAnkleY;
	@JsonProperty("jointAngleXZY_jRightAnkle_z")
	private Double jointAngleXZYJRightAnkleZ;
	@JsonProperty("jointAngle_jRightBallFoot_x")
	private Double jointAngleJRightBallFootX;
	@JsonProperty("jointAngle_jRightBallFoot_y")
	private Double jointAngleJRightBallFootY;
	@JsonProperty("jointAngle_jRightBallFoot_z")
	private Double jointAngleJRightBallFootZ;
	@JsonProperty("jointAngleXZY_jRightBallFoot_x")
	private Double jointAngleXZYJRightBallFootX;
	@JsonProperty("jointAngleXZY_jRightBallFoot_y")
	private Double jointAngleXZYJRightBallFootY;
	@JsonProperty("jointAngleXZY_jRightBallFoot_z")
	private Double jointAngleXZYJRightBallFootZ;
	@JsonProperty("jointAngle_jLeftHip_x")
	private Double jointAngleJLeftHipX;
	@JsonProperty("jointAngle_jLeftHip_y")
	private Double jointAngleJLeftHipY;
	@JsonProperty("jointAngle_jLeftHip_z")
	private Double jointAngleJLeftHipZ;
	@JsonProperty("jointAngleXZY_jLeftHip_x")
	private Double jointAngleXZYJLeftHipX;
	@JsonProperty("jointAngleXZY_jLeftHip_y")
	private Double jointAngleXZYJLeftHipY;
	@JsonProperty("jointAngleXZY_jLeftHip_z")
	private Double jointAngleXZYJLeftHipZ;
	@JsonProperty("jointAngle_jLeftKnee_x")
	private Double jointAngleJLeftKneeX;
	@JsonProperty("jointAngle_jLeftKnee_y")
	private Double jointAngleJLeftKneeY;
	@JsonProperty("jointAngle_jLeftKnee_z")
	private Double jointAngleJLeftKneeZ;
	@JsonProperty("jointAngleXZY_jLeftKnee_x")
	private Double jointAngleXZYJLeftKneeX;
	@JsonProperty("jointAngleXZY_jLeftKnee_y")
	private Double jointAngleXZYJLeftKneeY;
	@JsonProperty("jointAngleXZY_jLeftKnee_z")
	private Double jointAngleXZYJLeftKneeZ;
	@JsonProperty("jointAngle_jLeftAnkle_x")
	private Double jointAngleJLeftAnkleX;
	@JsonProperty("jointAngle_jLeftAnkle_y")
	private Double jointAngleJLeftAnkleY;
	@JsonProperty("jointAngle_jLeftAnkle_z")
	private Double jointAngleJLeftAnkleZ;
	@JsonProperty("jointAngleXZY_jLeftAnkle_x")
	private Double jointAngleXZYJLeftAnkleX;
	@JsonProperty("jointAngleXZY_jLeftAnkle_y")
	private Double jointAngleXZYJLeftAnkleY;
	@JsonProperty("jointAngleXZY_jLeftAnkle_z")
	private Double jointAngleXZYJLeftAnkleZ;
	@JsonProperty("jointAngle_jLeftBallFoot_x")
	private Double jointAngleJLeftBallFootX;
	@JsonProperty("jointAngle_jLeftBallFoot_y")
	private Double jointAngleJLeftBallFootY;
	@JsonProperty("jointAngle_jLeftBallFoot_z")
	private Double jointAngleJLeftBallFootZ;
	@JsonProperty("jointAngleXZY_jLeftBallFoot_x")
	private Double jointAngleXZYJLeftBallFootX;
	@JsonProperty("jointAngleXZY_jLeftBallFoot_y")
	private Double jointAngleXZYJLeftBallFootY;
	@JsonProperty("jointAngleXZY_jLeftBallFoot_z")
	private Double jointAngleXZYJLeftBallFootZ;
	@JsonProperty("CoM_x")
	private Double coMX;
	@JsonProperty("CoM_y")
	private Double coMY;
	@JsonProperty("CoM_z")
	private Double coMZ;
}
