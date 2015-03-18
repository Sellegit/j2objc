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

@Library("Photos/Photos.h") @Mapping("PHImageRequestOptions")
public class PHImageRequestOptions 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public PHImageRequestOptions() { }
    
    
    @Mapping("version")
    public native @Representing("PHImageRequestOptionsVersion") @MachineSizedSInt long getVersion();
    @Mapping("setVersion:")
    public native void setVersion(@Representing("PHImageRequestOptionsVersion") @MachineSizedSInt long v);
    @Mapping("deliveryMode")
    public native @Representing("PHImageRequestOptionsDeliveryMode") @MachineSizedSInt long getDeliveryMode();
    @Mapping("setDeliveryMode:")
    public native void setDeliveryMode(@Representing("PHImageRequestOptionsDeliveryMode") @MachineSizedSInt long v);
    @Mapping("resizeMode")
    public native @Representing("PHImageRequestOptionsResizeMode") @MachineSizedSInt long getResizeMode();
    @Mapping("setResizeMode:")
    public native void setResizeMode(@Representing("PHImageRequestOptionsResizeMode") @MachineSizedSInt long v);
    @Mapping("normalizedCropRect")
    public native CGRect getNormalizedCropRect();
    @Mapping("setNormalizedCropRect:")
    public native void setNormalizedCropRect(CGRect v);
    @Mapping("isNetworkAccessAllowed")
    public native boolean isNetworkAccessAllowed();
    @Mapping("setNetworkAccessAllowed:")
    public native void setNetworkAccessAllowed(boolean v);
    @Mapping("isSynchronous")
    public native boolean isSynchronous();
    @Mapping("setSynchronous:")
    public native void setSynchronous(boolean v);
    @Mapping("progressHandler")
    public native @Block VoidBlock4<Double, NSError, Todo, NSDictionary<NSString, NSObject>> getProgressHandler();
    @Mapping("setProgressHandler:")
    public native void setProgressHandler(@Block VoidBlock4<Double, NSError, Todo, NSDictionary<NSString, NSObject>> v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
