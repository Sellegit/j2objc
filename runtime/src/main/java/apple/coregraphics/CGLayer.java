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
@Mapping("CGLayerRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGLayer 
    extends CFType 
     {

    
    
    protected CGLayer() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGLayerCreateWithContext")
    public static native CGLayer create(CGContext context, CGSize size, CFDictionary auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGLayerGetSize")
    public static native CGSize getSize(CGLayer layer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGLayerGetContext")
    public static native CGContext getContext(CGLayer layer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGLayerGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();

}
