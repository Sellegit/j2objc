package apple.metal;


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
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Metal") @Mapping("MTLCompileOptions")
public class MTLCompileOptions 
    extends NSObject 
    implements NSCopying {

    
    
    public MTLCompileOptions() {}
    
    
    @Mapping("preprocessorMacros")
    public native Map<String, String> getPreprocessorMacros();
    public native void setPreprocessorMacros(Map<String, String> v);
    @Mapping("fastMathEnabled")
    public native boolean isFastMathEnabled();
    public native void setFastMathEnabled(boolean v);
    
    
    
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
