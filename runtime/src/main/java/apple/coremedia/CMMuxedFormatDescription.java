package apple.coremedia;


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
import apple.dispatch.*;
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


/*<javadoc>*/
/*</javadoc>*/
@Mapping("CMMuxedFormatDescriptionRef") @Library("CoreMedia/CoreMedia.h")
public class CMMuxedFormatDescription 
    extends CMFormatDescription 
     {

    
    
    protected CMMuxedFormatDescription() {}
    
    
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CMMuxedFormatDescriptionCreate")
    public static native int create(CFAllocator allocator, @Representing("CMMuxedStreamType") long muxType, CFDictionary extensions, Todo outDesc);
    
}
