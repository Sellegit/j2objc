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

@Library("HomeKit") @Mapping("HMCharacteristicMetadata")
public class HMCharacteristicMetadata 
    extends NSObject 
     {

    
    
    public HMCharacteristicMetadata() {}
    
    
    @Mapping("minimumValue")
    public native NSNumber getMinimumValue();
    @Mapping("maximumValue")
    public native NSNumber getMaximumValue();
    @Mapping("stepValue")
    public native NSNumber getStepValue();
    @Mapping("maxLength")
    public native NSNumber getMaxLength();
    @Mapping("format")
    public native HMCharacteristicMetadataFormat getFormat();
    @Mapping("units")
    public native HMCharacteristicMetadataUnits getUnits();
    @Mapping("manufacturerDescription")
    public native String getManufacturerDescription();
    
    
    
    
    
}
