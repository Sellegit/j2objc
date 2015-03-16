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

@Library("Photos/Photos.h") @Mapping("PHContentEditingInputRequestOptions")
public class PHContentEditingInputRequestOptions 
    extends NSObject 
     {

    
    
    public PHContentEditingInputRequestOptions() {}
    
    
    @Mapping("canHandleAdjustmentData")
    public native @Block Block1<PHAdjustmentData, Boolean> getCanHandleAdjustmentData();
    @Mapping("setCanHandleAdjustmentData:")
    public native void setCanHandleAdjustmentData(@Block Block1<PHAdjustmentData, Boolean> v);
    @Mapping("isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();
    @Mapping("setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean v);
    @Mapping("progressHandler")
    public native @Block VoidBlock2<Double, Todo> getProgressHandler();
    @Mapping("setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock2<Double, Todo> v);
    
    
    
    
    
}
