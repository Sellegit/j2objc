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





@Library("QuartzCore") @Mapping("CAKeyframeAnimation")
public class CAKeyframeAnimation 
    extends CAPropertyAnimation 
     {

    
    
    public CAKeyframeAnimation() {}
    
    
    @Mapping("values")
    public native NSArray<NSObject> getValues();
    public native void setValues(NSArray<NSObject> v);
    @Mapping("path")
    public native CGPath getPath();
    public native void setPath(CGPath v);
    @Mapping("keyTimes")
    public native NSArray<NSNumber> getKeyTimes();
    public native void setKeyTimes(NSArray<NSNumber> v);
    @Mapping("timingFunctions")
    public native NSArray<CAMediaTimingFunction> getTimingFunctions();
    public native void setTimingFunctions(NSArray<CAMediaTimingFunction> v);
    @Mapping("calculationMode")
    public native CAAnimationCalculationMode getCalculationMode();
    public native void setCalculationMode(CAAnimationCalculationMode v);
    @Mapping("tensionValues")
    public native NSArray<NSNumber> getTensionValues();
    public native void setTensionValues(NSArray<NSNumber> v);
    @Mapping("continuityValues")
    public native NSArray<NSNumber> getContinuityValues();
    public native void setContinuityValues(NSArray<NSNumber> v);
    @Mapping("biasValues")
    public native NSArray<NSNumber> getBiasValues();
    public native void setBiasValues(NSArray<NSNumber> v);
    @Mapping("rotationMode")
    public native CAAnimationRotationMode getRotationMode();
    public native void setRotationMode(CAAnimationRotationMode v);
    
    
    
    
    
}
