package apple.localauthentication;


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

@Library("LocalAuthentication") @Mapping("LAContext")
public class LAContext 
    extends NSObject 
     {

    
    
    public LAContext() {}
    
    
    @Mapping("localizedFallbackTitle")
    public native String getLocalizedFallbackTitle();
    public native void setLocalizedFallbackTitle(String v);
    
    
    
    @Mapping("canEvaluatePolicy:error:")
    protected native boolean canEvaluatePolicy(@Representing("LAPolicy") @MachineSizedSInt long policy, Todo error);
    @Mapping("evaluatePolicy:localizedReason:reply:")
    public native void evaluatePolicy(@Representing("LAPolicy") @MachineSizedSInt long policy, String localizedReason, @Block VoidBlock2<Boolean, NSError> reply);
    
}
