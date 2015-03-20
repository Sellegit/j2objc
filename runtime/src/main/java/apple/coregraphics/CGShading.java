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
@Mapping("CGShadingRef") @Library("CoreGraphics/CoreGraphics.h")
public class CGShading 
    extends CFType 
     {

    
    
    protected CGShading() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGShadingGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGShadingCreateAxial")
    public static native CGShading createAxial(CGColorSpace space, CGPoint start, CGPoint end, CGFunction function, boolean extendStart, boolean extendEnd);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGShadingCreateRadial")
    public static native CGShading createRadial(CGColorSpace space, CGPoint start, @MachineSizedFloat double startRadius, CGPoint end, @MachineSizedFloat double endRadius, CGFunction function, boolean extendStart, boolean extendEnd);
    
}
