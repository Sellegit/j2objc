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





@Library("QuartzCore") @Mapping("CATransition")
public class CATransition 
    extends CAAnimation 
     {

    
    
    public CATransition() {}
    
    
    @Mapping("type")
    public native CATransitionType getType();
    @Mapping("setType:")
    public native void setType(CATransitionType v);
    @Mapping("subtype")
    public native CATransitionSubType getSubtype();
    @Mapping("setSubtype:")
    public native void setSubtype(CATransitionSubType v);
    @Mapping("startProgress")
    public native float getStartProgress();
    @Mapping("setStartProgress:")
    public native void setStartProgress(float v);
    @Mapping("endProgress")
    public native float getEndProgress();
    @Mapping("setEndProgress:")
    public native void setEndProgress(float v);
    @Mapping("filter")
    public native CIFilter getFilter();
    @Mapping("setFilter:")
    public native void setFilter(CIFilter v);
    
    
    
    
    
}
