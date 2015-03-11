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





@Library("QuartzCore") @Mapping("CAAnimation")
public class CAAnimation 
    extends NSObject 
    implements NSCoding, NSCopying, CAMediaTiming, CAAction {

    
    
    public CAAnimation() {}
    
    
    @Mapping("timingFunction")
    public native CAMediaTimingFunction getTimingFunction();
    public native void setTimingFunction(CAMediaTimingFunction v);
    @Mapping("delegate")
    public native CAAnimationDelegate getDelegate();
    public native void setDelegate(CAAnimationDelegate v);
    @Mapping("isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();
    public native void setRemovedOnCompletion(boolean v);
    @Mapping("beginTime")
    public native double getBeginTime();
    public native void setBeginTime(double v);
    @Mapping("duration")
    public native double getDuration();
    public native void setDuration(double v);
    @Mapping("speed")
    public native float getSpeed();
    public native void setSpeed(float v);
    @Mapping("timeOffset")
    public native double getTimeOffset();
    public native void setTimeOffset(double v);
    @Mapping("repeatCount")
    public native float getRepeatCount();
    public native void setRepeatCount(float v);
    @Mapping("repeatDuration")
    public native double getRepeatDuration();
    public native void setRepeatDuration(double v);
    @Mapping("autoreverses")
    public native boolean autoreverses();
    public native void setAutoreverses(boolean v);
    @Mapping("fillMode")
    public native CAFillMode getFillMode();
    public native void setFillMode(CAFillMode v);
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CACurrentMediaTime")
    public static native double getCurrentMediaTime();
    
    @Mapping("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValue(String key);
    @Mapping("animation")
    public static native CAAnimation create();
    @Mapping("defaultValueForKey:")
    public static native Object getDefaultValue(String key);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("runActionForKey:object:arguments:")
    public native void runAction(String event, Object anObject, Map<String, NSObject> dict);
    
}
