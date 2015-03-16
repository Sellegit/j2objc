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
    public static native List<CTFontDescriptor> createFontDescriptors0(NSURL fileURL);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontManagerCreateFontDescriptorFromData")
    public static native CTFontDescriptor createFontDescriptor(NSData data);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterFontsForURL")
    protected static native boolean registerFonts(NSURL fontURL, CTFontManagerScope scope, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterFontsForURL")
    protected static native boolean unregisterFonts(NSURL fontURL, CTFontManagerScope scope, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterGraphicsFont")
    protected static native boolean registerGraphicsFont(CGFont font, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterGraphicsFont")
    protected static native boolean unregisterGraphicsFont(CGFont font, Todo error);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerRegisterFontsForURLs")
    protected static native boolean registerFonts(CFArray fontURLs, CTFontManagerScope scope, Todo errors);
    /**
     * @since Available in iOS 4.1 and later.
     */
    @GlobalFunction("CTFontManagerUnregisterFontsForURLs")
    protected static native boolean unregisterFonts(CFArray fontURLs, CTFontManagerScope scope, Todo errors);
    
}
