package apple.homekit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("HomeKit/HomeKit.h")
@Mapping("HMCharacteristicValueHeatingCooling")
public final class HMCharacteristicValueHeatingCooling extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueHeatingCoolingOff")
    public static final long Off = 0L;
    @GlobalConstant("HMCharacteristicValueHeatingCoolingHeat")
    public static final long Heat = 1L;
    @GlobalConstant("HMCharacteristicValueHeatingCoolingCool")
    public static final long Cool = 2L;
    @GlobalConstant("HMCharacteristicValueHeatingCoolingAuto")
    public static final long Auto = 3L;


}
