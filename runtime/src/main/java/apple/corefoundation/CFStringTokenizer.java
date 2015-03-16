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
@Library("CoreFoundation/CoreFoundation.h")
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
    protected static native CFStringTokenizer create(CFAllocator alloc, String string, CFRange range, @MachineSizedUInt long options, CFLocale locale);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerSetString")
    public static native void setString(CFStringTokenizer tokenizer, String string, CFRange range);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGoToTokenAtIndex")
    public static native CFStringTokenizerTokenType goToToken(CFStringTokenizer tokenizer, @MachineSizedSInt long index);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerAdvanceToNextToken")
    public static native CFStringTokenizerTokenType advanceToNextToken(CFStringTokenizer tokenizer);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGetCurrentTokenRange")
    public static native CFRange getCurrentTokenRange(CFStringTokenizer tokenizer);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerCopyCurrentTokenAttribute")
    public static native CFType getCurrentTokenAttribute(CFStringTokenizer tokenizer, @MachineSizedUInt long attribute);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @GlobalFunction("CFStringTokenizerGetCurrentSubTokens")
    protected static native @MachineSizedSInt long getCurrentSubTokens(CFStringTokenizer tokenizer, CFRange ranges, @MachineSizedSInt long maxRangeLength, CFArray derivedSubTokens);
    
}
