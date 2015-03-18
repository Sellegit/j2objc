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





@Library("QuartzCore/QuartzCore.h") @Mapping("CAPropertyAnimation")
public class CAPropertyAnimation 
    extends CAAnimation 
     {

    
    
    @Mapping("init")
    public CAPropertyAnimation() { }
    
    
    @Mapping("keyPath")
    public native String getKeyPath();
    @Mapping("setKeyPath:")
    public native void setKeyPath(String v);
    @Mapping("isAdditive")
    public native boolean isAdditive();
    @Mapping("setAdditive:")
    public native void setAdditive(boolean v);
    @Mapping("isCumulative")
    public native boolean isCumulative();
    @Mapping("setCumulative:")
    public native void setCumulative(boolean v);
    @Mapping("valueFunction")
    public native CAValueFunction getValueFunction();
    @Mapping("setValueFunction:")
    public native void setValueFunction(CAValueFunction v);
    
    
    
    @Mapping("animationWithKeyPath:")
    public static native CAPropertyAnimation create(String path);
    
}
