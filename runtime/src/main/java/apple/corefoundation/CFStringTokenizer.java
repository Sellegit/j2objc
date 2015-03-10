package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation")
public class CFStringTokenizer 
    extends CFType 
     {

    
    
    protected CFStringTokenizer() {}
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerCopyBestStringLanguage")
    public static native String getBestStringLanguage(String string, CFRange range);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerCreate")
    protected static native CFStringTokenizer create(CFAllocator alloc, String string, CFRange range, CFStringTokenizerUnitOptions options, CFLocale locale);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerSetString")
    public native void setString(String string, CFRange range);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGoToTokenAtIndex")
    public native CFStringTokenizerTokenType goToToken(@MachineSizedSInt long index);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerAdvanceToNextToken")
    public native CFStringTokenizerTokenType advanceToNextToken();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGetCurrentTokenRange")
    public native CFRange getCurrentTokenRange();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerCopyCurrentTokenAttribute")
    public native CFType getCurrentTokenAttribute(CFStringTokenizerUnitOptions attribute);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGetCurrentSubTokens")
    protected native @MachineSizedSInt long getCurrentSubTokens(Todo ranges, @MachineSizedSInt long maxRangeLength, List<String> derivedSubTokens);
    
}
