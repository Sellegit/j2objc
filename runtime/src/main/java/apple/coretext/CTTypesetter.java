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
public class CTTypesetter 
    extends CFType 
     {

    
    
    protected CTTypesetter() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateWithAttributedString")
    public static native CTTypesetter create(NSAttributedString string);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateWithAttributedStringAndOptions")
    public static native CTTypesetter create(NSAttributedString string, CFDictionary options);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateLineWithOffset")
    public static native CTLine createLine(CTTypesetter typesetter, CFRange stringRange, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterCreateLine")
    public static native CTLine createLine(CTTypesetter typesetter, CFRange stringRange);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestLineBreakWithOffset")
    public static native @MachineSizedSInt long suggestLineBreak(CTTypesetter typesetter, @MachineSizedSInt long startIndex, double width, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestLineBreak")
    public static native @MachineSizedSInt long suggestLineBreak(CTTypesetter typesetter, @MachineSizedSInt long startIndex, double width);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestClusterBreakWithOffset")
    public static native @MachineSizedSInt long suggestClusterBreak(CTTypesetter typesetter, @MachineSizedSInt long startIndex, double width, double offset);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTTypesetterSuggestClusterBreak")
    public static native @MachineSizedSInt long suggestClusterBreak(CTTypesetter typesetter, @MachineSizedSInt long startIndex, double width);
    
}
