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





@Library("CoreImage/CoreImage.h") @Mapping("CIColor")
public class CIColor 
    extends NSObject 
    implements NSCoding, NSCopying {

    
    
    public CIColor() {}
    
    
    
    
    
    
    @Mapping("numberOfComponents")
    public native @MachineSizedUInt long getNumberOfComponents();
    @Mapping("components")
    protected native Todo components();
    @Mapping("alpha")
    public native @MachineSizedFloat double getAlpha();
    @Mapping("colorSpace")
    public native CGColorSpace getColorSpace();
    @Mapping("red")
    public native @MachineSizedFloat double getRed();
    @Mapping("green")
    public native @MachineSizedFloat double getGreen();
    @Mapping("blue")
    public native @MachineSizedFloat double getBlue();
    @Mapping("stringRepresentation")
    public native String getStringRepresentation();
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
