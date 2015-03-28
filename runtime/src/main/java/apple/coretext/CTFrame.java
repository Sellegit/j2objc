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
@Mapping("CTFrameRef") @Library("CoreText/CoreText.h")
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
    public static native CFRange getStringRange(CTFrame frame);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetVisibleStringRange")
    public static native CFRange getVisibleStringRange(CTFrame frame);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetPath")
    public static native CGPath getPath(CTFrame frame);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetFrameAttributes")
    public static native CTFrameAttributes getFrameAttributes(CTFrame frame);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetLines")
    public static native List<CTLine> getLines(CTFrame frame);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameGetLineOrigins")
    public static native void getLineOrigins(CTFrame frame, CFRange range, CGPoint origins);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFrameDraw")
    public static native void draw(CTFrame frame, CGContext context);

}
