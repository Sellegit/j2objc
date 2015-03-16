package apple.photos;


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
import apple.corelocation.*;
import apple.uikit.*;
import apple.avfoundation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Photos/Photos.h") @Mapping("PHAdjustmentData")
public class PHAdjustmentData 
    extends NSObject 
     {

    
    
    public PHAdjustmentData() {}
    @Mapping("initWithFormatIdentifier:formatVersion:data:")
    public PHAdjustmentData(String formatIdentifier, String formatVersion, NSData data) { }
    
    
    @Mapping("formatIdentifier")
    public native String getFormatIdentifier();
    @Mapping("formatVersion")
    public native String getFormatVersion();
    @Mapping("data")
    public native NSData getData();
    
    
    
    
    
}
