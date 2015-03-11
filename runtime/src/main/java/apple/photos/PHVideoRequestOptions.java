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

@Library("Photos") @Mapping("PHVideoRequestOptions")
public class PHVideoRequestOptions 
    extends NSObject 
     {

    
    
    public PHVideoRequestOptions() {}
    
    
    @Mapping("isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();
    @Mapping("setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean v);
    @Mapping("version")
    public native @Representing("PHVideoRequestOptionsVersion") @MachineSizedSInt long getVersion();
    @Mapping("setVersion:")
    public native void setVersion(@Representing("PHVideoRequestOptionsVersion") @MachineSizedSInt long v);
    @Mapping("deliveryMode")
    public native @Representing("PHVideoRequestOptionsDeliveryMode") @MachineSizedSInt long getDeliveryMode();
    @Mapping("setDeliveryMode:")
    public native void setDeliveryMode(@Representing("PHVideoRequestOptionsDeliveryMode") @MachineSizedSInt long v);
    @Mapping("progressHandler")
    public native @Block VoidBlock3<Double, NSError, Todo> getProgressHandler();
    @Mapping("setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock3<Double, NSError, Todo> v);
    
    
    
    
    
}
