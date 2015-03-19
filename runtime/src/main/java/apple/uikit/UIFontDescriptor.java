package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIFontDescriptor")
public class UIFontDescriptor 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    @Mapping("initWithFontAttributes:")
    public UIFontDescriptor(NSDictionary<?, ?> attributes) { }
    @Mapping("init")
    public UIFontDescriptor() { }
    
    
    @Mapping("postscriptName")
    public native String getPostscriptName();
    @Mapping("pointSize")
    public native @MachineSizedFloat double getPointSize();
    @Mapping("matrix")
    public native CGAffineTransform getMatrix();
    @Mapping("symbolicTraits")
    public native @Representing("UIFontDescriptorSymbolicTraits") long getSymbolicTraits();
    
    
    
    @Mapping("objectForKey:")
    public native Object getValue(String anAttribute);
    @Mapping("fontAttributes")
    public native UIFontDescriptorAttributes getFontAttributes();
    @Mapping("matchingFontDescriptorsWithMandatoryKeys:")
    public native NSArray<UIFontDescriptor> getMatchingFontDescriptors(NSSet<?> mandatoryKeys);
    @Mapping("fontDescriptorByAddingAttributes:")
    public native UIFontDescriptor newWithAttributes(NSDictionary<?, ?> attributes);
    @Mapping("fontDescriptorWithSymbolicTraits:")
    public native UIFontDescriptor newWithSymbolicTraits(@Representing("UIFontDescriptorSymbolicTraits") long symbolicTraits);
    @Mapping("fontDescriptorWithSize:")
    public native UIFontDescriptor newWithSize(@MachineSizedFloat double newPointSize);
    @Mapping("fontDescriptorWithMatrix:")
    public native UIFontDescriptor newWithMatrix(CGAffineTransform matrix);
    @Mapping("fontDescriptorWithFace:")
    public native UIFontDescriptor newWithFace(String newFace);
    @Mapping("fontDescriptorWithFamily:")
    public native UIFontDescriptor newWithFamily(String newFamily);
    @Mapping("fontDescriptorWithFontAttributes:")
    public static native UIFontDescriptor create(NSDictionary<?, ?> attributes);
    @Mapping("fontDescriptorWithName:size:")
    public static native UIFontDescriptor create(String fontName, @MachineSizedFloat double size);
    @Mapping("fontDescriptorWithName:matrix:")
    public static native UIFontDescriptor create(String fontName, CGAffineTransform matrix);
    @Mapping("preferredFontDescriptorWithTextStyle:")
    public static native UIFontDescriptor getPreferredFontDescriptor(String style);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
