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

@Library("Photos") @Mapping("PHContentEditingOutput")
public class PHContentEditingOutput 
    extends NSObject 
     {

    
    
    public PHContentEditingOutput() {}
    @Mapping("initWithContentEditingInput:")
    public PHContentEditingOutput(PHContentEditingInput contentEditingInput) { }
    @Mapping("initWithPlaceholderForCreatedAsset:")
    public PHContentEditingOutput(PHObjectPlaceholder placeholderForCreatedAsset) { }
    
    
    @Mapping("adjustmentData")
    public native PHAdjustmentData getAdjustmentData();
    @Mapping("setAdjustmentData:")
    public native void setAdjustmentData(PHAdjustmentData v);
    @Mapping("renderedContentURL")
    public native NSURL getRenderedContentURL();
    
    
    
    
    
}
