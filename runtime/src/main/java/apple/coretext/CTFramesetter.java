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
    public static native CTFramesetter create(NSAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterCreateFrame")
    public native CTFrame createFrame(CFRange stringRange, CGPath path, CFDictionary frameAttributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterGetTypesetter")
    public native CTTypesetter getTypesetter();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFramesetterSuggestFrameSizeWithConstraints")
    public native CGSize suggestFrameSize(CFRange stringRange, CFDictionary frameAttributes, CGSize constraints, CFRange fitRange);
    
}
