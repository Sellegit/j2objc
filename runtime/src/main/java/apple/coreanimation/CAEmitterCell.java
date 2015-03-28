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


@Library("QuartzCore/QuartzCore.h") @Mapping("CAEmitterCell")
public class CAEmitterCell 
    extends NSObject 
    implements NSCoding, CAMediaTiming {

    
    
    @Mapping("init")
    public CAEmitterCell() { }

    
    @Mapping("name")
    public native String getName();
    @Mapping("setName:")
    public native void setName(String v);
    @Mapping("isEnabled")
    public native boolean isEnabled();
    @Mapping("setEnabled:")
    public native void setEnabled(boolean v);
    @Mapping("birthRate")
    public native float getBirthRate();
    @Mapping("setBirthRate:")
    public native void setBirthRate(float v);
    @Mapping("lifetime")
    public native float getLifetime();
    @Mapping("setLifetime:")
    public native void setLifetime(float v);
    @Mapping("lifetimeRange")
    public native float getLifetimeRange();
    @Mapping("setLifetimeRange:")
    public native void setLifetimeRange(float v);
    @Mapping("emissionLatitude")
    public native @MachineSizedFloat double getEmissionLatitude();
    @Mapping("setEmissionLatitude:")
    public native void setEmissionLatitude(@MachineSizedFloat double v);
    @Mapping("emissionLongitude")
    public native @MachineSizedFloat double getEmissionLongitude();
    @Mapping("setEmissionLongitude:")
    public native void setEmissionLongitude(@MachineSizedFloat double v);
    @Mapping("emissionRange")
    public native @MachineSizedFloat double getEmissionRange();
    @Mapping("setEmissionRange:")
    public native void setEmissionRange(@MachineSizedFloat double v);
    @Mapping("velocity")
    public native @MachineSizedFloat double getVelocity();
    @Mapping("setVelocity:")
    public native void setVelocity(@MachineSizedFloat double v);
    @Mapping("velocityRange")
    public native @MachineSizedFloat double getVelocityRange();
    @Mapping("setVelocityRange:")
    public native void setVelocityRange(@MachineSizedFloat double v);
    @Mapping("xAcceleration")
    public native @MachineSizedFloat double getXAcceleration();
    @Mapping("setXAcceleration:")
    public native void setXAcceleration(@MachineSizedFloat double v);
    @Mapping("yAcceleration")
    public native @MachineSizedFloat double getYAcceleration();
    @Mapping("setYAcceleration:")
    public native void setYAcceleration(@MachineSizedFloat double v);
    @Mapping("zAcceleration")
    public native @MachineSizedFloat double getZAcceleration();
    @Mapping("setZAcceleration:")
    public native void setZAcceleration(@MachineSizedFloat double v);
    @Mapping("scale")
    public native @MachineSizedFloat double getScale();
    @Mapping("setScale:")
    public native void setScale(@MachineSizedFloat double v);
    @Mapping("scaleRange")
    public native @MachineSizedFloat double getScaleRange();
    @Mapping("setScaleRange:")
    public native void setScaleRange(@MachineSizedFloat double v);
    @Mapping("scaleSpeed")
    public native @MachineSizedFloat double getScaleSpeed();
    @Mapping("setScaleSpeed:")
    public native void setScaleSpeed(@MachineSizedFloat double v);
    @Mapping("spin")
    public native @MachineSizedFloat double getSpin();
    @Mapping("setSpin:")
    public native void setSpin(@MachineSizedFloat double v);
    @Mapping("spinRange")
    public native @MachineSizedFloat double getSpinRange();
    @Mapping("setSpinRange:")
    public native void setSpinRange(@MachineSizedFloat double v);
    @Mapping("color")
    public native CGColor getColor();
    @Mapping("setColor:")
    public native void setColor(CGColor v);
    @Mapping("redRange")
    public native float getRedRange();
    @Mapping("setRedRange:")
    public native void setRedRange(float v);
    @Mapping("greenRange")
    public native float getGreenRange();
    @Mapping("setGreenRange:")
    public native void setGreenRange(float v);
    @Mapping("blueRange")
    public native float getBlueRange();
    @Mapping("setBlueRange:")
    public native void setBlueRange(float v);
    @Mapping("alphaRange")
    public native float getAlphaRange();
    @Mapping("setAlphaRange:")
    public native void setAlphaRange(float v);
    @Mapping("redSpeed")
    public native float getRedSpeed();
    @Mapping("setRedSpeed:")
    public native void setRedSpeed(float v);
    @Mapping("greenSpeed")
    public native float getGreenSpeed();
    @Mapping("setGreenSpeed:")
    public native void setGreenSpeed(float v);
    @Mapping("blueSpeed")
    public native float getBlueSpeed();
    @Mapping("setBlueSpeed:")
    public native void setBlueSpeed(float v);
    @Mapping("alphaSpeed")
    public native float getAlphaSpeed();
    @Mapping("setAlphaSpeed:")
    public native void setAlphaSpeed(float v);
    @Mapping("contents")
    public native Object getContents();
    @Mapping("setContents:")
    public native void setContents(Object v);
    @Mapping("contentsRect")
    public native CGRect getContentsRect();
    @Mapping("setContentsRect:")
    public native void setContentsRect(CGRect v);
    @Mapping("minificationFilter")
    public native CAFilter getMinificationFilter();
    @Mapping("setMinificationFilter:")
    public native void setMinificationFilter(CAFilter v);
    @Mapping("magnificationFilter")
    public native CAFilter getMagnificationFilter();
    @Mapping("setMagnificationFilter:")
    public native void setMagnificationFilter(CAFilter v);
    @Mapping("minificationFilterBias")
    public native float getMinificationFilterBias();
    @Mapping("setMinificationFilterBias:")
    public native void setMinificationFilterBias(float v);
    @Mapping("emitterCells")
    public native NSArray<CAEmitterCell> getEmitterCells();
    @Mapping("setEmitterCells:")
    public native void setEmitterCells(NSArray<CAEmitterCell> v);
    @Mapping("style")
    public native NSDictionary<NSString, NSObject> getStyle();
    @Mapping("setStyle:")
    public native void setStyle(NSDictionary<NSString, NSObject> v);
    @Mapping("beginTime")
    public native double getBeginTime();
    @Mapping("setBeginTime:")
    public native void setBeginTime(double v);
    @Mapping("duration")
    public native double getDuration();
    @Mapping("setDuration:")
    public native void setDuration(double v);
    @Mapping("speed")
    public native float getSpeed();
    @Mapping("setSpeed:")
    public native void setSpeed(float v);
    @Mapping("timeOffset")
    public native double getTimeOffset();
    @Mapping("setTimeOffset:")
    public native void setTimeOffset(double v);
    @Mapping("repeatCount")
    public native float getRepeatCount();
    @Mapping("setRepeatCount:")
    public native void setRepeatCount(float v);
    @Mapping("repeatDuration")
    public native double getRepeatDuration();
    @Mapping("setRepeatDuration:")
    public native void setRepeatDuration(double v);
    @Mapping("autoreverses")
    public native boolean autoreverses();
    @Mapping("setAutoreverses:")
    public native void setAutoreverses(boolean v);
    @Mapping("fillMode")
    public native CAFillMode getFillMode();
    @Mapping("setFillMode:")
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
