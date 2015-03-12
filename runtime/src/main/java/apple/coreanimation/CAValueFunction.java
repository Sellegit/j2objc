package apple.coreanimation;


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
import apple.coreimage.*;
import apple.coretext.*;
import apple.opengles.*;
import apple.metal.*;





@Library("QuartzCore") @Mapping("CAValueFunction")
public class CAValueFunction 
    extends NSObject 
    implements NSCoding {

    
    
    
    
    
    @Mapping("name")
    public native CAValueFunctionName getName();
    
    
    
    @Mapping("functionWithName:")
    public static native CAValueFunction create(String name);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
