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
    @Mapping("setInstanceCount:")
    public native void setInstanceCount(@MachineSizedSInt long v);
    @Mapping("preservesDepth")
    public native boolean preservesDepth();
    @Mapping("setPreservesDepth:")
    public native void setPreservesDepth(boolean v);
    @Mapping("instanceDelay")
    public native double getInstanceDelay();
    @Mapping("setInstanceDelay:")
    public native void setInstanceDelay(double v);
    @Mapping("instanceTransform")
    public native CATransform3D getInstanceTransform();
    @Mapping("setInstanceTransform:")
    public native void setInstanceTransform(CATransform3D v);
    @Mapping("instanceColor")
    public native CGColor getInstanceColor();
    @Mapping("setInstanceColor:")
    public native void setInstanceColor(CGColor v);
    @Mapping("instanceRedOffset")
    public native float getInstanceRedOffset();
    @Mapping("setInstanceRedOffset:")
    public native void setInstanceRedOffset(float v);
    @Mapping("instanceGreenOffset")
    public native float getInstanceGreenOffset();
    @Mapping("setInstanceGreenOffset:")
    public native void setInstanceGreenOffset(float v);
    @Mapping("instanceBlueOffset")
    public native float getInstanceBlueOffset();
    @Mapping("setInstanceBlueOffset:")
    public native void setInstanceBlueOffset(float v);
    @Mapping("instanceAlphaOffset")
    public native float getInstanceAlphaOffset();
    @Mapping("setInstanceAlphaOffset:")
    public native void setInstanceAlphaOffset(float v);
    
    
    
    
    
}
