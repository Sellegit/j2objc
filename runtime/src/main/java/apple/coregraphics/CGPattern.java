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
public class CGPattern 
    extends CFType 
     {

    
    
    protected CGPattern() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPatternGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGPatternCreate")
    protected static native CGPattern create(Todo info, CGRect bounds, CGAffineTransform matrix, @MachineSizedFloat double xStep, @MachineSizedFloat double yStep, CGPatternTiling tiling, boolean isColored, CGPatternCallbacks callbacks);
    
}
