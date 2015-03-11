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
@Library("CoreText")
public class CTFrame 
    extends CFType 
     {

    
    
    protected CTFrame() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetStringRange")
    public native CFRange getStringRange();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetVisibleStringRange")
    public native CFRange getVisibleStringRange();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetPath")
    public native CGPath getPath();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetFrameAttributes")
    public native CTFrameAttributes getFrameAttributes();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetLines")
    public native List<CTLine> getLines();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetLineOrigins")
    public native void getLineOrigins(CFRange range, CGPoint origins);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameDraw")
    public native void draw(CGContext context);
    
}
