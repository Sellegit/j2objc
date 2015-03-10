package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;





@Library("Foundation") @Mapping("NSMethodSignature")
public class NSMethodSignature 
    extends NSObject 
     {

    
    
    public NSMethodSignature() {}
    
    
    @Mapping("numberOfArguments")
    public native @MachineSizedUInt long getNumberOfArguments();
    @Mapping("frameLength")
    public native @MachineSizedUInt long getFrameLength();
    @Mapping("methodReturnType")
    public native String getMethodReturnType();
    @Mapping("methodReturnLength")
    public native @MachineSizedUInt long getMethodReturnLength();
    
    
    
    @Mapping("getArgumentTypeAtIndex:")
    public native String getArgumentType(@MachineSizedUInt long idx);
    @Mapping("isOneway")
    public native boolean isOneway();
    @Mapping("signatureWithObjCTypes:")
    public static native NSMethodSignature create(String types);
    
}
