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





@Library("QuartzCore") @Mapping("CAMediaTimingFunction")
public class CAMediaTimingFunction 
    extends NSObject 
    implements NSCoding {

    
    
    public CAMediaTimingFunction() {}
    @Mapping("initWithControlPoints::::")
    public CAMediaTimingFunction(float c1x, float c1y, float c2x, float c2y) { }
    
    
    
    
    
    
    @Mapping("getControlPointAtIndex:values:")
    protected native void getControlPoint(@MachineSizedUInt long idx, Todo ptr);
    @Mapping("functionWithName:")
    public static native CAMediaTimingFunction create(String name);
    @Mapping("functionWithControlPoints::::")
    public static native CAMediaTimingFunction create(float c1x, float c1y, float c2x, float c2y);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
