package apple.coretext;


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

/*<javadoc>*/
/*</javadoc>*/
@Library("CoreText/CoreText.h")
public class CTFontManager 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontManagerCreateFontDescriptorsFromURL")
    public static native List<CTFontDescriptor> createFontDescriptors0(CFURL fileURL);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontManagerCreateFontDescriptorFromData")
    public static native CTFontDescriptor createFontDescriptor(CFData data);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterFontsForURL")
    public static native boolean registerFonts(CFURL fontURL, @Representing("CTFontManagerScope") long scope, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterFontsForURL")
    public static native boolean unregisterFonts(CFURL fontURL, @Representing("CTFontManagerScope") long scope, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterGraphicsFont")
    public static native boolean registerGraphicsFont(CGFont font, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterGraphicsFont")
    public static native boolean unregisterGraphicsFont(CGFont font, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterFontsForURLs")
    public static native boolean registerFonts(CFArray fontURLs, @Representing("CTFontManagerScope") long scope, Todo errors);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterFontsForURLs")
    public static native boolean unregisterFonts(CFArray fontURLs, @Representing("CTFontManagerScope") long scope, Todo errors);

}
