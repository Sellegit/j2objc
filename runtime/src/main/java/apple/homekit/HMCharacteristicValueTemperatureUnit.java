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

@Library("HomeKit")
@Mapping("HMCharacteristicValueTemperatureUnit")
public final class HMCharacteristicValueTemperatureUnit extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueTemperatureUnitCelsius")
    public static final long Celsius = 0L;
    @GlobalConstant("HMCharacteristicValueTemperatureUnitFahrenheit")
    public static final long Fahrenheit = 1L;
    

}
