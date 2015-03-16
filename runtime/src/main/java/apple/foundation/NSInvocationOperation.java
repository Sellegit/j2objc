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



/**
 * @since Available in iOS 2.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSInvocationOperation")
public class NSInvocationOperation 
    extends NSOperation 
     {

    
    
    public NSInvocationOperation() {}
    @Mapping("initWithTarget:selector:object:")
    public NSInvocationOperation(Object target, Selector sel, Object arg) { }
    @Mapping("initWithInvocation:")
    public NSInvocationOperation(NSInvocation inv) { }
    
    
    @Mapping("invocation")
    public native NSInvocation getInvocation();
    @Mapping("result")
    public native Object getResult();
    
    
    
    
    
}
