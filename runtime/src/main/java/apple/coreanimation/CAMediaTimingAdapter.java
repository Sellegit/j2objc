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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class CAMediaTimingAdapter 
    extends Object 
    implements CAMediaTiming {

    
    
    
    @NotImplemented("beginTime")
    public double getBeginTime() { throw new UnsupportedOperationException(); }
    @Mapping("setBeginTime:")
    public void setBeginTime(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("duration")
    public double getDuration() { throw new UnsupportedOperationException(); }
    @Mapping("setDuration:")
    public void setDuration(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("speed")
    public float getSpeed() { throw new UnsupportedOperationException(); }
    @Mapping("setSpeed:")
    public void setSpeed(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("timeOffset")
    public double getTimeOffset() { throw new UnsupportedOperationException(); }
    @Mapping("setTimeOffset:")
    public void setTimeOffset(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("repeatCount")
    public float getRepeatCount() { throw new UnsupportedOperationException(); }
    @Mapping("setRepeatCount:")
    public void setRepeatCount(float v) { throw new UnsupportedOperationException(); }
    @NotImplemented("repeatDuration")
    public double getRepeatDuration() { throw new UnsupportedOperationException(); }
    @Mapping("setRepeatDuration:")
    public void setRepeatDuration(double v) { throw new UnsupportedOperationException(); }
    @NotImplemented("autoreverses")
    public boolean autoreverses() { throw new UnsupportedOperationException(); }
    @Mapping("setAutoreverses:")
    public void setAutoreverses(boolean v) { throw new UnsupportedOperationException(); }
    @NotImplemented("fillMode")
    public CAFillMode getFillMode() { throw new UnsupportedOperationException(); }
    @Mapping("setFillMode:")
    public void setFillMode(CAFillMode v) { throw new UnsupportedOperationException(); }
    
    
    
    
    
}
