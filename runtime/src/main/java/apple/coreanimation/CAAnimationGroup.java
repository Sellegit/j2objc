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





@Library("QuartzCore/QuartzCore.h") @Mapping("CAAnimationGroup")
public class CAAnimationGroup 
    extends CAAnimation 
     {

    
    
    public CAAnimationGroup() {}
    
    
    @Mapping("animations")
    public native NSArray<CAAnimation> getAnimations();
    @Mapping("setAnimations:")
    public native void setAnimations(NSArray<CAAnimation> v);
    
    
    
    
    
}
