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





@Library("QuartzCore/QuartzCore.h") @Mapping("CAScrollLayer")
public class CAScrollLayer 
    extends CALayer 
     {

    
    
    public CAScrollLayer() {}
    @Mapping("initWithLayer:")
    public CAScrollLayer(Object layer) { }
    
    
    @Mapping("scrollMode")
    public native CAScrollMode getScrollMode();
    @Mapping("setScrollMode:")
    public native void setScrollMode(CAScrollMode v);
    
    
    
    @Mapping("scrollToPoint:")
    public native void scrollToPoint(CGPoint p);
    @Mapping("scrollToRect:")
    public native void scrollToRect(CGRect r);
    
}
