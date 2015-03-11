package apple.spritekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.coreimage.*;
import apple.avfoundation.*;
import apple.glkit.*;
import apple.scenekit.*;





@Library("SpriteKit") @Mapping("SKKeyframeSequence")
public class SKKeyframeSequence 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public SKKeyframeSequence() {}
    @Mapping("initWithKeyframeValues:times:")
    public SKKeyframeSequence(NSArray<NSObject> values, NSArray<NSNumber> times) { }
    @Mapping("initWithCapacity:")
    public SKKeyframeSequence(@MachineSizedUInt long numItems) { }
    @Mapping("initWithCoder:")
    public SKKeyframeSequence(NSCoder aDecoder) { }
    
    
    @Mapping("interpolationMode")
    public native @Representing("SKInterpolationMode") @MachineSizedSInt long getInterpolationMode();
    public native void setInterpolationMode(@Representing("SKInterpolationMode") @MachineSizedSInt long v);
    @Mapping("repeatMode")
    public native @Representing("SKRepeatMode") @MachineSizedSInt long getRepeatMode();
    public native void setRepeatMode(@Representing("SKRepeatMode") @MachineSizedSInt long v);
    
    
    
    @Mapping("count")
    public native @MachineSizedUInt long size();
    @Mapping("addKeyframeValue:time:")
    public native void add(Object value, @MachineSizedFloat double time);
    @Mapping("removeLastKeyframe")
    public native void removeLast();
    @Mapping("removeKeyframeAtIndex:")
    public native void remove(@MachineSizedUInt long index);
    @Mapping("setKeyframeValue:forIndex:")
    public native void setValue(Object value, @MachineSizedUInt long index);
    @Mapping("setKeyframeTime:forIndex:")
    public native void setTime(@MachineSizedFloat double time, @MachineSizedUInt long index);
    @Mapping("setKeyframeValue:time:forIndex:")
    public native void set(Object value, @MachineSizedFloat double time, @MachineSizedUInt long index);
    @Mapping("getKeyframeValueForIndex:")
    public native Object getValue(@MachineSizedUInt long index);
    @Mapping("getKeyframeTimeForIndex:")
    public native @MachineSizedFloat double getTime(@MachineSizedUInt long index);
    @Mapping("sampleAtTime:")
    public native Object getSample(@MachineSizedFloat double time);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
