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





@Library("QuartzCore") @Mapping("CABasicAnimation")
public class CABasicAnimation 
    extends CAPropertyAnimation 
     {

    
    
    public CABasicAnimation() {}
    
    
    @Mapping("fromValue")
    public native Object getFromValue();
    public native void setFromValue(Object v);
    @Mapping("toValue")
    public native Object getToValue();
    public native void setToValue(Object v);
    @Mapping("byValue")
    public native Object getByValue();
    public native void setByValue(Object v);
    
    
    
    
    
}
