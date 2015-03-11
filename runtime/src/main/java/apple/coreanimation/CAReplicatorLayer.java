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





@Library("QuartzCore") @Mapping("CAReplicatorLayer")
public class CAReplicatorLayer 
    extends CALayer 
     {

    
    
    public CAReplicatorLayer() {}
    @Mapping("initWithLayer:")
    public CAReplicatorLayer(Object layer) { }
    
    
    @Mapping("instanceCount")
    public native @MachineSizedSInt long getInstanceCount();
    public native void setInstanceCount(@MachineSizedSInt long v);
    @Mapping("preservesDepth")
    public native boolean preservesDepth();
    public native void setPreservesDepth(boolean v);
    @Mapping("instanceDelay")
    public native double getInstanceDelay();
    public native void setInstanceDelay(double v);
    @Mapping("instanceTransform")
    public native CATransform3D getInstanceTransform();
    public native void setInstanceTransform(CATransform3D v);
    @Mapping("instanceColor")
    public native CGColor getInstanceColor();
    public native void setInstanceColor(CGColor v);
    @Mapping("instanceRedOffset")
    public native float getInstanceRedOffset();
    public native void setInstanceRedOffset(float v);
    @Mapping("instanceGreenOffset")
    public native float getInstanceGreenOffset();
    public native void setInstanceGreenOffset(float v);
    @Mapping("instanceBlueOffset")
    public native float getInstanceBlueOffset();
    public native void setInstanceBlueOffset(float v);
    @Mapping("instanceAlphaOffset")
    public native float getInstanceAlphaOffset();
    public native void setInstanceAlphaOffset(float v);
    
    
    
    
    
}
