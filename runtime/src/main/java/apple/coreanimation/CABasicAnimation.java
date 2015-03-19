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





@Library("QuartzCore/QuartzCore.h") @Mapping("CABasicAnimation")
public class CABasicAnimation 
    extends CAPropertyAnimation 
     {

    
    
    @Mapping("initWithCoder:")
    public CABasicAnimation(NSCoder aDecoder) { }
    @Mapping("init")
    public CABasicAnimation() { }
    
    
    @Mapping("fromValue")
    public native Object getFromValue();
    @Mapping("setFromValue:")
    public native void setFromValue(Object v);
    @Mapping("toValue")
    public native Object getToValue();
    @Mapping("setToValue:")
    public native void setToValue(Object v);
    @Mapping("byValue")
    public native Object getByValue();
    @Mapping("setByValue:")
    public native void setByValue(Object v);
    
    
    
    
    
}
