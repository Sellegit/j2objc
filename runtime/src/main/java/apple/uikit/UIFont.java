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
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit") @Mapping("UIFont")
public class UIFont 
    extends NSObject 
    implements NSCopying {

    
    
    public UIFont() {}
    
    
    @Mapping("familyName")
    public native String getFamilyName();
    @Mapping("fontName")
    public native String getFontName();
    @Mapping("pointSize")
    public native @MachineSizedFloat double getPointSize();
    @Mapping("ascender")
    public native @MachineSizedFloat double getAscender();
    @Mapping("descender")
    public native @MachineSizedFloat double getDescender();
    @Mapping("capHeight")
    public native @MachineSizedFloat double getCapHeight();
    @Mapping("xHeight")
    public native @MachineSizedFloat double getXHeight();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("lineHeight")
    public native @MachineSizedFloat double getLineHeight();
    @Mapping("leading")
    public native @MachineSizedFloat double getLeading();
    
    
    
    @Mapping("fontWithSize:")
    public native UIFont getFontWithSize(@MachineSizedFloat double fontSize);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("fontDescriptor")
    public native UIFontDescriptor getFontDescriptor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("preferredFontForTextStyle:")
    protected static native UIFont getPreferredFont(String style);
    @Mapping("fontWithName:size:")
    public static native UIFont getFont(String fontName, @MachineSizedFloat double fontSize);
    @Mapping("familyNames")
    public static native List<String> getFamilyNames();
    @Mapping("fontNamesForFamilyName:")
    public static native List<String> getFontNamesForFamilyName(String familyName);
    @Mapping("systemFontOfSize:")
    public static native UIFont getSystemFont(@MachineSizedFloat double fontSize);
    @Mapping("boldSystemFontOfSize:")
    public static native UIFont getBoldSystemFont(@MachineSizedFloat double fontSize);
    @Mapping("italicSystemFontOfSize:")
    public static native UIFont getItalicSystemFont(@MachineSizedFloat double fontSize);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("fontWithDescriptor:size:")
    public static native UIFont getFont(UIFontDescriptor descriptor, @MachineSizedFloat double pointSize);
    @Mapping("labelFontSize")
    public static native @MachineSizedFloat double getLabelFontSize();
    @Mapping("buttonFontSize")
    public static native @MachineSizedFloat double getButtonFontSize();
    @Mapping("smallSystemFontSize")
    public static native @MachineSizedFloat double getSmallSystemFontSize();
    @Mapping("systemFontSize")
    public static native @MachineSizedFloat double getSystemFontSize();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
