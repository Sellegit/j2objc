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
public class CTGlyphInfo 
    extends CFType 
     {

    
    
    protected CTGlyphInfo() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoCreateWithGlyphName")
    public static native CTGlyphInfo create(String glyphName, CTFont font, String baseString);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoCreateWithGlyph")
    public static native CTGlyphInfo create(short glyph, CTFont font, String baseString);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoCreateWithCharacterIdentifier")
    public static native CTGlyphInfo create(short cid, CTCharacterCollection collection, String baseString);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoGetGlyphName")
    public native String getGlyphName();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoGetCharacterIdentifier")
    public native short getCharacterIdentifier();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTGlyphInfoGetCharacterCollection")
    public native CTCharacterCollection getCharacterCollection();
    
}
