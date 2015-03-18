package apple.coreimage;


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
import apple.opengles.*;
import apple.corevideo.*;
import apple.imageio.*;





@Library("CoreImage/CoreImage.h") @Mapping("CIFaceFeature")
public class CIFaceFeature 
    extends CIFeature 
     {

    
    
    @Mapping("init")
    public CIFaceFeature() { }
    
    
    @Mapping("bounds")
    public native CGRect getBounds();
    @Mapping("hasLeftEyePosition")
    public native boolean hasLeftEyePosition();
    @Mapping("leftEyePosition")
    public native CGPoint getLeftEyePosition();
    @Mapping("hasRightEyePosition")
    public native boolean hasRightEyePosition();
    @Mapping("rightEyePosition")
    public native CGPoint getRightEyePosition();
    @Mapping("hasMouthPosition")
    public native boolean hasMouthPosition();
    @Mapping("mouthPosition")
    public native CGPoint getMouthPosition();
    @Mapping("hasTrackingID")
    public native boolean hasTrackingID();
    @Mapping("trackingID")
    public native int getTrackingID();
    @Mapping("hasTrackingFrameCount")
    public native boolean hasTrackingFrameCount();
    @Mapping("trackingFrameCount")
    public native int getTrackingFrameCount();
    @Mapping("hasFaceAngle")
    public native boolean hasFaceAngle();
    @Mapping("faceAngle")
    public native float getFaceAngle();
    @Mapping("hasSmile")
    public native boolean hasSmile();
    @Mapping("leftEyeClosed")
    public native boolean isLeftEyeClosed();
    @Mapping("rightEyeClosed")
    public native boolean isRightEyeClosed();
    
    
    
    
    
}
