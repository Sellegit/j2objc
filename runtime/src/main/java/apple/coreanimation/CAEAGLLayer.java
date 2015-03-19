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





@Library("QuartzCore/QuartzCore.h") @Mapping("CAEAGLLayer")
public class CAEAGLLayer 
    extends CALayer 
    implements EAGLDrawable {

    
    
    @Mapping("init")
    public CAEAGLLayer() { }
    @Mapping("initWithLayer:")
    public CAEAGLLayer(Object layer) { }
    @Mapping("initWithCoder:")
    public CAEAGLLayer(NSCoder aDecoder) { }
    
    
    @Mapping("drawableProperties")
    public native EAGLDrawableProperties getDrawableProperties();
    @Mapping("setDrawableProperties:")
    public native void setDrawableProperties(EAGLDrawableProperties v);
    
    
    
    
    
}
