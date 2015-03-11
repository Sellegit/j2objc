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
    @Mapping("setValues:")
    public native void setValues(NSArray<NSObject> v);
    @Mapping("path")
    public native CGPath getPath();
    @Mapping("setPath:")
    public native void setPath(CGPath v);
    @Mapping("keyTimes")
    public native NSArray<NSNumber> getKeyTimes();
    @Mapping("setKeyTimes:")
    public native void setKeyTimes(NSArray<NSNumber> v);
    @Mapping("timingFunctions")
    public native NSArray<CAMediaTimingFunction> getTimingFunctions();
    @Mapping("setTimingFunctions:")
    public native void setTimingFunctions(NSArray<CAMediaTimingFunction> v);
    @Mapping("calculationMode")
    public native CAAnimationCalculationMode getCalculationMode();
    @Mapping("setCalculationMode:")
    public native void setCalculationMode(CAAnimationCalculationMode v);
    @Mapping("tensionValues")
    public native NSArray<NSNumber> getTensionValues();
    @Mapping("setTensionValues:")
    public native void setTensionValues(NSArray<NSNumber> v);
    @Mapping("continuityValues")
    public native NSArray<NSNumber> getContinuityValues();
    @Mapping("setContinuityValues:")
    public native void setContinuityValues(NSArray<NSNumber> v);
    @Mapping("biasValues")
    public native NSArray<NSNumber> getBiasValues();
    @Mapping("setBiasValues:")
    public native void setBiasValues(NSArray<NSNumber> v);
    @Mapping("rotationMode")
    public native CAAnimationRotationMode getRotationMode();
    @Mapping("setRotationMode:")
    public native void setRotationMode(CAAnimationRotationMode v);
    
    
    
    
    
}
