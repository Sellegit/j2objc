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
    void setBeginTime(double v);
    @Mapping("duration")
    double getDuration();
    void setDuration(double v);
    @Mapping("speed")
    float getSpeed();
    void setSpeed(float v);
    @Mapping("timeOffset")
    double getTimeOffset();
    void setTimeOffset(double v);
    @Mapping("repeatCount")
    float getRepeatCount();
    void setRepeatCount(float v);
    @Mapping("repeatDuration")
    double getRepeatDuration();
    void setRepeatDuration(double v);
    @Mapping("autoreverses")
    boolean autoreverses();
    void setAutoreverses(boolean v);
    @Mapping("fillMode")
    CAFillMode getFillMode();
    void setFillMode(CAFillMode v);
    
    
    
    
    /*<adapter>*/
    /*</adapter>*/
}
