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





@Library("QuartzCore") @Mapping("CAEmitterCell")
public class CAEmitterCell 
    extends NSObject 
    implements NSCoding, CAMediaTiming {

    
    
    public CAEmitterCell() {}
    
    
    @Mapping("name")
    public native String getName();
    public native void setName(String v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    public native void setEnabled(boolean v);
    @Mapping("birthRate")
    public native float getBirthRate();
    public native void setBirthRate(float v);
    @Mapping("lifetime")
    public native float getLifetime();
    public native void setLifetime(float v);
    @Mapping("lifetimeRange")
    public native float getLifetimeRange();
    public native void setLifetimeRange(float v);
    @Mapping("emissionLatitude")
    public native @MachineSizedFloat double getEmissionLatitude();
    public native void setEmissionLatitude(@MachineSizedFloat double v);
    @Mapping("emissionLongitude")
    public native @MachineSizedFloat double getEmissionLongitude();
    public native void setEmissionLongitude(@MachineSizedFloat double v);
    @Mapping("emissionRange")
    public native @MachineSizedFloat double getEmissionRange();
    public native void setEmissionRange(@MachineSizedFloat double v);
    @Mapping("velocity")
    public native @MachineSizedFloat double getVelocity();
    public native void setVelocity(@MachineSizedFloat double v);
    @Mapping("velocityRange")
    public native @MachineSizedFloat double getVelocityRange();
    public native void setVelocityRange(@MachineSizedFloat double v);
    @Mapping("xAcceleration")
    public native @MachineSizedFloat double getXAcceleration();
    public native void setXAcceleration(@MachineSizedFloat double v);
    @Mapping("yAcceleration")
    public native @MachineSizedFloat double getYAcceleration();
    public native void setYAcceleration(@MachineSizedFloat double v);
    @Mapping("zAcceleration")
    public native @MachineSizedFloat double getZAcceleration();
    public native void setZAcceleration(@MachineSizedFloat double v);
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    public native void setScale(@MachineSizedFloat double v);
    @Mapping("scaleRange")
    public native @MachineSizedFloat double getScaleRange();
    public native void setScaleRange(@MachineSizedFloat double v);
    @Mapping("scaleSpeed")
    public native @MachineSizedFloat double getScaleSpeed();
    public native void setScaleSpeed(@MachineSizedFloat double v);
    @Mapping("spin")
    public native @MachineSizedFloat double getSpin();
    public native void setSpin(@MachineSizedFloat double v);
    @Mapping("spinRange")
    public native @MachineSizedFloat double getSpinRange();
    public native void setSpinRange(@MachineSizedFloat double v);
    @Mapping("color")
    public native CGColor getColor();
    public native void setColor(CGColor v);
    @Mapping("redRange")
    public native float getRedRange();
    public native void setRedRange(float v);
    @Mapping("greenRange")
    public native float getGreenRange();
    public native void setGreenRange(float v);
    @Mapping("blueRange")
    public native float getBlueRange();
    public native void setBlueRange(float v);
    @Mapping("alphaRange")
    public native float getAlphaRange();
    public native void setAlphaRange(float v);
    @Mapping("redSpeed")
    public native float getRedSpeed();
    public native void setRedSpeed(float v);
    @Mapping("greenSpeed")
    public native float getGreenSpeed();
    public native void setGreenSpeed(float v);
    @Mapping("blueSpeed")
    public native float getBlueSpeed();
    public native void setBlueSpeed(float v);
    @Mapping("alphaSpeed")
    public native float getAlphaSpeed();
    public native void setAlphaSpeed(float v);
    @Mapping("contents")
    public native Object getContents();
    public native void setContents(Object v);
    @Mapping("contentsRect")
    public native CGRect getContentsRect();
    public native void setContentsRect(CGRect v);
    @Mapping("minificationFilter")
    public native CAFilter getMinificationFilter();
    public native void setMinificationFilter(CAFilter v);
    @Mapping("magnificationFilter")
    public native CAFilter getMagnificationFilter();
    public native void setMagnificationFilter(CAFilter v);
    @Mapping("minificationFilterBias")
    public native float getMinificationFilterBias();
    public native void setMinificationFilterBias(float v);
    @Mapping("emitterCells")
    public native NSArray<CAEmitterCell> getEmitterCells();
    public native void setEmitterCells(NSArray<CAEmitterCell> v);
    @Mapping("style")
    public native NSDictionary<NSString, NSObject> getStyle();
    public native void setStyle(NSDictionary<NSString, NSObject> v);
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
    
    
    
    @Mapping("shouldArchiveValueForKey:")
    public native boolean shouldArchiveValue(String key);
    @Mapping("emitterCell")
    public static native CAEmitterCell create();
    @Mapping("defaultValueForKey:")
    public static native Object getDefaultValue(String key);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
