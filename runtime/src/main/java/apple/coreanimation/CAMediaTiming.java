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





@Library("QuartzCore") @Mapping("CAMediaTiming")
public interface CAMediaTiming 
     {

    
    
    @Mapping("beginTime")
    double getBeginTime();
    @Mapping("setBeginTime:")
    void setBeginTime(double v);
    @Mapping("duration")
    double getDuration();
    @Mapping("setDuration:")
    void setDuration(double v);
    @Mapping("speed")
    float getSpeed();
    @Mapping("setSpeed:")
    void setSpeed(float v);
    @Mapping("timeOffset")
    double getTimeOffset();
    @Mapping("setTimeOffset:")
    void setTimeOffset(double v);
    @Mapping("repeatCount")
    float getRepeatCount();
    @Mapping("setRepeatCount:")
    void setRepeatCount(float v);
    @Mapping("repeatDuration")
    double getRepeatDuration();
    @Mapping("setRepeatDuration:")
    void setRepeatDuration(double v);
    @Mapping("autoreverses")
    boolean autoreverses();
    @Mapping("setAutoreverses:")
    void setAutoreverses(boolean v);
    @Mapping("fillMode")
    CAFillMode getFillMode();
    @Mapping("setFillMode:")
    void setFillMode(CAFillMode v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
