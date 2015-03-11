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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("QuartzCore") @Mapping("CAMetalLayer")
public class CAMetalLayer 
    extends CALayer 
     {

    
    
    public CAMetalLayer() {}
    @Mapping("initWithLayer:")
    public CAMetalLayer(Object layer) { }
    
    
    @Mapping("device")
    public native MTLDevice getDevice();
    public native void setDevice(MTLDevice v);
    @Mapping("pixelFormat")
    public native @Representing("MTLPixelFormat") @MachineSizedUInt long getPixelFormat();
    public native void setPixelFormat(@Representing("MTLPixelFormat") @MachineSizedUInt long v);
    @Mapping("framebufferOnly")
    public native boolean isFramebufferOnly();
    public native void setFramebufferOnly(boolean v);
    @Mapping("drawableSize")
    public native CGSize getDrawableSize();
    public native void setDrawableSize(CGSize v);
    @Mapping("presentsWithTransaction")
    public native boolean presentsWithTransaction();
    public native void setPresentsWithTransaction(boolean v);
    
    
    
    @Mapping("nextDrawable")
    public native CAMetalDrawable nextDrawable();
    @Mapping("newDrawable")
    public native CAMetalDrawable newDrawable();
    
}
