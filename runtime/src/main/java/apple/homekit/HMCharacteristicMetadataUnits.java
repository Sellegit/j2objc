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

/*<javadoc>*/
/*</javadoc>*/
@Library("HomeKit/HomeKit.h")
public class HMCharacteristicMetadataUnits 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataUnitsCelsius")
    public static native NSString CelsiusValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataUnitsFahrenheit")
    public static native NSString FahrenheitValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataUnitsPercentage")
    public static native NSString PercentageValue();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("HMCharacteristicMetadataUnitsArcDegree")
    public static native NSString ArcDegreeValue();

}
