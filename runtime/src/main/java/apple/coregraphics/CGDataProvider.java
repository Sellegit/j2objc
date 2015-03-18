package apple.coregraphics;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics/CoreGraphics.h")
public class CGDataProvider 
    extends CFType 
     {

    
    
    protected CGDataProvider() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataProviderGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataProviderCreateWithCFData")
    public static native CGDataProvider create(NSData data);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataProviderCreateWithURL")
    public static native CGDataProvider create(NSURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataProviderCreateWithFilename")
    public static native CGDataProvider createWithFilename(Todo filename);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGDataProviderCopyData")
    public static native NSData getData(CGDataProvider provider);
    
}
