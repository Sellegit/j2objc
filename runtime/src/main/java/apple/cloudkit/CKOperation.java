package apple.cloudkit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CloudKit/CloudKit.h") @Mapping("CKOperation")
public class CKOperation 
    extends NSOperation 
     {

    
    
    public CKOperation() {}
    
    
    @Mapping("container")
    public native CKContainer getContainer();
    @Mapping("setContainer:")
    public native void setContainer(CKContainer v);
    @Mapping("usesBackgroundSession")
    public native boolean usesBackgroundSession();
    @Mapping("setUsesBackgroundSession:")
    public native void setUsesBackgroundSession(boolean v);
    @Mapping("allowsCellularAccess")
    public native boolean allowsCellularAccess();
    @Mapping("setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    
    
    
    
    
}
