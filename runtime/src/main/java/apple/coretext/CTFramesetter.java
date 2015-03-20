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
@Mapping("CTFramesetterRef") @Library("CoreText/CoreText.h")
public class CTFramesetter 
    extends CFType 
     {

    
    
    protected CTFramesetter() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterCreateWithAttributedString")
    public static native CTFramesetter create(CFAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterCreateFrame")
    public static native CTFrame createFrame(CTFramesetter framesetter, CFRange stringRange, CGPath path, CFDictionary frameAttributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterGetTypesetter")
    public static native CTTypesetter getTypesetter(CTFramesetter framesetter);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterSuggestFrameSizeWithConstraints")
    public static native CGSize suggestFrameSize(CTFramesetter framesetter, CFRange stringRange, CFDictionary frameAttributes, CGSize constraints, CFRange fitRange);
    
}
